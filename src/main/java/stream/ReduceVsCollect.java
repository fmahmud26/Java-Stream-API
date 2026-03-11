package stream;

import java.util.List;

public class ReduceVsCollect {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Reduce Example
        int sum = list.stream().reduce(0, Integer::sum);


        List<Integer> even = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        even.forEach(System.out::println);

    }

}
