package validate;

public class Regex {

    public static final String REGEX_PHONE = "^((091)|(090)|(\\(84\\)\\+90)|((84)+91))([0-9]{7})$";
    public static final String REGEX_IDCARD = "^([0-9]{10})|([0-9]{9})$";
    public static final String REGEX_EMAIL = "^[A-z 0-9]+(@gmail.com)$";
    public static final String REGEX_BIRTHDAY = "^(((0)[1-9]{1})|((1)[0-9]{1})|((2)[0-9]{1})|((3)[0-1]{1}))\\-(((0)[1-9]{1})|((1)[0-2]{1}))\\-([2][0-1]{1}[0-9]{1}[0-9]{1})|([1][5-9]{1}[0-9]{1}[0-9]{1})$";
    public static final String REGEX_NUMBER_POSITIVE = "^[1-9]{1}[0-9]+$";
    public static final String REGEX_NUMBER_OF_FLOORS = "^[0-4]{1}$";
    public static final String REGEX_AMOUNT = "^[0-9]{1}[0-9]+$";

    public static boolean isMatchesPhone(String phone) {
        return phone.matches(REGEX_PHONE);
    }
    public static boolean isMatchesIdCard(String idCard){
        return idCard.matches(REGEX_IDCARD);
    }
    public static boolean isMatchesEmail(String email){
        return email.matches(REGEX_EMAIL);
    }
    public static boolean isMatchesBirthday(String birthday){
        return birthday.matches(REGEX_BIRTHDAY);
    }
    public static boolean isMatchesInteger(String number){
        return number.matches(REGEX_NUMBER_POSITIVE);
    }
    public static boolean isMatchesNumberOfFloors(String numberOfFloars){
        return numberOfFloars.matches(REGEX_NUMBER_OF_FLOORS);
    }
    public static boolean isMatchesAmount(String amount){
        return amount.matches(REGEX_AMOUNT);
    }

}
