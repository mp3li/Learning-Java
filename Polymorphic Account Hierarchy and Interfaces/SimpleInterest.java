public class SimpleInterest implements InterestStrategy {
    private final double rate;

    public SimpleInterest(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculate(double balance) {
        if (balance <= 0) {
            return 0.0;
        }
        return balance * rate;
    }
}
