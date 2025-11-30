package abstractFactoryPattern;

public class NonVegMealFactory implements MealFactory{
    @Override
    public MainCourse createMainCourse() {
        return new NonVegMainCourse();
    }

    @Override
    public Dessert createDessert() {
        return new NonVegDessert();
    }
}
