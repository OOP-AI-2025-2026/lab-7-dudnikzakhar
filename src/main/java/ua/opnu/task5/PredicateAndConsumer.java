package ua.opnu.task5;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    public static void conditionalForEach(int[] array, Predicate<Integer> condition,
                                          Consumer<Integer> action) {
        for (int i : array) {
            if (condition.test(i)) {
                action.accept(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Predicate<Integer> isEvenAndGreaterThanSix = n -> n % 2 == 0 && n > 5;
        Consumer<Integer> printPlusSeven = n -> {
            int plusSeven = n + 7;
            System.out.println("Число " + n + " задовольняє умову. Додамо 7: " + plusSeven);
        };

        conditionalForEach(test, isEvenAndGreaterThanSix, printPlusSeven);
    }
}
