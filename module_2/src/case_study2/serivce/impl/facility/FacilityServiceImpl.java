package case_study2.serivce.impl.facility;

import case_study2.serivce.inter.IFacilityService;

public class FacilityServiceImpl implements IFacilityService {
    private static HouseService houseService = new HouseService();
    private static RoomService roomService = new RoomService();
    private static VillaService villaService = new VillaService();


    @Override
    public void displayAll() {
        houseService.displayHouse();
        roomService.displayRoom();
        villaService.displayVilla();
    }

    @Override
    public void displayBaoTri() {
        villaService.displayVillaBaoTri();
        houseService.displayHouseBaoTri();
        roomService.displayRoomBaoTri();
    }
}
