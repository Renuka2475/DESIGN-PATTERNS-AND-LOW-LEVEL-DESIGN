package abstractFactoryPattern;

public class CustomerOrderMain {
    public static void main(String args[]){
        MealFactory mf = getFactory("non-veg");
        MainCourse mc1 = mf.createMainCourse();
        Dessert d = mf.createDessert();
        mc1.serve();
        d.serve();

    }

    public static MealFactory getFactory(String choice){
             if(choice=="veg"){
                 return new VegMealFactory();
             }
             else if (choice=="non-veg") {
                 return new NonVegMealFactory();
             }
             return null;

    }
}
