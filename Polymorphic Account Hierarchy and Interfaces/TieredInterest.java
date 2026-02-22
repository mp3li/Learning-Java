public class TieredInterest implements InterestStrategy {
    private final double threshold;
    private final double lowerRate;
    private final double higherRate;

    public TieredInterest(double threshold, double lowerRate, double higherRate) {
        this.threshold = threshold;
        this.lowerRate = lowerRate;
        this.higherRate = higherRate;
    }

    @Override
    public double calculate(double balance) {
        if (balance <= 0) {
            return 0.0;
        }
        if (balance < threshold) {
            return balance * lowerRate;
        }
        return balance * higherRate;
    }
}
