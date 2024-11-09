package Task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Question_3 {

    public static void main(String[] args) {
        // List of student names
        List<String> students = Arrays.asList("Alice", "Bob", "Andrew", "John", "Annie", "Steve", "Alex", "Mark", "Amy", "Paul");

        // Filter students whose names start with "A"
        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the list of students who will receive special gifts
        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}
