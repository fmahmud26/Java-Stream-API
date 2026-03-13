package stream;

import java.util.List;
import java.util.Optional;

import static java.lang.System.*;

public class FindFirstNumberGreaterThan {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 5, 10, 15, 11, 5, 25);

        Optional<Integer> first = numbers.stream()
                .filter(n -> n > 10) // 15, 11, 25
                .sorted() // 11, 15, 25
                .findFirst();

        first.ifPresent(out::println);
    }

}
