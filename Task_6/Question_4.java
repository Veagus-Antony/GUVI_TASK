package Task_6;

import java.util.HashMap;
import java.util.Scanner;

public class Question_4 {

    // HashMap to store student names (keys) and grades (values)
    private final HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public Question_4() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade: " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display the grade of a student by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade of " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_4 sg = new Question_4();

        while (true) {
            // Menu for user interaction
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Add a new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Display a student's grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.print("Enter student's name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter student's grade: ");
                    int gradeToAdd = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    sg.addStudent(nameToAdd, gradeToAdd);
                    break;

                case 2:
                    // Remove a student
                    System.out.print("Enter student's name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    sg.removeStudent(nameToRemove);
                    break;

                case 3:
                    // Display a student's grade
                    System.out.print("Enter student's name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    sg.displayGrade(nameToDisplay);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
