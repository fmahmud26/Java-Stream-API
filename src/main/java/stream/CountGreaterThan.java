package stream;


import java.util.List;

import static java.lang.System.*;

public class CountGreaterThan {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 6, 3, 10, 7, 1);

        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();

        out.println(count);
    }

}
