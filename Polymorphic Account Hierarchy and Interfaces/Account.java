public class Account {
    private final String owner;
    private double balance;
    private InterestStrategy interestStrategy;

    public Account(String owner, double balance) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Owner is required.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Starting balance cannot be negative.");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setInterestStrategy(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public String getStrategyName() {
        if (interestStrategy == null) {
            return "No strategy";
        }
        return interestStrategy.getClass().getSimpleName();
    }

    public void deposit(double amount) {
        validatePositiveAmount(amount);
        balance += amount;
    }

    public boolean withdraw(double amount) {
        validatePositiveAmount(amount);

        double totalWithdrawal = totalWithdrawalAmount(amount);
        if (!canWithdraw(totalWithdrawal)) {
            return false;
        }

        balance -= totalWithdrawal;
        afterSuccessfulWithdrawal(amount, totalWithdrawal);
        return true;
    }

    public double applyInterest() {
        if (interestStrategy == null) {
            return 0.0;
        }

        double interest = interestStrategy.calculate(balance);
        balance += interest;
        return interest;
    }

    protected double totalWithdrawalAmount(double requestedAmount) {
        return requestedAmount;
    }

    protected boolean canWithdraw(double totalWithdrawal) {
        return totalWithdrawal <= balance;
    }

    protected void afterSuccessfulWithdrawal(double requestedAmount, double totalWithdrawal) {
        // Hook for subclasses that need side effects after a withdrawal succeeds.
    }

    protected String accountType() {
        return "Account";
    }

    @Override
    public String toString() {
        return accountType()
                + "[owner=" + owner
                + ", balance=$" + String.format("%.2f", balance)
                + ", strategy=" + getStrategyName() + "]";
    }

    private void validatePositiveAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
    }
}
