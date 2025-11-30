package abstractFactoryPattern;

public class VegDesserts implements Dessert{
    @Override
    public void serve() {
        System.out.println("Ice cream");
    }
}
