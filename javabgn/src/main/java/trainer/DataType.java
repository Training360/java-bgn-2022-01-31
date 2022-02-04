package trainer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        int number = 12_000_000;
        int another = (int) 12.8;
//        System.out.println(another);
        double otherNumber = 3.4;
        double other = 1;
//        System.out.println(other);
        boolean b = true;
        boolean bool = false;
        char c = 'a';

        String text = "alma";
        String word = "";
        String apple = "jonathán" + " " + text + " finom" + 12;
//        System.out.println(apple);
        boolean boo = text.equals("alma");
//        System.out.println(boo);
        boolean bo = text.equals("körte");
//        System.out.println(bo);
//        System.out.println("alma".equals(text));
        Product product = new Product("kenyér", 500);
       // Trainer trainer = new Trainer("John", 45);
        Scanner scanner = new Scanner(System.in);

        Product anotherProduct = null;
        anotherProduct = product;

//        System.out.println(number);

//        System.out.println(number >= another);
//        int n = number++;
//        System.out.println(n);

//        System.out.println("alma ".length());
//
//        System.out.println("alma".indexOf("a"));
//        System.out.println("alma".indexOf("lm"));
//        System.out.println("alma".indexOf("x"));
//
//        System.out.println("almakörte".substring(2));
//        System.out.println("almakörte".substring(2, 6));

//        System.out.println("alma\nkörte");
//        System.out.println("alma" + "\n" + "körte");
//        System.out.print("alma");
//        System.out.print("körte");
//
//        System.out.print("Budapest\nSzeged\nDebrecen");

        LocalDate date = LocalDate.of(2022, 1, 31);
        System.out.println(date);
        LocalTime time = LocalTime.of(15, 50);
        System.out.println(time);
        LocalDateTime datetime = LocalDateTime.of(2022, 1, 31, 15, 51);
        System.out.println(datetime);


        new Product("kenyér", 500);
        String s = "alma";

    }

//    public void printNumber() {
//        System.out.println(number);
//    }
}
