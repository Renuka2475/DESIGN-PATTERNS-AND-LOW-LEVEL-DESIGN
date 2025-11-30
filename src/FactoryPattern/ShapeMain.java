package FactoryPattern;

public class ShapeMain {
    public static void main(String args[]){
        ShapeFactory sF = new ShapeFactory();
        Shape shapeObj = sF.getShape("Circle");
        shapeObj.draw();

    }
}
