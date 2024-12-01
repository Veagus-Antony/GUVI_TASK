package Task_6;

import java.util.Stack;
import java.util.Scanner;

public class Question_5 {

    // Stack to hold Integer values
    private final Stack<Integer> stack;

    // Constructor to initialize the stack
    public Question_5() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped " + poppedElement + " from the stack.");
        } else {
            System.out.println("The stack is empty. Cannot pop.");
        }
    }

    // Method to check if the stack is empty
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }

    // Method to display the current stack
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Current stack: " + stack);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_5 integerStack = new Question_5();

        while (true) {
            // Menu for user interaction
            System.out.println("\nStack Operations");
            System.out.println("1. Push an element onto the stack");
            System.out.println("2. Pop an element from the stack");
            System.out.println("3. Check if the stack is empty");
            System.out.println("4. Display the stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Push an element onto the stack
                    System.out.print("Enter an integer to push onto the stack: ");
                    int elementToPush = scanner.nextInt();
                    integerStack.pushElement(elementToPush);
                    break;

                case 2:
                    // Pop an element from the stack
                    integerStack.popElement();
                    break;

                case 3:
                    // Check if the stack is empty
                    integerStack.checkIfEmpty();
                    break;

                case 4:
                    // Display the current stack
                    integerStack.displayStack();
                    break;

                case 5:
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
