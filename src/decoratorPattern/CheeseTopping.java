package decoratorPattern;

public class CheeseTopping extends PizzaDecorator{

   public CheeseTopping(Pizza pizza){
       super(pizza);
   }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" Cheese";
    }

    @Override
    public Double getCost() {
        return pizza.getCost()+30;
    }
}
