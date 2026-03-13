package stream;

import java.util.List;

import static java.lang.System.*;

public class MapVsFlatMap {

    public static void main(String[] args) {

        // Map Example
        List<String> names = List.of("java", "spring");

        names.stream()
                .map(String::toUpperCase)
                .forEach(out::println);

        // FlatMap Example
        List<List<String>> list = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );

        list.stream()
                .flatMap(List::stream)
                .forEach(out::println);

    }

}
