package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add() {
        int x = Main.add(3,4);

        assertEquals(7, x);
    }
}