package bai_tap_lam_them.bai_tap_them_123.service;

import bai_tap_lam_them.bai_tap_them_123.common.ReadAndWrite;
import bai_tap_lam_them.bai_tap_them_123.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacher {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new Teacher(1, "hoa1", "23/3/2002", "nam", "gioi"));
        teachers.add(new Teacher(2, "hoa1", "23/3/2002", "nam", "tb"));
        teachers.add(new Teacher(3, "hoa1", "23/3/2002", "nam", "kha"));

        ReadAndWrite.writeTeacher(teachers, false);
    }

    @Override
    public void add() {
        teachers = ReadAndWrite.readTeacher();
        System.out.println("thêm id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("thêm tên: ");
        String name = scanner.nextLine();
        System.out.println("thêm ngày sinh: ");
        String birthDay = scanner.nextLine();
        System.out.println("thêm giới tính: ");
        String gener = scanner.nextLine();
        System.out.println("thêm trình độ: ");
        String trinhDo = scanner.nextLine();

        Teacher st = new Teacher(id, name, birthDay, gener, trinhDo);
        teachers.add(st);
        ReadAndWrite.writeTeacher(teachers, false);
    }

    @Override
    public void display() {
        teachers = ReadAndWrite.readTeacher();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
