package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable;

public class Text {
    public static void main(String[] args) {

        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(10,5);
        shapes[2]=new Square(20);
        System.out.println("luc dau: ");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }

        System.out.println("----------------");
        System.out.println("sau khi tang kich thuoc: ");

        Circle circle = new Circle(5);
        circle.resize(100);
        System.out.println(circle);

        Rectangle rectangle=new Rectangle(10,5);
        rectangle.resize(Math.random()+100);
        System.out.println(rectangle);

        Square square=new Square(20);
        square.resize(Math.random()+100);
        System.out.println(square);

    }
}
