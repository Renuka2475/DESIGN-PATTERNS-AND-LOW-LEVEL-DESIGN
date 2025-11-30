package decoratorPattern;

public class Margherita implements Pizza{
    @Override
    public String getDescription() {
        return "Margherita  ";
    }

    @Override
    public Double getCost() {
        return 150.0;
    }
}
