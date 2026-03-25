public class espresso extends coffeeprogram {
    @Override
    public void makeCoffee(CMM cmm, CoffeeIF cf) {
        System.out.println("Starting Espresso program...");
        cmm.setPowerLED(0);
        cmm.setTypeLED(4);
        cmm.setGrindingTime(10);
        cmm.setTemperature(205);
        cmm.holdTemperature(8);
        System.out.println("Applying high pressure extraction.");
        cmm.wait(10);
        cmm.setPowerLED(1);
        System.out.println("Espresso ready!");
        cmm.displayPrice(cf);
    }
}