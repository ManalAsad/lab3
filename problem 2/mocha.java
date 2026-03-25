public class mocha extends coffeeprogram {
    @Override
    public void makeCoffee(CMM cmm, CoffeeIF cf) {
        System.out.println("Starting Mocha coffee program...");
        cmm.setPowerLED(0);
        cmm.setTypeLED(2);     // 2 = Mocha
        cmm.setGrindingTime(5);
        cmm.setTemperature(200);
        cmm.holdTemperature(5);
        // Mocha adds cream and vanilla by default in program
        System.out.println("Adding cream (once).");
        System.out.println("Adding vanilla (once).");
        cmm.wait(15);
        cmm.setPowerLED(1);
        System.out.println("Mocha coffee ready!");
        cmm.displayPrice(cf);
    }
}
