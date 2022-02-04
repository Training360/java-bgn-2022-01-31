package trainer;

import java.util.Scanner;

public class TrainerMain {

    public static void main(String[] args) {
////        Trainer trainer = new Trainer("John Doe", 27);
////        Trainer anotherTrainer = new Trainer("Jack Doe", 45);
////        Trainer other = new Trainer("Jane Doe", 34);
//
////        Trainer trainer = new Trainer();
////        Trainer other = new Trainer();
//
////        System.out.println(trainer.getNameOfTrainer());
////        System.out.println(other.getNameOfTrainer());
////        System.out.println(other.getAge());
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Szia! Adj meg egy nevet!");
//
//        String name = scanner.nextLine();
//        System.out.println("Az általad megadott név: " + name);
//        System.out.println("Add meg ennek az embernek az életkorát is!");
//
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Az előző személy életkora: " + age);

//        Trainer otherTrainer = new Trainer(name, age);
//        System.out.println(otherTrainer.getNameOfTrainer());
//        System.out.println(otherTrainer.getAge());

//        Trainer trainer = new Trainer("John", 34, new Address("Budapest", "Fő utca", 3));
        Person person = new Person("Jack", 56);

//        System.out.println(trainer.getAge());
//        System.out.println(person.getAge());

//        System.out.println(trainer.getCourses());
//
//        trainer.addCourse(new Course("matek", 30));
//        trainer.addCourse(new Course("fizika", 60));
//
//        System.out.println(trainer.getCourses());

        Apple apple = new Apple();
        System.out.println(apple);
    }
}
