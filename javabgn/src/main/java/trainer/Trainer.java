package trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;

    private int age;

    private Address address;

    private List<Course> courses = new ArrayList<>();

//    public Trainer() {
//
//    }

    public Trainer(String name, int age, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getNameOfTrainer() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getNameAndAge() {
        return name + " " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Trainer youngTrainer = new Trainer("Nagy Béla", 19, new Address("Budapest", "Fő utca", 3));
        String trainerString = youngTrainer.toString();
        System.out.println(trainerString);

        System.out.println(youngTrainer);

        System.out.println(youngTrainer.getCourses().toString());

//        System.out.println(youngTrainer.getNameAndAge());

//        Trainer trainer = new Trainer();
//        System.out.println(trainer.getNameOfTrainer());
//        System.out.println(trainer.getAge());
//        System.out.println(trainer.getAddress());
//        System.out.println(trainer.getCourses());
    }
}
