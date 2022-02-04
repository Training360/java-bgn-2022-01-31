package control;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlTest {

    @Test
    void testGetCharacter() {
        Control control = new Control();

        assertEquals('g', control.getCharacter('g'));
        assertEquals('u', control.getCharacter('ü'));
    }
}