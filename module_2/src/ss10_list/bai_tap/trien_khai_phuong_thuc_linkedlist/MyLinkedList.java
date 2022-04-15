package ss10_list.bai_tap.trien_khai_phuong_thuc_linkedlist;

public class MyLinkedList<E> {
    //khai bao lop node trong lop mylinkedlist
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    //khai bao pthuoc cua lop mylinkedlist
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    //phtuc them node vao 1 vi tri chi dinh
    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    //pthuc them node vao dau dsach
    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    //pthuc them node vao cuoi dsach
    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    //xoa node theo chi dinh
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("error index: " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
    public int size() {
        return numNodes;
    }

    //sao chep
    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList nya null");
        }
        MyLinkedList<E> returnMyLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnMyLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnMyLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnMyLinkedList;
    }

    //pthu ktr co ptu do trong mang ko
    public boolean contains(E e) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(e)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //ktr co ptu trong mang ko
    //co thi tr ve index
    //ko co thi tra ve -1
    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(o)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

}
