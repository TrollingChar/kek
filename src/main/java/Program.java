import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parsing.KekLexer;
import parsing.KekParser;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        test("src/main/examples/1.kek");
    }

    private static void test(String fileName) {
        try {
            KekLexer lexer = new KekLexer(CharStreams.fromFileName(fileName));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            KekParser parser = new KekParser(tokens);
            ParseTree tree = parser.file();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new KekRealListener(), tree);
            System.err.println(fileName + " tested\n");
        } catch (IOException e) {
            System.err.println("Exception while testing " + fileName);
            e.printStackTrace();
            System.err.println();
        }
    }
}
