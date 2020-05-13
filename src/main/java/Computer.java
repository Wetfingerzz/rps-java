import java.util.Random;

public class Computer {
    Player name2;

    public Computer(Player name2) {
        this.name2 = name2;
    }
    public int random() {
        Random rg = new Random();
        int random = rg.nextInt(5);
        return random + 1;
    }

    @Override
    public String toString() {
        return "" + name2;
    }
}
