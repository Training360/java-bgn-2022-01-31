package training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetHalf() {
        Numbers numbers = new Numbers();

        assertEquals(4, numbers.getHalf(8));
        assertThrows(IllegalArgumentException.class, () -> numbers.getHalf(9));
    }
}