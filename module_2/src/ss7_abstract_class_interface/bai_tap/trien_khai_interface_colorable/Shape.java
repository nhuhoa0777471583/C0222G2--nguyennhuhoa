package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable;

public class Shape {
    public String color = "green";
    public boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "  A Shape with color of: " + getColor() + '\'' +
                "and " + (isFilled() ? "filled" : "not filled");
    }
}
