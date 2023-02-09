import java.util.Scanner;

public class Game {
    private String alphabet = "abcdefghijklmnopqrstuvwzyåäö";
    private String engAlphabet = "abcdefghijkmnopqrstuvwxyz";
    private double usersTime;

    public void playGame(Scanner input) {
        System.out.println("Write alphabet");
        long startTime = System.currentTimeMillis();
        input.nextLine();
        String answer = input.nextLine();
        long stopTime = System.currentTimeMillis();
        usersTime = (stopTime - startTime) / 1000;

        if (answer.equals(alphabet)) {
            System.out.println("Answer is right. Your time is: " + usersTime);
        }
        else {
            System.out.println("Answer  isn't right. Your answer is: " + answer + " and your time is: " + usersTime);
        }
    }

    public void playGameEng(Scanner input) {
        System.out.println("Write alphabet");
        long startTime = System.currentTimeMillis();
        input.nextLine();
        String answerEnglish = input.nextLine();
        long stopTime = System.currentTimeMillis();
        usersTime = (stopTime - startTime) / 1000;

        if (answerEnglish.equals(engAlphabet)) {
            System.out.println("Answer is right. Your time is: " + usersTime);
        }
        else {
            System.out.println("Answer  isn't right. Your answer is: " + answerEnglish + " and your time is: " + usersTime);
        }
    }

    public double getUsersTime() {
        return usersTime;
    }
}