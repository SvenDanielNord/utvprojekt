import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Highscore implements Comparable<Highscore>{
    private String playerName;
    private double highscore;


    private List <Highscore> table;

    public Highscore() {
        table = new ArrayList<>();
    }

    public Highscore(String playerName, double highscore) {
        this.playerName = playerName;
        this.highscore = highscore;

    }
    public void addScoreToTable(Highscore score){
        table.add(score);
        Collections.sort(table);
    }

    public double getHighscore() {
        return highscore;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public int compareTo(Highscore o) {
        Comparator<Highscore> comp = Comparator.comparing(Highscore::getHighscore);
        return comp.compare(this, o);
    }

    public void printTable(){
        for (Highscore h : table
             ) {
            System.out.println(h.playerName+ " " + h.getHighscore());
        }
    }


}
