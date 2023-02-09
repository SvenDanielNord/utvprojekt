import java.util.Scanner;

public class Game {
    private String alphabet;

    private double usersTime;

    public void playGame(Scanner input, int lang) {
        getAlphabet(lang);
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
            System.out.println("Answer  isn't right. Your answer is: " + answer + " and your time is: " + usersTime + " s.");
        }
    }
        public void getAlphabet(int lang) {
            if(lang == 1) {
                alphabet = "abcdefghijklmnopqrstuvwzyåäö";
            }
            else {
                alphabet = "abcdefghijkmnopqrstuvwxyz";
            }
        }
    public double getUsersTime() {
        return usersTime;
    }
}