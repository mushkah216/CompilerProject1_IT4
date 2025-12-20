parser grammar WebParser;

options { tokenVocab=WebLexer; }

// قاعدة البداية: مستند HTML كامل
htmlDocument
    : htmlContent EOF
    ;

// محتوى HTML: نص أو عناصر أو تعليمات جينجا
htmlContent
    : ( htmlElement
      | styleElement
      | scriptElement
      | jinjaExpression
      | jinjaStatement
      | HTML_TEXT
      )*
    ;

// عنصر HTML عادي مع محتواه أو عنصر مغلق ذاتيًا
htmlElement
    : TAG_OPEN TAG_NAME attribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
    | TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE
    ;

// عنصر <style> يتضمن CSS وجينجا داخله
styleElement
    : STYLE_OPEN styleContent* STYLE_CLOSE
    ;

// عنصر <script> يتضمن JavaScript وجينجا داخله
scriptElement
    : SCRIPT_OPEN scriptContent* SCRIPT_CLOSE
    ;

// تعريف السمة داخل وسم
attribute
    : TAG_NAME ( TAG_EQUALS attributeValue )?
    ;

// قيمة السمة (قد تحوي نص وجينجا)
attributeValue
    : attributeValueContent*
    ;

// جزء من قيمة السمة: نص ثابت أو شفرة جينجا
attributeValueContent
    : jinjaExpression
    | jinjaStatement
    | ATTVALUE_TEXT
    ;

// محتوى داخل وسم <style>: نص CSS أو جينجا
styleContent
    : jinjaExpression
    | jinjaStatement
    | CSS_IDENT
    | CSS_NUMBER
    | CSS_STRING
    | CSS_LBRACE
    | CSS_RBRACE
    | CSS_COLON
    | CSS_SEMI
    | CSS_DOT
    | CSS_HASH
    | CSS_LPAREN
    | CSS_RPAREN
    | CSS_COMMA
    | CSS_AT
    | CSS_TILDE
    | PLUS
    | MINUS
    | STAR
    | SLASH
    | GT
    ;

// محتوى داخل وسم <script>: نص JavaScript أو جينجا
scriptContent
    : jinjaExpression
    | jinjaStatement
    | SCRIPT_LBRACE
    | SCRIPT_RBRACE
    | SCRIPT_LT
    | SCRIPT_OTHER
    ;

// تعبير جينجا {{ ... }} كعقدة مستقلة
jinjaExpression
    : JINJA_EXPR_START expression JINJA_EXPR_END
    ;

// تعليمات جينجا {% ... %} كعقدة مستقلة
jinjaStatement
    : JINJA_STMT_START jinjaStatementBody JINJA_STMT_END
    ;

// محتوى تعليمات جينجا (if/for وغيرها)
jinjaStatementBody
    : IFKW expression
    | ELIFKW expression
    | ELSEKW
    | ENDIFKW
    | FORKW JINJA_NAME IN expression
    | ENDFORKW
    | SETKW JINJA_NAME ASSIGN expression
    ;

// ----------------------------------------------------
// قواعد تحليل التعبيرات (مع فرض الأولوية)
// ----------------------------------------------------

// 1. الأولوية الأدنى: OR (القاعدة الرئيسية)
expression
    : logicalAndExpression (ORKW logicalAndExpression)*
    ;

// 2. الأولوية المتوسطة: AND
logicalAndExpression
    : comparisonExpression (ANDKW comparisonExpression)*
    ;

// 3. الأولوية الأعلى: المقارنات
comparisonExpression
    : simpleExpression ( (EQ | NEQ | GT | LT | GTE | LTE) simpleExpression )?
    ;
// ----------------------------------------------------
// قواعد الحساب (تحتفظ بأولويتها الداخلية)
// ----------------------------------------------------

simpleExpression
    : term ( (PLUS | MINUS) term )*
    ;

term
    : factor ( (STAR | SLASH | DIV | MOD) factor )*
    ;

factor
    : primary
    ;

primary
    : ( JINJA_NUMBER
      | JINJA_STRING
      | JINJA_NAME (DOT JINJA_NAME)* | LPAREN expression RPAREN
      ) (PIPE JINJA_NAME)* ;