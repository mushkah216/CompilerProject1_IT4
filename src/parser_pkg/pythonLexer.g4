lexer grammar pythonLexer;

@header {
    package parser_pkg;
}

@members {
    private java.util.Queue<Token> tokens = new java.util.LinkedList<>();
    private java.util.Stack<Integer> indents = new java.util.Stack<>();
    private boolean reachedEof = false;

    private void init() {
        if (indents.isEmpty()) {
            indents.push(0);
        }
    }

    @Override
    public Token nextToken() {
        init();

        if (!tokens.isEmpty()) {
            return tokens.poll();
        }

        Token token = super.nextToken();

        if (token.getType() == EOF) {
            while (indents.size() > 1) {
                indents.pop();
                tokens.offer(createToken(DEDENT, ""));
            }

            tokens.offer(token);
            reachedEof = true;
            return tokens.poll();
        }

        if (token.getType() == NEWLINE) {
            String text = token.getText();

            int indent = 0;
            for (int i = text.length() - 1; i >= 0; i--) {
                char c = text.charAt(i);
                if (c == ' ') {
                    indent++;
                } else if (c == '\t') {
                    indent += 4;
                } else {
                    break;
                }
            }

            tokens.offer(token);

            int prevIndent = indents.peek();

            if (indent > prevIndent) {
                indents.push(indent);
                tokens.offer(createToken(INDENT, ""));
            } else if (indent < prevIndent) {
                while (indents.size() > 1 && indent < indents.peek()) {
                    indents.pop();
                    tokens.offer(createToken(DEDENT, ""));
                }
            }

            return tokens.poll();
        }

        return token;
    }

    private Token createToken(int type, String text) {
        CommonToken token = new CommonToken(
                this._tokenFactorySourcePair,
                type,
                DEFAULT_TOKEN_CHANNEL,
                _tokenStartCharIndex,
                _tokenStartCharIndex
        );
        token.setText(text);
        return token;
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

WS
    : [ \t]+ -> skip
    ;

COMMENT: '#' ~[\r\n]* -> skip;

NEWLINE : '\r'? '\n' [ \t]* ;
INDENT : ;
DEDENT : ;