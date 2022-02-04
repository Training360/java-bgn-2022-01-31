package trainer;

import exlibris.ExLibris;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        ExLibris exLibris = new ExLibris("Béla");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a termék nevét!");
        String nameOfProduct = scanner.nextLine();

        System.out.println("Add meg a termék árát!");
        int priceOfProduct = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(nameOfProduct, priceOfProduct);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        product.increasePrice(50);

        System.out.println(product.getPrice());

        product.decreasePrice(300);

        System.out.println(product.getPrice());
    }
}
