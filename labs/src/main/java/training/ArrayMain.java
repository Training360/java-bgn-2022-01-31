package training;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        String[] daysOfWeek = new String[]{"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(daysOfWeek[1]);
        System.out.println(daysOfWeek.length);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
