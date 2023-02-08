import java.util.Scanner;

public class Game {
    private String alphabet = "abcdefghijklmnopqrstuvwzyåäö";

    public void playGame(Scanner input) {
        System.out.println("Write alphabet");
        long startTime = System.currentTimeMillis();
        Scanner inputAlpha = new Scanner(System.in);
        String answer = inputAlpha.nextLine();
        long stopTime = System.currentTimeMillis();
        double usersTime = (stopTime - startTime) / 1000;

        if (answer == alphabet) {
            System.out.println("Answer is right. Your time is: " + usersTime + " s.");
        }
        else {
            System.out.println("Answer  isn't right. Your answer is: " + answer + " and your time is: " + usersTime + " s.");
        }
    }
}