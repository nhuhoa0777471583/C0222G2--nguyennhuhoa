package ss10_list.thuc_hanh.trien_khai_lop_list_don_gian;

import java.util.Arrays;

public class MyList<E> {
    // tao cac thuoc tinh
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];
//phuong thuc ko tham so
    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

//phuong thuc thay đổi số ptu toi da
    public void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    //phuoc thuc trả về
    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }
//pthuc truy cap 1 ptu trong dsach
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) element[i];
    }

    public static class MyListTest {
        public static void main(String[] args) {
            MyList<Integer> listInteger = new MyList<Integer>();
            listInteger.add(1);
            listInteger.add(2);
            listInteger.add(3);
            listInteger.add(3);
            listInteger.add(4);

            System.out.println("element 4: " + listInteger.get(4));
            System.out.println("element 1: " + listInteger.get(1));
            System.out.println("element 2: " + listInteger.get(2));

//            listInteger.get(6);
//            System.out.println("element 6: "+listInteger.get(6));
//            listInteger.get(-1);
//            System.out.println("element -1: " + listInteger.get(-1));
        }
    }
}