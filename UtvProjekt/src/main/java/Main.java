import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Highscore highscore = new Highscore();
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        String playerName;
        int lang;
        int choice = 123;

        // create player
        System.out.println("Write your name");
        playerName = input.nextLine();
        System.out.println("Select language 1 for Swedish 2 English");
        lang = input.nextInt();
        // Game menu

        System.out.println();
        do {

            System.out.println("1. Play\n2. Highscore");
            switch (choice = input.nextInt()) {

                case 1:
                    String isCorrect = game.playGame(input, lang);
                    if (isCorrect.equals("Corrext!")) {
                        Highscore highS = new Highscore(playerName, game.getUsersTime());
                        highscore.addScoreToTable(highS);
                    }
                    //play game
                    break;
                case 2:
                    // see highscore
                    highscore.printTable();
                    break;

                default:
                    System.out.println("choose one or two");
                    break;


            }
        } while (choice != 0);


    }
}
