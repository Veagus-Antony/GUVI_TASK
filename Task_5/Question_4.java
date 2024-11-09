package Task_5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for birthdate input in format YYYY-MM-DD
        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String input = scanner.nextLine();

        // Parse the input into a LocalDate
        LocalDate birthDate = LocalDate.parse(input);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age
        int age = Period.between(birthDate, currentDate).getYears();

        // Display the age
        System.out.println("Your age is: " + age + " years");

        scanner.close();
    }
}
