package training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Shopping {

    private List<String> products;

//    public List<String> readFromFile(Path path) {
//        try {
//            List<String> namesFromFile = Files.readAllLines(path);
//            return namesFromFile;
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file.", ioe);
//        }
//    }

    public void readFromFile(Path path) {
        try {
            products = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public void writeToFile(Path path) {
        try {
            Files.write(path, products);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }

    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        Path readPath = Path.of("src/main/resources/shoppinglist.txt");
//        System.out.println(shopping.readFromFile(readPath));

        Path writePath = Path.of("src/main/resources/shoppinglist2.txt");
        shopping.readFromFile(readPath);
        shopping.writeToFile(writePath);
    }
}
