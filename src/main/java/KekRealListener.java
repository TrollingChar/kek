import parsing.KekBaseListener;
import parsing.KekParser;

public class KekRealListener extends KekBaseListener {

    @Override
    public void exitStatement(KekParser.StatementContext ctx) {
        System.out.println(ctx.stmt);
    }
}
