import java.util.Scanner;

public class RockPaperScissorsRun {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        GameProcessor game = new GameProcessor();
        GameLayout layout = new GameLayout();
        layout.startScreen();
        String name = sn.nextLine();
        Player playerOne = new Player(name);
        Computer playerTwo = new Computer(new Player("Computer"));
        boolean end = false;
        int result1 = 0;
        int result2 = 0;
        int round = 0;
        layout.rulesScreen();
        layout.launchMenu();
        while (!end) {
            System.out.println("Hey! " + name + ", tell me after how many rounds we can declare a winner?");
            int howManyRounds = sn.nextInt();
            for (int i = 0; i < howManyRounds; ) {
                round++;
                i++;
                System.out.println("Your move:");
                int number1 = sn.nextInt();
                System.out.println(playerOne + " chose: ");
                game.game(number1).getChoiceName();
                int number2 = playerTwo.random();
                System.out.println(playerTwo + " chose: ");
                game.game(number2).getChoiceName();
                int a = game.singleMatchResult(number1, number2);
                if (a > 0) {
                    if (a == 1) {
                        result1++;
                    } else {
                        result2++;
                    }
                }
                System.out.println("The score is: " + result1 + " : " + result2);
            }
            game.finalResult(result1,result2);
            layout.endScreen();
            char nextGame = sn.next().charAt(0);
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
