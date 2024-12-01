package Task_6;

public class Question_1 {

        // Custom exception for invalid age
        static class AgeNotWithinRangeException extends Exception {
            public AgeNotWithinRangeException(String message) {
                super(message);
            }
        }

// Custom exception for invalid name
static class NameNotValidException extends Exception {
            public NameNotValidException(String message) {
                super(message);
            }
        }

// Student class
static class Student {
            private final int rollNo;
            private final String name;
            private final int age;
            private final String course;

            // Parameterized constructor to initialize values
            public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
                this.rollNo = rollNo;
                this.name = name;
                this.age = age;
                this.course = course;

                // Validate age
                if (age < 15 || age > 21) {
                    throw new AgeNotWithinRangeException("Age should be between 15 and 21. Provided age: " + age);
                }

                // Validate name (it should contain only alphabetic characters)
                if (!name.matches("[a-zA-Z]+")) {
                    throw new NameNotValidException("Name should not contain numbers or special symbols. Provided name: " + name);
                }
            }

            // Method to display student information
            public void displayInfo() {
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course);
            }
        }


}
