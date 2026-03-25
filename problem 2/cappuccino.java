public class cappuccino extends coffeeprogram {
    @Override
    public void makeCoffee(CMM cmm, CoffeeIF cf) {
        System.out.println("Starting Cappuccino program...");
        cmm.setPowerLED(0);
        cmm.setTypeLED(5);
        cmm.setGrindingTime(8);
        cmm.setTemperature(200);
        cmm.holdTemperature(5);
        System.out.println("Steaming milk.");
        System.out.println("Adding foam.");
        cmm.wait(15);
        cmm.setPowerLED(1);
        System.out.println("Cappuccino ready!");
        cmm.displayPrice(cf);
    }
}
