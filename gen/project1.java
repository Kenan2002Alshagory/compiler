// Generated from D:/com-proj/untitled/src/project1.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class project1 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, STRING=3, SYMBOL=4, NUMBER=5, LPAREN=6, RPAREN=7, QUOTE=8, 
		BACKSLASH=9, OPERATOR=10, KEYWORD=11, LEXICAL_ERROR=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "STRING", "SYMBOL", "NUMBER", "LPAREN", "RPAREN", "QUOTE", 
			"BACKSLASH", "OPERATOR", "KEYWORD", "LEXICAL_ERROR", "ESC_NEWLINE", "ESC_TAB", 
			"ESC_BACKSLASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", "'''", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "STRING", "SYMBOL", "NUMBER", "LPAREN", "RPAREN", 
			"QUOTE", "BACKSLASH", "OPERATOR", "KEYWORD", "LEXICAL_ERROR"
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


	public project1(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "project1.g4"; }

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
		"\u0004\u0000\f\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001"+
		"-\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003>\b\u0003\n\u0003\f\u0003"+
		"A\t\u0003\u0001\u0004\u0004\u0004D\b\u0004\u000b\u0004\f\u0004E\u0001"+
		"\u0004\u0001\u0004\u0004\u0004J\b\u0004\u000b\u0004\f\u0004K\u0003\u0004"+
		"N\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nu\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\u0000\u001b\u0000\u001d\u0000\u0001\u0000\u0007\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0002\u0000\"\"\\\\\u0004\u0000*"+
		"*AZ__az\u0006\u0000*+--09AZ__az\u0001\u000009\u0004\u0000*+--//==\u0089"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001 \u0001"+
		"\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000"+
		"\u0000\u0007;\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000b"+
		"O\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000fS\u0001\u0000"+
		"\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013W\u0001\u0000\u0000\u0000"+
		"\u0015t\u0001\u0000\u0000\u0000\u0017v\u0001\u0000\u0000\u0000\u0019x"+
		"\u0001\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d~\u0001\u0000"+
		"\u0000\u0000\u001f!\u0007\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0006\u0000\u0000\u0000%\u0002"+
		"\u0001\u0000\u0000\u0000&\'\u0005;\u0000\u0000\'+\u0005;\u0000\u0000("+
		"*\b\u0001\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000./\u0006\u0001\u0000\u0000/\u0004\u0001"+
		"\u0000\u0000\u000006\u0005\"\u0000\u000012\u0005\\\u0000\u000025\t\u0000"+
		"\u0000\u000035\b\u0002\u0000\u000041\u0001\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9:\u0005\"\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;?\u0007\u0003\u0000"+
		"\u0000<>\u0007\u0004\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\b\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BD\u0007\u0005\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FM\u0001\u0000\u0000\u0000GI\u0005.\u0000"+
		"\u0000HJ\u0007\u0005\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\n\u0001\u0000\u0000\u0000OP\u0005(\u0000\u0000P\f\u0001\u0000\u0000"+
		"\u0000QR\u0005)\u0000\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005\'\u0000"+
		"\u0000T\u0010\u0001\u0000\u0000\u0000UV\u0005\\\u0000\u0000V\u0012\u0001"+
		"\u0000\u0000\u0000WX\u0007\u0006\u0000\u0000X\u0014\u0001\u0000\u0000"+
		"\u0000YZ\u0005d\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005f\u0000\u0000"+
		"\\]\u0005p\u0000\u0000]^\u0005a\u0000\u0000^_\u0005r\u0000\u0000_`\u0005"+
		"a\u0000\u0000`a\u0005m\u0000\u0000ab\u0005e\u0000\u0000bc\u0005t\u0000"+
		"\u0000cd\u0005e\u0000\u0000du\u0005r\u0000\u0000ef\u0005d\u0000\u0000"+
		"fg\u0005e\u0000\u0000gh\u0005f\u0000\u0000hi\u0005u\u0000\u0000iu\u0005"+
		"n\u0000\u0000jk\u0005f\u0000\u0000kl\u0005o\u0000\u0000lm\u0005r\u0000"+
		"\u0000mn\u0005m\u0000\u0000no\u0005a\u0000\u0000ou\u0005t\u0000\u0000"+
		"pu\u0005t\u0000\u0000qr\u0005n\u0000\u0000rs\u0005i\u0000\u0000su\u0005"+
		"l\u0000\u0000tY\u0001\u0000\u0000\u0000te\u0001\u0000\u0000\u0000tj\u0001"+
		"\u0000\u0000\u0000tp\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000"+
		"u\u0016\u0001\u0000\u0000\u0000vw\t\u0000\u0000\u0000w\u0018\u0001\u0000"+
		"\u0000\u0000xy\u0005\\\u0000\u0000yz\u0005n\u0000\u0000z\u001a\u0001\u0000"+
		"\u0000\u0000{|\u0005\\\u0000\u0000|}\u0005t\u0000\u0000}\u001c\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\\\u0000\u0000\u007f\u0080\u0005\\\u0000\u0000"+
		"\u0080\u001e\u0001\u0000\u0000\u0000\n\u0000\"+46?EKMt\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}