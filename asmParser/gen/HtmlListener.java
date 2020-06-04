// Generated from C:/Users/kotyn/Documents/asmParser/src/main/antlr4\Html.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(HtmlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(HtmlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(HtmlParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(HtmlParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalic(HtmlParser.ItalicContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalic(HtmlParser.ItalicContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(HtmlParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(HtmlParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#normal}.
	 * @param ctx the parse tree
	 */
	void enterNormal(HtmlParser.NormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#normal}.
	 * @param ctx the parse tree
	 */
	void exitNormal(HtmlParser.NormalContext ctx);
}