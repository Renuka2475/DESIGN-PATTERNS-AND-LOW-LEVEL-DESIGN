package decoratorPattern;

public class PizzaReadyMain {
    public static void main(String args[]){
        Pizza pizza = new Margherita();
        pizza = new CheeseTopping(pizza);
        pizza = new OliveTopping(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
