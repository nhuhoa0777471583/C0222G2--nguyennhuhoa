package ss10_list.bai_tap.trien_khai_phuong_thuc_linkedlist;

import javax.xml.stream.events.StartDocument;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1=new Student(1,"hoa1");
        Student student2=new Student(2,"hoa2");
        Student student3=new Student(3,"hoa3");
        Student student4=new Student(4,"hoa4");
        Student student5=new Student(5,"hoa5");

        myLinkedList.addFirst(student5);
        myLinkedList.addFirst(student4);
        myLinkedList.addFirst(student3);
        myLinkedList.addFirst(student2);


//        myLinkedList.addLast(student1);
//        myLinkedList.add(1,student4);

//        myLinkedList.remove(student3);
//        MyLinkedList<Student> cloneLinkedList=myLinkedList.clone();
//
//        for (int i = 0; i < cloneLinkedList.size(); i++) {
//            Student student=(Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }
        //ktr co ptu trong mang ko
//        myLinkedList.contains(student2);
//        System.out.println(myLinkedList.contains(student1));

        System.out.println(myLinkedList.indexOf(student2));
        System.out.println(myLinkedList.indexOf(student1));
    }
}