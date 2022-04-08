package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

import java.util.Scanner;

public class Circle {
        private double radius =1;
        private String color = "red";

        public Circle(){
        }

        public Circle(double radius){
            this.radius=radius;
        }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
            return radius*radius*Math.PI;
    }



    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("nhap ban kinh: ");
        double a=scanner.nextDouble();

        Circle accessModifierCircle=new Circle(a);

        System.out.println("bán kính: "+accessModifierCircle.getRadius());
        System.out.print("diện tích hình tròn: "+accessModifierCircle.getArea());
    }
}
