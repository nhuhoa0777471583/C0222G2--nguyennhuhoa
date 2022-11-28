import java.util.Arrays;

public class NoDuplicates {
    public static void main(String[] art) {
        int a[] = {1, 2, 3, 4, 3, 2, 1};
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                flag = false;
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }

        }
        if (!flag) {
            System.out.println(Arrays.toString(a));
        }
    }
}

