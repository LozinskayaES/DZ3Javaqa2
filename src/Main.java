public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double heightMeter = 1.87;
        double weightKilogram = 98;

        int bmiIndex = service.calculate(heightMeter, weightKilogram);
        System.out.println("Ваш индекс массы тела: " + bmiIndex);
    }
}