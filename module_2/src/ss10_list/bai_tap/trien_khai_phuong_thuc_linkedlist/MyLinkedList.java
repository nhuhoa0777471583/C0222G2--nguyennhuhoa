package ss10_list.bai_tap.trien_khai_phuong_thuc_linkedlist;

public class MyLinkedList<E> {
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

    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    void add(int index, E element) {
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

    void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    void addLast(E e) {

    }

//    E remove(int index) {
//
//    }
//    public boolean remove(Object e){
//
//    }
//    int size(){
//
//    }
//    E clone(){}
//    boolean contains(E e){
//
//    }
}
