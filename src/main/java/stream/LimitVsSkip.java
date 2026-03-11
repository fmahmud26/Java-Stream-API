package stream;

import java.util.List;

public class LimitVsSkip {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Limit
        list.stream().limit(3).forEach(System.out::println);

        // Skip
        list.stream().skip(3).forEach(System.out::println);
    }

}
