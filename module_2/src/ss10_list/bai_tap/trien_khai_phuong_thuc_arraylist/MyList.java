package ss10_list.bai_tap.trien_khai_phuong_thuc_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capactity: " + capacity);
        }
    }
//    private E remove(int index) {
//
//    }

    //phuowng thuc tra ve so luong
    public int size() {
        return size;
    }


    public MyList<E> clone() {
        MyList<E> v =new MyList<>();
        v.elements=Arrays.copyOf(this.elements,this.size);
        v.size=this.size;
        return v;
    }


    public boolean contains(E element) {
        return this.indexOf(element)>=0;
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }


    //pthuc themm 1 ptu  vao mylist
    public boolean add(E o) {
        if (elements.length == size) {
            this.ensureCapacity(10);
        }
        elements[size] = elements;
        size++;
        return true;
    }

    public boolean add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(20);
        }
        if (elements[index] == null) {
            elements[index] = element;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
        return false;
    }

    //pthuc tang kich thuoc cua mylist
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCaparacity:" + minCapacity);
        }
    }

    //phuong thuc xoa ptu trong mang
    public void clean() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }
}
