
import java.util.Scanner;

public class GameProcessor {

    public Choice getChoice(int number) {
        Choice choice;
        if (number == 1) {
            choice = new Rock();
        } else if (number == 2) {
            choice = new Paper();
        } else if (number == 3) {
            choice = new Scissors();
        } else if (number == 4) {
            choice = new Lizard();
        } else {
            choice = new Spock();
        }
        return choice;
    }

    public int getSingleMatchResult(Choice playerOne, Choice computer) {
        if (playerOne instanceof Rock && computer instanceof Rock
            || playerOne instanceof Paper && computer instanceof Paper
            || playerOne instanceof Scissors && computer instanceof Scissors
            || playerOne instanceof Lizard && computer instanceof Lizard
            || playerOne instanceof Spock && computer instanceof Spock
        ) {
            System.out.println("It's a TIE");
            return 0;
        } else if ((playerOne instanceof Scissors && computer instanceof Paper)
                || (playerOne instanceof Paper && computer instanceof Rock)
                || (playerOne instanceof Paper && computer instanceof Scissors)
                || (playerOne instanceof Rock && computer instanceof Lizard)
                || (playerOne instanceof Lizard && computer instanceof Spock)
                || (playerOne instanceof Spock && computer instanceof Scissors)
                || (playerOne instanceof Scissors && computer instanceof Lizard)
                || (playerOne instanceof Lizard && computer instanceof Paper)
                || (playerOne instanceof Paper && computer instanceof Spock)
                || (playerOne instanceof Spock && computer instanceof Rock)) {
            System.out.println("You WIN");
            return 1;
        } else {
            System.out.println("You LOOSE");
            return 2;
        }
    }

    public void displayFinalResult(int res1, int res2) {
        if (res1 > res2) {
            System.out.println("Light smiles upon just! You've vanquished your enemies! ");
        } else if (res1 == res2) {
            System.out.println("We need a tie-breaker! Because some things left unhandled haunt you for eternity!");
        } else {
            System.out.println("Justice demands retribution! Redeem yourself my child!!! ");
        }
    }

    public Choice getPlayerChoice(Scanner sn, Player player) {
        System.out.println("Your move:");
        Choice playersChoice = getChoice(sn.nextInt());
        System.out.println(player + " threw: " + playersChoice);
        return playersChoice;
    }

    public Choice getComputerChoice(Scanner sn, Computer playerTwo) {
        Choice computersChoice = getChoice(playerTwo.random());
        System.out.println(playerTwo + " threw: " + computersChoice);
        return computersChoice;
    }


}
