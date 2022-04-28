package ss21_design_patterns.bai_tap.ApDungFactoryMethod;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if ("hình vuông".equals(shape)) {
            return new Rectangle();
        } else if ("hình tròn".equals(shape)) {
            return new Cirle();
        } else {
            return new Square();
        }
    }
}
