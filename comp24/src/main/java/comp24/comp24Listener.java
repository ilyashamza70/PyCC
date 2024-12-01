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
	 * Enter a parse tree produced by {@link comp24Parser#declara_func}.
	 * @param ctx the parse tree
	 */
	void enterDeclara_func(comp24Parser.Declara_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#declara_func}.
	 * @param ctx the parse tree
	 */
	void exitDeclara_func(comp24Parser.Declara_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(comp24Parser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(comp24Parser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(comp24Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(comp24Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(comp24Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(comp24Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#inst_while}.
	 * @param ctx the parse tree
	 */
	void enterInst_while(comp24Parser.Inst_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#inst_while}.
	 * @param ctx the parse tree
	 */
	void exitInst_while(comp24Parser.Inst_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#instruccion_if}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_if(comp24Parser.Instruccion_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#instruccion_if}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_if(comp24Parser.Instruccion_ifContext ctx);
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
	 * Enter a parse tree produced by {@link comp24Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(comp24Parser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(comp24Parser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#else_opcional}.
	 * @param ctx the parse tree
	 */
	void enterElse_opcional(comp24Parser.Else_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#else_opcional}.
	 * @param ctx the parse tree
	 */
	void exitElse_opcional(comp24Parser.Else_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(comp24Parser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(comp24Parser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#llamada_func}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_func(comp24Parser.Llamada_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#llamada_func}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_func(comp24Parser.Llamada_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#lista_opal}.
	 * @param ctx the parse tree
	 */
	void enterLista_opal(comp24Parser.Lista_opalContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#lista_opal}.
	 * @param ctx the parse tree
	 */
	void exitLista_opal(comp24Parser.Lista_opalContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(comp24Parser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(comp24Parser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#instruccion_else}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_else(comp24Parser.Instruccion_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#instruccion_else}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_else(comp24Parser.Instruccion_elseContext ctx);
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
	 * Enter a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(comp24Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(comp24Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(comp24Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(comp24Parser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(comp24Parser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(comp24Parser.LogicContext ctx);
}