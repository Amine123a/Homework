grammar StateModel;

// Starting rule
model: states transitions;

// States block
states: STATES LBRACE state+ RBRACE;
state: INITIAL? stateName LBRACE labels RBRACE ERROR?;
stateName: STATE_NAME;
labels: (IDENTIFIER (COMMA IDENTIFIER)*)?;

// Transitions block
transitions: TRANSITIONS LBRACE transition* RBRACE;
transition: transScheme | transDefinition;
transScheme: TRANS (NORMAL | ERROR) IDENTIFIER;
transDefinition: IDENTIFIER COLON fromState ARROW toState;
fromState: STATE_NAME;
toState: STATE_NAME;

// Lexer rules
STATES: 'states';
TRANSITIONS: 'transitions';
INITIAL: 'initial';
NORMAL: 'normal';
ERROR: 'error';
TRANS: 'trans';

LBRACE: '{';
RBRACE: '}';
COLON: ':';
ARROW: '->';
COMMA: ',';
SEMI: ';';

STATE_NAME: [A-Z][A-Z0-9]*;
IDENTIFIER: [a-z][a-z0-9]*;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\n\r]+ -> skip;