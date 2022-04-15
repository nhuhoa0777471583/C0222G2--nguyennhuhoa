package ss10_list.bai_tap.trien_khai_phuong_thuc_arraylist;

public class Test {
    public static class Student {
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

    public static void main(String[] args) {
        Student a = new Student(1, "hoa1");
        Student b = new Student(2, "hoa2");
        Student c = new Student(3, "hoa3");
        Student d = new Student(4, "hoa4");
        Student e = new Student(5, "hoa5");
        Student f = new Student(6, "hoang");
        MyList<Student> studentMyList = new MyList<>();

        // them ptu vao list
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);

        //sd pthuc them vao vi tri chỉ định
//        studentMyList.add(f,2);

        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        //pthuc lay ptu ở ví trí cần lấy
        System.out.println("ptu can lay ra: " + studentMyList.get(3).getName());

        //pthuc lấy index của 1 ptu trong mang
        System.out.println("ptu thu: " + studentMyList.indexOf(c));

        //sd pthuc xoa tat ca clear
        // studentMyList.clear();

        //ktr ptu co trong mang ko
        System.out.println(studentMyList.contains(b));
        //sd pthuc size
        studentMyList.size();
        System.out.println("do dai mang= " + studentMyList.size());

        //pth clone tao ra ban sao cua mang cu
        MyList<Student> newStudentMyList = new MyList<>();
        newStudentMyList= studentMyList.clone();

        //xoa vi tri ptu theo chi dinh
        Student student = newStudentMyList.remove(3);

        System.out.println("ban sao");
        for (int i = 0; i < newStudentMyList.size(); i++) {
            System.out.println(newStudentMyList.get(i).getName());
        }
    }
}
