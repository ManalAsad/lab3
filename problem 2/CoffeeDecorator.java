public class CoffeeDecorator implements CoffeeIF {
    protected CoffeeIF coffee;
    
    public CoffeeDecorator(CoffeeIF coffee) {
        this.coffee = coffee;
    }
    
    @Override
    public double getprice() {
        return coffee.getprice();
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}