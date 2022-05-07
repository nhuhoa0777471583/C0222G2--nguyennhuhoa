package case_study2.serivce.impl.facility;

import case_study2.common.read_and_write.Read;
import case_study2.common.read_and_write.Write;
import case_study2.common.validate.RegexService;
import case_study2.model.ficility.Villa;
import case_study2.serivce.inter.IVilla;

import java.util.*;

public class VillaService implements IVilla {
    private static Scanner sc = new Scanner(System.in);
    //    private static List<Villa> villaList = new ArrayList<>();
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();

//    static {
//        //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
//        // String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang
//        villaMap.put(new Villa("SVVL","villa1", "10m2", "1tr", "4ng",
//                "1ngay", "2sao", "50m2", "2tang"), 5);
//
//        villaMap.put(new Villa("SVVL","villa2", "15m2", "2tr", "4ng",
//                "3ngay", "2sao", "50m2", "2tang"), 1);
//
//        villaMap.put(new Villa("SVVL","villa3", "15m2", "2tr", "4ng",
//                "3ngay", "2sao", "50m2", "2tang"), 5);
//
//        villaMap.put(new Villa("SVVL","villa2", "15m2", "2tr", "4ng",
//                "3ngay", "2sao", "50m2", "2tang"), 2);
//        Write.writeVilla(villaMap, true);
//    }

    @Override
    public void addVilla() {

        villaMap = Read.readVilla();
        System.out.print("thêm mã dịch vụ: ");
        String maDichVu = sc.nextLine();
        maDichVu = RegexService.regexMaDichVuVilla(maDichVu);

        System.out.print("thêm tên dịch vụ: ");
        String tenDichVu = sc.nextLine();
        tenDichVu = RegexService.regexTenDichVu(tenDichVu);

        System.out.print("thêm diện tích sử dụng: ");
        String dienTichSD = sc.nextLine();
        //dienTichSD=RegexService.regexDienTichSD(dienTichSD);
        System.out.print("thêm chi phí thuê: ");
        String chiPhiThue = sc.nextLine();
        //chiPhiThue= RegexService.regexChiPhi(chiPhiThue);
        System.out.print("thêm so nguoi: ");
        String soNguoi = sc.nextLine();
        // soNguoi=RegexService.regexSoLuongNguoi(soNguoi);

        System.out.print("thêm kieu thuê: ");
        String kieuThue = sc.nextLine();
        //kieuThue= RegexService.regexKieuThue(kieuThue);

        System.out.print("thêm tiêu chuẩn phòng: ");
        String tieuChuanPhong = sc.nextLine();
        //   tieuChuanPhong=RegexService.regexTieuChuanPhong(tieuChuanPhong);

        System.out.print("thêm diện tích hồ bơi: ");
        String dienTichHoBoi = sc.nextLine();
        // dienTichHoBoi=RegexService.regexDienTichHoBoi(dienTichHoBoi);

        System.out.print("thêm so tầng: ");
        String soTang = sc.nextLine();
        // soTang=RegexService.regexSoTang(soTang);

        Villa villa1 = new Villa(maDichVu, tenDichVu, dienTichSD, chiPhiThue, soNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        System.out.println(villa1);
        boolean flag = false;

//        if (flag==false) {
//            Write.writeVilla(villaMap, false);
//        }
//        for (Map.Entry<Villa, Integer> entryVilla : villaMap.entrySet()) {
//            if (tenDichVu.equals(entryVilla.getKey().getTenDichVu())) {
//                Write.writeVilla(villaMap, false);
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag == true) {
        for (Map.Entry<Villa, Integer> entryVilla : villaMap.entrySet()) {
            if (tenDichVu.equals(entryVilla.getKey().getTenDichVu())) {
                entryVilla.setValue(entryVilla.getValue() + 1);
                Write.writeVilla(villaMap, true);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            villaMap.put(villa1, 1);
            Write.writeVilla(villaMap, false);
        }
    }

    @Override
    public void displayVilla() {
        villaMap = Read.readVilla();
        for (Map.Entry<Villa, Integer> v : villaMap.entrySet()) {
            System.out.println(v);
        }
    }

    @Override
    public void displayVillaBaoTri() {

        for (Map.Entry<Villa, Integer> v : villaMap.entrySet()) {
            if (v.getValue() > 4) {
                System.out.println(v.getKey().toString() + "," + v.getValue().toString());
                v.setValue(0);
            }
        }
        System.out.println("đã đc bảo trì");
        Write.writeVilla(villaMap, false);
    }

}
