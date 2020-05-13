import java.util.Scanner;

public class RockPaperScissorsRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameProcessor game = new GameProcessor();
        GamePrinter printer = new GamePrinter();
        printer.printStartScreen();
        String name = scanner.nextLine();
        Player playerOne = new Player(name);
        Computer playerTwo = new Computer(new Player("Computer"));
        boolean end = false;
        int result1 = 0;
        int result2 = 0;
        printer.printRulesScreen();
        printer.printLaunchMenu();
        while (!end) {
            System.out.println("Hey! " + name + ", after how many rounds we can declare a winner?");
            int howManyRounds = scanner.nextInt();
            for (int round = 1; round < howManyRounds; round++) {
                Choice playerOneChoice = game.getPlayerChoice(scanner, playerOne);
                Choice playerTwoChoice = game.getComputerChoice(scanner, playerTwo);
                int singleMatchResult = game.getSingleMatchResult(playerOneChoice, playerTwoChoice);
                if (singleMatchResult > 0) {
                    if (singleMatchResult == 1) {
                        result1++;
                    } else {
                        result2++;
                    }
                }
                System.out.println("The score is: " + result1 + " : " + result2);
            }
            game.displayFinalResult(result1, result2);
            printer.printEndScreen();
            char nextGame = scanner.next().charAt(0);
            if (nextGame == 'x') {
                end = true;
            } else if (nextGame == 'n') {
                end = false;
                result1 = 0;
                result2 = 0;
            }
        }
    }
}
