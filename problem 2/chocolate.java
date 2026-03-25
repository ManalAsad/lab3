public class chocolate extends CoffeeDecorator {
    public chocolate(CoffeeIF coffee) {
        super(coffee);
    }

    @Override
    public double getprice() {
        return coffee.getprice() + 1.00;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with chocolate";
    }
    
}
