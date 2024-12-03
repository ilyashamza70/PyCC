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
		T__0=1, FOR=2, WHILE=3, IF=4, ELSE=5, INT=6, DOUBLE=7, CHAR=8, VOID=9, 
		BOOL=10, COMA=11, PYC=12, PA=13, PC=14, LLA=15, LLC=16, ASIG=17, SUMA=18, 
		RESTA=19, MULT=20, DIV=21, MOD=22, IGUAL=23, NEQ=24, GT=25, LT=26, GTE=27, 
		LTE=28, AND=29, OR=30, ID=31, NUMERO=32, WS=33, OTRO=34;
	public static final int
		RULE_programa = 0, RULE_declara_func = 1, RULE_funcion = 2, RULE_parametros = 3, 
		RULE_parametro = 4, RULE_inst_while = 5, RULE_instruccion_if = 6, RULE_bloque = 7, 
		RULE_instruccion = 8, RULE_instrucciones = 9, RULE_declaracion = 10, RULE_tdato = 11, 
		RULE_asignacion = 12, RULE_condicional = 13, RULE_else_opcional = 14, 
		RULE_bucle = 15, RULE_llamada_func = 16, RULE_lista_opal = 17, RULE_return = 18, 
		RULE_instruccion_else = 19, RULE_opal = 20, RULE_exp = 21, RULE_term = 22, 
		RULE_factor = 23, RULE_comparacion = 24, RULE_logic = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declara_func", "funcion", "parametros", "parametro", "inst_while", 
			"instruccion_if", "bloque", "instruccion", "instrucciones", "declaracion", 
			"tdato", "asignacion", "condicional", "else_opcional", "bucle", "llamada_func", 
			"lista_opal", "return", "instruccion_else", "opal", "exp", "term", "factor", 
			"comparacion", "logic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'for'", "'while'", "'if'", "'else'", "'int'", "'double'", 
			"'char'", "'void'", "'bool'", "','", "';'", "'('", "')'", "'{'", "'}'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FOR", "WHILE", "IF", "ELSE", "INT", "DOUBLE", "CHAR", "VOID", 
			"BOOL", "COMA", "PYC", "PA", "PC", "LLA", "LLC", "ASIG", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "IGUAL", "NEQ", "GT", "LT", "GTE", "LTE", "AND", 
			"OR", "ID", "NUMERO", "WS", "OTRO"
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
		public TerminalNode EOF() { return getToken(comp24Parser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147485694L) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(52);
					instruccion();
					}
					break;
				case 2:
					{
					setState(53);
					funcion();
					}
					break;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
	public static class Declara_funcContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public Declara_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterDeclara_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitDeclara_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitDeclara_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declara_funcContext declara_func() throws RecognitionException {
		Declara_funcContext _localctx = new Declara_funcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			tdato();
			setState(62);
			match(ID);
			setState(63);
			match(PA);
			setState(64);
			parametros();
			setState(65);
			match(PC);
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
	public static class FuncionContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			tdato();
			setState(68);
			match(ID);
			setState(69);
			match(PA);
			setState(70);
			parametros();
			setState(71);
			match(PC);
			setState(72);
			bloque();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(comp24Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(comp24Parser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametros);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				parametro();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(75);
					match(COMA);
					setState(76);
					parametro();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PC:
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
	public static class ParametroContext extends ParserRuleContext {
		public TdatoContext tdato() {
			return getRuleContext(TdatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			tdato();
			setState(86);
			match(ID);
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
	public static class Inst_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(comp24Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Inst_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInst_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInst_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInst_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_whileContext inst_while() throws RecognitionException {
		Inst_whileContext _localctx = new Inst_whileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inst_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(WHILE);
			setState(89);
			match(PA);
			setState(90);
			comparacion();
			setState(91);
			match(PC);
			setState(92);
			bloque();
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
	public static class Instruccion_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(comp24Parser.IF, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(comp24Parser.ELSE, 0); }
		public Instruccion_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInstruccion_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInstruccion_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInstruccion_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_ifContext instruccion_if() throws RecognitionException {
		Instruccion_ifContext _localctx = new Instruccion_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IF);
			setState(95);
			match(PA);
			setState(96);
			comparacion();
			setState(97);
			match(PC);
			setState(98);
			bloque();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(99);
				match(ELSE);
				setState(100);
				bloque();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(comp24Parser.LLA, 0); }
		public TerminalNode LLC() { return getToken(comp24Parser.LLC, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LLA);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147485694L) != 0)) {
				{
				{
				setState(104);
				instruccion();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public Llamada_funcContext llamada_func() {
			return getRuleContext(Llamada_funcContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Instruccion_elseContext instruccion_else() {
			return getRuleContext(Instruccion_elseContext.class,0);
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
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				asignacion();
				setState(114);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				bucle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				llamada_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				return_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				instruccion_else();
				}
				break;
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
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
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
		enterRule(_localctx, 18, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				instruccion();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2147485694L) != 0) );
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
		public List<TerminalNode> ID() { return getTokens(comp24Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(comp24Parser.ID, i);
		}
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public List<TerminalNode> ASIG() { return getTokens(comp24Parser.ASIG); }
		public TerminalNode ASIG(int i) {
			return getToken(comp24Parser.ASIG, i);
		}
		public List<OpalContext> opal() {
			return getRuleContexts(OpalContext.class);
		}
		public OpalContext opal(int i) {
			return getRuleContext(OpalContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(comp24Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(comp24Parser.COMA, i);
		}
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
		enterRule(_localctx, 20, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			tdato();
			setState(129);
			match(ID);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIG) {
				{
				setState(130);
				match(ASIG);
				setState(131);
				opal();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(134);
				match(COMA);
				setState(135);
				match(ID);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIG) {
					{
					setState(136);
					match(ASIG);
					setState(137);
					opal();
					}
				}

				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
		enterRule(_localctx, 22, RULE_tdato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1984L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(ASIG);
			setState(151);
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(comp24Parser.IF, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(comp24Parser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			match(PA);
			setState(155);
			comparacion();
			setState(156);
			match(PC);
			setState(157);
			bloque();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(158);
				match(ELSE);
				setState(159);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_opcionalContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(comp24Parser.ELSE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Else_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterElse_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitElse_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitElse_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_opcionalContext else_opcional() throws RecognitionException {
		Else_opcionalContext _localctx = new Else_opcionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_opcional);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ELSE);
				setState(163);
				bloque();
				}
				break;
			case EOF:
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
	public static class BucleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(comp24Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FOR() { return getToken(comp24Parser.FOR, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PYC() { return getTokens(comp24Parser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(comp24Parser.PYC, i);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bucle);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(WHILE);
				setState(168);
				match(PA);
				setState(169);
				comparacion();
				setState(170);
				match(PC);
				setState(171);
				bloque();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(FOR);
				setState(174);
				match(PA);
				setState(175);
				asignacion();
				setState(176);
				match(PYC);
				setState(177);
				comparacion();
				setState(178);
				match(PYC);
				setState(179);
				asignacion();
				setState(180);
				match(PC);
				setState(181);
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
	public static class Llamada_funcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(comp24Parser.ID, 0); }
		public TerminalNode PA() { return getToken(comp24Parser.PA, 0); }
		public Lista_opalContext lista_opal() {
			return getRuleContext(Lista_opalContext.class,0);
		}
		public TerminalNode PC() { return getToken(comp24Parser.PC, 0); }
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public Llamada_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterLlamada_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitLlamada_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitLlamada_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcContext llamada_func() throws RecognitionException {
		Llamada_funcContext _localctx = new Llamada_funcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_llamada_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(186);
			match(PA);
			setState(187);
			lista_opal();
			setState(188);
			match(PC);
			setState(189);
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
	public static class Lista_opalContext extends ParserRuleContext {
		public List<OpalContext> opal() {
			return getRuleContexts(OpalContext.class);
		}
		public OpalContext opal(int i) {
			return getRuleContext(OpalContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(comp24Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(comp24Parser.COMA, i);
		}
		public Lista_opalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterLista_opal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitLista_opal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitLista_opal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_opalContext lista_opal() throws RecognitionException {
		Lista_opalContext _localctx = new Lista_opalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lista_opal);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case ID:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				opal();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(192);
					match(COMA);
					setState(193);
					opal();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PC:
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
	public static class ReturnContext extends ParserRuleContext {
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PYC() { return getToken(comp24Parser.PYC, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__0);
			setState(203);
			opal();
			setState(204);
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
	public static class Instruccion_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(comp24Parser.ELSE, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Instruccion_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterInstruccion_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitInstruccion_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitInstruccion_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_elseContext instruccion_else() throws RecognitionException {
		Instruccion_elseContext _localctx = new Instruccion_elseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_instruccion_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ELSE);
			setState(207);
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
		enterRule(_localctx, 40, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			exp(0);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(comp24Parser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(comp24Parser.RESTA, 0); }
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
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						match(SUMA);
						setState(216);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						match(RESTA);
						setState(219);
						term(0);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULT() { return getToken(comp24Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(comp24Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(comp24Parser.MOD, 0); }
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
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(228);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(229);
						match(MULT);
						setState(230);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232);
						match(DIV);
						setState(233);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(MOD);
						setState(236);
						factor();
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(PA);
				setState(245);
				exp(0);
				setState(246);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public List<OpalContext> opal() {
			return getRuleContexts(OpalContext.class);
		}
		public OpalContext opal(int i) {
			return getRuleContext(OpalContext.class,i);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			opal();
			setState(251);
			logic();
			setState(252);
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
	public static class LogicContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(comp24Parser.IGUAL, 0); }
		public TerminalNode NEQ() { return getToken(comp24Parser.NEQ, 0); }
		public TerminalNode GT() { return getToken(comp24Parser.GT, 0); }
		public TerminalNode LT() { return getToken(comp24Parser.LT, 0); }
		public TerminalNode GTE() { return getToken(comp24Parser.GTE, 0); }
		public TerminalNode LTE() { return getToken(comp24Parser.LTE, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comp24Listener ) ((comp24Listener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof comp24Visitor ) return ((comp24Visitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 22:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003"+
		"\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006f\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007"+
		"j\b\u0007\n\u0007\f\u0007m\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bz\b"+
		"\b\u0001\t\u0004\t}\b\t\u000b\t\f\t~\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0085\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008b\b\n\u0005\n"+
		"\u008d\b\n\n\n\f\n\u0090\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00a1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00b8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00c3"+
		"\b\u0011\n\u0011\f\u0011\u00c6\t\u0011\u0001\u0011\u0003\u0011\u00c9\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00dd\b\u0015\n\u0015\f\u0015\u00e0\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u00ee\b\u0016\n\u0016\f\u0016\u00f1\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f9\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0000\u0002*,\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0002\u0001\u0000"+
		"\u0006\n\u0001\u0000\u0017\u001c\u0102\u00008\u0001\u0000\u0000\u0000"+
		"\u0002=\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006S"+
		"\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000"+
		"\u0000\f^\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000\u0010"+
		"y\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u0080\u0001"+
		"\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018\u0095\u0001"+
		"\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00a5\u0001"+
		"\u0000\u0000\u0000\u001e\u00b7\u0001\u0000\u0000\u0000 \u00b9\u0001\u0000"+
		"\u0000\u0000\"\u00c8\u0001\u0000\u0000\u0000$\u00ca\u0001\u0000\u0000"+
		"\u0000&\u00ce\u0001\u0000\u0000\u0000(\u00d1\u0001\u0000\u0000\u0000*"+
		"\u00d3\u0001\u0000\u0000\u0000,\u00e1\u0001\u0000\u0000\u0000.\u00f8\u0001"+
		"\u0000\u0000\u00000\u00fa\u0001\u0000\u0000\u00002\u00fe\u0001\u0000\u0000"+
		"\u000047\u0003\u0010\b\u000057\u0003\u0004\u0002\u000064\u0001\u0000\u0000"+
		"\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0000\u0000\u0001<\u0001\u0001\u0000\u0000"+
		"\u0000=>\u0003\u0016\u000b\u0000>?\u0005\u001f\u0000\u0000?@\u0005\r\u0000"+
		"\u0000@A\u0003\u0006\u0003\u0000AB\u0005\u000e\u0000\u0000B\u0003\u0001"+
		"\u0000\u0000\u0000CD\u0003\u0016\u000b\u0000DE\u0005\u001f\u0000\u0000"+
		"EF\u0005\r\u0000\u0000FG\u0003\u0006\u0003\u0000GH\u0005\u000e\u0000\u0000"+
		"HI\u0003\u000e\u0007\u0000I\u0005\u0001\u0000\u0000\u0000JO\u0003\b\u0004"+
		"\u0000KL\u0005\u000b\u0000\u0000LN\u0003\b\u0004\u0000MK\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PT\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RT\u0001"+
		"\u0000\u0000\u0000SJ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"T\u0007\u0001\u0000\u0000\u0000UV\u0003\u0016\u000b\u0000VW\u0005\u001f"+
		"\u0000\u0000W\t\u0001\u0000\u0000\u0000XY\u0005\u0003\u0000\u0000YZ\u0005"+
		"\r\u0000\u0000Z[\u00030\u0018\u0000[\\\u0005\u000e\u0000\u0000\\]\u0003"+
		"\u000e\u0007\u0000]\u000b\u0001\u0000\u0000\u0000^_\u0005\u0004\u0000"+
		"\u0000_`\u0005\r\u0000\u0000`a\u00030\u0018\u0000ab\u0005\u000e\u0000"+
		"\u0000be\u0003\u000e\u0007\u0000cd\u0005\u0005\u0000\u0000df\u0003\u000e"+
		"\u0007\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\r\u0001"+
		"\u0000\u0000\u0000gk\u0005\u000f\u0000\u0000hj\u0003\u0010\b\u0000ih\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000no\u0005\u0010\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pz\u0003"+
		"\u0014\n\u0000qr\u0003\u0018\f\u0000rs\u0005\f\u0000\u0000sz\u0001\u0000"+
		"\u0000\u0000tz\u0003\u001a\r\u0000uz\u0003\u001e\u000f\u0000vz\u0003 "+
		"\u0010\u0000wz\u0003$\u0012\u0000xz\u0003&\u0013\u0000yp\u0001\u0000\u0000"+
		"\u0000yq\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yu\u0001\u0000"+
		"\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{}\u0003\u0010\b\u0000"+
		"|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0013\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0003\u0016\u000b\u0000\u0081\u0084\u0005\u001f\u0000\u0000"+
		"\u0082\u0083\u0005\u0011\u0000\u0000\u0083\u0085\u0003(\u0014\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u008e\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000b\u0000\u0000\u0087"+
		"\u008a\u0005\u001f\u0000\u0000\u0088\u0089\u0005\u0011\u0000\u0000\u0089"+
		"\u008b\u0003(\u0014\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0086"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\f\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0094\u0007"+
		"\u0000\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u001f\u0000\u0000\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u0098\u0003"+
		"(\u0014\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0004"+
		"\u0000\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b\u009c\u00030\u0018"+
		"\u0000\u009c\u009d\u0005\u000e\u0000\u0000\u009d\u00a0\u0003\u000e\u0007"+
		"\u0000\u009e\u009f\u0005\u0005\u0000\u0000\u009f\u00a1\u0003\u000e\u0007"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0005\u0000"+
		"\u0000\u00a3\u00a6\u0003\u000e\u0007\u0000\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u001d\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0003\u0000"+
		"\u0000\u00a8\u00a9\u0005\r\u0000\u0000\u00a9\u00aa\u00030\u0018\u0000"+
		"\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab\u00ac\u0003\u000e\u0007\u0000"+
		"\u00ac\u00b8\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0002\u0000\u0000"+
		"\u00ae\u00af\u0005\r\u0000\u0000\u00af\u00b0\u0003\u0018\f\u0000\u00b0"+
		"\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u00030\u0018\u0000\u00b2\u00b3"+
		"\u0005\f\u0000\u0000\u00b3\u00b4\u0003\u0018\f\u0000\u00b4\u00b5\u0005"+
		"\u000e\u0000\u0000\u00b5\u00b6\u0003\u000e\u0007\u0000\u00b6\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b7\u00a7\u0001\u0000\u0000\u0000\u00b7\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b8\u001f\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u001f\u0000\u0000\u00ba\u00bb\u0005\r\u0000\u0000\u00bb\u00bc\u0003\""+
		"\u0011\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd\u00be\u0005\f\u0000"+
		"\u0000\u00be!\u0001\u0000\u0000\u0000\u00bf\u00c4\u0003(\u0014\u0000\u00c0"+
		"\u00c1\u0005\u000b\u0000\u0000\u00c1\u00c3\u0003(\u0014\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00bf\u0001\u0000\u0000\u0000\u00c8\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9#\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"\u0001\u0000\u0000\u00cb\u00cc\u0003(\u0014\u0000\u00cc\u00cd\u0005\f"+
		"\u0000\u0000\u00cd%\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0005\u0000"+
		"\u0000\u00cf\u00d0\u0003\u0010\b\u0000\u00d0\'\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0003*\u0015\u0000\u00d2)\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0006\u0015\uffff\uffff\u0000\u00d4\u00d5\u0003,\u0016\u0000\u00d5\u00de"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\n\u0003\u0000\u0000\u00d7\u00d8\u0005"+
		"\u0012\u0000\u0000\u00d8\u00dd\u0003,\u0016\u0000\u00d9\u00da\n\u0002"+
		"\u0000\u0000\u00da\u00db\u0005\u0013\u0000\u0000\u00db\u00dd\u0003,\u0016"+
		"\u0000\u00dc\u00d6\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df+\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0006\u0016\uffff\uffff"+
		"\u0000\u00e2\u00e3\u0003.\u0017\u0000\u00e3\u00ef\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\n\u0004\u0000\u0000\u00e5\u00e6\u0005\u0014\u0000\u0000\u00e6"+
		"\u00ee\u0003.\u0017\u0000\u00e7\u00e8\n\u0003\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0015\u0000\u0000\u00e9\u00ee\u0003.\u0017\u0000\u00ea\u00eb\n"+
		"\u0002\u0000\u0000\u00eb\u00ec\u0005\u0016\u0000\u0000\u00ec\u00ee\u0003"+
		".\u0017\u0000\u00ed\u00e4\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0-\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f9\u0005 \u0000\u0000\u00f3\u00f9\u0005\u001f\u0000\u0000"+
		"\u00f4\u00f5\u0005\r\u0000\u0000\u00f5\u00f6\u0003*\u0015\u0000\u00f6"+
		"\u00f7\u0005\u000e\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f9/\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0003(\u0014\u0000\u00fb\u00fc\u00032\u0019\u0000\u00fc\u00fd\u0003("+
		"\u0014\u0000\u00fd1\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0001\u0000"+
		"\u0000\u00ff3\u0001\u0000\u0000\u0000\u001568OSeky~\u0084\u008a\u008e"+
		"\u00a0\u00a5\u00b7\u00c4\u00c8\u00dc\u00de\u00ed\u00ef\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}