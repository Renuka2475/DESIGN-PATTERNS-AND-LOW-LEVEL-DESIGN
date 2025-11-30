package decoratorPattern;

public class OliveTopping extends PizzaDecorator{

    public OliveTopping(Pizza pizza){
        super(pizza);
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() +" Olives";
    }

    @Override
    public Double getCost() {
        return pizza.getCost()+20;
    }
}
