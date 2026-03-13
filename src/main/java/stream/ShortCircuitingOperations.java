package stream;

import java.util.List;

import static java.lang.System.*;

public class ShortCircuitingOperations {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Any Match
        var anyMatch = list.stream().anyMatch(n -> n > 10);

        out.println("AnyMatch: " + anyMatch);

        // Limit
        list.stream().limit(5).forEach(out::println);

    }

}
