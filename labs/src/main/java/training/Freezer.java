package training;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();
        foods.add("zöldborsó");
        foods.add("meggy");
        foods.add("sertéskaraj");
        foods.add("csirkemell");
        foods.add("sóska");

        System.out.println(foods);
        System.out.println(foods.size());

        foods.remove(1);
        foods.remove("csirkemell");

        System.out.println(foods);
        System.out.println(foods.size());
    }
}
