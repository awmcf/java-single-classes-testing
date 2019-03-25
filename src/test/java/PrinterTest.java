import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(100, 500);
    }

    @Test
    public void hasSheets()
    { assertEquals(100, printer.getSheets()); }

    @Test
    public void hasEnoughToPrint()
    {assertEquals(75, printer.print(5, 5)); }

    @Test
    public void notEnoughToPrint()
    {assertEquals(100, printer.print(200, 200)); }

    @Test
    public void fill()
    {assertEquals(100, printer.fill());}

}