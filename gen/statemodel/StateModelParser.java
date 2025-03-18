// Generated from C:/Users/amine/IdeaProjects/Homework/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STATES=1, TRANSITIONS=2, INITIAL=3, NORMAL=4, ERROR=5, TRANS=6, LBRACE=7, 
		RBRACE=8, COLON=9, ARROW=10, COMMA=11, SEMI=12, STATE_NAME=13, LABEL=14, 
		TRANS_NAME=15, WS=16;
	public static final int
		RULE_model = 0, RULE_states = 1, RULE_state = 2, RULE_labels = 3, RULE_transitions = 4, 
		RULE_transition = 5, RULE_transScheme = 6, RULE_transDefinition = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "states", "state", "labels", "transitions", "transition", "transScheme", 
			"transDefinition"
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

	@Override
	public String getGrammarFileName() { return "StateModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public StatesContext states() {
			return getRuleContext(StatesContext.class,0);
		}
		public TransitionsContext transitions() {
			return getRuleContext(TransitionsContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			states();
			setState(17);
			transitions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatesContext extends ParserRuleContext {
		public TerminalNode STATES() { return getToken(StateModelParser.STATES, 0); }
		public TerminalNode LBRACE() { return getToken(StateModelParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateModelParser.RBRACE, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesContext states() throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(STATES);
			setState(20);
			match(LBRACE);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				state();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INITIAL || _la==STATE_NAME );
			setState(26);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE_NAME() { return getToken(StateModelParser.STATE_NAME, 0); }
		public TerminalNode LBRACE() { return getToken(StateModelParser.LBRACE, 0); }
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(StateModelParser.RBRACE, 0); }
		public TerminalNode INITIAL() { return getToken(StateModelParser.INITIAL, 0); }
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(28);
				match(INITIAL);
				}
			}

			setState(31);
			match(STATE_NAME);
			setState(32);
			match(LBRACE);
			setState(33);
			labels();
			setState(34);
			match(RBRACE);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ERROR) {
				{
				setState(35);
				match(ERROR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelsContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(StateModelParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(StateModelParser.LABEL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateModelParser.COMMA, i);
		}
		public LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelsContext labels() throws RecognitionException {
		LabelsContext _localctx = new LabelsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(38);
				match(LABEL);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(39);
					match(COMMA);
					setState(40);
					match(LABEL);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionsContext extends ParserRuleContext {
		public TerminalNode TRANSITIONS() { return getToken(StateModelParser.TRANSITIONS, 0); }
		public TerminalNode LBRACE() { return getToken(StateModelParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateModelParser.RBRACE, 0); }
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(TRANSITIONS);
			setState(49);
			match(LBRACE);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANS || _la==TRANS_NAME) {
				{
				{
				setState(50);
				transition();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionContext extends ParserRuleContext {
		public TransSchemeContext transScheme() {
			return getRuleContext(TransSchemeContext.class,0);
		}
		public TransDefinitionContext transDefinition() {
			return getRuleContext(TransDefinitionContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transition);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRANS:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				transScheme();
				}
				break;
			case TRANS_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				transDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransSchemeContext extends ParserRuleContext {
		public TerminalNode TRANS() { return getToken(StateModelParser.TRANS, 0); }
		public TerminalNode TRANS_NAME() { return getToken(StateModelParser.TRANS_NAME, 0); }
		public TerminalNode NORMAL() { return getToken(StateModelParser.NORMAL, 0); }
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public TransSchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transScheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransSchemeContext transScheme() throws RecognitionException {
		TransSchemeContext _localctx = new TransSchemeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transScheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TRANS);
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==NORMAL || _la==ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			match(TRANS_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransDefinitionContext extends ParserRuleContext {
		public TerminalNode TRANS_NAME() { return getToken(StateModelParser.TRANS_NAME, 0); }
		public TerminalNode COLON() { return getToken(StateModelParser.COLON, 0); }
		public List<TerminalNode> STATE_NAME() { return getTokens(StateModelParser.STATE_NAME); }
		public TerminalNode STATE_NAME(int i) {
			return getToken(StateModelParser.STATE_NAME, i);
		}
		public TerminalNode ARROW() { return getToken(StateModelParser.ARROW, 0); }
		public TransDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransDefinitionContext transDefinition() throws RecognitionException {
		TransDefinitionContext _localctx = new TransDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(TRANS_NAME);
			setState(67);
			match(COLON);
			setState(68);
			match(STATE_NAME);
			setState(69);
			match(ARROW);
			setState(70);
			match(STATE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u0017\b\u0001\u000b\u0001\f\u0001\u0018\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0003\u0002\u001e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003*\b\u0003\n\u0003\f\u0003-\t\u0003\u0003\u0003"+
		"/\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00044\b\u0004\n\u0004"+
		"\f\u00047\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005=\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001"+
		"\u0000\u0004\u0005G\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0013\u0001"+
		"\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u0006.\u0001\u0000"+
		"\u0000\u0000\b0\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\f>"+
		"\u0001\u0000\u0000\u0000\u000eB\u0001\u0000\u0000\u0000\u0010\u0011\u0003"+
		"\u0002\u0001\u0000\u0011\u0012\u0003\b\u0004\u0000\u0012\u0001\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0016\u0005\u0007"+
		"\u0000\u0000\u0015\u0017\u0003\u0004\u0002\u0000\u0016\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0005\b\u0000\u0000\u001b\u0003\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0005\u0003\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\r\u0000\u0000 !\u0005\u0007\u0000\u0000!\"\u0003\u0006"+
		"\u0003\u0000\"$\u0005\b\u0000\u0000#%\u0005\u0005\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0005\u0001\u0000\u0000"+
		"\u0000&+\u0005\u000e\u0000\u0000\'(\u0005\u000b\u0000\u0000(*\u0005\u000e"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000.&\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/\u0007\u0001\u0000\u0000\u000001\u0005\u0002\u0000\u000015\u0005"+
		"\u0007\u0000\u000024\u0003\n\u0005\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\b\u0000\u0000"+
		"9\t\u0001\u0000\u0000\u0000:=\u0003\f\u0006\u0000;=\u0003\u000e\u0007"+
		"\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u000b\u0001"+
		"\u0000\u0000\u0000>?\u0005\u0006\u0000\u0000?@\u0007\u0000\u0000\u0000"+
		"@A\u0005\u000f\u0000\u0000A\r\u0001\u0000\u0000\u0000BC\u0005\u000f\u0000"+
		"\u0000CD\u0005\t\u0000\u0000DE\u0005\r\u0000\u0000EF\u0005\n\u0000\u0000"+
		"FG\u0005\r\u0000\u0000G\u000f\u0001\u0000\u0000\u0000\u0007\u0018\u001d"+
		"$+.5<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}