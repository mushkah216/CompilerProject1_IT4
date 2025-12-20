// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/antler/Example1Lexer.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Example1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW_PAGE=1, WS=2, CLOSE_PAGE=3, NAME=4, NAV=5, FOOTER=6, OPEN_BR=7, SEMICOLN=8, 
		CLOSE_BR=9, STRING=10, QOUT=11;
	public static final int
		PAGE=1, ATTRIBUTE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PAGE", "ATTRIBUTE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEW_PAGE", "WS", "CLOSE_PAGE", "NAME", "NAV", "FOOTER", "OPEN_BR", "SEMICOLN", 
			"CLOSE_BR", "STRING", "QOUT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'}'", "'name'", "'add_nav'", "'add_footer'", "'('", 
			"';'", "')'", null, "'\\''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW_PAGE", "WS", "CLOSE_PAGE", "NAME", "NAV", "FOOTER", "OPEN_BR", 
			"SEMICOLN", "CLOSE_BR", "STRING", "QOUT"
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


	public Example1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Example1Lexer.g4"; }

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
		"\u0004\u0000\u000bU\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002"+
		"\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005"+
		"\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002"+
		"\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\"\b\u0001"+
		"\u000b\u0001\f\u0001#\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004"+
		"\tO\b\t\u000b\t\f\tP\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0003\u0001"+
		"\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011"+
		"\b\u0013\t\u0015\n\u0017\u000b\u0003\u0000\u0001\u0002\u0002\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000AZazT\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0001\u0007\u0001\u0000\u0000\u0000\u0001"+
		"\t\u0001\u0000\u0000\u0000\u0001\u000b\u0001\u0000\u0000\u0000\u0001\r"+
		"\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0001\u0011"+
		"\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0002\u0015"+
		"\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0003\u0019"+
		"\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007\'\u0001"+
		"\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b0\u0001\u0000\u0000"+
		"\u0000\r8\u0001\u0000\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011"+
		"G\u0001\u0000\u0000\u0000\u0013I\u0001\u0000\u0000\u0000\u0015N\u0001"+
		"\u0000\u0000\u0000\u0017R\u0001\u0000\u0000\u0000\u0019\u001a\u0005h\u0000"+
		"\u0000\u001a\u001b\u0005i\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005{\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0006\u0000\u0000\u0000\u001f\u0004\u0001\u0000\u0000\u0000 \""+
		"\u0007\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%&\u0006\u0001\u0001\u0000&\u0006\u0001\u0000\u0000\u0000"+
		"\'(\u0005}\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0006\u0002\u0002\u0000"+
		"*\b\u0001\u0000\u0000\u0000+,\u0005n\u0000\u0000,-\u0005a\u0000\u0000"+
		"-.\u0005m\u0000\u0000./\u0005e\u0000\u0000/\n\u0001\u0000\u0000\u0000"+
		"01\u0005a\u0000\u000012\u0005d\u0000\u000023\u0005d\u0000\u000034\u0005"+
		"_\u0000\u000045\u0005n\u0000\u000056\u0005a\u0000\u000067\u0005v\u0000"+
		"\u00007\f\u0001\u0000\u0000\u000089\u0005a\u0000\u00009:\u0005d\u0000"+
		"\u0000:;\u0005d\u0000\u0000;<\u0005_\u0000\u0000<=\u0005f\u0000\u0000"+
		"=>\u0005o\u0000\u0000>?\u0005o\u0000\u0000?@\u0005t\u0000\u0000@A\u0005"+
		"e\u0000\u0000AB\u0005r\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005"+
		"(\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0006\u0006\u0003\u0000F\u0010"+
		"\u0001\u0000\u0000\u0000GH\u0005;\u0000\u0000H\u0012\u0001\u0000\u0000"+
		"\u0000IJ\u0005)\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0006\b\u0002"+
		"\u0000L\u0014\u0001\u0000\u0000\u0000MO\u0007\u0001\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005\\\u0000"+
		"\u0000ST\u0005\'\u0000\u0000T\u0018\u0001\u0000\u0000\u0000\u0005\u0000"+
		"\u0001\u0002#P\u0004\u0005\u0001\u0000\u0006\u0000\u0000\u0004\u0000\u0000"+
		"\u0005\u0002\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}