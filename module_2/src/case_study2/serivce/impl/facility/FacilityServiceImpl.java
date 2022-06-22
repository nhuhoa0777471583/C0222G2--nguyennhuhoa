package case_study2.serivce.impl.facility;

import case_study2.serivce.inter.IFacilityService;

import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner sc = new Scanner(System.in);
    private static HouseService houseService = new HouseService();
    private static RoomService roomService = new RoomService();
    private static VillaService villaService = new VillaService();


    @Override
    public void displayAll() {
        roomService.displayRoom();
        houseService.displayHouse();
        villaService.displayVilla();
    }

    public static void displayFacility() {
        roomService.displayRoom();
        houseService.displayHouse();
        villaService.displayVilla();
    }
    public static String displayIdFacility() {
            System.out.println("cac dich vu:\n" +
                    "1.Room\n" +
                    "2.House\n" +
                    "3.Villa\n" +
                    "chon: ");
            int chosse = Integer.parseInt(sc.nextLine());
            switch (chosse) {
                case 1:
                    System.out.println("ban chon dich vu room");
                    return RoomService.displayIdRoom();
                case 2:
                    System.out.println("ban chon dich vu house");
                    return HouseService.displayIdHouse();
                case 3:
                    System.out.println("ban chon dich vu villa");
                    return VillaService.displayIdVilla();
                default:
                    System.out.println("nhap lai");
                    break;
            }
        return null;
    }

    @Override
    public void displayBaoTri() {
        villaService.displayVillaBaoTri();
        houseService.displayHouseBaoTri();
        roomService.displayRoomBaoTri();
    }
}
