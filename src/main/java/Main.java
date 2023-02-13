import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HighScore highScore = new HighScore();
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        Player player = new Player();


        // create player
        System.out.println("Write your name:");
        Player.name = input.nextLine();
        System.out.println("Select language 1 for Swedish 2 English");
        Player.lang = input.nextInt();
        // Game menu

        System.out.println();
        do {

            System.out.println("\n");
            System.out.println("          MENU");
            System.out.println("       1. Play\n       2. High score\n       0. Exit");

            switch (Player.choice = input.nextInt()) {

                case 1:
                    String isCorrect = game.playGame(input, Player.lang);
                    if (isCorrect.equals("Corrext!")) {
                        HighScore highS = new HighScore(Player.name.toString(), game.getUsersTime());
                        highScore.addScoreToTable(highS);
                    }
                    input.nextLine();

                    //play game
                    break;
                case 2:
                    // see highScore
                    highScore.printTable();
                    input.nextLine();
                    input.nextLine();
                    break;

                default:

                    break;


            }
        } while (Player.choice != 0);
        System.out.println("Thank you for playing!");

    }
}
