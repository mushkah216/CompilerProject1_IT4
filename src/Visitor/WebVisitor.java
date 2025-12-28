package Visitor;

import AST.Web.*;
import Web.WebParser;
import  Web.WebParserBaseVisitor;
// تأكد من وجود مكتبة ANTLR في الـ Classpath ليتم التعرف على السطر التالي
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class WebVisitor extends WebParserBaseVisitor<Object> {

    @Override
    public HtmlDocument visitHtmlDocument(WebParser.HtmlDocumentContext ctx) {
        HtmlDocument doc = new HtmlDocument(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        if (ctx.htmlContent() != null) {
            List<HtmlNode> nodes = (List<HtmlNode>) visit(ctx.htmlContent());
            for (HtmlNode node : nodes) {
                doc.addChild(node);
            }
        }
        return doc;
    }

    @Override
    public List<HtmlNode> visitHtmlContent(WebParser.HtmlContentContext ctx) {
        List<HtmlNode> nodes = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object child = visit(ctx.getChild(i));

            if (child instanceof HtmlNode) {
                // الآن سيقبل HtmlElement و HtmlText و JinjaExpression و JinjaStatement
                nodes.add((HtmlNode) child);
            }
            else if (ctx.getChild(i) instanceof org.antlr.v4.runtime.tree.TerminalNode) {
                String text = ctx.getChild(i).getText().trim();
                if (!text.isEmpty()) {
                    nodes.add(new HtmlText(text, ctx.start.getLine(), ctx.start.getCharPositionInLine()));
                }
            }
        }
        return nodes;
    }

    // معالجة الـ Attributes بدقة حسب ملفاتك
    @Override
    public HtmlAttribute visitAttribute(WebParser.AttributeContext ctx) {
        HtmlAttribute attribute = new HtmlAttribute(ctx.TAG_NAME().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
        if (ctx.attributeValue() != null) {
            for (WebParser.AttributeValueContentContext partCtx : ctx.attributeValue().attributeValueContent()) {
                Object part = visit(partCtx);
                if (part instanceof AttributeValuePart) {
                    attribute.addPart((AttributeValuePart) part);
                } else if (partCtx.ATTVALUE_TEXT() != null) {
                    attribute.addPart(new AttributeText(partCtx.start.getLine(), partCtx.start.getCharPositionInLine(), partCtx.ATTVALUE_TEXT().getText()));
                }
            }
        }
        return attribute;
    }

    // ربط الـ Jinja مع الـ Attributes
    @Override
    public Object visitAttributeValueContent(WebParser.AttributeValueContentContext ctx) {
        if (ctx.jinjaExpression() != null) {
            return new AttributeJinjaExpression((JinjaExpression) visit(ctx.jinjaExpression()), ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
        if (ctx.jinjaStatement() != null) {
            return new AttributeJinjaStatement((JinjaStatement) visit(ctx.jinjaStatement()), ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
        if (ctx.ATTVALUE_TEXT() != null) {
            return new AttributeText(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.ATTVALUE_TEXT().getText());
        }
        return null;
    }

    // معالجة الـ CSS
    @Override
    public StyleElement visitStyleElement(WebParser.StyleElementContext ctx) {
        StyleElement style = new StyleElement(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        for (WebParser.StyleContentContext sc : ctx.styleContent()) {
            Object content = visit(sc);
            if (content instanceof CssNode) {
                style.addChild((CssNode) content);
            }
        }
        return style;
    }

    // معالجة الـ Script
    @Override
    public ScriptElement visitScriptElement(WebParser.ScriptElementContext ctx) {
        ScriptElement script = new ScriptElement(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        for (WebParser.ScriptContentContext sc : ctx.scriptContent()) {
            Object content = visit(sc);
            if (content instanceof ScriptNode) {
                script.addChild((ScriptNode) content);
            }
        }
        return script;
    }

    // --- 1. معالجة عناصر HTML ---
    @Override
    public HtmlElement visitNormalHtmlElement(WebParser.NormalHtmlElementContext ctx) {
        // 1. إنشاء العنصر (التاج)
        HtmlElement element = new HtmlElement(ctx.TAG_NAME(0).getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());

        // 2. إضافة الخصائص (Attributes)
        if (ctx.attribute() != null) {
            for (WebParser.AttributeContext attrCtx : ctx.attribute()) {
                element.addAttribute((HtmlAttribute) visit(attrCtx));
            }
        }

        // 3. الخطوة الأهم: إضافة الأبناء (الـ body، الـ h1، الـ Jinja)
        if (ctx.htmlContent() != null) {
            Object contentResult = visit(ctx.htmlContent());
            if (contentResult instanceof List) {
                List<HtmlNode> children = (List<HtmlNode>) contentResult;
                for (HtmlNode child : children) {
                    element.addChild(child); // هنا يتم بناء الشجرة بشكل هرمي
                }
            }
        }

        return element;
    }

    @Override
    public HtmlSelfClosingElement visitSelfClosingHtmlElement(WebParser.SelfClosingHtmlElementContext ctx) {
        HtmlSelfClosingElement element = new HtmlSelfClosingElement(ctx.TAG_NAME().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
        for (WebParser.AttributeContext attrCtx : ctx.attribute()) {
            element.addAttribute((HtmlAttribute) visit(attrCtx));
        }
        return element;
    }

    // --- 2. معالجة جمل Jinja2 ---
    @Override
    public JinjaExpression visitJinjaExpression(WebParser.JinjaExpressionContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        return new JinjaExpression(expr, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public JinjaIf visitJinjaIf(WebParser.JinjaIfContext ctx) {
        Expression cond = (Expression) visit(ctx.expression());
        return new JinjaIf(cond, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public JinjaFor visitJinjaFor(WebParser.JinjaForContext ctx) {
        String varName = ctx.JINJA_NAME().getText();
        Expression iterable = (Expression) visit(ctx.expression());
        return new JinjaFor(varName, iterable, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    // --- 3. معالجة التعابير الرياضية والمنطقية (المستوى العميق) ---
    @Override
    public Expression visitAddSubExpr(WebParser.AddSubExprContext ctx) {
        // إذا كان هناك طرف واحد فقط
        if (ctx.term().size() == 1) return (Expression) visit(ctx.term(0));

        Expression left = (Expression) visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // جلب العملية + أو -
            Expression right = (Expression) visit(ctx.term(i));
            left = new AddSub(left, op, right, ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
        return left;
    }

    @Override
    public Expression visitComparisonExpr(WebParser.ComparisonExprContext ctx) {
        if (ctx.getChildCount() == 1) return (Expression) visit(ctx.simpleExpression(0));

        Expression left = (Expression) visit(ctx.simpleExpression(0));
        String op = ctx.getChild(1).getText(); // ==, !=, >, etc.
        Expression right = (Expression) visit(ctx.simpleExpression(1));
        return new Comparison(left, op, right, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public NumberLiteral visitNumberLiteral(WebParser.NumberLiteralContext ctx) {
        return new NumberLiteral(ctx.JINJA_NUMBER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public Variable visitVariableExpr(WebParser.VariableExprContext ctx) {
        List<String> names = new ArrayList<>();
        ctx.JINJA_NAME().forEach(n -> names.add(n.getText()));
        return new Variable(names, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
}