public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(45225522, "Tony Stark", 3.0);
        savingsAccount.deposit(1000);
        savingsAccount.addInterest();
        savingsAccount.displayAccountInfo();

        CheckingAccount checkingAccount = new CheckingAccount(45126525, "Tony Stark");
        checkingAccount.deposit(500);
        checkingAccount.deductMonthlyFee();
        checkingAccount.displayAccountInfo();
    }
}
