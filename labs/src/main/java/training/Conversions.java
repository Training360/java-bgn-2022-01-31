package training;

import java.util.Scanner;

public class Conversions {

    public double convertDoubleToDouble(double number) {
        return (int) number;
    }

    public static void main(String[] args) {
        Conversions conversions = new Conversions();

        System.out.println(conversions.convertDoubleToDouble(628.426718));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg két számot!");
        System.out.println("Első szám:");
        String firstNumberString = scanner.nextLine();
        int firstNumber = Integer.parseInt(firstNumberString);
        System.out.println("Második szám:");
        String secondNumberString = scanner.nextLine();
        int secondNumber = Integer.parseInt(secondNumberString);
        int sum = firstNumber + secondNumber;
        System.out.println("A két szám összege: " + sum);
    }
}
