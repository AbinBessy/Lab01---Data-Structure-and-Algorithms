public class Account {
    public int accountNumber;
    public String accountHolder;
    public double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {

        balance += amount;
    }

    public void withdraw(double amount) {

        balance -= amount;
    }

    public double getBalance() {

        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}


