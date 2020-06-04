grammar AssemblerGrama;
begin: (inter | mov | push | xor)  EOF;
inter: INTERRUPT SPACE*;
mov: MOV left=expression COMMA SPACE right=REGISTER SPACE*;
push: PUSH expression SPACE*;
xor: XOR left=expression COMMA SPACE right=expression SPACE*;
expression
    :   left=expression SPACE? (MUL) SPACE? right=expression # Mul
    |   left=expression SPACE? (ADD) SPACE? right=expression # Add
    |   left=expression SPACE? (SUB) SPACE? right=expression # Sub
    |   INT #Int
    |   SUB SPACE? INT #Min
    |   REGISTER #Reg
    |   LPAREN expression RPAREN #Paren;

INTERRUPT: ('int 0x80' | 'INT 0x80');
MOV: 'mov ';
PUSH: 'push ';
XOR: 'xor ';
COMMA: ',';
MUL : '*' ;
ADD : '+' ;
SUB : '-' ;
LPAREN: '(';
RPAREN: ')';
INT : [0-9]+ ;
REGISTER: ('%eax'|'%ebx'|'%ecx'|'%edx');
WS: ('\n'|'\t'|'\r')+ -> skip;
SPACE: (' ');
ANY_CHAR: .;
EOL: '\n';