// Generated from C:/Users/Dima/IdeaProjects/kek/src/main/grammar\Kek.g4 by ANTLR 4.7
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
		T__9=10, ID=11, INT=12, WS=13, COMMENT=14, LINE_COMMENT=15;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_expression = 2;
	public static final String[] ruleNames = {
		"file", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-'", "'**'", "'*'", "'/'", "'+'", "'='", 
		"':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"INT", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(6);
				statement();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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
			setState(14);
			expression(0);
			setState(15);
			match(T__0);
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
		public lang.Expression expr;
		public ExpressionContext l;
		public ExpressionContext e;
		public Token ID;
		public Token INT;
		public ExpressionContext r;
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(KekParser.ID, 0); }
		public TerminalNode INT() { return getToken(KekParser.INT, 0); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(18);
				match(T__1);
				setState(19);
				((ExpressionContext)_localctx).e = expression(0);
				setState(20);
				match(T__2);
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).e.expr; 
				}
				break;
			case 2:
				{
				setState(23);
				match(T__3);
				setState(24);
				((ExpressionContext)_localctx).e = expression(8);
				 ((ExpressionContext)_localctx).expr =  lang.Expression.prefix(((ExpressionContext)_localctx).e.expr, "-"); 
				}
				break;
			case 3:
				{
				setState(27);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(28);
				match(T__8);
				setState(29);
				((ExpressionContext)_localctx).e = expression(4);
				 ((ExpressionContext)_localctx).expr =  lang.Expression.assignment(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 4:
				{
				setState(32);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(33);
				match(T__9);
				setState(34);
				((ExpressionContext)_localctx).e = expression(3);
				 ((ExpressionContext)_localctx).expr =  lang.Expression.declaration(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 5:
				{
				setState(37);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).expr =  lang.Expression.identifier(((ExpressionContext)_localctx).ID.getText()); 
				}
				break;
			case 6:
				{
				setState(39);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).expr =  lang.Expression.number(((ExpressionContext)_localctx).INT.getText()); 
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
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(44);
						match(T__4);
						setState(45);
						((ExpressionContext)_localctx).r = expression(7);
						 ((ExpressionContext)_localctx).expr =  lang.Expression.binary(((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr, "**"); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(49);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						((ExpressionContext)_localctx).r = expression(7);
						 ((ExpressionContext)_localctx).expr =  lang.Expression.binary(((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr, ((ExpressionContext)_localctx).op.getText()); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(54);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__7) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						((ExpressionContext)_localctx).r = expression(6);
						 ((ExpressionContext)_localctx).expr =  lang.Expression.binary(((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr, ((ExpressionContext)_localctx).op.getText()); 
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\b\t"+
		"\4\2\6\6\n\n\2G\2\13\3\2\2\2\4\20\3\2\2\2\6+\3\2\2\2\b\n\5\4\3\2\t\b\3"+
		"\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13\3\2\2\2"+
		"\16\17\7\2\2\3\17\3\3\2\2\2\20\21\5\6\4\2\21\22\7\3\2\2\22\5\3\2\2\2\23"+
		"\24\b\4\1\2\24\25\7\4\2\2\25\26\5\6\4\2\26\27\7\5\2\2\27\30\b\4\1\2\30"+
		",\3\2\2\2\31\32\7\6\2\2\32\33\5\6\4\n\33\34\b\4\1\2\34,\3\2\2\2\35\36"+
		"\7\r\2\2\36\37\7\13\2\2\37 \5\6\4\6 !\b\4\1\2!,\3\2\2\2\"#\7\r\2\2#$\7"+
		"\f\2\2$%\5\6\4\5%&\b\4\1\2&,\3\2\2\2\'(\7\r\2\2(,\b\4\1\2)*\7\16\2\2*"+
		",\b\4\1\2+\23\3\2\2\2+\31\3\2\2\2+\35\3\2\2\2+\"\3\2\2\2+\'\3\2\2\2+)"+
		"\3\2\2\2,>\3\2\2\2-.\f\t\2\2./\7\7\2\2/\60\5\6\4\t\60\61\b\4\1\2\61=\3"+
		"\2\2\2\62\63\f\b\2\2\63\64\t\2\2\2\64\65\5\6\4\t\65\66\b\4\1\2\66=\3\2"+
		"\2\2\678\f\7\2\289\t\3\2\29:\5\6\4\b:;\b\4\1\2;=\3\2\2\2<-\3\2\2\2<\62"+
		"\3\2\2\2<\67\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2\2"+
		"\2\6\13+<>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}