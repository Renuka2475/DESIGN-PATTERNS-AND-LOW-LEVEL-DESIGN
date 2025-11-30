package abstractFactoryPattern;

public class NonVegMainCourse implements MainCourse {

    @Override
    public void serve() {
        System.out.println("Chicken Biryani");
    }
}
