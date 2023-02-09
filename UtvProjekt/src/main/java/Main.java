import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HighScore highScore = new HighScore();
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        String playerName;
        int lang;
        int choice = 123;

        // create player
        System.out.println("Write your name:");
        playerName = input.nextLine();
        System.out.println("Select language 1 for Swedish 2 English");
        lang = input.nextInt();
        // Game menu

        System.out.println();
        do {
            System.out.println("\n");
            System.out.println("          MENU");
            System.out.println("       1. Play\n       2. High score\n       0. Exit");
            switch (choice = input.nextInt()) {

                case 1:
                    String isCorrect = game.playGame(input, lang);
                    if (isCorrect.equals("Corrext!")) {
                        HighScore highS = new HighScore(playerName, game.getUsersTime());
                        highScore.addScoreToTable(highS);
                    }
                    //play game
                    break;
                case 2:
                    // see highScore
                    highScore.printTable();
                    break;

                default:

                    break;


            }
        } while (choice != 0);
        System.out.println("Thank you for playing!");

    }
}
