import java.util.*;

// Class created to save player score/time and show it on screen
public class HighScore implements Comparable<HighScore> {
    // Name on highScore board
    private String playerName;
    // time on highScore board
    private double time;
    // List high scores
    private List<HighScore> table;

    // Empty constructor used to make a table object before any scores exist
    public HighScore() {
        table = new ArrayList<>();
    }

    //Constructor with name on player and score/time
    public HighScore(String playerName, double time) {
        this.playerName = playerName;
        this.time = time;

    }

    //Method who add a high score to List table and sorts the list after fastest time.
    public void addScoreToTable(HighScore score) {
        table.add(score);
        Collections.sort(table);
    }
    // Method who is used to compare which time is the fastest time with built comparator
    @Override
    public int compareTo(HighScore o) {
        Comparator<HighScore> comp = Comparator.comparing(HighScore::getTime);
        return comp.compare(this, o);
    }

    // Getters time and name
    public double getTime() {
        return time;
    }

    public String getPlayerName() {
        return playerName;
    }


    // Method used to print high score table
    public void printTable() {
        System.out.println("|------------------------------------------------|");
        System.out.println("|                                                |");
        System.out.println("                   High Score!");
        for (HighScore h : table
        ) {
            System.out.println("               Name: " + h.getPlayerName() + "   Time: " + h.getTime() + "sec");
        }
        System.out.println("|                                                |");
        System.out.println("|------------------------------------------------|");
    }
    // Metod to get numeber of scores and check that is not over 30 scores
    public int getNumberOfScores() throws ToManyScoresException {
        if (table.size() > 30) {
            throw new ToManyScoresException();
        }
        return table.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HighScore highscore1 = (HighScore) o;
        return Double.compare(highscore1.time, time) == 0 && Objects.equals(playerName, highscore1.playerName) && Objects.equals(table, highscore1.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, time, table);
    }
}
