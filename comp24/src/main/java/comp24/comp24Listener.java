// Generated from c:/Users/Maria/OneDrive - Politecnico di Torino/LENOVOBOOK_backup/Desktop/pycc/comp24/src/main/java/comp24/comp24.g4 by ANTLR 4.13.1

package comp24;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link comp24Parser}.
 */
public interface comp24Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link comp24Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(comp24Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(comp24Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(comp24Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(comp24Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(comp24Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(comp24Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(comp24Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(comp24Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(comp24Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(comp24Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#tdato}.
	 * @param ctx the parse tree
	 */
	void enterTdato(comp24Parser.TdatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#tdato}.
	 * @param ctx the parse tree
	 */
	void exitTdato(comp24Parser.TdatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#inic}.
	 * @param ctx the parse tree
	 */
	void enterInic(comp24Parser.InicContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#inic}.
	 * @param ctx the parse tree
	 */
	void exitInic(comp24Parser.InicContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#lvars}.
	 * @param ctx the parse tree
	 */
	void enterLvars(comp24Parser.LvarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#lvars}.
	 * @param ctx the parse tree
	 */
	void exitLvars(comp24Parser.LvarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(comp24Parser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(comp24Parser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(comp24Parser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(comp24Parser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(comp24Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(comp24Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(comp24Parser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(comp24Parser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(comp24Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(comp24Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(comp24Parser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(comp24Parser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(comp24Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(comp24Parser.FactorContext ctx);
}