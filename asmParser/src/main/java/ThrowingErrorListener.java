import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;

public class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    private static String specificMismatchedError = "expecting \\{INTERRUPT, 'mov ', 'push ', 'xor '}";
    private static String specificMissingSpace = "missing SPACE";
    private static String specificMissingRegister = "missing REGISTER";
    private static String specificExpectingRegister = " expecting REGISTER";

    private static String specificTokenRecognitionError = "(.*)token recognition(.*)";
    private List<Error> errorList = new ArrayList<>();
    private Error error = new Error();
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) throws ParseCancellationException {
//        if(msg.length() >= specificMismatchedError.length() && msg.matches("(.*)"+specificMismatchedError+"(.*)")) System.out.println("Error");
//        else if(msg.length() >= specificMissingSpace.length() && msg.matches("(.*)"+specificMissingSpace+"(.*)")) System.out.println("Error SPACE");
//        else if(msg.length() >= specificMissingRegister.length() && msg.matches("(.*)"+specificMissingRegister+"(.*)")) System.out.println("#Error");
//        else if(msg.length() >= specificExpectingRegister.length() && msg.matches("(.*)"+specificExpectingRegister+"(.*)")) System.out.println("#@Error");
//        else
            throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}