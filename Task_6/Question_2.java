package Task_6;

public class Question_2 {

    // Custom checked exception for invalid age
    static class InvalidAgeException extends Exception {
        // Constructor to accept a message
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Voter class
    static class Voter {
        private final int voterId;
        private final String name;
        private final int age;

        // Parameterized constructor
        public Voter(int voterId, String name, int age) throws InvalidAgeException {
            this.voterId = voterId;
            this.name = name;
            this.age = age;

            // Throw exception if age is less than 18
            if (age < 18) {
                throw new InvalidAgeException("Invalid age for voter: " + name);
            }
        }

        // Method to display voter information
        public void displayInfo() {
            System.out.println("Voter ID: " + voterId + ", Name: " + name + ", Age: " + age);
        }
    }

    // Main class to test the Voter class and exception handling
    public static class VoterManagementSystem {
        public static void main(String[] args) {
            try {
                // Trying to create a voter with an invalid age (below 18)
                Voter voter1 = new Voter(101, "Veagus", 17);
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                // Trying to create a voter with a valid age
                Voter voter2 = new Voter(102, "George", 20);
                voter2.displayInfo();  // Display voter information if valid
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
