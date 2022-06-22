package bai_tap_lam_them.bai_tap_them_123.service;

import bai_tap_lam_them.bai_tap_them_123.common.ReadAndWrite;
import bai_tap_lam_them.bai_tap_them_123.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

//    static {
//        students.add(new Student(1, "hoa1", "23/3/2002", "nam", "C1", 10));
//        students.add(new Student(2, "hoa1", "23/3/2002", "nu", "C2", 10));
//        students.add(new Student(3, "hoa1", "23/3/2002", "nam", "C3", 10));
//        ReadAndWrite.writeStudent(students, false);
//    }

    @Override
    public void add() {
        students = ReadAndWrite.readStudent();
        System.out.println("thêm id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("thêm tên: ");
        String name = sc.nextLine();
        System.out.println("thêm ngày sinh: ");
        String birthDay = sc.nextLine();
        System.out.println("thêm giới tính: ");
        String gener = sc.nextLine();
        System.out.println("thêm lớp: ");
        String classroom = sc.nextLine();
        System.out.println("thêm điểm: ");
        int point = Integer.parseInt(sc.nextLine());
        Student st = new Student(id, name, birthDay, gener, classroom, point);
        students.add(st);
        ReadAndWrite.writeStudent(students, false);
    }

    @Override
    public void display() {
        students =ReadAndWrite.readStudent();
        for (Student st : students) {
            System.out.println(st);
        }
    }

    @Override
    public void delete() {
        students =ReadAndWrite.readStudent();
        System.out.println("nhap id");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                System.out.println("bạn đã xoá: "+ students.remove(i));
            }
        }
        ReadAndWrite.writeStudent(students, false);
    }

    @Override
    public void search() {

    }
}
