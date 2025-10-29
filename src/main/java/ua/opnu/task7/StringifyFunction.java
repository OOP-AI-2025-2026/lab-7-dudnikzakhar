package ua.opnu.task7;

import java.util.Arrays;
import java.util.function.Function;

public class StringifyFunction {
    static Function<Integer, String> digitStringify = n -> {
        String[] words = {"нуль", "один", "два", "три", "чотири",
                "п'ять", "шість", "сім", "вісім", "дев'ять"};
        if (n >= 0 && n < 10) {
            return words[n];
        }
        return "Число має бути більше 0 та менше 10";
    };

    static String[] processArray(int[] input, Function<Integer, String> function) {
        String[] result = new String[input.length];

        for (int i = 0; i < input.length; i++)
            result[i] = function.apply(input[i]);

        return result;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] result = processArray(test, digitStringify);

        System.out.println(Arrays.toString(result));
    }
}
