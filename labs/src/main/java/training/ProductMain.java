package training;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a termék nevét!");
        String name = scanner.nextLine();
        System.out.println("Adja meg a termék árát!");
        int price = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(name, price);
        System.out.println("A termék neve: " + product.getName());
        System.out.println("A termék ára: " + product.getPrice());

        product.increasePrice(200);
        System.out.println("A termék ára növelés után: " + product.getPrice());

        product.decreasePrice(300);
        System.out.println("A termék ára csökkentés után: " + product.getPrice());
    }
}
