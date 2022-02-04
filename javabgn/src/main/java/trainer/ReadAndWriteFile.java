package trainer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadAndWriteFile {

    public List<String> readFromFile(Path path) {
        try {
            List<String> namesFromFile = Files.readAllLines(path);
            return namesFromFile;
//            for (String s : namesFromFile) {
//                System.out.println("Kedves " + s + "! Örülünk a jelentkezésének.");
//            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public void writeToFile(Path path) {
        List<String> names = readFromFile(Path.of("src/main/resources/names.txt"));
        try {
            names.add("Béla");
            names.add("John");
            Files.write(path, names);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }

    public static void main(String[] args) {
        ReadAndWriteFile r = new ReadAndWriteFile();
//        Path path = Path.of("src/main/resources/names.txt");
//        r.readFromFile(path);
        Path path = Path.of("src/main/resources/texts.txt");
        r.writeToFile(path);
    }
}
