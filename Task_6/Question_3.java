package Task_6;

import java.util.Scanner;

public class Question_3 {

    public static void main(String[] args) {
        // Array of weekday names
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user to enter the day position
            System.out.print("Enter the day index (0-6): ");
            int dayIndex = scanner.nextInt();

            // Access the day from the array using the entered index
            System.out.println("The day is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle case when the index is out of range (0-6)
            System.out.println("Error: Invalid day index. Please enter a value between 0 and 6.");
        } catch (Exception e) {
            // Handle any other exceptions (e.g., invalid input format)
            System.out.println("Error: Invalid input. Please enter a valid integer between 0 and 6.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

}
