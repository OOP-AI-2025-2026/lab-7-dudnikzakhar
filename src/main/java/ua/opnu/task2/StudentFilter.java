package ua.opnu.task2;

import java.util.Arrays;
import java.util.function.Predicate;

public class StudentFilter {
    static Predicate<Student> hasNoDebts = student -> {
        for (int i : student.getMarks()) {
            if (i < 60) {
                return false;
            }
        }
        return true;
    };

    public static Student[] filter(Student[] input, Predicate<Student> p) {
        Student[] result = new Student[input.length];

        int counter = 0;
        for (Student student : input) {
            if (p.test(student)) {
                result[counter] = student;
                counter++;
            }
        }

        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Іван", "AI-245", new int[]{75, 80, 90});
        Student student2 = new Student("Петро", "AI-245", new int[]{100, 55, 88});
        Student student3 = new Student("Марія", "AI-244", new int[]{60, 95, 100});
        Student student4 = new Student("Ольга", "AI-244", new int[]{40, 50, 30});

        Student[] allStudents = {student1, student2, student3, student4};

        System.out.println("Всі студенти: " + Arrays.toString(allStudents));

        Student[] successfulStudents = filter(allStudents, hasNoDebts);

        System.out.println("Студенти без заборгованостей: " + Arrays.toString(successfulStudents));
    }
}
