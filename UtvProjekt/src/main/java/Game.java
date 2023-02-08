import java.util.Scanner;

public class Game {
    private String alphabet = "abcdefghijklmnopqrstuvwzyåäö";
    private String engAlphabet = "abcdefghijkmnopqrstuvwxyz";

    public double playGame(Scanner input) {
        System.out.println("Write alphabet");
        long startTime = System.currentTimeMillis();
        input.nextLine();
        String answer = input.nextLine();
        long stopTime = System.currentTimeMillis();
        double usersTime = (stopTime - startTime) / 1000;

        if (answer.equals(alphabet)) {
            System.out.println("Answer is right. Your time is: " + usersTime);
        }
        else {
            System.out.println("Answer  isn't right. Your answer is: " + answer + " and your time is: " + usersTime + " s.");
        }
        return usersTime;
    }
    public double playGameEng(Scanner input) {
        System.out.println("Write alphabet");
        long startTime = System.currentTimeMillis();
        input.nextLine();
        String answerEnglish = input.nextLine();
        long stopTime = System.currentTimeMillis();
        double usersTime = (stopTime - startTime) / 1000;

        if (answerEnglish.equals(engAlphabet)) {
            System.out.println("Answer is right. Your time is: " + usersTime);
        }
        else {
            System.out.println("Answer  isn't right. Your answer is: " + answerEnglish + " and your time is: " + usersTime);
        }
        return usersTime;
    }

}