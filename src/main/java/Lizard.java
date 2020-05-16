import java.util.ArrayList;
import java.util.List;

public class Lizard implements Choice {

    @Override
    public void getChoiceName() {
        System.out.println("LIZARD");
    }

    @Override
    public List<Choice> getWinsWith() {
        List<Choice> lizardWinsWith = new ArrayList<>();
        lizardWinsWith.add(new Spock());
        lizardWinsWith.add(new Paper());
        return lizardWinsWith;
    }

    @Override
    public String toString() {
        return "LIZARD";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Lizard;
    }
}
