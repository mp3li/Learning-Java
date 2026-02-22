import java.util.ArrayList;

public class PolymorphicAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Avery", 1000.00, 2);
        CheckingAccount checking = new CheckingAccount("Jordan", 300.00, 1.50, 200.00);

        savings.setInterestStrategy(new SimpleInterest(0.02));
        checking.setInterestStrategy(new TieredInterest(500.00, 0.005, 0.01));

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(checking);

        System.out.println("=== Starting Accounts ===");
        for (Account account : accounts) {
            System.out.println(account);
        }

        System.out.println("\n=== Polymorphism Demo (Shared Methods) ===");
        for (Account account : accounts) {
            account.deposit(100.00);
            boolean withdrew = account.withdraw(250.00);
            System.out.println(account.getOwner() + " withdraw success? " + withdrew);
            System.out.println(account);
        }

        System.out.println("\nSavings withdrawal limit behavior:");
        System.out.println("Withdrawal #2 success? " + savings.withdraw(100.00));
        System.out.println("Withdrawal #3 success? " + savings.withdraw(50.00) + " (blocked by limit)");
        System.out.println(savings);

        System.out.println("\nChecking overdraft + fee behavior:");
        System.out.println("Withdrawal success? " + checking.withdraw(320.00) + " (includes $1.50 fee)");
        System.out.println(checking);

        System.out.println("\n=== Strategy Usage ===");
        double savingsInterest = savings.applyInterest();
        double checkingInterest = checking.applyInterest();
        System.out.println("Savings applied with " + savings.getStrategyName() + ": $"
                + String.format("%.2f", savingsInterest));
        System.out.println("Checking applied with " + checking.getStrategyName() + ": $"
                + String.format("%.2f", checkingInterest));
        System.out.println(savings);
        System.out.println(checking);

        System.out.println("\n=== Runtime Strategy Swap ===");
        Account swapDemo = new SavingsAccount("Taylor", 800.00, 3);
        swapDemo.setInterestStrategy(new SimpleInterest(0.01));
        System.out.println("Before apply with " + swapDemo.getStrategyName() + ": " + swapDemo);
        double firstRun = swapDemo.applyInterest();
        System.out.println("Interest added: $" + String.format("%.2f", firstRun));
        System.out.println("After apply: " + swapDemo);

        // Open/Closed: we can extend behavior by adding new InterestStrategy classes
        // and swapping them in, without changing Account/SavingsAccount/CheckingAccount.
        swapDemo.setInterestStrategy(new TieredInterest(1000.00, 0.02, 0.03));
        System.out.println("\nSwapped to " + swapDemo.getStrategyName() + ": " + swapDemo);
        double secondRun = swapDemo.applyInterest();
        System.out.println("Interest added after strategy swap: $" + String.format("%.2f", secondRun));
        System.out.println("Final account state: " + swapDemo);
    }
}
