import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ParserMethod extends AssemblerGramaBaseVisitor<Integer>  {

    private List<String> errors = new ArrayList<>();
    private static Data data = new Data();

    @Override
    public Integer visitBegin(AssemblerGramaParser.BeginContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitMov(AssemblerGramaParser.MovContext ctx) {
//        try {
//            System.out.println(visit(ctx.left));
//            data.setRegister(ctx.right.getText(), visit(ctx.left));
//        } catch (Exception e)
//        {
//            System.out.println("Error mov");
//        }
        try {
            if(visit(ctx.left) != null && ctx.right.getText() != null) {
                data.setRegister(ctx.right.getText(), visit(ctx.left));
            }
            else {
                //System.out.println("Error");
            }
        } catch(Exception e)
        {
            //System.out.println("Error");
        }

        return visitChildren(ctx);
    }


    @Override
    public Integer visitPush(AssemblerGramaParser.PushContext ctx) {
        data.push(visit(ctx.expression()));
        return visitChildren(ctx);
    }

    @Override
    public Integer visitInter(AssemblerGramaParser.InterContext ctx) {
        if (data.stackEmpty()) {
            System.out.println("???");
        } else {
            Integer integer = data.pop();
            if (integer == null) {
                System.out.println("???");
            } else {
                System.out.println(integer);
            }
        }
        return super.visitInter(ctx);
    }

    @Override
    public Integer visitAdd(AssemblerGramaParser.AddContext ctx) {
        Integer result = null;
        try {
            result = visit(ctx.left) + visit(ctx.right);
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    @Override
    public Integer visitMin(AssemblerGramaParser.MinContext ctx) {
        return -Integer.valueOf(ctx.getText());
    }

    @Override
    public Integer visitXor(AssemblerGramaParser.XorContext ctx) {
       if(visit(ctx.left) == null && visit(ctx.right) == null)
       {
           data.setRegister(ctx.left.getText(),0);
           return 0;
       }
       else
       {
           data.setRegister(ctx.left.getText(),visit(ctx.left)^ visit(ctx.right));
           //System.out.println(visit(ctx.left)^ visit(ctx.right));
           return visit(ctx.left)^ visit(ctx.right);
       }
    }

    @Override
    public Integer visitSub(AssemblerGramaParser.SubContext ctx) {
       Integer result = null;
        try {
            //System.out.println(visit(ctx.left) + " - " + visit(ctx.right));
            result = visit(ctx.left) - visit(ctx.right);
            //System.out.println(result);
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    @Override
    public Integer visitReg(AssemblerGramaParser.RegContext ctx){
        return data.getRegister(ctx.getText()).getValue();
    }

    @Override
    public Integer visitMul(AssemblerGramaParser.MulContext ctx) {
        Integer result = null;
        try {
            result = visit(ctx.left) * visit(ctx.right);
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    @Override
    public Integer visitInt(AssemblerGramaParser.IntContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Integer visitParen(AssemblerGramaParser.ParenContext ctx) {
        return this.visit(ctx.expression());
    }

    //    @Override
//    public void enterAdd(AssemblerGramaParser.AddContext ctx) {
//       // TerminalNode node = ctx.Identifier();
//        ParseTree leftSide = ctx.getChild(0);
//        ParseTree rightSide = ctx.getChild(2);
//        System.out.println(leftSide.getText() + " tutaj dodawanko " + rightSide.getText());
//    }
//
//    @Override
//    public void enterSub(AssemblerGramaParser.SubContext ctx)  {
//        // TerminalNode node = ctx.Identifier();
//        ParseTree leftSide = ctx.getChild(0);
//        ParseTree rightSide = ctx.getChild(2);
//        System.out.println(leftSide.getText() + " tutaj odejmowanko " + rightSide.getText());
//    }
//
//    @Override
//    public void enterMov(AssemblerGramaParser.MovContext ctx)  {
//        String sthToPush = ctx.getChild(1).getText();
//        String wherePush = ctx.getChild(3).getText();
//        Integer result = Integer.valueOf(sthToPush);
//        System.out.println(sthToPush + wherePush);
//        data.setRegister(wherePush, result);
//    }
//
//    @Override
//    public void enterPush(AssemblerGramaParser.PushContext ctx) {
//        ;
//    }
}