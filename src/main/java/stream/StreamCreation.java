package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.lang.System.*;

public class StreamCreation {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob");
        // 1. List -> Stream
        Stream<String> stream = names.stream();
        stream.forEach(out::println);

        String[] arr = {"Java", "Python", "C++"};
        // 2. Array -> Stream
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(out::println);

        // 3. Stream of
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        stream2.forEach(out::println);

        // 4. Stream generate
        Stream<Double> generate = Stream.generate(Math::random).limit(5);
        generate.forEach(out::println);

        // Random int stream
        Random random = new Random();
        Stream<Integer> integerStream = random.ints(5, 1, 100).boxed();
        integerStream.forEach(out::println);
    }
}
