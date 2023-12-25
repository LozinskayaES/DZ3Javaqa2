public class BmiService {

    public int calculate(double heightMeter, double weightKilogram) {
        double bmiIndex = weightKilogram / (heightMeter * heightMeter);
        return (int) bmiIndex;
    }
}
