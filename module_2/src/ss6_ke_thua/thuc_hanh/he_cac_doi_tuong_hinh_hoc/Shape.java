package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

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

    //test class shape
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape=new Shape("red",false);
        System.out.print(shape);
    }
}
