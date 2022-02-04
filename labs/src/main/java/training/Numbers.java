package training;

public class Numbers {

    public void printEvenNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public int getHalf(int number) {
        if (number % 2 == 0) {
            return number / 2;
        } else {
            throw new IllegalArgumentException("This number is odd.");
        }
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.printEvenNumbers(14);
    }
}
