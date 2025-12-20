lexer grammar Example1Lexer;

NEW_PAGE : 'hi' '{' ->pushMode(PAGE);
WS: [ \t\n\r]+ ->skip;

mode PAGE;
CLOSE_PAGE : '}' ->popMode;
NAME: 'name';
NAV:'add_nav';
FOOTER:'add_footer';
OPEN_BR:'(' ->pushMode(ATTRIBUTE);
SEMICOLN : ';';
mode ATTRIBUTE;
CLOSE_BR : ')'->popMode;
STRING : [a-zA-Z]+;
QOUT: '\\\'';


