//concrete base coffee class, each has a fixed price 
public class BaseCoffee implements CoffeeIF {
    private final String name;
    private final double price;

    public BaseCoffee(String name, double price){
        this.name = name;
        this.price=price;
    }

    @Override
    public double getprice() {
        return price;
    }

    @Override
    public String getDescription() {
        return name;
    }
} 


