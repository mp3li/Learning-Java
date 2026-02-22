public class SavingsAccount extends Account {
    private final int withdrawalLimit;
    private int withdrawalsMade;

    public SavingsAccount(String owner, double balance, int withdrawalLimit) {
        super(owner, balance);
        if (withdrawalLimit < 1) {
            throw new IllegalArgumentException("Withdrawal limit must be at least 1.");
        }
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalsMade = 0;
    }

    @Override
    protected boolean canWithdraw(double totalWithdrawal) {
        if (withdrawalsMade >= withdrawalLimit) {
            return false;
        }
        return super.canWithdraw(totalWithdrawal);
    }

    @Override
    protected void afterSuccessfulWithdrawal(double requestedAmount, double totalWithdrawal) {
        withdrawalsMade++;
    }

    public int getWithdrawalsMade() {
        return withdrawalsMade;
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void resetWithdrawals() {
        withdrawalsMade = 0;
    }

    @Override
    protected String accountType() {
        return "SavingsAccount";
    }
}
