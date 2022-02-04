package trainer;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {

    public static void main(String[] args) {
//        System.out.println("John".toUpperCase());
//        System.out.println("John".toLowerCase());
//        System.out.println("John".equals("JOHN"));
//        System.out.println("John".equalsIgnoreCase("JOHN"));
//        System.out.println("John Doe".substring(2));
//        System.out.println("John Doe".substring(2, 6));
//        System.out.println("John Doe".toUpperCase().substring(2, 6));
//        System.out.println("John Doe".startsWith("f"));
//        System.out.println("John".endsWith("n"));

//        StringBuilder sb = new StringBuilder();
//        sb.append("alma");
//        sb.append(" ");
//        sb.append("körte");
//        System.out.println(sb.toString());
//        System.out.println("alma körte");
//        System.out.println("alma" + " " + "körte");

//        List<String> names = new ArrayList<>();
//        names.add("Béla");
//        names.add("Sanyi");
//        names.add("Karcsi");
//
//        StringBuilder sb = new StringBuilder("Helló ");
//        for (String s :names) {
//            sb.append(s);
//            sb.append(" ");
//        }
//        sb.append("!");
//
//        System.out.println(sb.toString());

//        System.out.printf("Vettem %d kiló almát.", 1);
//        System.out.printf("A %s osztály megtett %d kilométert, ez az egész út %.2f része.", "10.a", 23, 0.546);

        StringOperations op = new StringOperations();
        op.sayHello("Béla");
    }

    public void sayHello(String name) {
        System.out.printf("Helló %s!", name);
    }
}
