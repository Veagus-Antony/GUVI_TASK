package Task_6;

public class StudentManagementSystem extends Question_1 {

    public static void main(String[] args) {
        try {
            // Create a student with an invalid age
            Student student1 = new Student(101, "Veagus", 22, "Computer Science");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create a student with an invalid name
            Student student2 = new Student(102, "George", 20, "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create a valid student
            Student student3 = new Student(103, "Azazel", 19, "Physics");
            student3.displayInfo();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
