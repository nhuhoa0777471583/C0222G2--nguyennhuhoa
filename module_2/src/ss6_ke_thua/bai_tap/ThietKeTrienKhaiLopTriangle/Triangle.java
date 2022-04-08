package ss6_ke_thua.bai_tap.ThietKeTrienKhaiLopTriangle;

import java.util.Scanner;

public class Triangle extends Shape{
    private double side1=1;
    private double side2=1;
    private double side3=1;
    public Triangle(){}
    public Triangle(double side1,double side2,double side3,String color){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getArea(){
        return side1*side2*side3;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 + '\n'+super.toString();
    }

    public static void main(String[] args) {


        Triangle triangle =new Triangle(9,8,7,"red");
        System.out.println(triangle);
        System.out.println("dien tich= "+triangle.getArea());
        System.out.println("chu vi= "+triangle.getPerimeter());
    }
}
