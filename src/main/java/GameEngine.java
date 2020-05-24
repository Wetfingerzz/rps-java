import java.util.Scanner;

public class GameEngine {
    Scanner scanner = new Scanner(System.in);
    GameProcessor game = new GameProcessor();
    private boolean end = false;
    private int result1 = 0;
    private int result2 = 0;
    public Player playerOne;
    public Computer playerTwo = new Computer(new Player("Computer"));

    public Player getPlayerOneName() {
        String name = scanner.nextLine();
        playerOne = new Player(name);
        return playerOne;
    }

    public void play() {
        GamePrinter printer = new GamePrinter();
        GameEngine engine = new GameEngine();
        printer.printStartScreen();
        playerOne = engine.getPlayerOneName();
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
            char nextGame = scanner.next().charAt(0);
            if (nextGame == 'x') {
                end = true;
            } else if (nextGame == 'n') {
                result1 = 0;
                result2 = 0;
            }
        }
    }
}
