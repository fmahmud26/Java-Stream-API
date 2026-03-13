package stream;

import java.util.List;

import static java.lang.System.*;

public class ReduceVsCollect {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Reduce Example
        int sum = list.stream()
                .reduce(0, Integer::sum);
        out.println(sum);

        List<Integer> even = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        even.forEach(out::println);


        Integer reduce = list.stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);
        out.println(reduce);

    }

}
