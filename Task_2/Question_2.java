package Task_2;

public class Question_2 {

    public static class Product {
        private String pid;
        private int price;
        private int quantity;

        public Product(String pid, int price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }

        public String getPid() {
            return pid;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

}
