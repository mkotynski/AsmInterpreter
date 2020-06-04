// Generated from AssemblerGrama.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerGramaParser}.
 */
public interface AssemblerGramaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerGramaParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(AssemblerGramaParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGramaParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(AssemblerGramaParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGramaParser#inter}.
	 * @param ctx the parse tree
	 */
	void enterInter(AssemblerGramaParser.InterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGramaParser#inter}.
	 * @param ctx the parse tree
	 */
	void exitInter(AssemblerGramaParser.InterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGramaParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(AssemblerGramaParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGramaParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(AssemblerGramaParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGramaParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(AssemblerGramaParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGramaParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(AssemblerGramaParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGramaParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(AssemblerGramaParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGramaParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(AssemblerGramaParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(AssemblerGramaParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(AssemblerGramaParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSub(AssemblerGramaParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSub(AssemblerGramaParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Min}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMin(AssemblerGramaParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Min}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMin(AssemblerGramaParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reg}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReg(AssemblerGramaParser.RegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reg}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReg(AssemblerGramaParser.RegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(AssemblerGramaParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(AssemblerGramaParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(AssemblerGramaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(AssemblerGramaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(AssemblerGramaParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link AssemblerGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(AssemblerGramaParser.ParenContext ctx);
}