package stream;

import java.util.List;
import java.util.Optional;

import static java.lang.System.*;

public class FindFirstVsFindAny {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> first = list.stream().findFirst();
        Optional<Integer> any = list.parallelStream().findAny();

        out.println("First: " + first.orElse(null));
        out.println("Any: " + any.orElse(null));

    }

}
