package stream;

import java.util.List;

import static java.lang.System.*;

public class Sum {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 5, 10);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        out.println(sum);
    }

}
