package ss7_abstract_class_interface.thuc_hanh.trien_khai_interface_comparable;

import java.util.Arrays;

 class Text{
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(6, "black", false);
        System.out.println("Ban dau: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("luc sau: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
