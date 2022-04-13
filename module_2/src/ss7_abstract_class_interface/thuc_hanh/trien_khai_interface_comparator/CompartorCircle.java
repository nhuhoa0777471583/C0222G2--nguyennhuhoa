package ss7_abstract_class_interface.thuc_hanh.trien_khai_interface_comparator;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CompartorCircle implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
    public static class TextCompartorCircle {
        public static void main(String[] args) {
            Circle[] circles = new Circle[3];
            circles[0] = new Circle(10);
            circles[1] = new Circle();
            circles[2] = new Circle(4, "yellow", true);
            System.out.println("ban dau");
            for (Circle circle : circles) {
                System.out.println(circle);
            }
            CompartorCircle circleCompartor = new CompartorCircle();
            Arrays.sort(circles, circleCompartor);
            System.out.println("luc sau: ");
            for (Circle circle : circles) {
                System.out.println(circle);
            }
        }
    }
}
