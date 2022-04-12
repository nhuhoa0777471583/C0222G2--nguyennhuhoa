package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable;

public class Rectangle extends Shape {
    private double width = 1;
    private double length = 2;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public double getArea() {
        return (width + length) * 2;
    }

    public double getPerimeter() {
        return width * length;
    }


    @Override
    public String toString() {
        return "Rectangle : " +
                "width=" + width +
                ", length=" + length;
    }

}
