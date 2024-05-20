package Quiz2.F1;

public class Driver {
    String driver;
    int poin = 0, start_pos, finish_pos;
    public static int no;

    Driver(int start_pos, String nama, int poin, int finish_pos) {
        this.start_pos = start_pos;
        driver = nama;
        this.poin = poin;
        this.finish_pos = finish_pos;
    }

    Driver(String nama, int poin){
        driver = nama;
        this.poin = poin;
    }

    String getDriver() {
        return driver;
    }

    int getPoin() {
        return poin;
    }

    public void infoDriverFInal() {
        System.out.printf("| %-3s | %-37s | %-3s |\n", no, driver, poin);
    }

    public void infoDriver() {
        if (finish_pos == 0) {
            System.out.printf("| %-6s | %-25s | %-6s |\n", "NC", driver, start_pos);

        } else{
            System.out.printf("| %-6d | %-25s | %-6s |\n", finish_pos, driver, start_pos);
        }
        // System.out.println(start_pos);
        // System.out.println(driver);
        // System.out.println(poin);
        // System.out.println(finish_pos);=
    }
    public void infoDriverNol() {
        if (finish_pos == 0) {
            System.out.printf("| %-6s | %-25s | %-7d | %-6d |\n", "NC", driver, poin, start_pos);

        } 
    }

    public void BonusFastestLaps() { // bonus poin untuk pemegang lap tercepat(10 besar finish)
        poin += 1;
    }

    public void First() {
        poin += 25;
    }

    public void Second() {
        poin += 18;
    }

    public void Third() {
        poin += 15;
    }

    public void Fourth() {
        poin += 12;
    }

    public void Fiveth() {
        poin += 10;
    }

    public void Sixth() {
        poin += 8;
    }

    public void Seventh() {
        poin += 6;
    }

    public void Eighth() {
        poin += 4;
    }

    public void Nineth() {
        poin += 2;
    }

    public void Tenth() {
        poin += 1;
    }

    public void OverTen() {
        poin += 0;
    }

}