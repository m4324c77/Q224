// Generated from QGrammar.g4 by ANTLR 4.13.2
package io.compiler.core;

	import java.util.ArrayList;
	import java.util.Stack;
	import java.util.HashMap;
	import io.compiler.types.*;
	import io.compiler.core.exceptions.*;
	import io.compiler.core.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QGrammarParser}.
 */
public interface QGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(QGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(QGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(QGrammarParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(QGrammarParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(QGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(QGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#cmdWHILE}.
	 * @param ctx the parse tree
	 */
	void enterCmdWHILE(QGrammarParser.CmdWHILEContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#cmdWHILE}.
	 * @param ctx the parse tree
	 */
	void exitCmdWHILE(QGrammarParser.CmdWHILEContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#cmdIF}.
	 * @param ctx the parse tree
	 */
	void enterCmdIF(QGrammarParser.CmdIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#cmdIF}.
	 * @param ctx the parse tree
	 */
	void exitCmdIF(QGrammarParser.CmdIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#cmdAttrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAttrib(QGrammarParser.CmdAttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#cmdAttrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAttrib(QGrammarParser.CmdAttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(QGrammarParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(QGrammarParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(QGrammarParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(QGrammarParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(QGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(QGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(QGrammarParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(QGrammarParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link QGrammarParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(QGrammarParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link QGrammarParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(QGrammarParser.ExprlContext ctx);
}