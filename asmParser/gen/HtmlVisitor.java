// Generated from C:/Users/kotyn/Documents/asmParser/src/main/antlr4\Html.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(HtmlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(HtmlParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalic(HtmlParser.ItalicContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBold(HtmlParser.BoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#normal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal(HtmlParser.NormalContext ctx);
}