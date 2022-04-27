package ss19_string_regex.thuc_hanh.ValidateAccount;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] validAccount= new String[]{"123abc_","_abc123","______","123456","abcdefg"};
    private static final String[] invalidAccount= new String[]{".@", "12345", "1234_","abcde "};

    public static void main(String[] args) {
        accountExample =new AccountExample();
        for (String acc: validAccount) {
            boolean isvali= accountExample.validate(acc);
            System.out.println("chuoi : "+acc+" co gia tri: "+ isvali);
        }
        for (String acc:invalidAccount) {
            boolean isvali= accountExample.validate(acc);
            System.out.println("chuoi : "+acc+" co gia tri: "+ isvali);
        }
    }
}
