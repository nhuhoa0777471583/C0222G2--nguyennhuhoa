package case_study2.serivce.impl.facility;

import case_study2.common.read_and_write.Read;
import case_study2.common.read_and_write.Write;
import case_study2.model.ficility.Room;
import case_study2.serivce.inter.IRoom;

import java.util.*;

public class RoomService implements IRoom {
    private static Scanner sc = new Scanner(System.in);
    //    private static List<Room> roomList = new ArrayList<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();

//    static {
//        //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
//        //                String kieuThue, String freeService
//        roomMap.put(new Room("SVRO","room1", "10m2", "5tr", "4ng", "2ngya3dem", "buffe"), 5);
//        roomMap.put(new Room("SVRO","room2", "20m2", "10tr", "5ng", "2ngya3dem", "buffe"), 5);
//        roomMap.put(new Room("SVRO","room3", "30m2", "15tr", "6ng", "2ngya3dem", "buffe"), 1);
//        Write.writeRoom(roomMap,true);
//    }

    @Override
    public void addRoom()  {

            roomMap = Read.readRoom();
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
            System.out.print("thêm dịch vụ free: ");
            String freeService = sc.nextLine();
            Room room1 = new Room(maDichVu, tenDichVu, dienTichSD, chiPhiThue, soNguoi, kieuThue, freeService);
            System.out.println(room1);
            roomMap.put(room1, 1);
            Write.writeRoom(roomMap, false);
        }


    @Override
    public void displayRoom() {
        roomMap = Read.readRoom();
        for (Map.Entry<Room, Integer> r : roomMap.entrySet()) {
            System.out.println(r);
        }
    }

    @Override
    public void displayRoomBaoTri() {
        roomMap = Read.readRoom();
        for (Map.Entry<Room, Integer> r : roomMap.entrySet()) {
            if (r.getValue() > 4) {
                System.out.println(r.getKey().toString() + "," + r.getValue().toString());
                r.setValue(0);
            }

        }
        System.out.println("đã bảo trì xong");
        Write.writeRoom(roomMap, false);

    }
}
