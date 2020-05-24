import java.util.ArrayList;
import java.util.List;

public class Rock implements Choice {

    @Override
    public List<Choice> getWinsWith() {
        List<Choice> rockWinsWith = new ArrayList<>();
        rockWinsWith.add(new Scissors());
        rockWinsWith.add(new Lizard());
        return rockWinsWith;
    }

    @Override
    public String toString() {
        return "ROCK";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rock;
    }
}
