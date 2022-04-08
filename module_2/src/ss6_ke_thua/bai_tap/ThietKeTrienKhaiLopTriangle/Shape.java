package ss6_ke_thua.bai_tap.ThietKeTrienKhaiLopTriangle;

public class Shape {
    private String color;
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape" +
                "color='" + color + '\'' ;
    }
}
