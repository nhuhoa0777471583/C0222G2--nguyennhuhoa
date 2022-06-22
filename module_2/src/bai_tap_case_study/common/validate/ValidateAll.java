package bai_tap_case_study.common.validate;

public class ValidateAll {
    private static final String REGEX_ROOM = "^(SVRO)\\-[0-9]{4}$";
    private static final String REGEX_VILLA = "^(SVVL)\\-[0-9]{4}$";
    private static final String REGEX_HOUSE = "^(SVHO)\\-[0-9]{4}$";
    private static final String REGEX_NAMESERVICE = "^[A-Z][a-z]+$";
    private static final String REGEX_DIENTICH = "^[3-9]+[0-9]+(.[0-9])+(m2)$";
    private static final String REGEX_CHIPHITHUE = "^[1-9]{1}[0-9]{1}[0-9]{1}(Dola)$";
    private static final String REGEX_SOLUONGNGUOI = "^[0-9]{1}$";
    private static final String REGEX_SOTANG = "^[1-5]$";
    //    private static final String REGEX_KIEUTHUE="^[A-Z][a-z]+$";
//    private static final String REGEX_TIEUCHUANPHONG="^[A-Z][a-z]+$";
    private static final String REGEX_DAY = "^([0][1-9]{1}|[1][0-9]{1}|[2][0-9]{1}|[3][0-1]{1})$";
    private static final String REGEX_MONTH = "^([0][1-9]{1}|[1][0-2]{1})$";
    private static final String REGEX_YEAR = "^([2][0]+[0-9]+[0-9]+)$";


    public  static boolean isMatchesBirth(String birth) {
        return  birth.matches(REGEX_DAY + "/" + REGEX_MONTH + "/" + REGEX_YEAR);
    }


    public static boolean isMatchesRoom(String room) {
        return room.matches(REGEX_ROOM);
    }

    public static boolean isMatchesHouse(String house) {
        return house.matches(REGEX_HOUSE);
    }

    public static boolean isMatchesVilla(String villa) {
        return villa.matches(REGEX_VILLA);
    }

    public static boolean isMatchesNameService(String nameService) {
        return nameService.matches(REGEX_NAMESERVICE);
    }

    public static boolean isMatchesDienTich(String dienTich) {
        return dienTich.matches(REGEX_DIENTICH);
    }

    public static boolean isMatchesChiPhi(String chiPhi) {
        return chiPhi.matches(REGEX_CHIPHITHUE);
    }

    public static boolean isMatchesSoLuongNguoi(String soLuongNguoi) {
        return soLuongNguoi.matches(REGEX_SOLUONGNGUOI);
    }

    public static boolean isMatchesSotang(String soTang) {
        return soTang.matches(REGEX_SOTANG);
    }


}
