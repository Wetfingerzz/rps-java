import java.util.Scanner;

public class GameEngine {
    Scanner scanner = new Scanner(System.in);
    GameProcessor game = new GameProcessor();
    GamePrinter printer = new GamePrinter();
    private boolean end = false;
    private int result1 = 0;
    private int result2 = 0;
    public Player playerOne;
    public Computer playerTwo = new Computer(new Player("Computer"));

    public void play() {
        printer.printStartScreen();
        playerOne = game.getPlayerOneName(scanner,playerOne);
        printer.printRulesScreen();
        printer.printLaunchMenu();
        while (!end) {
            int howManyRounds = game.getNumberOfRounds(scanner, playerOne);
            for (int round = 0; round < howManyRounds; round++) {
                Choice playerOneChoice = game.getPlayerChoice(scanner, playerOne);
                Choice playerTwoChoice = game.getComputerChoice(scanner, playerTwo);
                int singleMatchResult = game.getSingleMatchResult(playerOneChoice, playerTwoChoice);
                switch (singleMatchResult) {
                    case 1:
                        result1++;
                        break;
                    case 2:
                        result2++;
                }
                printer.printSingleMatchResult(singleMatchResult);
                printer.printScore(result1, result2);
            }
            game.displayFinalResult(result1, result2);
            printer.printEndScreen();
            char whatToDo = scanner.next().charAt(0);
            switch (whatToDo) {
                case 'x':
                    end = true;
                    break;
                case 'n':
                    result1 = 0;
                    result2 = 0;
            }
        }
    }
}

