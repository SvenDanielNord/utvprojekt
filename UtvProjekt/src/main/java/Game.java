import java.util.Scanner;

public class Game {
    private String alphabet = "abcdefghijklmnopqrstuvwzyåäö";

    public void playGame(Scanner input) {
        System.out.println("Write alphabet");
        long startTime = System.currentTimeMillis();
        String answer = input.nextLine();
        long stopTime = System.currentTimeMillis();
        double usersTime = (stopTime - startTime) / 1000;

        if (answer == alphabet) {
            System.out.println("Answer is right. Your time is: " + usersTime);
        }
        else {
            System.out.println("Answer  isn't right. Your answer is: " + answer + " and your time is: " + usersTime);
        }
    }
}