package ua.opnu.task6;

import java.util.Arrays;
import java.util.function.Function;

public class PowerFunction {


    static Function<Integer, Integer> powerOfTwoFunction = n
            -> (int) Math.pow(2, n);

    static int[] processArray(int[] input,Function<Integer,Integer> function) {
        int[] result = new int[input.length];

        for (int i = 0; i < input.length; i++)
            result[i] = (int) function.apply(input[i]);

        return result;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = processArray(test, powerOfTwoFunction);

        System.out.println(Arrays.toString(result));
    }
}
