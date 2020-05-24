import java.util.ArrayList;
import java.util.List;

public class Spock implements Choice {

    @Override
    public List<Choice> getWinsWith() {
        List<Choice> spockWinsWith = new ArrayList<>();
        spockWinsWith.add(new Scissors());
        spockWinsWith.add(new Rock());
        return spockWinsWith;
    }

    @Override
    public String toString() {
        return "SPOCK";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Spock;
    }
}
