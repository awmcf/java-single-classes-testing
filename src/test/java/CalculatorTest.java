import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator(3, 3);
    }

    @Test
    public void add()
    { assertEquals(6, calculator.add()); }


}