import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestLexer {
    public static void main(String[] args) throws Exception {

        String inputFile = "src/testInput.txt";
        InputStream is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);


        project1 lexer = new project1(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();
        int index = 0;

        for (Token token : tokens.getTokens()) {
            String tokenName = project1.VOCABULARY.getSymbolicName(token.getType());
            if (tokenName == null || token.getType() == project1.LEXICAL_ERROR) {
                // Handle unrecognized tokens (lexical errors)
                System.out.printf("Lexical Error: Unrecognized token '%s' at line %d, column %d%n",
                        token.getText(), token.getLine(), token.getCharPositionInLine());
            } else {
                // Print recognized tokens
                System.out.printf("Index: %d, Line: %d, Column: %d, Type: %s, Value: '%s'%n",
                        index,
                        token.getLine(),
                        token.getCharPositionInLine(),
                        tokenName,
                        token.getText());
            }
            index++;
        }
    }
}
