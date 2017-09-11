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
		ID=10, INT=11, WS=12, COMMENT=13, LINE_COMMENT=14;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_expression = 2, RULE_multiplicative_operator = 3, 
		RULE_additive_operator = 4;
	public static final String[] ruleNames = {
		"file", "statement", "expression", "multiplicative_operator", "additive_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-'", "'**'", "'='", "'*'", "'/'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"WS", "COMMENT", "LINE_COMMENT"
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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
			setState(18);
			((StatementContext)_localctx).e = expression(0);
			setState(19);
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
		public Token ID;
		public Token INT;
		public ExpressionContext r;
		public Multiplicative_operatorContext mop;
		public Additive_operatorContext aop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(KekParser.ID, 0); }
		public TerminalNode INT() { return getToken(KekParser.INT, 0); }
		public Multiplicative_operatorContext multiplicative_operator() {
			return getRuleContext(Multiplicative_operatorContext.class,0);
		}
		public Additive_operatorContext additive_operator() {
			return getRuleContext(Additive_operatorContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(23);
				match(T__1);
				setState(24);
				((ExpressionContext)_localctx).e = expression(0);
				setState(25);
				match(T__2);
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).e.expr; 
				}
				break;
			case 2:
				{
				setState(28);
				match(T__3);
				setState(29);
				((ExpressionContext)_localctx).e = expression(7);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.UNARY_MINUS, ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 3:
				{
				setState(32);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(33);
				match(T__5);
				setState(34);
				((ExpressionContext)_localctx).e = expression(3);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.setter(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 4:
				{
				setState(37);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.getter(((ExpressionContext)_localctx).ID.getText()); 
				}
				break;
			case 5:
				{
				setState(39);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.constant(((ExpressionContext)_localctx).INT.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44);
						match(T__4);
						setState(45);
						((ExpressionContext)_localctx).r = expression(6);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.EXPONENT, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(49);
						((ExpressionContext)_localctx).mop = multiplicative_operator();
						setState(50);
						((ExpressionContext)_localctx).r = expression(6);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).mop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(54);
						((ExpressionContext)_localctx).aop = additive_operator();
						setState(55);
						((ExpressionContext)_localctx).r = expression(5);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).aop.op, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					}
					} 
				}
				setState(62);
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
		enterRule(_localctx, 6, RULE_multiplicative_operator);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__6);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.MULTIPLY; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__7);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.DIVIDE; 
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
		enterRule(_localctx, 8, RULE_additive_operator);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__8);
				 ((Additive_operatorContext)_localctx).op =  lang.Operator.ADD; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__3);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\3\5\3\5\5\5F\n\5\3"+
		"\6\3\6\3\6\3\6\5\6L\n\6\3\6\2\3\6\7\2\4\6\b\n\2\2\2R\2\17\3\2\2\2\4\24"+
		"\3\2\2\2\6+\3\2\2\2\bE\3\2\2\2\nK\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16"+
		"\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22"+
		"\23\7\2\2\3\23\3\3\2\2\2\24\25\5\6\4\2\25\26\7\3\2\2\26\27\b\3\1\2\27"+
		"\5\3\2\2\2\30\31\b\4\1\2\31\32\7\4\2\2\32\33\5\6\4\2\33\34\7\5\2\2\34"+
		"\35\b\4\1\2\35,\3\2\2\2\36\37\7\6\2\2\37 \5\6\4\t !\b\4\1\2!,\3\2\2\2"+
		"\"#\7\f\2\2#$\7\b\2\2$%\5\6\4\5%&\b\4\1\2&,\3\2\2\2\'(\7\f\2\2(,\b\4\1"+
		"\2)*\7\r\2\2*,\b\4\1\2+\30\3\2\2\2+\36\3\2\2\2+\"\3\2\2\2+\'\3\2\2\2+"+
		")\3\2\2\2,>\3\2\2\2-.\f\b\2\2./\7\7\2\2/\60\5\6\4\b\60\61\b\4\1\2\61="+
		"\3\2\2\2\62\63\f\7\2\2\63\64\5\b\5\2\64\65\5\6\4\b\65\66\b\4\1\2\66=\3"+
		"\2\2\2\678\f\6\2\289\5\n\6\29:\5\6\4\7:;\b\4\1\2;=\3\2\2\2<-\3\2\2\2<"+
		"\62\3\2\2\2<\67\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2"+
		"\2\2AB\7\t\2\2BF\b\5\1\2CD\7\n\2\2DF\b\5\1\2EA\3\2\2\2EC\3\2\2\2F\t\3"+
		"\2\2\2GH\7\13\2\2HL\b\6\1\2IJ\7\6\2\2JL\b\6\1\2KG\3\2\2\2KI\3\2\2\2L\13"+
		"\3\2\2\2\b\17+<>EK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}