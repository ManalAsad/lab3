public class cream  extends CoffeeDecorator {
    public cream(CoffeeIF coffee) {
        super(coffee);
    }

    @Override
    public double getprice() {
        return coffee.getprice() + 0.25;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with cream";
    }
    
}
