package stream;

import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);

        int secondMax = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(secondMax);

    }

}
