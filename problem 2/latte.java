public class latte extends coffeeprogram {
    @Override
    public void makeCoffee(CMM cmm, CoffeeIF cf) {
        System.out.println("Starting Latte program...");
        cmm.setPowerLED(0);
        cmm.setTypeLED(3);
        cmm.setGrindingTime(6);
        cmm.setTemperature(180);
        cmm.holdTemperature(3);
        System.out.println("Steaming milk.");
        cmm.wait(15);
        cmm.setPowerLED(1);
        System.out.println("Latte ready!");
        cmm.displayPrice(cf);
    }
}
