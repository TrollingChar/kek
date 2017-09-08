
grammar Kek;

file : statement* EOF;

statement : expression ';' ;

expression returns[lang.Expression expr]
:   '(' e=expression ')'                            { $expr = $e.expr; }
|   '-' e=expression                                { $expr = lang.Expression.prefix($e.expr, "-"); }
|   <assoc=right> l=expression '**' r=expression    { $expr = lang.Expression.binary($l.expr, $r.expr, "**"); }
|   l=expression op=('*' | '/') r=expression        { $expr = lang.Expression.binary($l.expr, $r.expr, $op.getText()); }
|   l=expression op=('+' | '-') r=expression        { $expr = lang.Expression.binary($l.expr, $r.expr, $op.getText()); }
|   <assoc=right> ID '=' e=expression               { $expr = lang.Expression.assignment($ID.getText(), $e.expr); }
|   <assoc=right> ID ':=' e=expression              { $expr = lang.Expression.declaration($ID.getText(), $e.expr); }
|   ID                                              { $expr = lang.Expression.identifier($ID.getText()); }
|   INT                                             { $expr = lang.Expression.number($INT.getText()); }
;

ID : [a-zA-Z_]+ [a-zA-Z0-9_]* ;
INT : [0-9]+ ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;