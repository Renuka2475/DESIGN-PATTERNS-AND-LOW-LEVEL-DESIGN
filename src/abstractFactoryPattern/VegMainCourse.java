package abstractFactoryPattern;

public class VegMainCourse implements MainCourse{

    @Override
    public void serve() {
        System.out.println("Paneer Biryani");
    }
}
