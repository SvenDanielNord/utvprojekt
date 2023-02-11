import java.util.Scanner;

public class Game {
    private String alphabet;

    private double usersTime;

    public String playGame(Scanner input, int lang) {
        getAlphabet(lang);
        System.out.println("Write alphabet");
        long startTime = System.currentTimeMillis();
        input.nextLine();
        String answer = input.nextLine();
        String ignCase = answer.toLowerCase();
        long stopTime = System.currentTimeMillis();
        usersTime = (stopTime - startTime) / 1000.0;

        if (ignCase.equals(alphabet)) {
            System.out.printf("Answer is right. Your time is: %.3fsec", usersTime);
            return "Corrext!";
        }
        else {
            System.out.printf("Answer isn't right. Your answer is: %s and your time is: %.3fsec", ignCase, usersTime);
            return "Incorrect";
        }
    }
        public void getAlphabet(int lang) {
            if(lang == 1) {
                alphabet = "abcdefghijklmnopqrstuvwxyzåäö";
            }
            else {
                alphabet = "abcdefghijklmnopqrstuvwxyz";
            }
        }
    public double getUsersTime() {
        return usersTime;
    }

    public String getAlphabet() {
        return alphabet;
    }
}