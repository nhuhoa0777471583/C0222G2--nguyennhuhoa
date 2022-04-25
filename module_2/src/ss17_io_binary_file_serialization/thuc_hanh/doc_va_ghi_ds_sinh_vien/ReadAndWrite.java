package ss17_io_binary_file_serialization.thuc_hanh.doc_va_ghi_ds_sinh_vien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeToFile(String path, List<Student> studentList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
public static List<Student> readDataFromFile(String path){
        List<Student>studentList=new ArrayList<>();
        try {
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois= new ObjectInputStream(fis);
            studentList=(List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
}
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "hoa1", "dn"));
        students.add(new Student(2, "hoa2", "sg"));
        students.add(new Student(3, "hoa3", "dn"));
        students.add(new Student(4, "hoa4", "cb"));
        writeToFile("src/ss17_io_binary_file_serialization/thuc_hanh/doc_va_ghi_ds_sinh_vien/student.txt", students);

        List<Student> studentDataFromList=readDataFromFile("src/ss17_io_binary_file_serialization/thuc_hanh/doc_va_ghi_ds_sinh_vien/student.txt");
        for (Student st:studentDataFromList) {
            System.out.println(st);
        }
    }
}
