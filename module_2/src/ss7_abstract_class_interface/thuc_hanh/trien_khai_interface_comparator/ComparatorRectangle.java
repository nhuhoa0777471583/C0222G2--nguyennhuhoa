package ss7_abstract_class_interface.thuc_hanh.trien_khai_interface_comparator;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorRectangle implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getLength() > o2.getWidth()) {
            return 1;
        } else if (o1.getLength() < o2.getWidth()) {
            return -1;
        } else {
            return 0;
        }
    }

    static class TextComparatorRectangle {
        public static void main(String[] args) {
            Rectangle[] rectangles = new Rectangle[3];
            rectangles[0] = new Rectangle(10, 5);
            rectangles[1] = new Rectangle();
            rectangles[2] = new Rectangle(8, 4);
            System.out.println("ban dau: ");
            for (Rectangle rectangle : rectangles) {
                System.out.println(rectangle);
            }
            Comparator comparatorRectangle = new ComparatorRectangle();
            Arrays.sort(rectangles, comparatorRectangle);

            System.out.println("luc sau: ");
            for (Rectangle rectangle : rectangles) {
                System.out.println(rectangle);
            }
        }
    }
}
