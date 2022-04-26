package ss19_String_Regex.thuc_hanh.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX= "^[_a-z)-9]{6,}$";
    public AccountExample(){}
    public boolean validate(String regex){
        Pattern p=  Pattern.compile(ACCOUNT_REGEX);
        Matcher m = p.matcher(regex);
        return m.matches();
    }

}
