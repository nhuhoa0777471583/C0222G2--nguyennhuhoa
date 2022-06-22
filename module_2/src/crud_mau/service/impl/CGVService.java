package crud_mau.service.impl;

import crud_mau.common.NotInList;
import crud_mau.common.read_write.Read;
import crud_mau.common.read_write.Write;
import crud_mau.controller.ControllerCGV;
import crud_mau.model.CGV;
import crud_mau.service.ICGV;

import java.util.*;

public class CGVService implements ICGV {
    public static final String REGEX_MASUATCHIEU = "^(CI-)[0-9]{4}$";
    private static Scanner sc = new Scanner(System.in);
    private static List<CGV> cgvList = new ArrayList<>();

//    static {
//        cgvList.add(new CGV("CI-0001", "Ma", "2/2/2022", "100ve"));
//        cgvList.add(new CGV("CI-0002", "kinhdi", "2/2/2022", "100ve"));
//        cgvList.add(new CGV("CI-0003", "hai", "2/2/2022", "100ve"));
//        Write.writeSuatChieu(cgvList, true);
//    }

    public static boolean isMatchesMaSuatChieu(String maSuatChieu) {
        return maSuatChieu.matches(REGEX_MASUATCHIEU);
    }

    @Override
    public void add() {
        cgvList = Read.readSuatChieu();
        String maSuatChieu = null;
        maSuatChieu = checkMaSuatChieu(maSuatChieu);

        String tenPhim = null;
        tenPhim = checkTenPhim(tenPhim);
        System.out.println("nhập ngày chiếu: ");
        String ngayChieu = sc.nextLine();
        System.out.println("nhập so lượng vé: ");
        String soLuong = sc.nextLine();
        CGV cgv = new CGV(maSuatChieu, tenPhim, ngayChieu, soLuong);
        System.out.println(cgv);
        cgvList.add(cgv);
        Write.writeSuatChieu(cgvList, false);
    }

    private String checkTenPhim(String tenPhim) {
        boolean flag = true;
        while (flag) {
            System.out.println("nhập tên phim: ");
            tenPhim = sc.nextLine();
            for (CGV cinema : cgvList) {
                if (tenPhim.equals(cinema.getTenPhim())) {
                    flag = true;
                    System.out.println("trùng tên phim trong ds, nhâp lại");
                    break;
                } else {
                    flag = false;
                }
            }
        }
        return tenPhim;
    }

    private String checkMaSuatChieu(String maSuatChieu) {
        boolean flag = true;
        while (flag) {
            System.out.println("nhập mã suất chiếu: ");
            maSuatChieu = sc.nextLine();

            while (!isMatchesMaSuatChieu(maSuatChieu)) {
                System.out.println("nhập sai định dạng,định dạng CI-XXXX, với X là số nguyên dương: ");
                maSuatChieu = sc.nextLine();
            }
            for (CGV cinema : cgvList) {
                if (maSuatChieu.equals(cinema.getMaSuatChieu())) {
                    flag = true;
                    System.out.println("đã có mã suất chiếu trong ds, nhập lại: ");
                    break;
                } else {
                    flag = false;
                }
            }
        }
        return maSuatChieu;
    }

    @Override
    public void display() {
        cgvList = Read.readSuatChieu();
        for (CGV cinema : cgvList) {
            System.out.println(cinema);
        }
    }

    @Override
    public void delete() {
        cgvList = Read.readSuatChieu();
        try {
            check();
        } catch (NotInList e) {
            e.getMessage();
        }
        Write.writeSuatChieu(cgvList, false);
    }

    private void check() throws NotInList {
        boolean flag = false;
        System.out.println("nhập mã suất chiếu: ");
        String maSuatChieu = sc.nextLine();
        for (int i = 0; i < cgvList.size(); i++) {
            if (maSuatChieu.equals(cgvList.get(i).getMaSuatChieu())) {
                flag = true;
                System.out.println("Chọn xoá hay không xoá:\n" +
                        "1.Yes\n" +
                        "2.No\n" +
                        "mời chọn: ");
                int chosse = Integer.parseInt(sc.nextLine());
                switch (chosse) {
                    case 1:
                        System.out.println("Bạn chọn xoá ");
                        System.out.println("đã xoá mã xuất chiếu: " + cgvList.remove(i).getMaSuatChieu());
                        break;
                    case 2:
                        System.out.println("Bạn chọn không xoá");
                        return;
                    default:
                        System.out.println("chọn ko đúng trong menu,nhập lại: ");
                        break;
                }
            }
        }
        if (flag==false) {
            throw new NotInList();
        }
    }
}
