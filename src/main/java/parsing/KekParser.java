// Generated from D:/fun/kek/src/main/grammar\Kek.g4 by ANTLR 4.7
package parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KekParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ID=29, INT=30, WS=31, COMMENT=32, 
		LINE_COMMENT=33;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_expression = 2, RULE_prefix_operator = 3, 
		RULE_multiplicative_operator = 4, RULE_additive_operator = 5, RULE_shift_operator = 6, 
		RULE_comparison_operator = 7, RULE_equality_operator = 8, RULE_bitwise_operator = 9;
	public static final String[] ruleNames = {
		"file", "statement", "expression", "prefix_operator", "multiplicative_operator", 
		"additive_operator", "shift_operator", "comparison_operator", "equality_operator", 
		"bitwise_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'**'", "'&&'", "'||'", "'='", "'+'", "'-'", 
		"'!'", "'~'", "'++'", "'--'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'^'", "'&^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ID", "INT", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Kek.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KekParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KekParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	public static class StatementContext extends ParserRuleContext {
		public lang.Statement stmt;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((StatementContext)_localctx).e = expression(0);
			setState(29);
			match(T__0);
			 ((StatementContext)_localctx).stmt =  new lang.Statement(((StatementContext)_localctx).e.expr); 
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
		public lang.expr.Expression expr;
		public ExpressionContext l;
		public ExpressionContext e;
		public Prefix_operatorContext prop;
		public Token ID;
		public Token INT;
		public ExpressionContext r;
		public Multiplicative_operatorContext mop;
		public Additive_operatorContext aop;
		public Shift_operatorContext sop;
		public Comparison_operatorContext cop;
		public Equality_operatorContext eop;
		public Bitwise_operatorContext bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public TerminalNode ID() { return getToken(KekParser.ID, 0); }
		public TerminalNode INT() { return getToken(KekParser.INT, 0); }
		public Multiplicative_operatorContext multiplicative_operator() {
			return getRuleContext(Multiplicative_operatorContext.class,0);
		}
		public Additive_operatorContext additive_operator() {
			return getRuleContext(Additive_operatorContext.class,0);
		}
		public Shift_operatorContext shift_operator() {
			return getRuleContext(Shift_operatorContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Bitwise_operatorContext bitwise_operator() {
			return getRuleContext(Bitwise_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(33);
				match(T__1);
				setState(34);
				((ExpressionContext)_localctx).e = expression(0);
				setState(35);
				match(T__2);
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).e.expr; 
				}
				break;
			case 2:
				{
				setState(38);
				((ExpressionContext)_localctx).prop = prefix_operator();
				setState(39);
				((ExpressionContext)_localctx).e = expression(13);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).prop.op, ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 3:
				{
				setState(42);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(43);
				match(T__6);
				setState(44);
				((ExpressionContext)_localctx).e = expression(3);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.setter(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 4:
				{
				setState(47);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.getter(((ExpressionContext)_localctx).ID.getText()); 
				}
				break;
			case 5:
				{
				setState(49);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.constant(((ExpressionContext)_localctx).INT.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(54);
						match(T__3);
						setState(55);
						((ExpressionContext)_localctx).r = expression(12);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.EXPONENT, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(59);
						((ExpressionContext)_localctx).mop = multiplicative_operator();
						setState(60);
						((ExpressionContext)_localctx).r = expression(12);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).mop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(64);
						((ExpressionContext)_localctx).aop = additive_operator();
						setState(65);
						((ExpressionContext)_localctx).r = expression(11);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).aop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(69);
						((ExpressionContext)_localctx).sop = shift_operator();
						setState(70);
						((ExpressionContext)_localctx).r = expression(10);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).sop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(74);
						((ExpressionContext)_localctx).cop = comparison_operator();
						setState(75);
						((ExpressionContext)_localctx).r = expression(9);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).cop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(79);
						((ExpressionContext)_localctx).eop = equality_operator();
						setState(80);
						((ExpressionContext)_localctx).r = expression(8);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).eop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(84);
						((ExpressionContext)_localctx).bop = bitwise_operator();
						setState(85);
						((ExpressionContext)_localctx).r = expression(7);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).bop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(89);
						match(T__4);
						setState(90);
						((ExpressionContext)_localctx).r = expression(5);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.AND, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(T__5);
						setState(95);
						((ExpressionContext)_localctx).r = expression(4);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.OR, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Prefix_operatorContext extends ParserRuleContext {
		public lang.Operator op;
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitPrefix_operator(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix_operator);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__7);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_PLUS; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__8);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_MINUS; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(T__9);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.NOT; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(T__10);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.BIT_NOT; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(T__11);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.PRE_INC; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				match(T__12);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.PRE_DEC; 
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

	public static class Multiplicative_operatorContext extends ParserRuleContext {
		public lang.Operator op;
		public Multiplicative_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterMultiplicative_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitMultiplicative_operator(this);
		}
	}

	public final Multiplicative_operatorContext multiplicative_operator() throws RecognitionException {
		Multiplicative_operatorContext _localctx = new Multiplicative_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiplicative_operator);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__13);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.MULTIPLY; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__14);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.DIVIDE; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(T__15);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.REMNANT; 
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

	public static class Additive_operatorContext extends ParserRuleContext {
		public lang.Operator op;
		public Additive_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterAdditive_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitAdditive_operator(this);
		}
	}

	public final Additive_operatorContext additive_operator() throws RecognitionException {
		Additive_operatorContext _localctx = new Additive_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_additive_operator);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__7);
				 ((Additive_operatorContext)_localctx).op =  lang.Operator.ADD; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__8);
				 ((Additive_operatorContext)_localctx).op =  lang.Operator.SUBTRACT; 
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

	public static class Shift_operatorContext extends ParserRuleContext {
		public lang.Operator op;
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterShift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitShift_operator(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shift_operator);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__16);
				 ((Shift_operatorContext)_localctx).op =  lang.Operator.LEFT_SHIFT; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__17);
				 ((Shift_operatorContext)_localctx).op =  lang.Operator.RIGHT_SHIFT; 
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

	public static class Comparison_operatorContext extends ParserRuleContext {
		public lang.Operator op;
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison_operator);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__18);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS; 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__19);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.GREATER; 
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(T__20);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS_EQUAL; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(T__21);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.GREATER_EQUAL; 
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

	public static class Equality_operatorContext extends ParserRuleContext {
		public lang.Operator op;
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitEquality_operator(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_equality_operator);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__22);
				 ((Equality_operatorContext)_localctx).op =  lang.Operator.EQUAL; 
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__23);
				 ((Equality_operatorContext)_localctx).op =  lang.Operator.NOT_EQUAL; 
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

	public static class Bitwise_operatorContext extends ParserRuleContext {
		public lang.Operator op;
		public Bitwise_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterBitwise_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitBitwise_operator(this);
		}
	}

	public final Bitwise_operatorContext bitwise_operator() throws RecognitionException {
		Bitwise_operatorContext _localctx = new Bitwise_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bitwise_operator);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__24);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_AND; 
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__25);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_OR; 
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__26);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_XOR; 
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__27);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_CLEAR; 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4e\n\4\f\4\16\4h\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5v\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\5\7\u0084\n\7\3\b\3\b\3\b\3\b"+
		"\5\b\u008a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3"+
		"\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a4"+
		"\n\13\3\13\2\3\6\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u00b9\2\31\3\2\2\2\4"+
		"\36\3\2\2\2\6\65\3\2\2\2\bu\3\2\2\2\n}\3\2\2\2\f\u0083\3\2\2\2\16\u0089"+
		"\3\2\2\2\20\u0093\3\2\2\2\22\u0099\3\2\2\2\24\u00a3\3\2\2\2\26\30\5\4"+
		"\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2"+
		"\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\37\5\6\4\2\37 \7\3\2"+
		"\2 !\b\3\1\2!\5\3\2\2\2\"#\b\4\1\2#$\7\4\2\2$%\5\6\4\2%&\7\5\2\2&\'\b"+
		"\4\1\2\'\66\3\2\2\2()\5\b\5\2)*\5\6\4\17*+\b\4\1\2+\66\3\2\2\2,-\7\37"+
		"\2\2-.\7\t\2\2./\5\6\4\5/\60\b\4\1\2\60\66\3\2\2\2\61\62\7\37\2\2\62\66"+
		"\b\4\1\2\63\64\7 \2\2\64\66\b\4\1\2\65\"\3\2\2\2\65(\3\2\2\2\65,\3\2\2"+
		"\2\65\61\3\2\2\2\65\63\3\2\2\2\66f\3\2\2\2\678\f\16\2\289\7\6\2\29:\5"+
		"\6\4\16:;\b\4\1\2;e\3\2\2\2<=\f\r\2\2=>\5\n\6\2>?\5\6\4\16?@\b\4\1\2@"+
		"e\3\2\2\2AB\f\f\2\2BC\5\f\7\2CD\5\6\4\rDE\b\4\1\2Ee\3\2\2\2FG\f\13\2\2"+
		"GH\5\16\b\2HI\5\6\4\fIJ\b\4\1\2Je\3\2\2\2KL\f\n\2\2LM\5\20\t\2MN\5\6\4"+
		"\13NO\b\4\1\2Oe\3\2\2\2PQ\f\t\2\2QR\5\22\n\2RS\5\6\4\nST\b\4\1\2Te\3\2"+
		"\2\2UV\f\b\2\2VW\5\24\13\2WX\5\6\4\tXY\b\4\1\2Ye\3\2\2\2Z[\f\7\2\2[\\"+
		"\7\7\2\2\\]\5\6\4\7]^\b\4\1\2^e\3\2\2\2_`\f\6\2\2`a\7\b\2\2ab\5\6\4\6"+
		"bc\b\4\1\2ce\3\2\2\2d\67\3\2\2\2d<\3\2\2\2dA\3\2\2\2dF\3\2\2\2dK\3\2\2"+
		"\2dP\3\2\2\2dU\3\2\2\2dZ\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\7\3\2\2\2hf\3\2\2\2ij\7\n\2\2jv\b\5\1\2kl\7\13\2\2lv\b\5\1\2mn\7\f"+
		"\2\2nv\b\5\1\2op\7\r\2\2pv\b\5\1\2qr\7\16\2\2rv\b\5\1\2st\7\17\2\2tv\b"+
		"\5\1\2ui\3\2\2\2uk\3\2\2\2um\3\2\2\2uo\3\2\2\2uq\3\2\2\2us\3\2\2\2v\t"+
		"\3\2\2\2wx\7\20\2\2x~\b\6\1\2yz\7\21\2\2z~\b\6\1\2{|\7\22\2\2|~\b\6\1"+
		"\2}w\3\2\2\2}y\3\2\2\2}{\3\2\2\2~\13\3\2\2\2\177\u0080\7\n\2\2\u0080\u0084"+
		"\b\7\1\2\u0081\u0082\7\13\2\2\u0082\u0084\b\7\1\2\u0083\177\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\r\3\2\2\2\u0085\u0086\7\23\2\2\u0086\u008a\b\b\1"+
		"\2\u0087\u0088\7\24\2\2\u0088\u008a\b\b\1\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\7\25\2\2\u008c\u0094\b\t\1"+
		"\2\u008d\u008e\7\26\2\2\u008e\u0094\b\t\1\2\u008f\u0090\7\27\2\2\u0090"+
		"\u0094\b\t\1\2\u0091\u0092\7\30\2\2\u0092\u0094\b\t\1\2\u0093\u008b\3"+
		"\2\2\2\u0093\u008d\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\21\3\2\2\2\u0095\u0096\7\31\2\2\u0096\u009a\b\n\1\2\u0097\u0098\7\32"+
		"\2\2\u0098\u009a\b\n\1\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\23\3\2\2\2\u009b\u009c\7\33\2\2\u009c\u00a4\b\13\1\2\u009d\u009e\7\34"+
		"\2\2\u009e\u00a4\b\13\1\2\u009f\u00a0\7\35\2\2\u00a0\u00a4\b\13\1\2\u00a1"+
		"\u00a2\7\36\2\2\u00a2\u00a4\b\13\1\2\u00a3\u009b\3\2\2\2\u00a3\u009d\3"+
		"\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\25\3\2\2\2\r\31\65"+
		"dfu}\u0083\u0089\u0093\u0099\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}