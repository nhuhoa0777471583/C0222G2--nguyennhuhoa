package ss10_list.thuc_hanh.trien_khai_lop_linkedlist_don_gian;

public class LinkedList {
    private Node head;
    private int numNodes;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

  public void add(int index, Object data) {
        Node temp=head;
        Node holder;
      for (int i = 0; i < index-1&& temp.next !=null  ; i++) {
          temp=temp.next;
      }
      holder=temp.next;
      temp.next=new Node(data);
      temp.next.next=holder;
      numNodes++;
    }

    public void addFirst(Object data) {
    Node temp=head;
    head =new Node(data);
    head.next=temp;
    numNodes++;
    }

    public Node get(int index) {
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
public static class Text{
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList ll= new LinkedList(10);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(6);

        ll.add(3,8);
        ll.add(1,8);
        ll.printList();
    }
}

}
