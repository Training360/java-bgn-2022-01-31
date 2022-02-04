package trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetOneMore() {
        Numbers n = new Numbers();

        assertEquals(5, n.getOneMore(4));
        assertEquals(9, n.getOneMore(8));
        assertEquals(7, n.getOneMore(7));
        assertEquals(11, n.getOneMore(11));
        assertEquals(11, n.getOneMore(10));
    }
}