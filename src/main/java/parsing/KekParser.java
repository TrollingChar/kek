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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT=39, 
		WS=40, COMMENT=41, LINE_COMMENT=42;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_expression_statement = 2, RULE_if_statement = 3, 
		RULE_while_statement = 4, RULE_do_statement = 5, RULE_for_statement = 6, 
		RULE_empty_statement = 7, RULE_block = 8, RULE_expression = 9, RULE_primary_expression = 10, 
		RULE_expression_list = 11, RULE_prefix_operator = 12, RULE_multiplicative_operator = 13, 
		RULE_additive_operator = 14, RULE_shift_operator = 15, RULE_comparison_operator = 16, 
		RULE_equality_operator = 17, RULE_bitwise_operator = 18;
	public static final String[] ruleNames = {
		"file", "statement", "expression_statement", "if_statement", "while_statement", 
		"do_statement", "for_statement", "empty_statement", "block", "expression", 
		"primary_expression", "expression_list", "prefix_operator", "multiplicative_operator", 
		"additive_operator", "shift_operator", "comparison_operator", "equality_operator", 
		"bitwise_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'if'", "'('", "')'", "'else'", "'while'", "'do'", "'for'", 
		"'{'", "'}'", "'**'", "'&&'", "'||'", "'.'", "'='", "','", "'+'", "'-'", 
		"'!'", "'~'", "'++'", "'--'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'^'", "'&^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "INT", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
		public Expression_statementContext expression_statement;
		public BlockContext block;
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Empty_statementContext empty_statement() {
			return getRuleContext(Empty_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((StatementContext)_localctx).expression_statement = expression_statement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).expression_statement.stmt; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				if_statement();
				 ((StatementContext)_localctx).stmt =  if_statement.stmt; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				while_statement();
				 ((StatementContext)_localctx).stmt =  while_statement.stmt; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				do_statement();
				 ((StatementContext)_localctx).stmt =  do_statement.stmt; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				for_statement();
				 ((StatementContext)_localctx).stmt =  for_statement.stmt; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				empty_statement();
				 ((StatementContext)_localctx).stmt =  lang.Statement.empty(); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				((StatementContext)_localctx).block = block();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).block.stmt; 
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

	public static class Expression_statementContext extends ParserRuleContext {
		public lang.Statement stmt;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((Expression_statementContext)_localctx).e = expression(0);
			setState(70);
			match(T__0);
			 ((Expression_statementContext)_localctx).stmt =  new lang.Statement(((Expression_statementContext)_localctx).e.expr); 
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

	public static class If_statementContext extends ParserRuleContext {
		public lang.Statement stmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__1);
			setState(74);
			match(T__2);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(75);
				expression_list();
				setState(76);
				match(T__0);
				}
				break;
			}
			setState(80);
			expression(0);
			setState(81);
			match(T__3);
			setState(82);
			statement();
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(83);
				match(T__4);
				setState(84);
				statement();
				}
				break;
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

	public static class While_statementContext extends ParserRuleContext {
		public lang.Statement stmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__5);
			setState(88);
			match(T__2);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(89);
				expression_list();
				setState(90);
				match(T__0);
				}
				break;
			}
			setState(94);
			expression(0);
			setState(95);
			match(T__3);
			setState(96);
			statement();
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

	public static class Do_statementContext extends ParserRuleContext {
		public lang.Statement stmt;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitDo_statement(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__6);
			setState(99);
			statement();
			setState(100);
			match(T__5);
			setState(101);
			match(T__2);
			setState(102);
			expression(0);
			setState(103);
			match(T__3);
			setState(104);
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

	public static class For_statementContext extends ParserRuleContext {
		public lang.Statement stmt;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__7);
			setState(107);
			match(T__2);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(108);
				expression_list();
				}
			}

			setState(111);
			match(T__0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(112);
				expression(0);
				}
			}

			setState(115);
			match(T__0);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(116);
				expression_list();
				}
			}

			setState(119);
			match(T__3);
			setState(120);
			statement();
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

	public static class Empty_statementContext extends ParserRuleContext {
		public Empty_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterEmpty_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitEmpty_statement(this);
		}
	}

	public final Empty_statementContext empty_statement() throws RecognitionException {
		Empty_statementContext _localctx = new Empty_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_empty_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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

	public static class BlockContext extends ParserRuleContext {
		public lang.Statement stmt;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KekListener ) ((KekListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__8);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__9);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(134);
				((ExpressionContext)_localctx).pe = primary_expression(0);
				 ((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).pe.expr; 
				}
				break;
			case 2:
				{
				setState(137);
				((ExpressionContext)_localctx).prop = prefix_operator();
				setState(138);
				((ExpressionContext)_localctx).e = expression(12);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(((ExpressionContext)_localctx).prop.op, ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 3:
				{
				setState(141);
				((ExpressionContext)_localctx).pe = primary_expression(0);
				setState(142);
				match(T__13);
				setState(143);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(144);
				match(T__14);
				setState(145);
				((ExpressionContext)_localctx).e = expression(2);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.setter(((ExpressionContext)_localctx).pe.expr, ((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			case 4:
				{
				setState(148);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(149);
				match(T__14);
				setState(150);
				((ExpressionContext)_localctx).e = expression(1);
				 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.setter(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).e.expr); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(156);
						match(T__10);
						setState(157);
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
						setState(160);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(161);
						((ExpressionContext)_localctx).mop = multiplicative_operator();
						setState(162);
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
						setState(165);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(166);
						((ExpressionContext)_localctx).aop = additive_operator();
						setState(167);
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
						setState(170);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(171);
						((ExpressionContext)_localctx).sop = shift_operator();
						setState(172);
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
						setState(175);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(176);
						((ExpressionContext)_localctx).cop = comparison_operator();
						setState(177);
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
						setState(180);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(181);
						((ExpressionContext)_localctx).eop = equality_operator();
						setState(182);
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
						setState(185);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(186);
						((ExpressionContext)_localctx).bop = bitwise_operator();
						setState(187);
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
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
						match(T__11);
						setState(192);
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
						setState(195);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(196);
						match(T__12);
						setState(197);
						((ExpressionContext)_localctx).r = expression(3);
						 ((ExpressionContext)_localctx).expr =  lang.expr.Expression.operator(lang.Operator.OR, ((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr); 
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_primary_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(206);
				match(T__2);
				setState(207);
				((Primary_expressionContext)_localctx).e = expression(0);
				setState(208);
				match(T__3);
				 ((Primary_expressionContext)_localctx).expr =  ((Primary_expressionContext)_localctx).e.expr; 
				}
				break;
			case ID:
				{
				setState(211);
				((Primary_expressionContext)_localctx).ID = match(ID);
				 ((Primary_expressionContext)_localctx).expr =  lang.expr.Expression.getter(((Primary_expressionContext)_localctx).ID.getText()); 
				}
				break;
			case INT:
				{
				setState(213);
				((Primary_expressionContext)_localctx).INT = match(INT);
				 ((Primary_expressionContext)_localctx).expr =  lang.expr.Expression.constant(((Primary_expressionContext)_localctx).INT.getText()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Primary_expressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primary_expression);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218);
						match(T__13);
						setState(219);
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
						setState(221);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(222);
						match(T__2);
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(223);
							((Primary_expressionContext)_localctx).l = expression_list();
							}
						}

						setState(226);
						match(T__3);

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
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 22, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((Expression_listContext)_localctx).l = expression(0);
			 ((Expression_listContext)_localctx).elist =  new lang.ExpressionList(((Expression_listContext)_localctx).l.expr); 
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(235);
				match(T__15);
				setState(236);
				((Expression_listContext)_localctx).r = expression(0);
				}
				}
				setState(241);
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
		enterRule(_localctx, 24, RULE_prefix_operator);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__16);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_PLUS; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__17);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.UNARY_MINUS; 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(T__18);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.NOT; 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(T__19);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.BIT_NOT; 
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(T__20);
				 ((Prefix_operatorContext)_localctx).op =  lang.Operator.PRE_INC; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				match(T__21);
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
		enterRule(_localctx, 26, RULE_multiplicative_operator);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__22);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.MULTIPLY; 
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__23);
				 ((Multiplicative_operatorContext)_localctx).op =  lang.Operator.DIVIDE; 
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(T__24);
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
		enterRule(_localctx, 28, RULE_additive_operator);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__16);
				 ((Additive_operatorContext)_localctx).op =  lang.Operator.ADD; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__17);
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
		enterRule(_localctx, 30, RULE_shift_operator);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__25);
				 ((Shift_operatorContext)_localctx).op =  lang.Operator.LEFT_SHIFT; 
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__26);
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
		enterRule(_localctx, 32, RULE_comparison_operator);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__27);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS; 
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(T__28);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.GREATER; 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(T__29);
				 ((Comparison_operatorContext)_localctx).op =  lang.Operator.LESS_EQUAL; 
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(T__30);
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
		enterRule(_localctx, 34, RULE_equality_operator);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__31);
				 ((Equality_operatorContext)_localctx).op =  lang.Operator.EQUAL; 
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__32);
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
		enterRule(_localctx, 36, RULE_bitwise_operator);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__33);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_AND; 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__34);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_OR; 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(T__35);
				 ((Bitwise_operatorContext)_localctx).op =  lang.Operator.BIT_XOR; 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(T__36);
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3F\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bp\n\b\3\b\3\b\5\bt\n\b\3\b\3\b\5\b"+
		"x\n\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00cb\n\13\f\13\16\13\u00ce\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00da\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e3\n\f\3\f\3\f\7"+
		"\f\u00e7\n\f\f\f\16\f\u00ea\13\f\3\r\3\r\3\r\3\r\7\r\u00f0\n\r\f\r\16"+
		"\r\u00f3\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0103\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010b\n"+
		"\17\3\20\3\20\3\20\3\20\5\20\u0111\n\20\3\21\3\21\3\21\3\21\5\21\u0117"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0121\n\22\3\23\3\23"+
		"\3\23\3\23\5\23\u0127\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0131\n\24\3\24\2\4\24\26\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&\2\2\2\u014f\2+\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\nY\3\2\2"+
		"\2\fd\3\2\2\2\16l\3\2\2\2\20|\3\2\2\2\22~\3\2\2\2\24\u009b\3\2\2\2\26"+
		"\u00d9\3\2\2\2\30\u00eb\3\2\2\2\32\u0102\3\2\2\2\34\u010a\3\2\2\2\36\u0110"+
		"\3\2\2\2 \u0116\3\2\2\2\"\u0120\3\2\2\2$\u0126\3\2\2\2&\u0130\3\2\2\2"+
		"(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2"+
		"./\7\2\2\3/\3\3\2\2\2\60\61\5\6\4\2\61\62\b\3\1\2\62F\3\2\2\2\63\64\5"+
		"\b\5\2\64\65\b\3\1\2\65F\3\2\2\2\66\67\5\n\6\2\678\b\3\1\28F\3\2\2\29"+
		":\5\f\7\2:;\b\3\1\2;F\3\2\2\2<=\5\16\b\2=>\b\3\1\2>F\3\2\2\2?@\5\20\t"+
		"\2@A\b\3\1\2AF\3\2\2\2BC\5\22\n\2CD\b\3\1\2DF\3\2\2\2E\60\3\2\2\2E\63"+
		"\3\2\2\2E\66\3\2\2\2E9\3\2\2\2E<\3\2\2\2E?\3\2\2\2EB\3\2\2\2F\5\3\2\2"+
		"\2GH\5\24\13\2HI\7\3\2\2IJ\b\4\1\2J\7\3\2\2\2KL\7\4\2\2LP\7\5\2\2MN\5"+
		"\30\r\2NO\7\3\2\2OQ\3\2\2\2PM\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\24\13\2"+
		"ST\7\6\2\2TW\5\4\3\2UV\7\7\2\2VX\5\4\3\2WU\3\2\2\2WX\3\2\2\2X\t\3\2\2"+
		"\2YZ\7\b\2\2Z^\7\5\2\2[\\\5\30\r\2\\]\7\3\2\2]_\3\2\2\2^[\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`a\5\24\13\2ab\7\6\2\2bc\5\4\3\2c\13\3\2\2\2de\7\t\2\2"+
		"ef\5\4\3\2fg\7\b\2\2gh\7\5\2\2hi\5\24\13\2ij\7\6\2\2jk\7\3\2\2k\r\3\2"+
		"\2\2lm\7\n\2\2mo\7\5\2\2np\5\30\r\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\7"+
		"\3\2\2rt\5\24\13\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\3\2\2vx\5\30\r\2"+
		"wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\6\2\2z{\5\4\3\2{\17\3\2\2\2|}\7\3\2"+
		"\2}\21\3\2\2\2~\u0082\7\13\2\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\f\2\2\u0086\23\3\2\2\2\u0087\u0088"+
		"\b\13\1\2\u0088\u0089\5\26\f\2\u0089\u008a\b\13\1\2\u008a\u009c\3\2\2"+
		"\2\u008b\u008c\5\32\16\2\u008c\u008d\5\24\13\16\u008d\u008e\b\13\1\2\u008e"+
		"\u009c\3\2\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\20\2\2\u0091\u0092\7"+
		"(\2\2\u0092\u0093\7\21\2\2\u0093\u0094\5\24\13\4\u0094\u0095\b\13\1\2"+
		"\u0095\u009c\3\2\2\2\u0096\u0097\7(\2\2\u0097\u0098\7\21\2\2\u0098\u0099"+
		"\5\24\13\3\u0099\u009a\b\13\1\2\u009a\u009c\3\2\2\2\u009b\u0087\3\2\2"+
		"\2\u009b\u008b\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0096\3\2\2\2\u009c\u00cc"+
		"\3\2\2\2\u009d\u009e\f\r\2\2\u009e\u009f\7\r\2\2\u009f\u00a0\5\24\13\r"+
		"\u00a0\u00a1\b\13\1\2\u00a1\u00cb\3\2\2\2\u00a2\u00a3\f\f\2\2\u00a3\u00a4"+
		"\5\34\17\2\u00a4\u00a5\5\24\13\r\u00a5\u00a6\b\13\1\2\u00a6\u00cb\3\2"+
		"\2\2\u00a7\u00a8\f\13\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\5\24\13\f"+
		"\u00aa\u00ab\b\13\1\2\u00ab\u00cb\3\2\2\2\u00ac\u00ad\f\n\2\2\u00ad\u00ae"+
		"\5 \21\2\u00ae\u00af\5\24\13\13\u00af\u00b0\b\13\1\2\u00b0\u00cb\3\2\2"+
		"\2\u00b1\u00b2\f\t\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\5\24\13\n\u00b4"+
		"\u00b5\b\13\1\2\u00b5\u00cb\3\2\2\2\u00b6\u00b7\f\b\2\2\u00b7\u00b8\5"+
		"$\23\2\u00b8\u00b9\5\24\13\t\u00b9\u00ba\b\13\1\2\u00ba\u00cb\3\2\2\2"+
		"\u00bb\u00bc\f\7\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\5\24\13\b\u00be\u00bf"+
		"\b\13\1\2\u00bf\u00cb\3\2\2\2\u00c0\u00c1\f\6\2\2\u00c1\u00c2\7\16\2\2"+
		"\u00c2\u00c3\5\24\13\6\u00c3\u00c4\b\13\1\2\u00c4\u00cb\3\2\2\2\u00c5"+
		"\u00c6\f\5\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\5\24\13\5\u00c8\u00c9"+
		"\b\13\1\2\u00c9\u00cb\3\2\2\2\u00ca\u009d\3\2\2\2\u00ca\u00a2\3\2\2\2"+
		"\u00ca\u00a7\3\2\2\2\u00ca\u00ac\3\2\2\2\u00ca\u00b1\3\2\2\2\u00ca\u00b6"+
		"\3\2\2\2\u00ca\u00bb\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\25\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\f\1\2\u00d0\u00d1\7\5\2\2\u00d1\u00d2"+
		"\5\24\13\2\u00d2\u00d3\7\6\2\2\u00d3\u00d4\b\f\1\2\u00d4\u00da\3\2\2\2"+
		"\u00d5\u00d6\7(\2\2\u00d6\u00da\b\f\1\2\u00d7\u00d8\7)\2\2\u00d8\u00da"+
		"\b\f\1\2\u00d9\u00cf\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00e8\3\2\2\2\u00db\u00dc\f\6\2\2\u00dc\u00dd\7\20\2\2\u00dd\u00de\7"+
		"(\2\2\u00de\u00e7\b\f\1\2\u00df\u00e0\f\5\2\2\u00e0\u00e2\7\5\2\2\u00e1"+
		"\u00e3\5\30\r\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\7\6\2\2\u00e5\u00e7\b\f\1\2\u00e6\u00db\3\2\2\2\u00e6"+
		"\u00df\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\27\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\24\13\2\u00ec"+
		"\u00f1\b\r\1\2\u00ed\u00ee\7\22\2\2\u00ee\u00f0\5\24\13\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\b\r\1\2\u00f5\31\3\2\2"+
		"\2\u00f6\u00f7\7\23\2\2\u00f7\u0103\b\16\1\2\u00f8\u00f9\7\24\2\2\u00f9"+
		"\u0103\b\16\1\2\u00fa\u00fb\7\25\2\2\u00fb\u0103\b\16\1\2\u00fc\u00fd"+
		"\7\26\2\2\u00fd\u0103\b\16\1\2\u00fe\u00ff\7\27\2\2\u00ff\u0103\b\16\1"+
		"\2\u0100\u0101\7\30\2\2\u0101\u0103\b\16\1\2\u0102\u00f6\3\2\2\2\u0102"+
		"\u00f8\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\33\3\2\2\2\u0104\u0105\7\31\2\2\u0105\u010b"+
		"\b\17\1\2\u0106\u0107\7\32\2\2\u0107\u010b\b\17\1\2\u0108\u0109\7\33\2"+
		"\2\u0109\u010b\b\17\1\2\u010a\u0104\3\2\2\2\u010a\u0106\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\35\3\2\2\2\u010c\u010d\7\23\2\2\u010d\u0111\b\20"+
		"\1\2\u010e\u010f\7\24\2\2\u010f\u0111\b\20\1\2\u0110\u010c\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\37\3\2\2\2\u0112\u0113\7\34\2\2\u0113\u0117\b\21"+
		"\1\2\u0114\u0115\7\35\2\2\u0115\u0117\b\21\1\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117!\3\2\2\2\u0118\u0119\7\36\2\2\u0119\u0121\b\22\1"+
		"\2\u011a\u011b\7\37\2\2\u011b\u0121\b\22\1\2\u011c\u011d\7 \2\2\u011d"+
		"\u0121\b\22\1\2\u011e\u011f\7!\2\2\u011f\u0121\b\22\1\2\u0120\u0118\3"+
		"\2\2\2\u0120\u011a\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"#\3\2\2\2\u0122\u0123\7\"\2\2\u0123\u0127\b\23\1\2\u0124\u0125\7#\2\2"+
		"\u0125\u0127\b\23\1\2\u0126\u0122\3\2\2\2\u0126\u0124\3\2\2\2\u0127%\3"+
		"\2\2\2\u0128\u0129\7$\2\2\u0129\u0131\b\24\1\2\u012a\u012b\7%\2\2\u012b"+
		"\u0131\b\24\1\2\u012c\u012d\7&\2\2\u012d\u0131\b\24\1\2\u012e\u012f\7"+
		"\'\2\2\u012f\u0131\b\24\1\2\u0130\u0128\3\2\2\2\u0130\u012a\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131\'\3\2\2\2\32+EPW^osw\u0082\u009b"+
		"\u00ca\u00cc\u00d9\u00e2\u00e6\u00e8\u00f1\u0102\u010a\u0110\u0116\u0120"+
		"\u0126\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}