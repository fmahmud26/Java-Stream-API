package stream;

import java.util.List;

import static java.lang.System.*;

public class MapVsPeek {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .peek(n -> out.println("Before: " + n))
                .map(n -> n * 2)
                .forEach(out::println);

    }

}
