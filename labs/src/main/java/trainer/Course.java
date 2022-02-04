package trainer;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String title;

    private int length;

    private List<Student> students = new ArrayList<>();

    public Course(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
