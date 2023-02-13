import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HighScore highScore = new HighScore();
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        Player player = new Player();

        System.out.println("\n         Welcome to Alphabet Game! \n");

        // create player
        System.out.println("Write your name:");
        Player.name = input.nextLine();
        System.out.println("\nSelect language:\n1. Swedish\n2. English");
        Player.lang = input.nextInt();


        System.out.println();
        do {
            // Game menu
            System.out.println("\n");
            System.out.println("          MENU");
            System.out.println("       1. Play\n       2. High score\n       0. Exit\n");

            switch (Player.choice = input.nextInt()) {

                case 1:
                    //play game
                    String isCorrect = game.playGame(input, Player.lang);
                    if (isCorrect.equals("Corrext!")) {
                        HighScore highS = new HighScore(Player.name.toString(), game.getUsersTime());
                        highScore.addScoreToTable(highS);
                    }
                    System.out.println("\n\nPress enter to continue");
                    input.nextLine();


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
