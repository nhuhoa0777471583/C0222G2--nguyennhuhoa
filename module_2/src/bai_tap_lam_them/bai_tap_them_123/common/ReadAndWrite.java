package bai_tap_lam_them.bai_tap_them_123.common;

import bai_tap_lam_them.bai_tap_them_123.model.Student;
import bai_tap_lam_them.bai_tap_them_123.model.Teacher;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String DATA_STUDENT = "src/bai_tap_lam_them/bai_tap_them_123/data/student.csv";
    public static final String DATA_TEACHER = "src/bai_tap_lam_them/bai_tap_them_123/data/teacher.csv";

    public static void writeAll(List<String> stringList, String pathFile, boolean flag) {
        try {
            FileWriter fw = new FileWriter(pathFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String str : stringList) {
                bw.write(str);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readAll(String pathFile, boolean flag) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeStudent(List<Student> studentList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Student st : studentList) {
            stringList.add(st.getInfoStudent());
        }
        writeAll(stringList, DATA_STUDENT, flag);
    }


    public static void writeTeacher(List<Teacher> teacherList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            stringList.add(teacher.getInfoTeacher());
        }
        writeAll(stringList, DATA_TEACHER, flag);
    }


    public static List<Student> readStudent() {
        List<String> stringList = readAll(DATA_STUDENT, true);
        List<Student> studentList = new ArrayList<>();
        String arr[] = null;
        for (String st : stringList) {
            arr = st.split(",");
            studentList.add(new Student(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4],Integer.parseInt(arr[5])));
        }
        return studentList;
    }

    public static List<Teacher> readTeacher() {
        List<String> stringList = readAll(DATA_TEACHER, true);
        List<Teacher> teacherList = new ArrayList<>();
        String arr[] = null;
        for (String st : stringList) {
            arr = st.split(",");
            teacherList.add(new Teacher(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],arr[4]));
        }
        return teacherList;
    }
}
