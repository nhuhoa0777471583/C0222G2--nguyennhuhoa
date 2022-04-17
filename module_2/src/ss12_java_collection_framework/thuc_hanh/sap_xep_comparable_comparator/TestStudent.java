package ss12_java_collection_framework.thuc_hanh.sap_xep_comparable_comparator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("hoa1", 25, "dn");
        Student student2 = new Student("hoa2", 40, "sg");
        Student student3 = new Student("hoa3", 35, "hn");

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st : list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("so sanh theo tuoi:");
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }
}
