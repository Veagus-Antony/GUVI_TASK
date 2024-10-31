package Taskk_3;

public class Product implements Taxable {

        private int pid;
        private double price;
        private int quantity;

        public Product(int pid, double price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public double calcTax() {
            // Calculate sales tax on the unit price of the product
            return price * SALES_TAX;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

}
