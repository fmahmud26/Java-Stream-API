package stream;

import java.util.List;

import static java.lang.System.*;

public class LazyStream {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = numbers.stream()
                .filter(n -> {
                    out.println("Filter: " + n);
                    return n > 3;
                })
                .map(n -> {
                    out.println("Map: " + n);
                    return n * 2;
                })
                .findFirst().orElse(null);

        out.println(result);
    }

}
