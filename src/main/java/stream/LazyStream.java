package stream;

import java.util.List;

public class LazyStream {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = numbers.stream()
                .filter(n -> {
                    System.out.println("Filter: " + n);
                    return n > 3;
                })
                .map(n -> {
                    System.out.println("Map: " + n);
                    return n * 2;
                })
                .findFirst().orElse(null);

        System.out.println(result);
    }

}
