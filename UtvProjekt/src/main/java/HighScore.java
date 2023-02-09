import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Class created to save player score/time and show it on screen
public class Highscore implements Comparable<Highscore> {
    // Name on highscore board
    private String playerName;
    // time on highscore board
    private double highscore;
    // List high scores
    private List<Highscore> table;

    // Empty constructor used to make a table object before any scores exist
    public Highscore() {
        table = new ArrayList<>();
    }

    //Constructor with name on player and score/time
    public Highscore(String playerName, double highscore) {
        this.playerName = playerName;
        this.highscore = highscore;


    }

    //Method who add a high score to List table and sorts the list after fastest time.
    public void addScoreToTable(Highscore score) {
        table.add(score);
        Collections.sort(table);
    }

    // Getters time and name
    public double getHighscore() {
        return highscore;
    }

    public String getPlayerName() {
        return playerName;
    }

    // Method who is used to compare which time is the fastest time
    @Override
    public int compareTo(Highscore o) {
        Comparator<Highscore> comp = Comparator.comparing(Highscore::getHighscore);
        return comp.compare(this, o);
    }

    // Method used to print high score table
    public void printTable() {
        System.out.println("|------------------------------------------------|");
        System.out.println("|                                                |");
        System.out.println("                   High Score!");
        for (Highscore h : table
        ) {
            System.out.println("               Name: " + h.getPlayerName() + "   Time: " + h.getHighscore() + "sec");
        }
        System.out.println("|                                                |");
        System.out.println("|------------------------------------------------|");
    }



}
