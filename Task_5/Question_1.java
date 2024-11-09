package Task_5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question_1 {

    public static void main(String[] args) {
        // Creating a Stream of Strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert each string to uppercase using map, and collect to a list
        List<String> uppercaseNames = names
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println(uppercaseNames);
    }
}
