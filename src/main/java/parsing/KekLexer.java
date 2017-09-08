// Generated from C:/Users/Dima/IdeaProjects/kek/src/main/grammar\Kek.g4 by ANTLR 4.7
package parsing;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KekLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, INT=12, WS=13, COMMENT=14, LINE_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "ID", "INT", "WS", "COMMENT", "LINE_COMMENT"
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


	public KekLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kek.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\6\f9\n\f\r\f\16\f:\3\f\7\f>\n\f\f\f\16\fA\13\f\3\r\6\rD\n\r\r\r\16"+
		"\rE\3\16\6\16I\n\16\r\16\16\16J\3\16\3\16\3\17\3\17\3\17\3\17\7\17S\n"+
		"\17\f\17\16\17V\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20"+
		"a\n\20\f\20\16\20d\13\20\3\20\3\20\3\20\3\20\3T\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\7\5\2C\\"+
		"aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\2n\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2"+
		"\2\t\'\3\2\2\2\13)\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\60\3\2\2\2\23\62"+
		"\3\2\2\2\25\64\3\2\2\2\278\3\2\2\2\31C\3\2\2\2\33H\3\2\2\2\35N\3\2\2\2"+
		"\37\\\3\2\2\2!\"\7=\2\2\"\4\3\2\2\2#$\7*\2\2$\6\3\2\2\2%&\7+\2\2&\b\3"+
		"\2\2\2\'(\7/\2\2(\n\3\2\2\2)*\7,\2\2*+\7,\2\2+\f\3\2\2\2,-\7,\2\2-\16"+
		"\3\2\2\2./\7\61\2\2/\20\3\2\2\2\60\61\7-\2\2\61\22\3\2\2\2\62\63\7?\2"+
		"\2\63\24\3\2\2\2\64\65\7<\2\2\65\66\7?\2\2\66\26\3\2\2\2\679\t\2\2\28"+
		"\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;?\3\2\2\2<>\t\3\2\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\30\3\2\2\2A?\3\2\2\2BD\t\4\2\2CB\3\2"+
		"\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\32\3\2\2\2GI\t\5\2\2HG\3\2\2\2IJ\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\b\16\2\2M\34\3\2\2\2NO\7\61\2\2"+
		"OP\7,\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2"+
		"UW\3\2\2\2VT\3\2\2\2WX\7,\2\2XY\7\61\2\2YZ\3\2\2\2Z[\b\17\2\2[\36\3\2"+
		"\2\2\\]\7\61\2\2]^\7\61\2\2^b\3\2\2\2_a\n\6\2\2`_\3\2\2\2ad\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\f\2\2fg\3\2\2\2gh\b\20\2\2"+
		"h \3\2\2\2\t\2:?EJTb\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}