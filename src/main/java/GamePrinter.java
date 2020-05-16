public class GamePrinter {
    private static final String HEADER = "-----ROCK, PAPER, SCISSORS, LIZARD, SPOCK-----";

    public void printStartScreen() {
        System.out.println(HEADER);
        System.out.println("Please enter your name: ");
    }

    public void printRulesScreen() {
        System.out.println("Here are some basic rules for you my little friend:");
        System.out.println("ROCK crushes SCISSORS");
        System.out.println("SCISSORS cut PAPER");
        System.out.println("PAPER covers ROCK");
        System.out.println("ROCK crushes LIZARD");
        System.out.println("LIZARD poisons SPOCK");
        System.out.println("SCISSORS wound LIZARD");
        System.out.println("LIZARD eats PAPER");
        System.out.println("PAPER proves that SPOCK is wrong");
        System.out.println("SPOCK crumbles ROCK");
        System.out.println("Enjoy the game!");
    }

    public void printLaunchMenu() {
        System.out.println();
        System.out.println(HEADER);
        System.out.println("To play ROCK press --> 1 <--");
        System.out.println("To play PAPER press --> 2 <--");
        System.out.println("To play SCISSORS press --> 3 <--");
        System.out.println("To play LIZARD press ---> 4 <---");
        System.out.println("To play SPOCK press ---> 5 <---");
        System.out.println("If you want to end the game press --> x <--");
        System.out.println("If you want to restart your current game press --> n <--");
        System.out.println(HEADER);
        System.out.println();
    }

    public void printEndScreen() {
        System.out.println("If you dare to play another game PRESS ---> n <---");
        System.out.println("If the fear is so unbearable and paralyzing PRESS ---> x <---");
    }

    public void printScore(int score1, int score2) {
        System.out.println(score1 + " : " + score2);
    }
    public void printSingleMatchResult(int singleResult) {
        if(singleResult == 0) {
            System.out.println("It's a TIE!");
        } else if (singleResult == 1) {
            System.out.println("You WIN!");
        } else {
            System.out.println("You LOOSE!");
        }

    }
}
