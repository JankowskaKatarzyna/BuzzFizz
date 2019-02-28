import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    public static final int LAST_ELEMENT_OF_ARRAY = 99;
    public static final int FIRST_ELEMENT_OF_ARRAY = 0;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void createNewFizzBuzzObjectForTheTest() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnOneForTheFirstElementOfFizzBuzzArray() {
        Assert.assertEquals(Integer.valueOf(1), fizzBuzz.getOneHundredElementList().get(FIRST_ELEMENT_OF_ARRAY));
    }

    @Test
    public void shouldReturnOneHundredForTheLastElementOfFizzBuzzArray() {
        Assert.assertEquals(Integer.valueOf(100), fizzBuzz.getOneHundredElementList().get(LAST_ELEMENT_OF_ARRAY));
    }

    @Test
    public void shouldReturnFizzForInputDivisibleByThree() {
        String actualResult = fizzBuzz.getFizzBusTestResult(39);
        Assert.assertEquals(FIZZ, actualResult);
    }

    @Test
    public void shouldReturnBuzzForInputDivisibleByFive() {
        String actualResult = fizzBuzz.getFizzBusTestResult(55);
        Assert.assertEquals(BUZZ, actualResult);
    }

    @Test
    public void shouldReturnFizzBuzzForInputDivisibleByFiveAndThree() {
        String actualResult = fizzBuzz.getFizzBusTestResult(60);
        Assert.assertEquals(FIZZ_BUZZ, actualResult);
    }

}
