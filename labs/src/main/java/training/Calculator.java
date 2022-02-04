package training;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg két számot!");
        System.out.println("Első szám:");
        String firstNumberString = scanner.nextLine();

        int firstNumber = 0;
        try {
            firstNumber = Integer.parseInt(firstNumberString);
        } catch (NumberFormatException nfe) {
            System.out.println("Nem megfelelő szám!");
        }
        System.out.println("Második szám:");
        String secondNumberString = scanner.nextLine();

        int secondNumber = 0;
        try {
            secondNumber = Integer.parseInt(secondNumberString);
        } catch (NumberFormatException nfe) {
            System.out.println("Nem megfelelő szám!");
        }

        int sum = firstNumber + secondNumber;
        System.out.println("A két szám összege: " + sum);
    }
}
