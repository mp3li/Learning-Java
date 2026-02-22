public class CheckingAccount extends Account {
    private final double transactionFee;
    private final double overdraftLimit;

    public CheckingAccount(String owner, double balance, double transactionFee, double overdraftLimit) {
        super(owner, balance);
        if (transactionFee < 0) {
            throw new IllegalArgumentException("Transaction fee cannot be negative.");
        }
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative.");
        }
        this.transactionFee = transactionFee;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    protected double totalWithdrawalAmount(double requestedAmount) {
        return requestedAmount + transactionFee;
    }

    @Override
    protected boolean canWithdraw(double totalWithdrawal) {
        return totalWithdrawal <= getBalance() + overdraftLimit;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    protected String accountType() {
        return "CheckingAccount";
    }
}
