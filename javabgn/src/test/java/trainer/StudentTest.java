package trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testGetName() {
        // Given
        Student student = new Student("Béla");
        // When
        String result = student.getName();
        // Then
        assertEquals("Béla", result);
    }

    @Test
    void testGetName2() {
        Student student = new Student("Béla");

        assertEquals("Béla", student.getName());
    }
}