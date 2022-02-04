package trainer;

import java.util.Scanner;

public class Exceptions {

    public int getNumberFromArray(int[] numbers) {
        return numbers[numbers.length];
    }

    public void printAge(int age) {
        if (age < 0 && age > 120) {
            throw new IllegalArgumentException("Nem létező életkor!");
        }
        System.out.println(age);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Adj meg egy számot!");
//        String input = scanner.nextLine();
//        System.out.println("Szia!");
//        try {
            int x = Integer.parseInt("a");
//        } catch (NullPointerException exception) {
//            System.out.println("Hiba keletkezett!");
//        } catch (NumberFormatException nfe) {
//            System.out.println(nfe.toString());
//        } catch (Exception ex) {
//            System.out.println("Hiba");
//        }
//        System.out.println("Vége");


//        String word = null;
//        System.out.println(word.equals("a"));
//        System.out.println("a".equals(word));

//        System.out.println(10 / 0);

//        int[] numbers = new int[]{1, 2, 3};
//        for (int i = 0; i <= 3; i++) {
//            System.out.println(numbers[i]);
//        }

//        Exceptions ex = new Exceptions();
//        int[] numbers = new int[]{1, 2, 3};
//        try {
//            System.out.println(ex.getNumberFromArray(numbers));
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println(exception.toString());
//            System.out.println("Rossz index");
//        }
//
//        try {
//            Integer.parseInt("a");
//        } catch (NumberFormatException nfe) {
//            System.out.println(nfe.toString());
//        }

//        throw new IllegalArgumentException("Hiba keletkezett!");
//
//        IllegalArgumentException iae = new IllegalArgumentException("Hiba!");
//        throw iae;

//        String word = null;
//        if (word == null) {
//
//        }
//
//        try {
//            word.equals("alma");
//        } catch (NullPointerException npe) {
//
//        }
    }
}
