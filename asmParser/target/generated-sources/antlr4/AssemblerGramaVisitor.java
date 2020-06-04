// Generated from AssemblerGrama.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblerGramaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblerGramaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblerGramaParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(AssemblerGramaParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGramaParser#inter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInter(AssemblerGramaParser.InterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGramaParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(AssemblerGramaParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGramaParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(AssemblerGramaParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerGramaParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(AssemblerGramaParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(AssemblerGramaParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(AssemblerGramaParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Min}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(AssemblerGramaParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Reg}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg(AssemblerGramaParser.RegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(AssemblerGramaParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(AssemblerGramaParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(AssemblerGramaParser.ParenContext ctx);
}