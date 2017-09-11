
grammar Kek;



file
:   statement* EOF
;



statement returns[lang.Statement stmt]
:   e=expression ';'
    { $stmt = new lang.Statement($e.expr); }
;



expression returns[lang.expr.Expression expr]
:   '(' e=expression ')'
    { $expr = $e.expr; }

|   '-' e=expression
    { $expr = lang.expr.Expression.operator(lang.Operator.UNARY_MINUS, $e.expr); }

|   <assoc=right> l=expression '**' r=expression
    { $expr = lang.expr.Expression.operator(lang.Operator.EXPONENT, $l.expr, $r.expr); }

|   l=expression mop=multiplicative_operator r=expression
    { $expr = lang.expr.Expression.operator($mop.op, $l.expr, $r.expr); }

|   l=expression aop=additive_operator r=expression
    { $expr = lang.expr.Expression.operator($aop.op, $l.expr, $r.expr); }

|   <assoc=right> ID '=' e=expression
    { $expr = lang.expr.Expression.setter($ID.getText(), $e.expr); }

//|   <assoc=right> ID ':=' e=expression
//    { $expr = new ($ID.getText(), $e.expr); }

|   ID
    { $expr = lang.expr.Expression.getter($ID.getText()); }

|   INT
    { $expr = lang.expr.Expression.constant($INT.getText()); }
;



multiplicative_operator returns[lang.Operator op]
:   '*' { $op = lang.Operator.MULTIPLY; }
|   '/' { $op = lang.Operator.DIVIDE; }
;



additive_operator returns[lang.Operator op]
:   '+' { $op = lang.Operator.ADD; }
|   '-' { $op = lang.Operator.SUBTRACT; }
;



ID : [a-z] ; // [a-zA-Z_]+ [a-zA-Z0-9_]* ;
INT : [0-9]+ ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;