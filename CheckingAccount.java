public class CheckingAccount extends Account {
    public CheckingAccount(int accountNumber, String accountHolder) {

        super(accountNumber, accountHolder);
    }

    public void deductMonthlyFee() {

        withdraw(5.00);
    }
}