package trainer;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ReadAndWriteFileTest {

    @Test
    void testReadFileFromNotExistingFile() {
        ReadAndWriteFile r = new ReadAndWriteFile();
        Path path = Path.of("src/main/resources/n.txt");

        assertThrows(IllegalStateException.class, () -> r.readFromFile(path));
    }
}