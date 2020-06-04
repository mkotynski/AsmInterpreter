// Generated from C:/Users/kotyn/Documents/asmParser/src/main/antlr4\gram.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gramParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#asm}.
	 * @param ctx the parse tree
	 */
	void enterAsm(gramParser.AsmContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#asm}.
	 * @param ctx the parse tree
	 */
	void exitAsm(gramParser.AsmContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(gramParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(gramParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(gramParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(gramParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(gramParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(gramParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(gramParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(gramParser.XorContext ctx);
}