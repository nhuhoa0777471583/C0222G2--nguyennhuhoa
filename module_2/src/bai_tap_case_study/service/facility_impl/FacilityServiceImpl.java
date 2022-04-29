package bai_tap_case_study.service.facility_impl;

import bai_tap_case_study.service.interf.i_facility.IFacilityService;

public class FacilityServiceImpl implements IFacilityService {
//    private static LinkedHashMap<Integer, FacilityFurama>
    static {
    }
    @Override
    public void displayFacility() {
        new HouseService().dislayHouse();
        new VillaService().displayVilla();
        new RoomService().displayRoom();
    }

    @Override
    public void displayBaoTri() {

    }
}
