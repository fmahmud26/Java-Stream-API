package stream;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class SquareNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list = numbers.stream()
                .map(n -> n * n)
                .toList();

        list.forEach(out::println);
    }

}
