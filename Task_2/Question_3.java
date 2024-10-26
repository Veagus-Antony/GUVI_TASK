package Task_2;

public class Question_3 {

    public static class Account {
        private int balance;

        public Account() {
            this.balance = 0;
        }

        public Account(int initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
                System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            }
        }

        public void deposit(int amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(int amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient funds for withdrawal.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        public void displayBalance() {
            System.out.println("Current balance: " + balance);
        }

        public static void main(String[] args) {
            Account account1 = new Account();
            account1.displayBalance();

            Account account2 = new Account(1000);
            account2.displayBalance();

            account2.deposit(500);
            account2.displayBalance();

            account2.withdraw(300);
            account2.displayBalance();

            account2.withdraw(1500);
        }
    }


}
