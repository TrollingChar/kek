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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ID=31, INT=32, 
		WS=33, COMMENT=34, LINE_COMMENT=35;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_expression = 2, RULE_primary_expression = 3, 
		RULE_expression_list = 4, RULE_prefix_operator = 5, RULE_multiplicative_operator = 6, 
		RULE_additive_operator = 7, RULE_shift_operator = 8, RULE_comparison_operator = 9, 
		RULE_equality_operator = 10, RULE_bitwise_operator = 11;
	public static final String[] ruleNames = {
		"file", "statement", "expression", "primary_expression", "expression_list", 
		"prefix_operator", "multiplicative_operator", "additive_operator", "shift_operator", 
		"comparison_operator", "equality_operator", "bitwise_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'**'", "'&&'", "'||'", "'.'", "'='", "'('", "')'", "','", 
		"'+'", "'-'", "'!'", "'~'", "'++'", "'--'", "'*'", "'/'", "'%'", "'<<'", 
		"'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'^'", 
		"'&^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ID", "INT", "WS", "COMMENT", 
		"LINE_COMMENT"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
			setState(32);
			((StatementContext)_localctx).e = expression(0);
			setState(33);
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
		public Primary_expressionContext pe;
		public Prefix_operatorContext prop;
		public ExpressionContext e;
		public Token ID;
		public ExpressionContext r;
		public Multiplicative_operatorContext mop;
		public Additive_operatorContext aop;
		public Shift_operatorContext sop;
		public Comparison_operatorContext cop;
		public Equality_operatorContext eop;
		public Bitwise_operatorContext bop;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(KekParser.ID, 0); }
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				((ExpressionContext)_localctx).pe = primary_expression(0);
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).pe.expr; 
				}
				break;
			case 2:
				{
				setState(40);
				((ExpressionContext)_localctx).prop = prefix_operator();
				setState(41);
				((ExpressionContext)_localctx).e = expression(12);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).prop.op, ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 3:
				{
				setState(44);
				((ExpressionContext)_localctx).pe = primary_expression(0);
				setState(45);
				match(T__4);
				setState(46);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(47);
				match(T__5);
				setState(48);
				((ExpressionContext)_localctx).e = expression(2);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.setter(((ExpressionContext)_localctx).pe.expr, ((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 4:
				{
				setState(51);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(52);
				match(T__5);
				setState(53);
				((ExpressionContext)_localctx).e = expression(1);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.setter(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(59);
						match(T__1);
						setState(60);
						((ExpressionContext)_localctx).r = expression(11);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.EXPONENT, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(64);
						((ExpressionContext)_localctx).mop = multiplicative_operator();
						setState(65);
						((ExpressionContext)_localctx).r = expression(11);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).mop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(69);
						((ExpressionContext)_localctx).aop = additive_operator();
						setState(70);
						((ExpressionContext)_localctx).r = expression(10);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).aop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(74);
						((ExpressionContext)_localctx).sop = shift_operator();
						setState(75);
						((ExpressionContext)_localctx).r = expression(9);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).sop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(79);
						((ExpressionContext)_localctx).cop = comparison_operator();
						setState(80);
						((ExpressionContext)_localctx).r = expression(8);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).cop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(84);
						((ExpressionContext)_localctx).eop = equality_operator();
						setState(85);
						((ExpressionContext)_localctx).r = expression(7);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).eop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(89);
						((ExpressionContext)_localctx).bop = bitwise_operator();
						setState(90);
						((ExpressionContext)_localctx).r = expression(6);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).bop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(T__2);
						setState(95);
						((ExpressionContext)_localctx).r = expression(4);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.AND, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99);
						match(T__3);
						setState(100);
						((ExpressionContext)_localctx).r = expression(3);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.OR, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					}
					} 
				}
				setState(107);
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
		public Primary_expressionContext pe;
		public ExpressionContext e;
		public Token ID;
		public Token INT;
		public Expression_listContext l;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(KekParser.ID, 0); }
		public TerminalNode INT() { return getToken(KekParser.INT, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(109);
				match(T__6);
				setState(110);
				((Primary_expressionContext)_localctx).e = expression(0);
				setState(111);
				match(T__7);
				 ((Primary_expressionContext)_localctx).expr =  ((Primary_expressionContext)_localctx).e.expr; 
				}
				break;
			case ID:
				{
				setState(114);
				((Primary_expressionContext)_localctx).ID = match(ID);
				 ((Primary_expressionContext)_localctx).expr =  lang.expr.Expression.getter(((Primary_expressionContext)_localctx).ID.getText()); 
				}
				break;
			case INT:
				{
				setState(116);
				((Primary_expressionContext)_localctx).INT = match(INT);
				 ((Primary_expressionContext)_localctx).expr =  lang.expr.Expression.constant(((Primary_expressionContext)_localctx).INT.getText()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Primary_expressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(121);
						match(T__4);
						setState(122);
						((Primary_expressionContext)_localctx).ID = match(ID);
						 ((Primary_expressionContext)_localctx).expr =  lang.expr.Expression.memberAccess(((Primary_expressionContext)_localctx).pe.expr, ((Primary_expressionContext)_localctx).ID.getText()); 
						}
						break;
					case 2:
						{
						_localctx = new Primary_expressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(125);
						match(T__6);
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(126);
							((Primary_expressionContext)_localctx).l = expression_list();
							}
						}

						setState(129);
						match(T__7);

						                  lang.ExpressionList elist;
						                  try {
						                      elist = ((Primary_expressionContext)_localctx).l.elist;
						                  }
						                  catch (NullPointerException e) {
						                      elist = new lang.ExpressionList();
						                  }
						                  ((Primary_expressionContext)_localctx).expr =  lang.expr.Expression.invokation(((Primary_expressionContext)_localctx).pe.expr, elist);
						              
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Expression_listContext extends ParserRuleContext {
		public lang.ExpressionList elist;
		public ExpressionContext l;
		public ExpressionContext r;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((Expression_listContext)_localctx).l = expression(0);
			 ((Expression_listContext)_localctx).elist =  new lang.ExpressionList(((Expression_listContext)_localctx).l.expr); 
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(138);
				match(T__8);
				setState(139);
				((Expression_listContext)_localctx).r = expression(0);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.elist.add(((Expression_listContext)_localctx).r.expr); 
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
		enterRule(_localctx, 10, RULE_prefix_operator);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__9);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_PLUS; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__10);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_MINUS; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__11);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.NOT; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(T__12);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.BIT_NOT; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(T__13);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.PRE_INC; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(T__14);
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
		enterRule(_localctx, 12, RULE_multiplicative_operator);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__15);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.MULTIPLY; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__16);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.DIVIDE; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(T__17);
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
		enterRule(_localctx, 14, RULE_additive_operator);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__9);
				 ((Additive_operatorContext)_localctx).op =  lang.Operator.ADD; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__10);
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
		enterRule(_localctx, 16, RULE_shift_operator);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__18);
				 ((Shift_operatorContext)_localctx).op =  lang.Operator.LEFT_SHIFT; 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__19);
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
		enterRule(_localctx, 18, RULE_comparison_operator);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__20);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__21);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.GREATER; 
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(T__22);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS_EQUAL; 
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(T__23);
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
		enterRule(_localctx, 20, RULE_equality_operator);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__24);
				 ((Equality_operatorContext)_localctx).op =  lang.Operator.EQUAL; 
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__25);
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
		enterRule(_localctx, 22, RULE_bitwise_operator);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__26);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_AND; 
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__27);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_OR; 
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(T__28);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_XOR; 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(T__29);
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
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean primary_expression_sempred(Primary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"j\n\4\f\4\16\4m\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5y\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\7\5\u0086\n\5\f\5\16"+
		"\5\u0089\13\5\3\6\3\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a2\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\n\3\n"+
		"\3\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c0"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u00c6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00d0\n\r\3\r\2\4\6\b\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00e8"+
		"\2\35\3\2\2\2\4\"\3\2\2\2\6:\3\2\2\2\bx\3\2\2\2\n\u008a\3\2\2\2\f\u00a1"+
		"\3\2\2\2\16\u00a9\3\2\2\2\20\u00af\3\2\2\2\22\u00b5\3\2\2\2\24\u00bf\3"+
		"\2\2\2\26\u00c5\3\2\2\2\30\u00cf\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34"+
		"\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7"+
		"\2\2\3!\3\3\2\2\2\"#\5\6\4\2#$\7\3\2\2$%\b\3\1\2%\5\3\2\2\2&\'\b\4\1\2"+
		"\'(\5\b\5\2()\b\4\1\2);\3\2\2\2*+\5\f\7\2+,\5\6\4\16,-\b\4\1\2-;\3\2\2"+
		"\2./\5\b\5\2/\60\7\7\2\2\60\61\7!\2\2\61\62\7\b\2\2\62\63\5\6\4\4\63\64"+
		"\b\4\1\2\64;\3\2\2\2\65\66\7!\2\2\66\67\7\b\2\2\678\5\6\4\389\b\4\1\2"+
		"9;\3\2\2\2:&\3\2\2\2:*\3\2\2\2:.\3\2\2\2:\65\3\2\2\2;k\3\2\2\2<=\f\r\2"+
		"\2=>\7\4\2\2>?\5\6\4\r?@\b\4\1\2@j\3\2\2\2AB\f\f\2\2BC\5\16\b\2CD\5\6"+
		"\4\rDE\b\4\1\2Ej\3\2\2\2FG\f\13\2\2GH\5\20\t\2HI\5\6\4\fIJ\b\4\1\2Jj\3"+
		"\2\2\2KL\f\n\2\2LM\5\22\n\2MN\5\6\4\13NO\b\4\1\2Oj\3\2\2\2PQ\f\t\2\2Q"+
		"R\5\24\13\2RS\5\6\4\nST\b\4\1\2Tj\3\2\2\2UV\f\b\2\2VW\5\26\f\2WX\5\6\4"+
		"\tXY\b\4\1\2Yj\3\2\2\2Z[\f\7\2\2[\\\5\30\r\2\\]\5\6\4\b]^\b\4\1\2^j\3"+
		"\2\2\2_`\f\6\2\2`a\7\5\2\2ab\5\6\4\6bc\b\4\1\2cj\3\2\2\2de\f\5\2\2ef\7"+
		"\6\2\2fg\5\6\4\5gh\b\4\1\2hj\3\2\2\2i<\3\2\2\2iA\3\2\2\2iF\3\2\2\2iK\3"+
		"\2\2\2iP\3\2\2\2iU\3\2\2\2iZ\3\2\2\2i_\3\2\2\2id\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\7\3\2\2\2mk\3\2\2\2no\b\5\1\2op\7\t\2\2pq\5\6\4\2qr"+
		"\7\n\2\2rs\b\5\1\2sy\3\2\2\2tu\7!\2\2uy\b\5\1\2vw\7\"\2\2wy\b\5\1\2xn"+
		"\3\2\2\2xt\3\2\2\2xv\3\2\2\2y\u0087\3\2\2\2z{\f\6\2\2{|\7\7\2\2|}\7!\2"+
		"\2}\u0086\b\5\1\2~\177\f\5\2\2\177\u0081\7\t\2\2\u0080\u0082\5\n\6\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\n"+
		"\2\2\u0084\u0086\b\5\1\2\u0085z\3\2\2\2\u0085~\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\t\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\5\6\4\2\u008b\u0090\b\6\1\2\u008c\u008d\7\13\2\2"+
		"\u008d\u008f\5\6\4\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\b\6\1\2\u0094\13\3\2\2\2\u0095\u0096\7\f\2\2\u0096\u00a2\b\7\1"+
		"\2\u0097\u0098\7\r\2\2\u0098\u00a2\b\7\1\2\u0099\u009a\7\16\2\2\u009a"+
		"\u00a2\b\7\1\2\u009b\u009c\7\17\2\2\u009c\u00a2\b\7\1\2\u009d\u009e\7"+
		"\20\2\2\u009e\u00a2\b\7\1\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\b\7\1\2\u00a1"+
		"\u0095\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009b\3\2"+
		"\2\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a4"+
		"\7\22\2\2\u00a4\u00aa\b\b\1\2\u00a5\u00a6\7\23\2\2\u00a6\u00aa\b\b\1\2"+
		"\u00a7\u00a8\7\24\2\2\u00a8\u00aa\b\b\1\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\17\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac"+
		"\u00b0\b\t\1\2\u00ad\u00ae\7\r\2\2\u00ae\u00b0\b\t\1\2\u00af\u00ab\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b6"+
		"\b\n\1\2\u00b3\u00b4\7\26\2\2\u00b4\u00b6\b\n\1\2\u00b5\u00b1\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b8\7\27\2\2\u00b8\u00c0"+
		"\b\13\1\2\u00b9\u00ba\7\30\2\2\u00ba\u00c0\b\13\1\2\u00bb\u00bc\7\31\2"+
		"\2\u00bc\u00c0\b\13\1\2\u00bd\u00be\7\32\2\2\u00be\u00c0\b\13\1\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\25\3\2\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c6\b\f\1\2\u00c3\u00c4"+
		"\7\34\2\2\u00c4\u00c6\b\f\1\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\27\3\2\2\2\u00c7\u00c8\7\35\2\2\u00c8\u00d0\b\r\1\2\u00c9\u00ca"+
		"\7\36\2\2\u00ca\u00d0\b\r\1\2\u00cb\u00cc\7\37\2\2\u00cc\u00d0\b\r\1\2"+
		"\u00cd\u00ce\7 \2\2\u00ce\u00d0\b\r\1\2\u00cf\u00c7\3\2\2\2\u00cf\u00c9"+
		"\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\31\3\2\2\2\22\35"+
		":ikx\u0081\u0085\u0087\u0090\u00a1\u00a9\u00af\u00b5\u00bf\u00c5\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}