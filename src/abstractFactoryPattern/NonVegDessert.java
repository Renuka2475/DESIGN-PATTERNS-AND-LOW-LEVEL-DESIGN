package abstractFactoryPattern;

public class NonVegDessert implements Dessert{
    @Override
    public void serve() {
        System.out.println("Ice cream");
    }
}
