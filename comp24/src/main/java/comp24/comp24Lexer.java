// Generated from c:/Users/Maria/OneDrive - Politecnico di Torino/LENOVOBOOK_backup/Desktop/pycc/comp24/src/main/java/comp24/comp24.g4 by ANTLR 4.13.1

package comp24;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class comp24Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, WHILE=2, INT=3, DOUBLE=4, CHAR=5, VOID=6, BOOL=7, COMA=8, PYC=9, 
		PA=10, PC=11, LLA=12, LLC=13, ASIG=14, SUMA=15, RESTA=16, MULT=17, DIV=18, 
		MOD=19, IGUAL=20, ID=21, NUMERO=22, WS=23, OTRO=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "FOR", "WHILE", "INT", "DOUBLE", "CHAR", "VOID", "BOOL", 
			"COMA", "PYC", "PA", "PC", "LLA", "LLC", "ASIG", "SUMA", "RESTA", "MULT", 
			"DIV", "MOD", "IGUAL", "ID", "NUMERO", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'while'", "'int'", "'double'", "'char'", "'void'", "'bool'", 
			"','", "';'", "'('", "')'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "WHILE", "INT", "DOUBLE", "CHAR", "VOID", "BOOL", "COMA", 
			"PYC", "PA", "PC", "LLA", "LLC", "ASIG", "SUMA", "RESTA", "MULT", "DIV", 
			"MOD", "IGUAL", "ID", "NUMERO", "WS", "OTRO"
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


	public comp24Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "comp24.g4"; }

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
		"\u0004\u0000\u0018\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0003\u0016{\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0080\b\u0016\n\u0016\f\u0016\u0083\t\u0016"+
		"\u0001\u0017\u0004\u0017\u0086\b\u0017\u000b\u0017\f\u0017\u0087\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0000"+
		"\u0000\u001a\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b"+
		"\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b"+
		"\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014"+
		"-\u0015/\u00161\u00173\u0018\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u0091\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000"+
		"\u00037\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007="+
		"\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bG\u0001\u0000"+
		"\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fS\u0001\u0000\u0000\u0000"+
		"\u0011X\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015_"+
		"\u0001\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019c\u0001\u0000"+
		"\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000"+
		"\u001fi\u0001\u0000\u0000\u0000!k\u0001\u0000\u0000\u0000#m\u0001\u0000"+
		"\u0000\u0000%o\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000)s\u0001"+
		"\u0000\u0000\u0000+u\u0001\u0000\u0000\u0000-z\u0001\u0000\u0000\u0000"+
		"/\u0085\u0001\u0000\u0000\u00001\u0089\u0001\u0000\u0000\u00003\u008d"+
		"\u0001\u0000\u0000\u000056\u0007\u0000\u0000\u00006\u0002\u0001\u0000"+
		"\u0000\u000078\u0007\u0001\u0000\u00008\u0004\u0001\u0000\u0000\u0000"+
		"9:\u0005f\u0000\u0000:;\u0005o\u0000\u0000;<\u0005r\u0000\u0000<\u0006"+
		"\u0001\u0000\u0000\u0000=>\u0005w\u0000\u0000>?\u0005h\u0000\u0000?@\u0005"+
		"i\u0000\u0000@A\u0005l\u0000\u0000AB\u0005e\u0000\u0000B\b\u0001\u0000"+
		"\u0000\u0000CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000EF\u0005t\u0000"+
		"\u0000F\n\u0001\u0000\u0000\u0000GH\u0005d\u0000\u0000HI\u0005o\u0000"+
		"\u0000IJ\u0005u\u0000\u0000JK\u0005b\u0000\u0000KL\u0005l\u0000\u0000"+
		"LM\u0005e\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005c\u0000\u0000"+
		"OP\u0005h\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005r\u0000\u0000R\u000e"+
		"\u0001\u0000\u0000\u0000ST\u0005v\u0000\u0000TU\u0005o\u0000\u0000UV\u0005"+
		"i\u0000\u0000VW\u0005d\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005"+
		"b\u0000\u0000YZ\u0005o\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005l\u0000"+
		"\u0000\\\u0012\u0001\u0000\u0000\u0000]^\u0005,\u0000\u0000^\u0014\u0001"+
		"\u0000\u0000\u0000_`\u0005;\u0000\u0000`\u0016\u0001\u0000\u0000\u0000"+
		"ab\u0005(\u0000\u0000b\u0018\u0001\u0000\u0000\u0000cd\u0005)\u0000\u0000"+
		"d\u001a\u0001\u0000\u0000\u0000ef\u0005{\u0000\u0000f\u001c\u0001\u0000"+
		"\u0000\u0000gh\u0005}\u0000\u0000h\u001e\u0001\u0000\u0000\u0000ij\u0005"+
		"=\u0000\u0000j \u0001\u0000\u0000\u0000kl\u0005+\u0000\u0000l\"\u0001"+
		"\u0000\u0000\u0000mn\u0005-\u0000\u0000n$\u0001\u0000\u0000\u0000op\u0005"+
		"*\u0000\u0000p&\u0001\u0000\u0000\u0000qr\u0005/\u0000\u0000r(\u0001\u0000"+
		"\u0000\u0000st\u0005%\u0000\u0000t*\u0001\u0000\u0000\u0000uv\u0005=\u0000"+
		"\u0000vw\u0005=\u0000\u0000w,\u0001\u0000\u0000\u0000x{\u0003\u0001\u0000"+
		"\u0000y{\u0005_\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{\u0081\u0001\u0000\u0000\u0000|\u0080\u0003\u0001\u0000\u0000}"+
		"\u0080\u0003\u0003\u0001\u0000~\u0080\u0005_\u0000\u0000\u007f|\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082.\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0003\u0001\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u00880\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0002\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0006\u0018\u0000\u0000\u008c"+
		"2\u0001\u0000\u0000\u0000\u008d\u008e\t\u0000\u0000\u0000\u008e4\u0001"+
		"\u0000\u0000\u0000\u0005\u0000z\u007f\u0081\u0087\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}