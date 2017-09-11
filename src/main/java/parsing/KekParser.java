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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, ID=30, INT=31, WS=32, 
		COMMENT=33, LINE_COMMENT=34;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_expression = 2, RULE_primary_expression = 3, 
		RULE_prefix_operator = 4, RULE_multiplicative_operator = 5, RULE_additive_operator = 6, 
		RULE_shift_operator = 7, RULE_comparison_operator = 8, RULE_equality_operator = 9, 
		RULE_bitwise_operator = 10;
	public static final String[] ruleNames = {
		"file", "statement", "expression", "primary_expression", "prefix_operator", 
		"multiplicative_operator", "additive_operator", "shift_operator", "comparison_operator", 
		"equality_operator", "bitwise_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'**'", "'&&'", "'||'", "'='", "'.'", "'+'", 
		"'-'", "'!'", "'~'", "'++'", "'--'", "'*'", "'/'", "'%'", "'<<'", "'>>'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'^'", "'&^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ID", "INT", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
			setState(30);
			((StatementContext)_localctx).e = expression(0);
			setState(31);
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
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(35);
				match(T__1);
				setState(36);
				((ExpressionContext)_localctx).e = expression(0);
				setState(37);
				match(T__2);
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).e.expr; 
				}
				break;
			case 2:
				{
				setState(40);
				primary_expression(0);
				}
				break;
			case 3:
				{
				setState(41);
				((ExpressionContext)_localctx).prop = prefix_operator();
				setState(42);
				((ExpressionContext)_localctx).e = expression(13);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).prop.op, ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 4:
				{
				setState(45);
				primary_expression(0);
				setState(46);
				match(T__6);
				setState(47);
				((ExpressionContext)_localctx).e = expression(3);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.setter(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 5:
				{
				setState(50);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.getter(((ExpressionContext)_localctx).ID.getText()); 
				}
				break;
			case 6:
				{
				setState(52);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.constant(((ExpressionContext)_localctx).INT.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(57);
						match(T__3);
						setState(58);
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
						setState(61);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(62);
						((ExpressionContext)_localctx).mop = multiplicative_operator();
						setState(63);
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
						setState(66);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(67);
						((ExpressionContext)_localctx).aop = additive_operator();
						setState(68);
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
						setState(71);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(72);
						((ExpressionContext)_localctx).sop = shift_operator();
						setState(73);
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
						setState(76);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(77);
						((ExpressionContext)_localctx).cop = comparison_operator();
						setState(78);
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
						setState(81);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(82);
						((ExpressionContext)_localctx).eop = equality_operator();
						setState(83);
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
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87);
						((ExpressionContext)_localctx).bop = bitwise_operator();
						setState(88);
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
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
						match(T__4);
						setState(93);
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
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						match(T__5);
						setState(98);
						((ExpressionContext)_localctx).r = expression(4);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.OR, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					}
					} 
				}
				setState(105);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public lang.expr.Expression expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(KekParser.ID, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		return primary_expression(0);
	}

	private Primary_expressionContext primary_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, _parentState);
		Primary_expressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_primary_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(107);
			match(T__1);
			setState(108);
			expression(0);
			setState(109);
			match(T__2);
			setState(110);
			match(T__7);
			setState(111);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Primary_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
					setState(113);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(114);
					match(T__7);
					setState(115);
					match(ID);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 8, RULE_prefix_operator);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__8);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_PLUS; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__9);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_MINUS; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__10);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.NOT; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__11);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.BIT_NOT; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(T__12);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.PRE_INC; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				match(T__13);
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
		enterRule(_localctx, 10, RULE_multiplicative_operator);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__14);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.MULTIPLY; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__15);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.DIVIDE; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__16);
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
		enterRule(_localctx, 12, RULE_additive_operator);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__8);
				 ((Additive_operatorContext)_localctx).op =  lang.Operator.ADD; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__9);
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
		enterRule(_localctx, 14, RULE_shift_operator);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__17);
				 ((Shift_operatorContext)_localctx).op =  lang.Operator.LEFT_SHIFT; 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__18);
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
		enterRule(_localctx, 16, RULE_comparison_operator);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__19);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS; 
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__20);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.GREATER; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__21);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS_EQUAL; 
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__22);
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
		enterRule(_localctx, 18, RULE_equality_operator);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__23);
				 ((Equality_operatorContext)_localctx).op =  lang.Operator.EQUAL; 
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__24);
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
		enterRule(_localctx, 20, RULE_bitwise_operator);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__25);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_AND; 
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__26);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_OR; 
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__27);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_XOR; 
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__28);
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
		case 3:
			return primary_expression_sempred((Primary_expressionContext)_localctx, predIndex);
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
	private boolean primary_expression_sempred(Primary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4h\n\4\f"+
		"\4\16\4k\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16"+
		"\5z\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0088\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3"+
		"\t\3\t\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a6"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00b6\n\f\3\f\2\4\6\b\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00cc"+
		"\2\33\3\2\2\2\4 \3\2\2\2\68\3\2\2\2\bl\3\2\2\2\n\u0087\3\2\2\2\f\u008f"+
		"\3\2\2\2\16\u0095\3\2\2\2\20\u009b\3\2\2\2\22\u00a5\3\2\2\2\24\u00ab\3"+
		"\2\2\2\26\u00b5\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3"+
		"\3\2\2\2 !\5\6\4\2!\"\7\3\2\2\"#\b\3\1\2#\5\3\2\2\2$%\b\4\1\2%&\7\4\2"+
		"\2&\'\5\6\4\2\'(\7\5\2\2()\b\4\1\2)9\3\2\2\2*9\5\b\5\2+,\5\n\6\2,-\5\6"+
		"\4\17-.\b\4\1\2.9\3\2\2\2/\60\5\b\5\2\60\61\7\t\2\2\61\62\5\6\4\5\62\63"+
		"\b\4\1\2\639\3\2\2\2\64\65\7 \2\2\659\b\4\1\2\66\67\7!\2\2\679\b\4\1\2"+
		"8$\3\2\2\28*\3\2\2\28+\3\2\2\28/\3\2\2\28\64\3\2\2\28\66\3\2\2\29i\3\2"+
		"\2\2:;\f\16\2\2;<\7\6\2\2<=\5\6\4\16=>\b\4\1\2>h\3\2\2\2?@\f\r\2\2@A\5"+
		"\f\7\2AB\5\6\4\16BC\b\4\1\2Ch\3\2\2\2DE\f\f\2\2EF\5\16\b\2FG\5\6\4\rG"+
		"H\b\4\1\2Hh\3\2\2\2IJ\f\13\2\2JK\5\20\t\2KL\5\6\4\fLM\b\4\1\2Mh\3\2\2"+
		"\2NO\f\n\2\2OP\5\22\n\2PQ\5\6\4\13QR\b\4\1\2Rh\3\2\2\2ST\f\t\2\2TU\5\24"+
		"\13\2UV\5\6\4\nVW\b\4\1\2Wh\3\2\2\2XY\f\b\2\2YZ\5\26\f\2Z[\5\6\4\t[\\"+
		"\b\4\1\2\\h\3\2\2\2]^\f\7\2\2^_\7\7\2\2_`\5\6\4\7`a\b\4\1\2ah\3\2\2\2"+
		"bc\f\6\2\2cd\7\b\2\2de\5\6\4\6ef\b\4\1\2fh\3\2\2\2g:\3\2\2\2g?\3\2\2\2"+
		"gD\3\2\2\2gI\3\2\2\2gN\3\2\2\2gS\3\2\2\2gX\3\2\2\2g]\3\2\2\2gb\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\7\3\2\2\2ki\3\2\2\2lm\b\5\1\2mn\7\4\2"+
		"\2no\5\6\4\2op\7\5\2\2pq\7\n\2\2qr\7 \2\2rx\3\2\2\2st\f\3\2\2tu\7\n\2"+
		"\2uw\7 \2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\t\3\2\2\2zx\3\2\2"+
		"\2{|\7\13\2\2|\u0088\b\6\1\2}~\7\f\2\2~\u0088\b\6\1\2\177\u0080\7\r\2"+
		"\2\u0080\u0088\b\6\1\2\u0081\u0082\7\16\2\2\u0082\u0088\b\6\1\2\u0083"+
		"\u0084\7\17\2\2\u0084\u0088\b\6\1\2\u0085\u0086\7\20\2\2\u0086\u0088\b"+
		"\6\1\2\u0087{\3\2\2\2\u0087}\3\2\2\2\u0087\177\3\2\2\2\u0087\u0081\3\2"+
		"\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\13\3\2\2\2\u0089\u008a"+
		"\7\21\2\2\u008a\u0090\b\7\1\2\u008b\u008c\7\22\2\2\u008c\u0090\b\7\1\2"+
		"\u008d\u008e\7\23\2\2\u008e\u0090\b\7\1\2\u008f\u0089\3\2\2\2\u008f\u008b"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\r\3\2\2\2\u0091\u0092\7\13\2\2\u0092"+
		"\u0096\b\b\1\2\u0093\u0094\7\f\2\2\u0094\u0096\b\b\1\2\u0095\u0091\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u009c"+
		"\b\t\1\2\u0099\u009a\7\25\2\2\u009a\u009c\b\t\1\2\u009b\u0097\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009c\21\3\2\2\2\u009d\u009e\7\26\2\2\u009e\u00a6"+
		"\b\n\1\2\u009f\u00a0\7\27\2\2\u00a0\u00a6\b\n\1\2\u00a1\u00a2\7\30\2\2"+
		"\u00a2\u00a6\b\n\1\2\u00a3\u00a4\7\31\2\2\u00a4\u00a6\b\n\1\2\u00a5\u009d"+
		"\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\23\3\2\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00ac\b\13\1\2\u00a9\u00aa\7\33"+
		"\2\2\u00aa\u00ac\b\13\1\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00b6\b\f\1\2\u00af\u00b0\7\35"+
		"\2\2\u00b0\u00b6\b\f\1\2\u00b1\u00b2\7\36\2\2\u00b2\u00b6\b\f\1\2\u00b3"+
		"\u00b4\7\37\2\2\u00b4\u00b6\b\f\1\2\u00b5\u00ad\3\2\2\2\u00b5\u00af\3"+
		"\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\27\3\2\2\2\16\33"+
		"8gix\u0087\u008f\u0095\u009b\u00a5\u00ab\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}