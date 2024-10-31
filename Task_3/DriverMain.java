package Taskk_3;

import java.util.Scanner;

public class DriverMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input and calculate tax for Employee
            System.out.println("Enter Employee Details:");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(empId, name, salary);
            double incomeTax = employee.calcTax();
            System.out.println("Income Tax for " + employee.getName() + ": " + incomeTax);

            // Input and calculate tax for Product
            System.out.println("Enter Product Details:");
            System.out.println("Product ID: ");
            int pid = scanner.nextInt();
            System.out.println("Price: ");
            double price = scanner.nextDouble();
            System.out.println("Quantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(pid, price, quantity);
            double salesTax = product.calcTax();
            System.out.println("Sales Tax per unit of Product ID " + pid + ": " + salesTax);

            scanner.close();
        }


}
