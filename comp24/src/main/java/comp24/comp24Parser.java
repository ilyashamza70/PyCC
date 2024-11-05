// Generated from c:/Users/Maria/OneDrive - Politecnico di Torino/LENOVOBOOK_backup/Desktop/pycc/comp24/src/main/java/comp24/comp24.g4 by ANTLR 4.13.1

package comp24;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class comp24Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, WHILE=2, INT=3, DOUBLE=4, CHAR=5, VOID=6, BOOL=7, COMA=8, PYC=9, 
		PA=10, PC=11, LLA=12, LLC=13, ASIG=14, SUMA=15, RESTA=16, MULT=17, DIV=18, 
		MOD=19, IGUAL=20, ID=21, NUMERO=22, WS=23, OTRO=24;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_declaracion = 4, RULE_tdato = 5, RULE_inic = 6, RULE_lvars = 7, RULE_asignacion = 8, 
		RULE_iwhile = 9, RULE_opal = 10, RULE_exp = 11, RULE_e = 12, RULE_term = 13, 
		RULE_t = 14, RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "bloque", "declaracion", 
			"tdato", "inic", "lvars", "asignacion", "iwhile", "opal", "exp", "e", 
			"term", "t", "factor"
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

	@Override
	public String getGrammarFileName() { return "comp24.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public comp24Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(comp24Parser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			instrucciones();
			setState(33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case LLA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				instruccion();
				setState(36);
				instrucciones();
				}
				break;
			case EOF:
			case LLC:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				declaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				asignacion();
				setState(43);
				match(PYC);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				iwhile();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(comp24Parser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(comp24Parser.LLC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LLA);
			setState(50);
			instrucciones();
			setState(51);
			match(LLC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public InicContext inic() {
			return getRuleContext(InicContext.class,0);
		}
		public LvarsContext lvars() {
			return getRuleContext(LvarsContext.class,0);
		}
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			tdato();
			setState(54);
			match(ID);
			setState(55);
			inic();
			setState(56);
			lvars();
			setState(57);
			match(PYC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TdatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(comp24Parser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(comp24Parser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(comp24Parser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(comp24Parser.VOID, 0); }
		public TerminalNode BOOL() { return getToken(comp24Parser.BOOL, 0); }
		public TdatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tdato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterTdato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitTdato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitTdato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TdatoContext tdato() throws RecognitionException {
		TdatoContext _localctx = new TdatoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tdato);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(DOUBLE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(CHAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(VOID);
				setState(63);
				match(BOOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InicContext extends ParserRuleContext {
		public TerminalNode ASIG() { return getToken(comp24Parser.ASIG, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public InicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicContext inic() throws RecognitionException {
		InicContext _localctx = new InicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inic);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(ASIG);
				setState(67);
				opal();
				}
				break;
			case COMA:
			case PYC:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class LvarsContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(comp24Parser.COMA, 0); }
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public InicContext inic() {
			return getRuleContext(InicContext.class,0);
		}
		public LvarsContext lvars() {
			return getRuleContext(LvarsContext.class,0);
		}
		public LvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterLvars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitLvars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitLvars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvarsContext lvars() throws RecognitionException {
		LvarsContext _localctx = new LvarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lvars);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(COMA);
				setState(72);
				match(ID);
				setState(73);
				inic();
				setState(74);
				lvars();
				}
				break;
			case PYC:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode ASIG() { return getToken(comp24Parser.ASIG, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(ASIG);
			setState(81);
			opal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(comp24Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE);
			setState(84);
			match(PA);
			setState(85);
			opal();
			setState(86);
			match(PC);
			setState(87);
			instruccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpalContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			term();
			setState(92);
			e();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(comp24Parser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(comp24Parser.RESTA, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_e);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(SUMA);
				setState(95);
				term();
				setState(96);
				e();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(RESTA);
				setState(99);
				term();
				setState(100);
				e();
				}
				break;
			case COMA:
			case PYC:
			case PC:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			factor();
			setState(106);
			t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(comp24Parser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(comp24Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(comp24Parser.MOD, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_t);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(MULT);
				setState(109);
				factor();
				setState(110);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(DIV);
				setState(113);
				factor();
				setState(114);
				t();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(MOD);
				setState(117);
				factor();
				setState(118);
				t();
				}
				break;
			case COMA:
			case PYC:
			case PC:
			case SUMA:
			case RESTA:
				enterOuterAlt(_localctx, 4);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(comp24Parser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(PA);
				setState(126);
				exp();
				setState(127);
				match(PC);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fh\b\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ez\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0082\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000"+
		"\u0083\u0000 \u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b5\u0001"+
		"\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000"+
		"\u000eM\u0001\u0000\u0000\u0000\u0010O\u0001\u0000\u0000\u0000\u0012S"+
		"\u0001\u0000\u0000\u0000\u0014Y\u0001\u0000\u0000\u0000\u0016[\u0001\u0000"+
		"\u0000\u0000\u0018g\u0001\u0000\u0000\u0000\u001ai\u0001\u0000\u0000\u0000"+
		"\u001cy\u0001\u0000\u0000\u0000\u001e\u0081\u0001\u0000\u0000\u0000 !"+
		"\u0003\u0002\u0001\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000"+
		"\u0000\u0000#$\u0003\u0004\u0002\u0000$%\u0003\u0002\u0001\u0000%(\u0001"+
		"\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)0\u0003\b\u0004"+
		"\u0000*+\u0003\u0010\b\u0000+,\u0005\t\u0000\u0000,0\u0001\u0000\u0000"+
		"\u0000-0\u0003\u0012\t\u0000.0\u0003\u0006\u0003\u0000/)\u0001\u0000\u0000"+
		"\u0000/*\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000"+
		"\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005\f\u0000\u000023\u0003"+
		"\u0002\u0001\u000034\u0005\r\u0000\u00004\u0007\u0001\u0000\u0000\u0000"+
		"56\u0003\n\u0005\u000067\u0005\u0015\u0000\u000078\u0003\f\u0006\u0000"+
		"89\u0003\u000e\u0007\u00009:\u0005\t\u0000\u0000:\t\u0001\u0000\u0000"+
		"\u0000;A\u0005\u0003\u0000\u0000<A\u0005\u0004\u0000\u0000=A\u0005\u0005"+
		"\u0000\u0000>?\u0005\u0006\u0000\u0000?A\u0005\u0007\u0000\u0000@;\u0001"+
		"\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005\u000e"+
		"\u0000\u0000CF\u0003\u0014\n\u0000DF\u0001\u0000\u0000\u0000EB\u0001\u0000"+
		"\u0000\u0000ED\u0001\u0000\u0000\u0000F\r\u0001\u0000\u0000\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0005\u0015\u0000\u0000IJ\u0003\f\u0006\u0000JK\u0003"+
		"\u000e\u0007\u0000KN\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MG\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\u000f\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0015\u0000\u0000PQ\u0005\u000e\u0000\u0000QR\u0003"+
		"\u0014\n\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005\u0002\u0000\u0000"+
		"TU\u0005\n\u0000\u0000UV\u0003\u0014\n\u0000VW\u0005\u000b\u0000\u0000"+
		"WX\u0003\u0004\u0002\u0000X\u0013\u0001\u0000\u0000\u0000YZ\u0003\u0016"+
		"\u000b\u0000Z\u0015\u0001\u0000\u0000\u0000[\\\u0003\u001a\r\u0000\\]"+
		"\u0003\u0018\f\u0000]\u0017\u0001\u0000\u0000\u0000^_\u0005\u000f\u0000"+
		"\u0000_`\u0003\u001a\r\u0000`a\u0003\u0018\f\u0000ah\u0001\u0000\u0000"+
		"\u0000bc\u0005\u0010\u0000\u0000cd\u0003\u001a\r\u0000de\u0003\u0018\f"+
		"\u0000eh\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000g^\u0001\u0000"+
		"\u0000\u0000gb\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0019"+
		"\u0001\u0000\u0000\u0000ij\u0003\u001e\u000f\u0000jk\u0003\u001c\u000e"+
		"\u0000k\u001b\u0001\u0000\u0000\u0000lm\u0005\u0011\u0000\u0000mn\u0003"+
		"\u001e\u000f\u0000no\u0003\u001c\u000e\u0000oz\u0001\u0000\u0000\u0000"+
		"pq\u0005\u0012\u0000\u0000qr\u0003\u001e\u000f\u0000rs\u0003\u001c\u000e"+
		"\u0000sz\u0001\u0000\u0000\u0000tu\u0005\u0013\u0000\u0000uv\u0003\u001e"+
		"\u000f\u0000vw\u0003\u001c\u000e\u0000wz\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000yl\u0001\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000"+
		"yt\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u001d\u0001\u0000"+
		"\u0000\u0000{\u0082\u0005\u0016\u0000\u0000|\u0082\u0005\u0015\u0000\u0000"+
		"}~\u0005\n\u0000\u0000~\u007f\u0003\u0016\u000b\u0000\u007f\u0080\u0005"+
		"\u000b\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081{\u0001\u0000"+
		"\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000"+
		"\u0082\u001f\u0001\u0000\u0000\u0000\b\'/@EMgy\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}