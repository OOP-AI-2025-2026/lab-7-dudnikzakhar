package ua.opnu.task3;

import java.util.Arrays;
import java.util.function.Predicate;

public class DoublePredicateFilter {
    public static int[] filter(int[] input, Predicate<Integer> isEven, Predicate<Integer> isDivisibleByThree) {
        int[] result = new int[input.length];

        int counter = 0;
        for (int i : input) {
            if (isEven.test(i) && isDivisibleByThree.test(i)) {
                result[counter] = i;
                counter++;
            }
        }

        return Arrays.copyOfRange(result, 0, counter);
    }

    static Predicate<Integer> isEven = n -> n % 2 == 0;
    static Predicate<Integer> isDivisibleByThree = n -> n % 3 == 0;


    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int[] res = filter(test, isEven, isDivisibleByThree);
        System.out.println("Числа, що є парними і діляться на 3: " + Arrays.toString(res));
    }
}
