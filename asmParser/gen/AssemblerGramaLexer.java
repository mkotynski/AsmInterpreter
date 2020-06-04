// Generated from C:/Users/kotyn/Documents/asmParser/src/main/antlr4\AssemblerGrama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerGramaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTERRUPT=1, MOV=2, PUSH=3, XOR=4, COMMA=5, MUL=6, ADD=7, SUB=8, LPAREN=9, 
		RPAREN=10, INT=11, REGISTER=12, WS=13, SPACE=14, ANY_CHAR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTERRUPT", "MOV", "PUSH", "XOR", "COMMA", "MUL", "ADD", "SUB", "LPAREN", 
			"RPAREN", "INT", "REGISTER", "WS", "SPACE", "ANY_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'mov '", "'push '", "'xor '", "','", "'*'", "'+'", "'-'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTERRUPT", "MOV", "PUSH", "XOR", "COMMA", "MUL", "ADD", "SUB", 
			"LPAREN", "RPAREN", "INT", "REGISTER", "WS", "SPACE", "ANY_CHAR"
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


	public AssemblerGramaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AssemblerGrama.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fQ\n\f\r\f\16\fR\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\re\n\r\3\16\6\16h\n"+
		"\16\r\16\16\16i\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4\3\2\62"+
		";\4\2\13\f\17\17\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\78\3\2\2\2\t>\3\2\2\2\13C\3\2\2\2\rE\3\2"+
		"\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31d\3"+
		"\2\2\2\33g\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!\"\7k\2\2\"#\7p\2\2#$\7v\2"+
		"\2$%\7\"\2\2%&\7\62\2\2&\'\7z\2\2\'(\7:\2\2(\62\7\62\2\2)*\7K\2\2*+\7"+
		"P\2\2+,\7V\2\2,-\7\"\2\2-.\7\62\2\2./\7z\2\2/\60\7:\2\2\60\62\7\62\2\2"+
		"\61!\3\2\2\2\61)\3\2\2\2\62\4\3\2\2\2\63\64\7o\2\2\64\65\7q\2\2\65\66"+
		"\7x\2\2\66\67\7\"\2\2\67\6\3\2\2\289\7r\2\29:\7w\2\2:;\7u\2\2;<\7j\2\2"+
		"<=\7\"\2\2=\b\3\2\2\2>?\7z\2\2?@\7q\2\2@A\7t\2\2AB\7\"\2\2B\n\3\2\2\2"+
		"CD\7.\2\2D\f\3\2\2\2EF\7,\2\2F\16\3\2\2\2GH\7-\2\2H\20\3\2\2\2IJ\7/\2"+
		"\2J\22\3\2\2\2KL\7*\2\2L\24\3\2\2\2MN\7+\2\2N\26\3\2\2\2OQ\t\2\2\2PO\3"+
		"\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\30\3\2\2\2TU\7\'\2\2UV\7g\2\2VW"+
		"\7c\2\2We\7z\2\2XY\7\'\2\2YZ\7g\2\2Z[\7d\2\2[e\7z\2\2\\]\7\'\2\2]^\7g"+
		"\2\2^_\7e\2\2_e\7z\2\2`a\7\'\2\2ab\7g\2\2bc\7f\2\2ce\7z\2\2dT\3\2\2\2"+
		"dX\3\2\2\2d\\\3\2\2\2d`\3\2\2\2e\32\3\2\2\2fh\t\3\2\2gf\3\2\2\2hi\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\16\2\2l\34\3\2\2\2mn\7\"\2\2n\36"+
		"\3\2\2\2op\13\2\2\2p \3\2\2\2\7\2\61Rdi\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}