// Generated from AssemblerGrama.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerGramaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTERRUPT=1, MOV=2, PUSH=3, XOR=4, COMMA=5, MUL=6, ADD=7, SUB=8, LPAREN=9, 
		RPAREN=10, INT=11, REGISTER=12, WS=13, SPACE=14, ANY_CHAR=15, EOL=16;
	public static final int
		RULE_begin = 0, RULE_inter = 1, RULE_mov = 2, RULE_push = 3, RULE_xor = 4, 
		RULE_expression = 5;
	public static final String[] ruleNames = {
		"begin", "inter", "mov", "push", "xor", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'mov '", "'push '", "'xor '", "','", "'*'", "'+'", "'-'", 
		"'('", "')'", null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTERRUPT", "MOV", "PUSH", "XOR", "COMMA", "MUL", "ADD", "SUB", 
		"LPAREN", "RPAREN", "INT", "REGISTER", "WS", "SPACE", "ANY_CHAR", "EOL"
	};
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
	public String getGrammarFileName() { return "AssemblerGrama.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblerGramaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BeginContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AssemblerGramaParser.EOF, 0); }
		public InterContext inter() {
			return getRuleContext(InterContext.class,0);
		}
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public XorContext xor() {
			return getRuleContext(XorContext.class,0);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERRUPT:
				{
				setState(12);
				inter();
				}
				break;
			case MOV:
				{
				setState(13);
				mov();
				}
				break;
			case PUSH:
				{
				setState(14);
				push();
				}
				break;
			case XOR:
				{
				setState(15);
				xor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(18);
			match(EOF);
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

	public static class InterContext extends ParserRuleContext {
		public TerminalNode INTERRUPT() { return getToken(AssemblerGramaParser.INTERRUPT, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AssemblerGramaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AssemblerGramaParser.SPACE, i);
		}
		public InterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterInter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitInter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitInter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterContext inter() throws RecognitionException {
		InterContext _localctx = new InterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(INTERRUPT);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(21);
				match(SPACE);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MovContext extends ParserRuleContext {
		public ExpressionContext left;
		public Token right;
		public TerminalNode MOV() { return getToken(AssemblerGramaParser.MOV, 0); }
		public TerminalNode COMMA() { return getToken(AssemblerGramaParser.COMMA, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AssemblerGramaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AssemblerGramaParser.SPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(AssemblerGramaParser.REGISTER, 0); }
		public MovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterMov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitMov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitMov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovContext mov() throws RecognitionException {
		MovContext _localctx = new MovContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mov);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(MOV);
			setState(28);
			((MovContext)_localctx).left = expression(0);
			setState(29);
			match(COMMA);
			setState(30);
			match(SPACE);
			setState(31);
			((MovContext)_localctx).right = match(REGISTER);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(32);
				match(SPACE);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(AssemblerGramaParser.PUSH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AssemblerGramaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AssemblerGramaParser.SPACE, i);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_push);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PUSH);
			setState(39);
			expression(0);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(40);
				match(SPACE);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class XorContext extends ParserRuleContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode XOR() { return getToken(AssemblerGramaParser.XOR, 0); }
		public TerminalNode COMMA() { return getToken(AssemblerGramaParser.COMMA, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AssemblerGramaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AssemblerGramaParser.SPACE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public XorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorContext xor() throws RecognitionException {
		XorContext _localctx = new XorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_xor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(XOR);
			setState(47);
			((XorContext)_localctx).left = expression(0);
			setState(48);
			match(COMMA);
			setState(49);
			match(SPACE);
			setState(50);
			((XorContext)_localctx).right = expression(0);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(51);
				match(SPACE);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(AssemblerGramaParser.ADD, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AssemblerGramaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AssemblerGramaParser.SPACE, i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(AssemblerGramaParser.SUB, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AssemblerGramaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AssemblerGramaParser.SPACE, i);
		}
		public SubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(AssemblerGramaParser.SUB, 0); }
		public TerminalNode INT() { return getToken(AssemblerGramaParser.INT, 0); }
		public TerminalNode SPACE() { return getToken(AssemblerGramaParser.SPACE, 0); }
		public MinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegContext extends ExpressionContext {
		public TerminalNode REGISTER() { return getToken(AssemblerGramaParser.REGISTER, 0); }
		public RegContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitReg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitReg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AssemblerGramaParser.MUL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(AssemblerGramaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AssemblerGramaParser.SPACE, i);
		}
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(AssemblerGramaParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(AssemblerGramaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AssemblerGramaParser.RPAREN, 0); }
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGramaListener ) ((AssemblerGramaListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerGramaVisitor ) return ((AssemblerGramaVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				match(INT);
				}
				break;
			case SUB:
				{
				_localctx = new MinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(SUB);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(60);
					match(SPACE);
					}
				}

				setState(63);
				match(INT);
				}
				break;
			case REGISTER:
				{
				_localctx = new RegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(REGISTER);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(LPAREN);
				setState(66);
				expression(0);
				setState(67);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						((MulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(72);
							match(SPACE);
							}
						}

						{
						setState(75);
						match(MUL);
						}
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(76);
							match(SPACE);
							}
						}

						setState(79);
						((MulContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						((AddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(81);
							match(SPACE);
							}
						}

						{
						setState(84);
						match(ADD);
						}
						setState(86);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(85);
							match(SPACE);
							}
						}

						setState(88);
						((AddContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new SubContext(new ExpressionContext(_parentctx, _parentState));
						((SubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(90);
							match(SPACE);
							}
						}

						{
						setState(93);
						match(SUB);
						}
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(94);
							match(SPACE);
							}
						}

						setState(97);
						((SubContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\2\3\2"+
		"\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4$\n\4"+
		"\f\4\16\4\'\13\4\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\67\n\6\f\6\16\6:\13\6\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7H\n\7\3\7\3\7\5\7L\n\7\3\7\3\7\5\7P\n\7\3\7\3\7\3\7\5"+
		"\7U\n\7\3\7\3\7\5\7Y\n\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\5\7b\n\7\3\7\7\7"+
		"e\n\7\f\7\16\7h\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\2\2w\2\22\3\2\2\2\4\26"+
		"\3\2\2\2\6\35\3\2\2\2\b(\3\2\2\2\n\60\3\2\2\2\fG\3\2\2\2\16\23\5\4\3\2"+
		"\17\23\5\6\4\2\20\23\5\b\5\2\21\23\5\n\6\2\22\16\3\2\2\2\22\17\3\2\2\2"+
		"\22\20\3\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2"+
		"\26\32\7\3\2\2\27\31\7\20\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2"+
		"\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\36\7\4\2\2\36\37\5\f\7"+
		"\2\37 \7\7\2\2 !\7\20\2\2!%\7\16\2\2\"$\7\20\2\2#\"\3\2\2\2$\'\3\2\2\2"+
		"%#\3\2\2\2%&\3\2\2\2&\7\3\2\2\2\'%\3\2\2\2()\7\5\2\2)-\5\f\7\2*,\7\20"+
		"\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2/-\3\2\2\2\60\61"+
		"\7\6\2\2\61\62\5\f\7\2\62\63\7\7\2\2\63\64\7\20\2\2\648\5\f\7\2\65\67"+
		"\7\20\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2"+
		":8\3\2\2\2;<\b\7\1\2<H\7\r\2\2=?\7\n\2\2>@\7\20\2\2?>\3\2\2\2?@\3\2\2"+
		"\2@A\3\2\2\2AH\7\r\2\2BH\7\16\2\2CD\7\13\2\2DE\5\f\7\2EF\7\f\2\2FH\3\2"+
		"\2\2G;\3\2\2\2G=\3\2\2\2GB\3\2\2\2GC\3\2\2\2Hf\3\2\2\2IK\f\t\2\2JL\7\20"+
		"\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\7\b\2\2NP\7\20\2\2ON\3\2\2\2OP\3"+
		"\2\2\2PQ\3\2\2\2Qe\5\f\7\nRT\f\b\2\2SU\7\20\2\2TS\3\2\2\2TU\3\2\2\2UV"+
		"\3\2\2\2VX\7\t\2\2WY\7\20\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Ze\5\f\7\t"+
		"[]\f\7\2\2\\^\7\20\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\7\n\2\2`b\7\20"+
		"\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\5\f\7\bdI\3\2\2\2dR\3\2\2\2d[\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hf\3\2\2\2\21\22\32%-8?G"+
		"KOTX]adf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}