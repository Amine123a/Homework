// Generated from C:/Users/amine/IdeaProjects/Homework/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STATES=1, TRANSITIONS=2, INITIAL=3, NORMAL=4, ERROR=5, TRANS=6, LBRACE=7, 
		RBRACE=8, COLON=9, ARROW=10, COMMA=11, SEMI=12, STATE_NAME=13, LABEL=14, 
		TRANS_NAME=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STATES", "TRANSITIONS", "INITIAL", "NORMAL", "ERROR", "TRANS", "LBRACE", 
			"RBRACE", "COLON", "ARROW", "COMMA", "SEMI", "STATE_NAME", "LABEL", "TRANS_NAME", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'states'", "'transitions'", "'initial'", "'normal'", "'error'", 
			"'trans'", "'{'", "'}'", "':'", "'->'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STATES", "TRANSITIONS", "INITIAL", "NORMAL", "ERROR", "TRANS", 
			"LBRACE", "RBRACE", "COLON", "ARROW", "COMMA", "SEMI", "STATE_NAME", 
			"LABEL", "TRANS_NAME", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public StateModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StateModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010x\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\f_\b\f\n\f\f\fb\t\f\u0001\r\u0001\r\u0005\rf\b\r\n\r\f\ri\t\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000em\b\u000e\n\u000e\f\u000ep\t\u000e\u0001\u000f"+
		"\u0004\u000fs\b\u000f\u000b\u000f\f\u000ft\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0005\u0001\u0000AZ\u0002\u0000"+
		"09AZ\u0001\u0000az\u0002\u000009az\u0003\u0000\t\n\r\r  {\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000"+
		"\u0000\u0003(\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u0007"+
		"<\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bI\u0001\u0000"+
		"\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000"+
		"\u0011S\u0001\u0000\u0000\u0000\u0013U\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001"+
		"\u0000\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001dj\u0001\u0000\u0000"+
		"\u0000\u001fr\u0001\u0000\u0000\u0000!\"\u0005s\u0000\u0000\"#\u0005t"+
		"\u0000\u0000#$\u0005a\u0000\u0000$%\u0005t\u0000\u0000%&\u0005e\u0000"+
		"\u0000&\'\u0005s\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005t"+
		"\u0000\u0000)*\u0005r\u0000\u0000*+\u0005a\u0000\u0000+,\u0005n\u0000"+
		"\u0000,-\u0005s\u0000\u0000-.\u0005i\u0000\u0000./\u0005t\u0000\u0000"+
		"/0\u0005i\u0000\u000001\u0005o\u0000\u000012\u0005n\u0000\u000023\u0005"+
		"s\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005i\u0000\u000056\u0005"+
		"n\u0000\u000067\u0005i\u0000\u000078\u0005t\u0000\u000089\u0005i\u0000"+
		"\u00009:\u0005a\u0000\u0000:;\u0005l\u0000\u0000;\u0006\u0001\u0000\u0000"+
		"\u0000<=\u0005n\u0000\u0000=>\u0005o\u0000\u0000>?\u0005r\u0000\u0000"+
		"?@\u0005m\u0000\u0000@A\u0005a\u0000\u0000AB\u0005l\u0000\u0000B\b\u0001"+
		"\u0000\u0000\u0000CD\u0005e\u0000\u0000DE\u0005r\u0000\u0000EF\u0005r"+
		"\u0000\u0000FG\u0005o\u0000\u0000GH\u0005r\u0000\u0000H\n\u0001\u0000"+
		"\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005r\u0000\u0000KL\u0005a\u0000"+
		"\u0000LM\u0005n\u0000\u0000MN\u0005s\u0000\u0000N\f\u0001\u0000\u0000"+
		"\u0000OP\u0005{\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005}\u0000"+
		"\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005:\u0000\u0000T\u0012\u0001"+
		"\u0000\u0000\u0000UV\u0005-\u0000\u0000VW\u0005>\u0000\u0000W\u0014\u0001"+
		"\u0000\u0000\u0000XY\u0005,\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000"+
		"Z[\u0005;\u0000\u0000[\u0018\u0001\u0000\u0000\u0000\\`\u0007\u0000\u0000"+
		"\u0000]_\u0007\u0001\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u001a"+
		"\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cg\u0007\u0002\u0000"+
		"\u0000df\u0007\u0003\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u001c"+
		"\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jn\u0007\u0002\u0000"+
		"\u0000km\u0007\u0003\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u001e"+
		"\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qs\u0007\u0004\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0006"+
		"\u000f\u0000\u0000w \u0001\u0000\u0000\u0000\u0005\u0000`gnt\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}