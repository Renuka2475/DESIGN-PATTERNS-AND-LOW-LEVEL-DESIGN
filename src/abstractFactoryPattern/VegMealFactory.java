package abstractFactoryPattern;

public class VegMealFactory implements MealFactory{
    @Override
    public MainCourse createMainCourse() {
        return new VegMainCourse();
    }

    @Override
    public Dessert createDessert() {
        return new VegDesserts();
    }
}
