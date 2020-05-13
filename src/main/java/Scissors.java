public class Scissors implements Choice {
    @Override
    public void getChoiceName() {
        System.out.println("SCISSORS");
    }

    @Override
    public String toString() {
        return "SCISSORS";
    }
}
