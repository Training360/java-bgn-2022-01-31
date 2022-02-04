package trainer;

public class TrainerMain {

    public static void main(String[] args) {
        Address address = new Address("Budapest", "Fő utca", 3);
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouseNumber());

        Course course = new Course("Matematika alapok", 30);
        System.out.println(course.getTitle());
        System.out.println(course.getLength());

        Trainer trainer = new Trainer("John Doe", 34, address);
        System.out.println(trainer.getName());
        System.out.println(trainer.getAge());
        System.out.println(trainer.getAddress().getCity());
        System.out.println(trainer.getAddress().getStreet());
        System.out.println(trainer.getAddress().getHouseNumber());
        System.out.println(trainer.getCourses());
        System.out.println(trainer.getCourses().size());

        trainer.addCourse(course);
        trainer.addCourse(new Course("Fizika", 60));

        System.out.println(trainer.getCourses().size());
        System.out.println(trainer.getCourses().get(0).getTitle());
        System.out.println(trainer.getCourses().get(0).getLength());
        System.out.println(trainer.getCourses().get(1).getTitle());
        System.out.println(trainer.getCourses().get(1).getLength());

        Student student = new Student("Jack");
        System.out.println(student.getName());

        System.out.println(course.getStudents());
        System.out.println(course.getStudents().size());

        course.addStudent(student);
        course.addStudent(new Student("Joe"));

        System.out.println(course.getStudents().size());
        System.out.println(course.getStudents().get(0).getName());
        System.out.println(course.getStudents().get(1).getName());
    }
}
