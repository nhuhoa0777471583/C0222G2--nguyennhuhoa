package ss21_design_patterns.bai_tap.ApDungFactoryMethod;

public class FatoryPattenShape {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape shape1= shapeFactory.getShape("hình tròn");
        System.out.println("hình 1: ");
    }
}
