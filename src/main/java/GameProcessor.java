import java.util.InputMismatchException;
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

    public int getSingleMatchResult(Choice playersOneChoice, Choice computersChoice) {
        if(playersOneChoice.equals(computersChoice)) {
            return 0;
        } else if (playersOneChoice.getWinsWith().contains(computersChoice)) {
            return 1;
        } else {
            return 2;
        }
    }

    public void displayFinalResult(int res1, int res2) {
        if (res1 > res2) {
            System.out.println("Light smiles upon just! You've vanquished your enemy! ");
        } else if (res1 == res2) {
            System.out.println("We need a tie-breaker! Because some things left unhandled haunt you for eternity!");
        } else {
            System.out.println("Justice demands retribution! Redeem yourself my child!!! ");
        }
    }

    public Choice getPlayerChoice(Scanner sn, Player player) {
        System.out.println("Your move:");
        boolean exceptionOccurred = true;
        Choice playersChoice = getChoice(0);
        while (exceptionOccurred) {
            try {
                playersChoice = getChoice(sn.nextInt());
                System.out.println(player + " threw: " + playersChoice);
                exceptionOccurred = false;
            } catch (InputMismatchException e) {
                System.out.println("Oops! Mistakes were made. Try choosing numbers between 1-5");
                sn.next();
            }
        }
        return playersChoice;
    }

    public Choice getComputerChoice(Scanner sn, Computer playerTwo) {
        Choice computersChoice = getChoice(playerTwo.random());
        System.out.println(playerTwo + " threw: " + computersChoice);
        return computersChoice;
    }

    public int getNumberOfRounds(Scanner sn, Player player) {
        System.out.println("Hey! " + player + ", after how many rounds we can declare a winner?");
        int howManyRounds = 0;
        boolean exceptionOccurred = true;
        while (exceptionOccurred) {
            try {
                howManyRounds = sn.nextInt();
                exceptionOccurred = false;
                System.out.println("Let the game begin!");
            } catch (InputMismatchException e) {
                System.out.println("Oops! Mistakes were made. Try with numbers this time!");
                sn.next();
            }
        }
        return howManyRounds;
    }
/*
    public int assignSingleMatchScore(int singleResult) {
        int result1 = 0;
        int result2 = 0;
        if (singleResult > 0) {
            if (singleResult == 1) {
                result1++;
            } else {
                result2++;
            }
        }
        System.out.println("The score is: " + result1 + " : " + result2);
        return result1 + result2;
    }

 */

}

