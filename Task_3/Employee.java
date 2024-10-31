package Taskk_3;

public class Employee implements Taxable {


        private int empId;
        private String name;
        private double salary;

        public Employee(int empId, String name, double salary) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public double calcTax() {
            // Calculate income tax on yearly salary
            return salary * INCOME_TAX;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }


}
