package crudtaosan.service.impl;

import crudtaosan.common.NotFoudProductException;
import crudtaosan.common.readwrite.Read;
import crudtaosan.common.readwrite.Write;
import crudtaosan.model.DienThoaiChinhHang;
import crudtaosan.model.DienThoaiXachTay;
import crudtaosan.service.IDienThoaiXachTay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayService implements IDienThoaiXachTay {
    private static Scanner scanner = new Scanner(System.in);
    private static List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();

//    static {
//        dienThoaiXachTayList.add(new DienThoaiXachTay(1, "iphone", 1000, 10, "ios", "nhatban", "da sua chua"));
//        dienThoaiXachTayList.add(new DienThoaiXachTay(1, "iphone", 1000, 10, "ios", "nhatban", "da sua chua"));
//        dienThoaiXachTayList.add(new DienThoaiXachTay(1, "iphone", 1000, 10, "ios", "nhatban", "da sua chua"));
//        Write.writeDienThoaiXachTay(dienThoaiXachTayList, true);
//    }

    @Override
    public void add() {
        dienThoaiXachTayList = Read.readDienThoaiXachTay();
        int id = IPhoneServes.addId();
        System.out.println("nhập tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        System.out.println("nhập giá bán: ");
        int giaBan = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("nhập quốc gia xách tay: ");
        String quocGia = scanner.nextLine();
        System.out.println("nhập phạm vi bảo hành: ");
        String phamVi = scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGia, phamVi);
        System.out.println(dienThoaiXachTay);
        dienThoaiXachTayList.add(dienThoaiXachTay);
        Write.writeDienThoaiXachTay(dienThoaiXachTayList, false);
    }



    @Override
    public void display() {
        dienThoaiXachTayList = Read.readDienThoaiXachTay();
        for (DienThoaiXachTay dt : dienThoaiXachTayList) {
            System.out.println(dt);
        }
    }

    @Override
    public void delete() {
        dienThoaiXachTayList = Read.readDienThoaiXachTay();
        boolean flag = false;

        System.out.println("nhập id cần xoá: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (id == dienThoaiXachTayList.get(i).getId()) {
                flag = true;
                System.out.println("bạn muốn xoá không?\n" +
                        "1.yes\n" +
                        "2.no\n" +
                        "chọn chức năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("bạn chọn xoá");
                        System.out.println("bạn đã xoá id: " + dienThoaiXachTayList.remove(i).getId());
                        break;
                    case 2:
                        System.out.println("bạn đã ko xoá");
                        return;
                    default:
                        System.out.println("ko có trong menu,nhập lại");
                        break;
                }
            }
        }
        if (flag == false) {
            try {
                throw new NotFoudProductException();
            } catch (NotFoudProductException e) {
                e.getMessage();
            }
        }
        Write.writeDienThoaiXachTay(dienThoaiXachTayList, true);
    }

    @Override
    public void search() {
        dienThoaiXachTayList = Read.readDienThoaiXachTay();
        checkDienThoai();
        Write.writeDienThoaiXachTay(dienThoaiXachTayList, false);
    }

    private void checkDienThoai() {
        boolean flag = false;
        System.out.println("nhập tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (dienThoaiXachTayList.get(i).getTenDienThoai().contains(tenDienThoai)) {
                flag = true;
                System.out.println("có tên đt đó trong ds là đt : " + dienThoaiXachTayList.get(i).getTenDienThoai());
                break;
            }
        }
        if (flag == false) {
            System.out.println("ko có tên điện thoại nào trong đây");
        }
    }
}
