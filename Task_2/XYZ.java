package Task_2;

import java.util.Scanner;

public class XYZ extends Question_2 {

    public static class abc {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Product[] products = new Product[5];

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter details for product " + (i + 1) + ":");
                System.out.print("PID: ");
                String pid = scanner.nextLine();
                System.out.print("Price: ");
                int price = scanner.nextInt();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                products[i] = new Product(pid, price, quantity);
            }

            String highestPricePid = findHighestPricePid(products);
            System.out.println("Product ID with the highest price: " + highestPricePid);

            int totalAmount = (int) calculateTotalAmount(products);
            System.out.println("Total amount spent on all products: " + totalAmount);
        }

        public static String findHighestPricePid(Product[] products) {
            String highestPid = null;
            int highestPrice = 0;

            for (Product product : products) {
                if (product.getPrice() > highestPrice) {
                    highestPrice = (int) product.getPrice();
                    highestPid = product.getPid();
                }
            }

            return highestPid;
        }

        public static int calculateTotalAmount(Product[] products) {
            int total = 0;

            for (Product product : products) {
                total += product.getPrice() * product.getQuantity();
            }

            return total;
        }
    }

}
