package ss6_ke_thua.bai_tap.lop_cirle_va_lop_cylinder;

public class Circle {
    private double r;
    private String color;

    public Circle(){}

    public Circle(double R,String color){
        this.r =R;
        this.color =color;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return r * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "r=" + r +
                ", mau=" + color + '\'';
    }
    //Text class Circle
    public static void main(String[] args) {

        Circle circle = new Circle(8,"yellow");
        System.out.println(circle);
        System.out.print(circle.getArea());
    }
}
