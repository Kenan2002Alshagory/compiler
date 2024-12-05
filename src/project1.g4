lexer grammar project1;

// Whitespace
WS: [ \t\r\n]+ -> skip;

// Comments
COMMENT: ';' ';' ~[\r\n]* -> skip;


// Strings
STRING: '"' ( '\\' . | ~["\\] )* '"';

// Symbols (e.g., variables, function names)
SYMBOL: [a-zA-Z_*][a-zA-Z0-9_*+-]*;

// Numbers (integers and floats)
NUMBER: [0-9]+ ('.' [0-9]+)?;

// Special Characters
LPAREN: '(';
RPAREN: ')';
QUOTE: '\'';
BACKSLASH: '\\';

// Operators
OPERATOR: '+' | '-' | '*' | '/' | '=';

// Keywords
KEYWORD: 'defparameter' | 'defun' | 'format' | 't' | 'nil';

// Unrecognized characters (lexical errors)
LEXICAL_ERROR: .;

// Fragments for escape sequences
fragment ESC_NEWLINE: '\\n';
fragment ESC_TAB: '\\t';
fragment ESC_BACKSLASH: '\\\\';
