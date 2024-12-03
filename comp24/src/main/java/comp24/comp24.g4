grammar comp24;

@header {
package comp24;
}

// =========================
//  Token Definitions
// =========================

// Fragment definitions for letters and digits
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

// Reserved keywords
FOR   : 'for' ;
WHILE : 'while' ;
IF    : 'if' ;
ELSE  : 'else' ;

// Data types
INT   : 'int' ;
DOUBLE : 'double' ;
CHAR  : 'char' ;
VOID  : 'void' ;
BOOL  : 'bool' ;

// Operators and symbols
COMA  : ',' ;
PYC   : ';' ;
PA    : '(' ;
PC    : ')' ;
LLA   : '{' ;
LLC   : '}' ;
ASIG  : '=' ;
SUMA  : '+' ;
RESTA : '-' ;
MULT  : '*' ;
DIV   : '/' ;
MOD   : '%' ;

// Relational operators
IGUAL : '==' ;
NEQ   : '!=' ;
GT    : '>' ;
LT    : '<' ;
GTE   : '>=' ;
LTE   : '<=' ;

// Logical operators
AND   : '&&' ;
OR    : '||' ;

// Identifiers and numbers
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
NUMERO : DIGITO+ ;

// Whitespace (ignored)
WS : [ \t\n\r]+ -> skip ;

// Catch-all for unexpected tokens
OTRO : . ;

// =========================
//  Grammar Rules
// =========================

// Program entry point: a program consists of multiple instructions or functions
programa : (instruccion |  funcion)* EOF ;

// Function definitions
declara_func : tdato ID PA parametros PC ;

funcion : tdato ID PA parametros PC bloque ;
parametros : parametro (COMA parametro)* 
            |   /* Empty */;
parametro : tdato ID ;

// Instruction blocks

inst_while : WHILE PA comparacion PC bloque ;
instruccion_if : IF PA comparacion PC bloque (ELSE bloque)? ;



bloque : LLA (instruccion)* LLC ;

// Instructions
instruccion :
      declaracion
    | asignacion PYC
    | condicional
    | bucle
    | llamada_func
    | return 
    | instruccion_else;

instrucciones
    : (instruccion)+
    ;

// Variable declaration
declaracion : tdato ID (ASIG opal)? (COMA ID (ASIG opal)?)* PYC ;

// Data types
tdato : INT | DOUBLE | CHAR | VOID | BOOL ;

// Assignment statements
asignacion : ID ASIG opal ;

// Conditional statements
condicional : IF PA comparacion PC bloque (ELSE bloque)? ;

// Added to avoid using ? 
else_opcional
    : 'else' bloque
    | /* vuoto */
    ;

// Loop statements
bucle : 
      'while' PA comparacion PC bloque
    | 'for' PA asignacion PYC comparacion PYC asignacion PC bloque ;

// Function calls
llamada_func
    : ID PA lista_opal PC PYC
    ;
// Added to avoid using ?  and *

lista_opal
    : opal (COMA opal)*
    | /* Empty */
    ;

// Return statements
return : 'return' opal PYC ;
// Else instrction
instruccion_else : ELSE instruccion ;

// =========================
//  Expressions and Operators
// =========================

// General expressions
opal : exp ;

// Arithmetic expressions
exp : exp SUMA term
    | exp RESTA term
    | term ;

term : term MULT factor
     | term DIV factor
     | term MOD factor
     | factor ;

factor : NUMERO
       | ID
       | PA exp PC ;

// Comparisons
comparacion : opal logic opal ;

    logic : IGUAL | NEQ | GT | LT | GTE | LTE ;
