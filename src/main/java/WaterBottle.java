public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume()
    {return this.volume;}

    public int drink()
    {return this.volume - 10;}

    public int empty()
    {return 0;}

    public int fill()
    {return 100;}

}