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
        Student a = new Student(2, "hoa");
        Student b = new Student(3, "hoa1");
        Student c = new Student(5, "hoa4");
        Student d = new Student(7, "hoa3");
        Student e = new Student(7, "hoa2");


        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        System.out.println(studentMyList.add(2,d));
        studentMyList.size();
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(2).getName());
        System.out.println(studentMyList.indexOf(c));

        System.out.println(studentMyList.contains(b));

        newStudentMyList = studentMyList.clone();
        for (int i = 0; i < newStudentMyList.size(); i++) {
            System.out.println(newStudentMyList.get(i).getName());
        }
//        for (int i = 0; i < studentMyList.size(); i++) {
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//
//        }
    }
}
