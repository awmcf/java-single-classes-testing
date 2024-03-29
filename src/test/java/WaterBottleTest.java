import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        this.waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume()
    {assertEquals(100, waterBottle.getVolume());}

    @Test
    public void drink()
    {assertEquals(90, waterBottle.drink());}

    @Test
    public void empty()
    {assertEquals(0, waterBottle.empty());}

    @Test
    public void fill()
    {assertEquals(100, waterBottle.fill());}

}