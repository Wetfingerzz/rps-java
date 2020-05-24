import java.util.ArrayList;
import java.util.List;

public class Scissors implements Choice {

    @Override
    public List<Choice> getWinsWith() {
        List<Choice> scissorsWinWith = new ArrayList<>();
        scissorsWinWith.add(new Paper());
        scissorsWinWith.add(new Lizard());
        return scissorsWinWith;
    }

    @Override
    public String toString() {
        return "SCISSORS";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Scissors;
    }
}
