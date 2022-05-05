package case_study2.model.ficility;

public class Room extends Facility {
    //Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room() {

    }

    public Room(String maDichVu, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
                String kieuThue, String freeService) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soNguoi, kieuThue);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{ " + super.toString() +
                ", freeService= " + freeService + "}";
    }

    public String getInfoRoom() {
        //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
        //                String kieuThue, String freeService
        return getMaDichVu() + "," + getTenDichVu() + "," + getDienTichSuDung() + "," + getChiPhiThue() + "," + getSoNguoi() + "," +
                getKieuThue() + "," + getFreeService();
    }
}
