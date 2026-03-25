public class main {
    public static void main(String[] args) {
 
        CMM machine = new CMM();

        System.out.println("Coffee Making Machine-----Powered On");
    
        //Sale #1: Mocha + one Chocolate
        System.out.println("\nSale #1: Mocha with one Chocolate ");
 
        // Build the coffee object with decorators(Decorator pattern)
        CoffeeIF order1 = new BaseCoffee("Mocha", 2.00);
        order1 = new chocolate(order1);   // wrap once for one chocolate
 
        // Load the appropriate program (Strategy pattern)
        coffeeprogram program1 = new mocha();
        program1.makeCoffee(machine, order1);
 
        machine.addSaleRecord(order1);
 
        //Sale #2: Espresso+Cream+Vanilla+2xChocolate
        System.out.println("\nSale #2: Espresso with Cream, Vanilla, 2x Choc");

        CoffeeIF order2 = new BaseCoffee("Espresso", 4.00);
        order2 = new cream(order2);       // +$0.25
        order2 = new vanilla(order2);     // +$0.50
        order2 = new chocolate(order2);   // +$1.00 (first choc)
        order2 = new chocolate(order2);   // +$1.00 (second choc)
 
        coffeeprogram program2 = new espresso();
        program2.makeCoffee(machine, order2);
 
        machine.addSaleRecord(order2);
 
        //Print all sales
        machine.printAllSales();
    }
}