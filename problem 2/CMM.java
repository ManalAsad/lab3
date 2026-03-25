import java.util.ArrayList;
import java.util.List;

// The Coffee Making Machine
public class CMM {

    private List<CoffeeIF> salesRecords = new ArrayList<>();

    // Hardware methods

    public void setGrindingTime(int secs) {
        System.out.println("Grinding coffee beans for " + secs + " seconds.");
    }

    public void setTemperature(int degree) {
        System.out.println("Heating water to " + degree + "°F.");
    }

    public void holdTemperature(int seconds) {
        System.out.println("Holding temperature for " + seconds + " seconds.");
    }

    public void wait(int seconds) {
        System.out.println("Waiting " + seconds + " seconds...");
    }

    // LED: first digit = 0 (running) or 1 (idle), second = coffee type 1-5
    public void setPowerLED(int num) {
        String state = (num == 0) ? "RUNNING" : "IDLE";
        System.out.println("Power status → " + state + " (" + num + ")");
    }

    public void setTypeLED(int num) {
        String[] names = {"", "Regular","Mocha","Latte","Espresso","Cappuccino"};
        System.out.println("Coffee type  → " + num + " (" + names[num] + ")");
    }

    public void displayPrice(CoffeeIF cf) {
        System.out.printf("  [DISPLAY] %-40s  $%.2f%n",
                cf.getDescription(), cf.getprice());
    }

    //Sales record 

    public void addSaleRecord(CoffeeIF cf) {
        salesRecords.add(cf);
    }

    public void printAllSales() {
        
        System.out.println("*******SALE RECORDS SUMMARY********");
       
        double total = 0;
        for (int i = 0; i < salesRecords.size(); i++) {
            CoffeeIF cf = salesRecords.get(i);
            System.out.printf("Sale #%d: %-30s  $%5.2f %n",
                    i + 1, cf.getDescription(), cf.getprice());
            total += cf.getprice();
        }
       
        System.out.printf( "TOTAL:  $%5.2f %n", total);
       
    }
}
