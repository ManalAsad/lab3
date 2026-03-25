public class vanilla extends CoffeeDecorator {
    public vanilla(CoffeeIF coffee) {
        super(coffee);
    }

    @Override
    public double getprice() {
        return coffee.getprice() + 0.50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with vanilla";
    }
    
}
