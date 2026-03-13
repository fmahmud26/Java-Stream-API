package stream;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.*;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(out::println);

        Stream<Integer> stream = numbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2);

        List<Integer> result = stream.toList();
        result.forEach(out::println);

    }

}
