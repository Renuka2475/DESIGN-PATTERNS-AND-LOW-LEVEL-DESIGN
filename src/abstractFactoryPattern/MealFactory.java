package abstractFactoryPattern;

public interface MealFactory {
    MainCourse createMainCourse();
    Dessert createDessert();

}
