import AST.Web.HtmlDocument;
import AST.parser_pkg.Program;
import Visitor.PythonVisitor;
import Visitor.WebVisitor;
import Web.WebLexer;
import Web.WebParser;
import Visitor.WebVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser_pkg.pythonLexer;
import parser_pkg.pythonParser;

import java.io.IOException;

public class Main{
    public static void main(String[] args) {

        try {
            // 1. كود الاختبار (يمكنك تغييره لاختبار حالات مختلفة)
            String input =
                    "<style>\n" +
                            "  .btn { padding: 10px; }\n" +
                            "  .delete { color: red; }\n" +
                            "</style>\n" +
                            "<body>\n" +
                            "  <div class=\"container\">\n" +
                            "    <h1>Product Management</h1>\n" +
                            "\n" +
                            "    {% if user.isAdmin %}\n" +
                            "       <button onclick=\"add()\">Add New Product</button>\n" +
                            "    {% endif %}\n" +
                            "\n" +
                            "    <ul>\n" +
                            "      {% for item in products %}\n" +
                            "        <li>\n" +
                            "          <span>{{ item.name }} - {{ item.price }}$</span>\n" +
                            "          <button>View Details</button>\n" +
                            "          {% if user.isAdmin %}\n" +
                            "             <button class=\"delete\">Delete</button>\n" +
                            "          {% endif %}\n" +
                            "        </li>\n" +
                            "      {% endfor %}\n" +
                            "    </ul>\n" +
                            "  </div>\n" +
                            "</body>";

            // 2. تحويل النص إلى تدفق محارف (Lexer)
            WebLexer lexer = new WebLexer(CharStreams.fromString(input));

            // 3. تحويل التوكنز إلى شجرة قواعد (Parser)
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            WebParser parser = new WebParser(tokens);
            ParseTree tree = parser.htmlDocument(); // نقطة البداية في ملف g4

            // 4. استدعاء الـ Visitor لتعبئة الـ AST الخاص بك
            WebVisitor visitor = new WebVisitor();
            HtmlDocument ast = (HtmlDocument) visitor.visit(tree);



    }
}



