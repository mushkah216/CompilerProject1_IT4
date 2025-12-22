parser grammar WebParser;

options { tokenVocab=WebLexer; }


htmlDocument
    : htmlContent EOF
    ;


htmlContent
    : ( htmlElement
      | styleElement
      | scriptElement
      | jinjaExpression
      | jinjaStatement
      | HTML_TEXT
      )*
    ;

htmlElement
    : TAG_OPEN TAG_NAME attribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
    | TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE
    ;


styleElement
    : STYLE_OPEN styleContent* STYLE_CLOSE
    ;


scriptElement
    : SCRIPT_OPEN scriptContent* SCRIPT_CLOSE
    ;

attribute
    : TAG_NAME ( TAG_EQUALS attributeValue )?
    ;


attributeValue
    : attributeValueContent*
    ;


attributeValueContent
    : jinjaExpression
    | jinjaStatement
    | ATTVALUE_TEXT
    ;

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


scriptContent
    : jinjaExpression
    | jinjaStatement
    | SCRIPT_LBRACE
    | SCRIPT_RBRACE
    | SCRIPT_LT
    | SCRIPT_OTHER
    ;


jinjaExpression
    : JINJA_EXPR_START expression JINJA_EXPR_END
    ;


jinjaStatement
    : JINJA_STMT_START jinjaStatementBody JINJA_STMT_END
    ;


jinjaStatementBody
    : IFKW expression
    | ELIFKW expression
    | ELSEKW
    | ENDIFKW
    | FORKW JINJA_NAME IN expression
    | ENDFORKW
    | SETKW JINJA_NAME ASSIGN expression
    ;


expression
    : logicalAndExpression (ORKW logicalAndExpression)*
    ;


logicalAndExpression
    : comparisonExpression (ANDKW comparisonExpression)*
    ;


comparisonExpression
    : simpleExpression ( (EQ | NEQ | GT | LT | GTE | LTE) simpleExpression )?
    ;

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