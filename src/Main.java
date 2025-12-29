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


        // printing python(flask) AST
//        String filePath = "src/parser_pkg/test.txt"; // تأكد أن المسار صحيح بالنسبة لمجلد التشغيل
//
//        try {
//            System.out.println("Reading from file: " + filePath);
//            System.out.println("------------------------------------");
//
//            // 1. القراءة من الملف وتحويله إلى Tokens
//            CharStream input = CharStreams.fromFileName(filePath);
//            pythonLexer lexer = new pythonLexer(input);
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//            // 2. بناء الـ Parse Tree (الشجرة الأولية من ANTLR)
//            pythonParser parser = new pythonParser(tokens);
//            ParseTree tree = parser.program();
//
//            // 3. استخدام الـ Visitor لتحويلها إلى AST
//            PythonVisitor visitor = new PythonVisitor();
//            Program astRoot = (Program) visitor.visit(tree);
//
//            // 4. طباعة شجرة الـ AST النهائية
//            System.out.println("\n--- Final Abstract Syntax Tree ---");
//            if (astRoot != null) {
//                astRoot.print(""); // دالة الطباعة التي طورناها معاً
//            } else {
//                System.out.println("The AST is empty or null.");
//            }
//
//        } catch (IOException e) {
//            System.err.println("Error: Could not read file. Make sure 'test.txt' exists.");
//        } catch (Exception e) {
//            System.err.println("Unexpected Error: " + e.getMessage());
//            e.printStackTrace();
//        }
//
    }
}



