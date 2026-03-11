package stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 3, 4, 4, 4, 5, 6, 7, 8, 9, 8, 10);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        duplicates.forEach(System.out::println);

    }

}
