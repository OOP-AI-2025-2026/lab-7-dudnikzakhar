package ua.opnu.task4;

import ua.opnu.task2.Student;

import java.util.function.Consumer;

public class StudentConsumer {


    static void forEach(Student[] students, Consumer<Student> action) {
        for (Student student : students) {
            action.accept(student);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Іван Петренко", "AI-245", new int[]{75, 80, 90}),
                new Student("Петро Сидоренко", "AI-245", new int[]{100, 55, 88}),
                new Student("Марія Іваненко", "AI-244", new int[]{60, 95, 100}),
                new Student("Ольга Василенко", "AI-244", new int[]{40, 50, 30}),
        };
        Consumer<Student> printName = (student)
                -> System.out.println(student.getName());

        forEach(students, printName);
    }

}
