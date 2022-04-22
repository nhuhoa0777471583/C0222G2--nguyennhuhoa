package ss16_io_text_file.thuc_hanh.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class TextFileString {
    public static void main(String[] args) {
//        Student student = new Student("hoa", 18, "dn");
//        Student student1 = new Student("hoa1", 20, "dn");
//        Student student2 = new Student("hoa2", 21, "dn");
//        Student student3 = new Student("hoa3", 22, "dn");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        writeToFile(studentList);
        TextFileString textFileString = new TextFileString();
        List<Student> studentList = textFileString.readToFile();
        for (Student st : studentList) {
            System.out.println(st);
        }
    }

    private List<Student> readToFile() {
        List<Student> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader bw = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = bw.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                String address = txt[2];
                list.add(new Student(name, age, address));
            }
        } catch (Exception e) {
        }
        return list;
    }

    private static void writeToFile(List<Student> studentList) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student st : studentList) {
                bw.write(st.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {

        }
    }
}
