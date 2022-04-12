package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable;

public class Square extends Rectangle implements Colorable   {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }


    @Override
    public String toString() {
        return "A Square with side=" + getSide();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides!!");
    }
}
