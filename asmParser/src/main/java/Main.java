import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main
{

    public static void main(String args[])  throws Exception
    {
        String expression;
        CodePointCharStream input;
        AssemblerGramaLexer lexer;
        CommonTokenStream tokenStream;
        AssemblerGramaParser parser;
        ParserMethod engine = new ParserMethod();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:/Users/kotyn/Documents/asmParser/src/main/Lab 1 - input.txt"));
            String line = reader.readLine();
            while (line != null) {
                expression = line;
                input = CharStreams.fromString(expression);
                lexer = new AssemblerGramaLexer(input);
                lexer.removeErrorListeners();
                lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
                tokenStream = new CommonTokenStream(lexer);
                parser = new AssemblerGramaParser(tokenStream);
                parser.removeErrorListeners();
                parser.addErrorListener(ThrowingErrorListener.INSTANCE);
                //System.out.println("--" + line);
                try {
                    engine.visitBegin(parser.begin());
                } catch (Exception e1)
                {
                    System.out.println("Error");
                }
                // read next line
                line = reader.readLine();
                //System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error file");
        }
        Scanner scanString = new Scanner(System.in);
        Scanner scanIntFloat = new Scanner(System.in);
        String line;
        while(true)
        {
            line = scanString.nextLine();
            //System.out.println(line);
            expression = line;
            input = CharStreams.fromString(expression);
            lexer = new AssemblerGramaLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            tokenStream = new CommonTokenStream(lexer);
            parser = new AssemblerGramaParser(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            //System.out.println("--" + line);
            try {
                engine.visitBegin(parser.begin());
            } catch (Exception e1)
            {
                System.out.println("Error");
            }
        }
    }
}