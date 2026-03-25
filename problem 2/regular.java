public class regular extends coffeeprogram {
    @Override
    public void makeCoffee(CMM cmm, CoffeeIF cf) {
        System.out.println("Starting Regular coffee program...");
        cmm.setPowerLED(0);    // 0 = running
        cmm.setTypeLED(1);     // 1 = Regular
        cmm.setGrindingTime(8);
        cmm.setTemperature(150);
        cmm.holdTemperature(2);
        cmm.wait(15);
        cmm.setPowerLED(1);    // 1 = idle / not running
        System.out.println("Regular coffee ready!");
        cmm.displayPrice(cf);
    }
}
