public class GameProcessor {

    public Choice game(int number) {
        Choice choice;
        if (number == 1) {
            choice = new Rock();
        } else if (number == 2) {
            choice = new Paper();
        } else if ( number == 3) {
            choice = new Scissors();
        } else if (number == 4) {
            choice = new Lizard();
        } else {
            choice = new Spock();
        }
        return choice;
    }
    public int singleMatchResult(int gamer1, int gamer2) {
        if (gamer1 == gamer2) {
            System.out.println("It's a TIE");
            return 0;
        } else if ((gamer1 == 3 && gamer2 == 2) || (gamer1 == 2 && gamer2 == 1)
                || (gamer1 == 1 && gamer2 == 3) || (gamer1 == 1 && gamer2 == 4)
                || (gamer1 == 4 && gamer2 == 5) || (gamer1 == 5 && gamer2 == 3)
                || (gamer1 == 3 && gamer2 == 4) || (gamer1 == 4 && gamer2 == 2)
                || (gamer1 == 2 && gamer2 == 5) || (gamer1 == 5 && gamer2 == 1)) {
            System.out.println("You WIN");
            return 1;
        } else {
            System.out.println("You LOOSE");
            return 2;
        }
    }
    public void finalResult (int res1, int res2) {
        if (res1 > res2) {
            System.out.println("Light smiles upon just! You've vanquished your enemies! ");
        } else if (res1 == res2) {
            System.out.println("We need a tie-breaker! Because some things left unhandled haunt you for eternity!");
        } else {
            System.out.println("Justice demands retribution! Redeem yourself my child!!! ");
        }
    }
}
