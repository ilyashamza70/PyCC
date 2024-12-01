// Generated from c:/Users/Maria/OneDrive - Politecnico di Torino/LENOVOBOOK_backup/Desktop/pycc/comp24/src/main/java/comp24/comp24.g4 by ANTLR 4.13.1

package comp24;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link comp24Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface comp24Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link comp24Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(comp24Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#declara_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclara_func(comp24Parser.Declara_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(comp24Parser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(comp24Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(comp24Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#inst_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_while(comp24Parser.Inst_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#instruccion_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_if(comp24Parser.Instruccion_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(comp24Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(comp24Parser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(comp24Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(comp24Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#tdato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdato(comp24Parser.TdatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(comp24Parser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#else_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_opcional(comp24Parser.Else_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(comp24Parser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#llamada_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_func(comp24Parser.Llamada_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#lista_opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_opal(comp24Parser.Lista_opalContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(comp24Parser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#instruccion_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_else(comp24Parser.Instruccion_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(comp24Parser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(comp24Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(comp24Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(comp24Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(comp24Parser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(comp24Parser.LogicContext ctx);
}