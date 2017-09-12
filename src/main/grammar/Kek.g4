
grammar Kek;



file
:   statement* EOF
;



/*************
* STATEMENTS *
*************/



statement returns[lang.Statement stmt]
:   e=expression ';'
    { $stmt = new lang.Statement($e.expr); }
;



/**************
* EXPRESSIONS *
**************/



expression returns[lang.expr.Expression expr]
:   pe=primary_expression
    { $expr = $pe.expr; }

//|   e=expression '.' ID
//    { $expr = lang.expr.Expression.memberAccess($e.expr, $ID.getText()); }

|   prop=prefix_operator e=expression
    { $expr = lang.expr.Expression.operator($prop.op, $e.expr); }

|   <assoc=right> l=expression '**' r=expression
    { $expr = lang.expr.Expression.operator(lang.Operator.EXPONENT, $l.expr, $r.expr); }

|   l=expression mop=multiplicative_operator r=expression
    { $expr = lang.expr.Expression.operator($mop.op, $l.expr, $r.expr); }

|   l=expression aop=additive_operator r=expression
    { $expr = lang.expr.Expression.operator($aop.op, $l.expr, $r.expr); }

|   l=expression sop=shift_operator r=expression
    { $expr = lang.expr.Expression.operator($sop.op, $l.expr, $r.expr); }

|   l=expression cop=comparison_operator r=expression
    { $expr = lang.expr.Expression.operator($cop.op, $l.expr, $r.expr); }

|   l=expression eop=equality_operator r=expression
    { $expr = lang.expr.Expression.operator($eop.op, $l.expr, $r.expr); }

|   l=expression bop=bitwise_operator r=expression
    { $expr = lang.expr.Expression.operator($bop.op, $l.expr, $r.expr); }

|   <assoc=right> l=expression '&&' r=expression
    { $expr = lang.expr.Expression.operator(lang.Operator.AND, $l.expr, $r.expr); }

|   <assoc=right> l=expression '||' r=expression
    { $expr = lang.expr.Expression.operator(lang.Operator.OR, $l.expr, $r.expr); }

|   <assoc=right> pe=primary_expression '.' ID '=' e=expression
    { $expr = lang.expr.Expression.setter($pe.expr, $ID.getText(), $e.expr); }
    /*
    velocity.x = 0;
    getVelocity().x = 0;
    (kekOut << "KEK").ok = true;
    */

|   <assoc=right> ID '=' e=expression
    { $expr = lang.expr.Expression.setter($ID.getText(), $e.expr); }

//|   <assoc=right> ID ':=' e=expression
//    { $expr = lang.expr.Expression.setter($ID.getText(), $e.expr); }

//|   <assoc=right> ID ':=' e=expression
//    { $expr = new ($ID.getText(), $e.expr); }
;



primary_expression returns[lang.expr.Expression expr]
:   '(' e=expression ')'
    { $expr = $e.expr; }

|   pe=primary_expression '.' ID
    { $expr = lang.expr.Expression.memberAccess($pe.expr, $ID.getText()); }

|   pe=primary_expression '(' l=expression_list? ')'
    {
        lang.ExpressionList elist;
        try {
            elist = $l.elist;
        }
        catch (NullPointerException e) {
            elist = new lang.ExpressionList();
        }
        $expr = lang.expr.Expression.invokation($pe.expr, elist);
    }

|   ID
    { $expr = lang.expr.Expression.getter($ID.getText()); }

|   INT
    { $expr = lang.expr.Expression.constant($INT.getText()); }
;



expression_list returns[lang.ExpressionList elist]
:   l=expression        { $elist = new lang.ExpressionList($l.expr); }
    (',' r=expression)* { $elist.add($r.expr); }
;



/************
* OPERATORS *
************/



prefix_operator returns[lang.Operator op]
:   '+'  { $op = lang.Operator.UNARY_PLUS; }
|   '-'  { $op = lang.Operator.UNARY_MINUS; }
|   '!'  { $op = lang.Operator.NOT; }
|   '~'  { $op = lang.Operator.BIT_NOT; }
|   '++' { $op = lang.Operator.PRE_INC; }
|   '--' { $op = lang.Operator.PRE_DEC; }
;



multiplicative_operator returns[lang.Operator op]
:   '*' { $op = lang.Operator.MULTIPLY; }
|   '/' { $op = lang.Operator.DIVIDE; }
|   '%' { $op = lang.Operator.REMNANT; }
;



additive_operator returns[lang.Operator op]
:   '+' { $op = lang.Operator.ADD; }
|   '-' { $op = lang.Operator.SUBTRACT; }
;



shift_operator returns[lang.Operator op]
:   '<<' { $op = lang.Operator.LEFT_SHIFT; }
|   '>>' { $op = lang.Operator.RIGHT_SHIFT; }
;



comparison_operator returns[lang.Operator op]
:   '<'  { $op = lang.Operator.LESS; }
|   '>'  { $op = lang.Operator.GREATER; }
|   '<=' { $op = lang.Operator.LESS_EQUAL; }
|   '>=' { $op = lang.Operator.GREATER_EQUAL; }
;



equality_operator returns[lang.Operator op]
:   '==' { $op = lang.Operator.EQUAL; }
|   '!=' { $op = lang.Operator.NOT_EQUAL; }
;



bitwise_operator returns[lang.Operator op]
:   '&'  { $op = lang.Operator.BIT_AND; }
|   '|'  { $op = lang.Operator.BIT_OR; }
|   '^'  { $op = lang.Operator.BIT_XOR; }
|   '&^' { $op = lang.Operator.BIT_CLEAR; }
;



/*********
* TOKENS *
*********/



ID : [a-zA-Z_]+ [a-zA-Z0-9_]* ;
INT : [0-9]+ ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;