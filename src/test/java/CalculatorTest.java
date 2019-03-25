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

    @Test
    public void subtract()
    { assertEquals(0, calculator.subtract());}

    @Test
    public void multiply()
    {assertEquals(9, calculator.multiply());}

    @Test
    public void divide()
    {assertEquals(1, calculator.divide());}

}