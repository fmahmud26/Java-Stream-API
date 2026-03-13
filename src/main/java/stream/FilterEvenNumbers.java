package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.*;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> stream = numbers.stream();
        List<Integer> list = stream.filter(n -> n % 2 == 0)
                .toList();

        list.forEach(out::println);
    }

}
