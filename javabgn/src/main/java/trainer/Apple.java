package trainer;

public class Apple {

    public static void main(String[] args) {
        Course course = new Course("Matematika alapok", 30);
        System.out.println(course.getStudents());

        course.addStudent(new Student("John"));
        course.addStudent(new Student("Béla"));

        System.out.println(course.getStudents());
        System.out.println(course.getStudents().get(0));
        System.out.println(course.getStudents().get(0).getName());
        System.out.println(course.getStudents().get(1).getName());
    }
}
