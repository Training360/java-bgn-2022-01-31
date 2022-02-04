package training;

public class Greeting {

    public String greetingToJoe(String name) {
        if ("Joe".equals(name)) {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println(greeting.greetingToJoe("John"));
        System.out.println(greeting.greetingToJoe("Joe"));
    }
}
