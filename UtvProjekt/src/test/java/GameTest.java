import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();

    @Test
    void chosingBetweenSweEngAlphabet() {
        game.getAlphabet(1);
        assertEquals("abcdefghijklmnopqrstuvwxyzåäö", game.getAlphabet());
    }

    @Test
    void usersTimeIsCorrect() {
        assertEquals(0.0, game.getUsersTime());
    }
}