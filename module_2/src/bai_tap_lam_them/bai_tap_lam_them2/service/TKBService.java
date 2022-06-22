package bai_tap_lam_them.bai_tap_lam_them2.service;

import bai_tap_lam_them.bai_tap_lam_them2.model.Thoikhoabieu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TKBService implements ITKB {
    private static Scanner sc = new Scanner(System.in);
    private static List<Thoikhoabieu> thoiKhoaBieusList = new ArrayList<>();

    static {
        thoiKhoaBieusList.add(new Thoikhoabieu("code-1234", "code", "moday", "Low"));
        thoiKhoaBieusList.add(new Thoikhoabieu("code-1111", "code", "thurday", "hight"));
        thoiKhoaBieusList.add(new Thoikhoabieu("code-2222", "code", "wed", "normal"));
        thoiKhoaBieusList.add(new Thoikhoabieu("code-3333", "code", "sun", "normal"));
    }

    @Override
    public void display() {
        for (Thoikhoabieu tkb : thoiKhoaBieusList) {

        }
    }

    @Override
    public void add() {

    }

    @Override
    public void uppdate() {

    }
}
