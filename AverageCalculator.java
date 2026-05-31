public class AverageCalculator {
    public double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Must be at least one number ");
         }
         double sum = 0.0;
         for (double num : numbers) {
            sum += num;
         }
         return sum / numbers.length;
    }
    
    public static void main(String[] args) {
        AverageCalculator calc = new AverageCalculator();
        double[] nums = {2,4,6,8};
        System.out.println(calc.calculateAverage(nums));
    }
}
