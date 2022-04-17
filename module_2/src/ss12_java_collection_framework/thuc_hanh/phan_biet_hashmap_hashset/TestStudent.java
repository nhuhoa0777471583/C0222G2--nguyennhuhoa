package ss12_java_collection_framework.thuc_hanh.phan_biet_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("hoa1", 20, "dn");
        Student student2 = new Student("hoa2", 50, "hn");
        Student student3 = new Student("hoa3", 50, "sg");

        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(student1, 2);
        studentMap.put(student2, 1);
        studentMap.put(student3, 0);
        for (Map.Entry<Student, Integer> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println();

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
