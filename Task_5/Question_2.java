package Task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Question_2 {

    public static void main(String[] args) {

        // Given list of strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter non-empty strings and collect them into a new list
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the list with non-empty strings
        System.out.println(nonEmptyStrings);
    }
}
