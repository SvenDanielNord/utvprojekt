import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Highscore implements Comparable<Highscore>{
    private String playerName;
    private int highscore;


    private List <Highscore> table;

    public Highscore(String playerName, int highscore) {
        this.playerName = playerName;
        this.highscore = highscore;
        table = new ArrayList<>();
    }
    public void addScoreToTable(String nick, int score){
        table.add(new Highscore(nick,score));
        Collections.sort(table);
    }

    public int getHighscore() {
        return highscore;
    }

    @Override
    public int compareTo(Highscore o) {
        Comparator<Highscore> comp = Comparator.comparing(Highscore::getHighscore);
        return comp.compare(o, this);
    }
}
