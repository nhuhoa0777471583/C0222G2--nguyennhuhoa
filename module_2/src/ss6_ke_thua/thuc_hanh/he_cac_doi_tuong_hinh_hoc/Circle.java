package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" +
                getRadius() +
                "\n"+super.toString();
    }
    //test class circle
    public static void main(String[] args) {
        Circle cricle = new Circle();
        System.out.println(cricle);

        cricle = new Circle(3.5, "mau hong", false);
        System.out.println(cricle);

        cricle = new Circle(5.5);
        System.out.println("dien tich= " + cricle.getArea());
        System.out.println("chu vi= "+cricle.getPerimeter());


    }
}