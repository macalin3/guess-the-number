import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main newMain = new Main();

    @Test
    void firstTest() {
        assertEquals(17, newMain.getNumber(17), "failed test");
    }

}