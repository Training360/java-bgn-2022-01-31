package trainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndLists {

    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        int[] numbers2 = new int[]{4, 7, 1, 9, 3};
//        int[] numbers3 = {3, 6, 1};
//
//        numbers[1] = 10;
//        numbers[4] = 34;
//
//        numbers2[3] = 100;
//
//        System.out.println(numbers2.length);
//        System.out.println(numbers3[2]);
//        System.out.println(Arrays.toString(numbers2));
//        System.out.println(Arrays.toString(numbers));
//
//        String[] words = new String[3];
//        String[] words2 = new String[]{"alma", "körte", "barack"};
//        String[] words3 = {"zebra", "zsiráf"};
//
//        words3[0] = "oroszlán";
//
//        System.out.println(Arrays.toString(words3));

        int[] numbers = new int[5];
        double[] numbers2 = new double[]{2.3, 5.6, 7.8};
        Product[] products = new Product[4];
        List<String> words = new ArrayList<>();
       // Product[] products1 = new Product[]{new Product("kenyér", 500), new Product("tej", 300)};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(products));
        System.out.println(words);

//        List<String> words = new ArrayList<>();
//        words.add("alma");
//        // Csomagoló osztályok
//        // int -> Integer
//        // double -> Double
//        // boolean -> Boolean
//        // char -> Character
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.remove(0);
////        numbers.clear();
//
//        System.out.println(words);
//        System.out.println(numbers);
////        System.out.println(numbers.get(1));
//        System.out.println(numbers.indexOf(3));
//        System.out.println(words.contains("alma"));
//        System.out.println(words.contains("körte"));
//        System.out.println(words.size());
//        System.out.println(numbers.size());
//
//        List<String> words = new ArrayList<>();
//        words.add("Kiss Béla");
//        words.add("alma");
//        words.add("zsiráf");
//        words.add("számítógép");
//        words.add("szó");
//
////        for (int i = 0; i < words.size(); i++) {
////            if (words.get(i).length() > 5) {
////                System.out.println(words.get(i));
////            }
////        }
//
        for (String s : words) {
            if (s.length() == 3) {
                System.out.println(s);
            }
        }

//        List<Product> products = new ArrayList<>();
//        Product product = new Product("kenyér", 500);
//        products.add(product);
//        products.add(product);
//        products.add(product);
//        products.add(new Product("tej", 300));
//        products.add(new Product("fogkrém", 400));
//
//        System.out.println(products.size());
//
//        for (Product p : products) {
//            System.out.println(p);
//        }

//        List<Trainer> trainers = new ArrayList<>();
//        trainers.add(new Trainer("John", 34));
//        trainers.add(new Trainer("Jack", 56));


    }
}
