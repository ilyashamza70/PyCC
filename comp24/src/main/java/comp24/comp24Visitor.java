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
	 * Visit a parse tree produced by {@link comp24Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(comp24Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(comp24Parser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(comp24Parser.BloqueContext ctx);
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
	 * Visit a parse tree produced by {@link comp24Parser#inic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInic(comp24Parser.InicContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#lvars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvars(comp24Parser.LvarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(comp24Parser.IwhileContext ctx);
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
	 * Visit a parse tree produced by {@link comp24Parser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(comp24Parser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(comp24Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(comp24Parser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(comp24Parser.FactorContext ctx);
}