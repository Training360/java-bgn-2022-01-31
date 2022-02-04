package training;

public class ExLibris {

    private String name;

    public ExLibris(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ExLibris exLibris = new ExLibris("John Doe");

        System.out.println(exLibris.getName());
    }
}
