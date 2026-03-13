package stream;

import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "Simple String";

        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        freq.forEach((c, n) -> out.println(c + ": " + n));

    }

}

