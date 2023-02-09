import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HigscoreTest {


    private HighScore high0;
    private HighScore high1;
    private HighScore high2;

    public HigscoreTest() {

        high0 = new HighScore();
        high1 = new HighScore("Mamma", 55);
        high2 = new HighScore("Mamma", 55);
        high0.addScoreToTable(high1);

    }
    //This test should throw toManyScoresException
    @Test
    public void testAddScoreToTable() {
        try {
            for (int i = 0; i < 40; i++) {
                high0.addScoreToTable(high1);
            }
            high0.getNumberOfScores();
            fail("för lite böcker för att kasta exception");
        } catch (ToManyScoresException t) {
            System.out.println("Yes jag fånga det");
        }

    }
    @Test
    public void test2EqualHighScores(){
        assertEquals(high1,high2);
    }




}
