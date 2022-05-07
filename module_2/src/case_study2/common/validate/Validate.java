package case_study2.common.validate;

public class Validate {
    private static final String REGEX_MAVILLA = "^(SVVL)[-][0-9]{4}$";
    private static final String REGEX_MAROOM = "^(SVRO)[-][0-9]{4}$";
    private static final String REGEX_MAHOUSE = "^(SVHO)[-][0-9]{4}$";

    private static final String REGEX_TEN = "^[A-Z]{1}[a-z]+$";
    private static final String REGEX_DIENTICH =
            "^([3-9]{1}[1-9]{1})|([3-9]{1}[0-9]{1}(.[0-9]{1}))(m2)|([4-9]{1}[0-9]{1})(m2)|([1-9]{1}[0-9]{1}[0-9]{1})(m2)|([1-9]{1}[0-9]{1}[0-9]{1}(.[0-9]))(m2)$";

    private static final String REGEX_CHIPHITHUE = "^[1-9]{1}[0-9]{5}$";
    private static final String REGEX_SOLUONGNGUOI = "^[1-9]{1}|[1]{1}[0-9]$";
    private static final String REGEX_SOTANG = "^[0-5]{1}$";
    private static final String REGEX_DAY = "^([0][1-9]{1}|[1][0-9]{1}|[2][0-9]{1}|[3][0-1]{1})$";
    private static final String REGEX_MONTH = "^([0][1-9]{1}|[1][0-2]{1})$";
    private static final String REGEX_YEAR = "^([2][0]+[0-9]+[0-9]+)$";

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

    public boolean isMatchesChiPhiThue(String chiPhiThue) {
        return chiPhiThue.matches(REGEX_CHIPHITHUE);
    }

    public boolean isMatchesSoLuongNguoi(String soLuongNguoi) {
        return soLuongNguoi.matches(REGEX_SOLUONGNGUOI);
    }

    public boolean isMatchesSoTang(String soTang) {
        return soTang.matches(REGEX_SOTANG);
    }

    public boolean isMatchesBirth(String birth) {
        return birth.matches(REGEX_DAY + "/" + REGEX_MONTH + "/" + REGEX_YEAR);
    }
}
