parser grammar Example1Parser;
options { tokenVocab= Example1Lexer;}

 page: NEW_PAGE page_style+ CLOSE_PAGE;

 page_style: (name|nav|footer) SEMICOLN;
 name: NAME OPEN_BR QOUT page_name? QOUT CLOSE_BR;
 page_name:STRING;
 nav: NAV;
 footer : FOOTER;