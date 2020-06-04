// Generated from C:/Users/kotyn/Documents/asmParser/src/main/antlr4\gram.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(gramParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#asm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsm(gramParser.AsmContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(gramParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(gramParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(gramParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(gramParser.XorContext ctx);
}