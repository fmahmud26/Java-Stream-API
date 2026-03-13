package stream;

import java.util.List;

import static java.lang.System.*;

public class MaxMin {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);

        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElse(0);

        out.println("Max: " + max);
        out.println("Min: " + min);

    }

}
