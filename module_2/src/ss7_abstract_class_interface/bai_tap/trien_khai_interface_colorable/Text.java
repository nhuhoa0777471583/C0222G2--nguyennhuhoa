package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable;

public class Text {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Square(30);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("dien tich hinh tron:" + ((Circle) shape).getPerimeter());
            }
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
