import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageCalculatorTest {
    @Test
public void testCalculateAverage_NormalCase() {
    AverageCalculator calc = new AverageCalculator();
    double[] nums = {2,4,6,8};
    double result = calc.calculateAverage(nums);
    assertEquals(5.0, result, 0.0001)
}

@Test
public void testCalculateAverage_SingleValue() {
    AverageCalculator calc = new AverageCalculator();
    double[] nums = {};
    assertEquals(42.0, result, 0.0001)
}

@Test 
public void testCalculateAverage_DifferentNumbers() {
    AverageCalculator calc = new AverageCalculator();
    double[] nums = {10,20,30};
    double result = calc.calculateAverage(nums);
    assertEquals(20.0, result, 0.0001);
}

@Test
public void testCalculateAverage_WithDecimals() {
    AverageCalculator calc = new AverageCalculator();
    double[] nums = {1.5, 2.5, 3.5};
    double result = calc.calculateAverage(nums);
    assertEquals(2.5, result, 0.0001);
}

@Test 
public void testCalculateAverage_ThrowsOnEmptyArray() {
    AverageCalculator calc = new AverageCalculator();
    double[] nums = {};
    assertThrows(IllegalArgumentException.class, () -> calc.calculateAverage(nums));

}
}
    

