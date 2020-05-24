import java.util.ArrayList;
import java.util.List;

public class Paper implements Choice {

    @Override
    public List<Choice> getWinsWith() {
        List<Choice> paperWinsWith = new ArrayList<>();
        paperWinsWith.add(new Rock());
        paperWinsWith.add(new Spock());
        return paperWinsWith;
    }

    @Override
    public String toString() {
        return "PAPER";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Paper;
    }
}
