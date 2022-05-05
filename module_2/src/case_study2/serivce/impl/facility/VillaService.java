package case_study2.serivce.impl.facility;

import case_study2.common.read_and_write.Read;
import case_study2.common.read_and_write.Write;
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
        System.out.print("thêm mã dịch vụ: ");
        String maDichVu = sc.nextLine();
        System.out.print("thêm tên dịch vụ: ");
        String tenDichVu = sc.nextLine();
        System.out.print("thêm tên diện tích sử dụng: ");
        String dienTichSD = sc.nextLine();
        System.out.print("thêm chi phí thuê: ");
        String chiPhiThue = sc.nextLine();
        System.out.print("thêm so nguoi: ");
        String soNguoi = sc.nextLine();
        System.out.print("thêm kieu thuê: ");
        String kieuThue = sc.nextLine();
        System.out.print("thêm tiêu chuẩn phòng: ");
        String tieuChuanPhong = sc.nextLine();
        System.out.print("thêm diện tích hồ bơi: ");
        String dienTichHoBoi = sc.nextLine();
        System.out.print("thêm so tầng: ");
        String soTang = sc.nextLine();
        Villa villa1 = new Villa(maDichVu,tenDichVu, dienTichSD, chiPhiThue, soNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        System.out.println(villa1);
        villaMap.put(villa1, 1);
        Write.writeVilla(villaMap, false);
//        for (Map.Entry<Villa,Integer> entry: villaMap.entrySet()){
//            if(entry.getKey().getTenDichVu().equals(tenDichVu)){
//                entry.setValue(entry.getValue()+1);
//            }
//        }
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
