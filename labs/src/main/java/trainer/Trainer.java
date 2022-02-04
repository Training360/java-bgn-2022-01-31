package trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;

    private int age;

    private Address address;

    private List<Course> courses = new ArrayList<>();

    public Trainer(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
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

    public void addCourse(Course course) {
        courses.add(course);
    }
}
