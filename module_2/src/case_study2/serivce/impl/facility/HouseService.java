package case_study2.serivce.impl.facility;

import case_study2.common.read_and_write.Read;
import case_study2.common.read_and_write.Write;
import case_study2.model.ficility.House;
import case_study2.serivce.inter.IHouse;

import java.util.*;

public class HouseService implements IHouse {
    private static Scanner sc = new Scanner(System.in);
    //    private static List<House> houseList = new ArrayList<>();
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();

    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê
    //Tiêu chuẩn phòng, Số tầng.
//    static {
//        houseMap.put(new House("SVHO","house1", "100m", "10tr", "10ng", "3ngay2dem", "3sao", "2tang"), 1);
//        houseMap.put(new House("SVHO","house2", "100m", "10tr", "10ng", "3ngay2dem", "3sao", "2tang"), 5);
//        houseMap.put(new House("SVHO","house4", "50m", "5tr", "10ng", "3ngay2dem", "3sao", "2tang"), 2);
//        Write.writeHouse(houseMap, true);
//    }

    @Override
    public void addHouse() {
        System.out.print("thêm mã dịch vụ: ");
        String maDichVu = sc.nextLine();
        System.out.print("thêm tên dịch vụ: ");
        String tenDichVu = sc.nextLine();
        System.out.print("thêm diện tích sử dụng: ");
        String dienTichSD = sc.nextLine();
        System.out.print("thêm chi phí thuê: ");
        String chiPhiThue = sc.nextLine();
        System.out.print("thêm so nguoi: ");
        String soNguoi = sc.nextLine();
        System.out.print("thêm kieu thuê: ");
        String kieuThue = sc.nextLine();
        System.out.print("thêm tiêu chuẩn phòng: ");
        String tieuChuanPhong = sc.nextLine();
        System.out.print("thêm so tầng: ");
        String soTang = sc.nextLine();
        House house1 = new House(maDichVu, tenDichVu, dienTichSD, chiPhiThue, soNguoi, kieuThue, tieuChuanPhong, soTang);
        System.out.println(house1);
        houseMap.put(house1, 1);
        Write.writeHouse(houseMap, false);

    }

    @Override
    public void displayHouse() {
        houseMap = Read.readHouse();
        for (Map.Entry<House, Integer> h : houseMap.entrySet()) {
            System.out.println(h);
        }
    }

    public static String displayIdHouse() {
        houseMap = Read.readHouse();
        while (true) {
            System.out.println("nhap ma house theo ds house: ");
            String id = sc.nextLine();
            for (Map.Entry<House, Integer> h : houseMap.entrySet()) {
                if (id.equals(h.getKey().getMaDichVu())) {
                    return id;
                }
            }
        }
    }

    @Override
    public void displayHouseBaoTri() {
        houseMap = Read.readHouse();
        for (Map.Entry<House, Integer> h : houseMap.entrySet()) {
            if (h.getValue() > 4) {
                System.out.println(h.getKey().toString() + "," + h.getValue().toString());
                h.setValue(0);
            }
        }
        System.out.println("đã bảo trì xong");
        Write.writeHouse(houseMap, false);

    }
}
