package ua.opnu.task1;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatePrimeNumber {

    static Predicate<Integer> isPrime = n -> {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    };

    public static int[] filter(int[] input, Predicate<Integer>  p) {
        int[] result = new int[input.length];

        int counter = 0;
        for (int i : input) {
            if (p.test(i)) {
                result[counter] = i;
                counter++;
            }
        }

        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] numbers = filter(test, isPrime);
        System.out.println(Arrays.toString(numbers));
    }
}
