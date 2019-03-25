public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int print(int pages, int copies) {
        int total = pages * copies;
        if (this.sheets >= total) {
            this.toner -= total;
            return this.sheets - total;
        }
        else {
            return this.sheets;
        }
    }

    public int fill()
    {return 100;}

}