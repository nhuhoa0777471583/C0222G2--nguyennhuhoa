package crud_mau.service.impl;

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

    public static boolean  isMatchesMaSuatChieu(String maSuatChieu){
        return maSuatChieu.matches(REGEX_MASUATCHIEU)  ;
    }
    @Override
    public void add() {
        cgvList = Read.readSuatChieu();
        System.out.println("nhập mã suất chiếu: ");
        String maSuatChieu = sc.nextLine();
//        while (!isMatchesMaSuatChieu(maSuatChieu)){
//            System.out.println("nhập sai định dạng,định dạng CI-XXXX, với X là số nguyên dương: ");
//            maSuatChieu=sc.nextLine();
//        }
        System.out.println("nhập tên phim: ");
        String tenPhim = sc.nextLine();
        System.out.println("nhập ngày chiếu: ");
        String ngayChieu = sc.nextLine();
        System.out.println("nhập so lượng vé: ");
        String soLuong = sc.nextLine();
        CGV cgv = new CGV(maSuatChieu, tenPhim, ngayChieu, soLuong);
        System.out.println(cgv);
        cgvList.add(cgv);
        Write.writeSuatChieu(cgvList, false);
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
        System.out.println("nhập mã suất chiếu: ");
        String maSuatChieu = sc.nextLine();
        boolean flag = false;
        cgvList = Read.readSuatChieu();

        for (int i = 0; i < cgvList.size(); i++) {
            if (maSuatChieu.equals(cgvList.get(i).getMaSuatChieu())) {
                flag = true;

                while (true){
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
                            System.out.println("chọn lộn ");
                            break;
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("mã xuất chiếu ko có trong đây");
        }
        Write.writeSuatChieu(cgvList, false);
    }
}
