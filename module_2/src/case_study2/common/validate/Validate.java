package case_study2.common.validate;

public class Validate {
    private static final String REGEX_MAVILLA = "^(SVVL)[-][0-9]{4}$";
    private static final String REGEX_MAROOM = "^(SVRO)[-][0-9]{4}$";
    private static final String REGEX_MAHOUSE = "^(SVHO)[-][0-9]{4}$";
    private static final String REGEX_TEN = "^[A-Z]{1}[a-z]+$";
    private static final String REGEX_DIENTICH =
            "^([3-9]{1}[1-9]{1})|([3-9]{1}[0-9]{1}(.[0-9]{1}))|([4-9]{1}[0-9]{1})|([1-9]{1}[0-9]{1}[0-9]{1})|([1-9]{1}[0-9]{1}[0-9]{1}(.[0-9]))$";

    //    private static final String REGEX_CHIPHITHUE=
//    private static final String REGEX_SOLUONGNGUOI=
//    private static final String REGEX_SOTANG=
//    private static final String REGEX_DAY=
//    private static final String REGEX_MONTH=
//    private static final String REGEX_YEAR=
    public boolean isMatchesVilla(String maDichVu) {
        return maDichVu.matches(REGEX_MAVILLA);
    }

    public boolean isMatchesRoom(String maDichVu) {
        return maDichVu.matches(REGEX_MAROOM);
    }

    public boolean isMatchesHouse(String maDichVu) {
        return maDichVu.matches(REGEX_MAHOUSE);
    }

    public boolean isMatchesTen(String ten) {
        return ten.matches(REGEX_TEN);
    }

    public boolean isMatchesDienTich(String dienTich) {
        return dienTich.matches(REGEX_DIENTICH);
    }

}
