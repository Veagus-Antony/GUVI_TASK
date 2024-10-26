package Task_2;

public class Employee extends Person {

        private String employeeID;
        private int salary;

        public Employee(String name, int age, String employeeID, int salary) {

            super(name, age);
            this.employeeID = employeeID;
            this.salary = salary;
        }

        public void displayEmployeeInfo() {
            displayInfo();
            System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
        }

    public static void main(String[] args) {

        Employee employee = new Employee("Veagus", 23, "E123", 50000);

        employee.displayEmployeeInfo();
    }
}
