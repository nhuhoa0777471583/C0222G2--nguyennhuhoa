package ss19_string_regex.thuc_hanh.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static final String EMAIL_REGEX ="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;
    private Matcher matcher;

    public EmailExample() {
    }

    public boolean validate(String regex){
        pattern=Pattern.compile(EMAIL_REGEX);
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
