lexer grammar pythonLexer;

@header {
    package parser_pkg;
}

@members {
    private java.util.Queue<Token> tokens = new java.util.LinkedList<>();
    private java.util.Stack<Integer> indents = new java.util.Stack<>();
    private int lastTokenType = 0;
    private boolean reachedEof = false;

    // عند بداية التحليل، تأكد من أن المكدس يحتوي على 0
    private void init() {
        if (indents.isEmpty()) {
            indents.push(0);
        }
    }

    @Override
    public Token nextToken() {
        init(); // تأكد من تهيئة المكدس

        // إذا وصلنا للنهاية وأفرغنا قائمة الرموز، نرجع EOF
        if (reachedEof && tokens.isEmpty()) {
            return new CommonToken(EOF);
        }

        // أفرغ قائمة الرموز المعلقة أولاً
        if (!tokens.isEmpty()) {
            return tokens.poll();
        }

        // احصل على الرمز التالي من الـ Lexer الأساسي
        Token token = super.nextToken();

        // إذا كان الرمز هو EOF، عالج كل DEDENTs المتبقية
        if (token.getType() == EOF) {
            while (indents.peek() > 0) {
                tokens.offer(createToken(DEDENT, ""));
                indents.pop();
            }
            tokens.offer(token); // أضف EOF في النهاية
            reachedEof = true;
            return tokens.poll();
        }

        // إذا كان الرمز هو سطر جديد
        if (token.getType() == NEWLINE) {
            // تجاهل الأسطر الجديدة المتتالية
            if (lastTokenType == NEWLINE) {
                return nextToken();
            }
            tokens.offer(token); // أضف السطر الجديد
            lastTokenType = NEWLINE;

            // احسب المسافة البادئة للسطر التالي
            int indent = token.getText().length() - 1; // -1 لإزالة حرف \n
            if (indent < 0) indent = 0;

            int prevIndent = indents.peek();

            if (indent > prevIndent) {
                indents.push(indent);
                tokens.offer(createToken(INDENT, ""));
            } else {
                while (indent < indents.peek()) {
                    indents.pop();
                    tokens.offer(createToken(DEDENT, ""));
                }
            }
            return tokens.poll();
        }

        // لأي رمز آخر، فقط قم بتحديث lastTokenType
        lastTokenType = token.getType();
        return token;
    }

    private Token createToken(int type, String text) {
        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, _tokenStartCharIndex, _tokenStartCharIndex);
    }
}

DEF: 'def';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
WHILE: 'while';
FOR: 'for';
IN: 'in';
PRINT: 'print';
RETURN: 'return';
AND: 'and';
OR: 'or';
NOT: 'not';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';
IMPORT: 'import';
FROM: 'from';
AS: 'as';
IS: 'is';

PLUS: '+';
MINUS: '-';
MUL: '*';
AT: '@';
DIV: '/';
EQ: '=';
EQEQ: '==';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
NOT_EQ : '!=' ;

LP: '(';
RP: ')';
LB: '{';
RB: '}';
LC: '[';
RC: ']';
COMMA: ',';
COLON: ':';
DOT: '.';

ID: [a-zA-Z_][a-zA-Z_0-9]*;

NUMBER: [0-9]+ (DOT [0-9]+)?;

STRING
    : '"'  ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;

WS: [ \t]+ -> skip;

COMMENT: '#' ~[\r\n]* -> skip;

NEWLINE: ( '\r\n' | '\r' | '\n' );
INDENT : ;
DEDENT : ;