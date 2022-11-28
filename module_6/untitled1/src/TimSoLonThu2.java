public class TimSoLonThu2 {


    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 17, 3, 8, 6};
        int max = arr[0];
        int max2 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
            if (max2 < arr[i] && arr[i] < max) {
                max2 = arr[i];
            }
        }
        System.out.println("so lớn thứ 1: " + max);
        System.out.println("so lớn thứ 2: " + max2);
    }
}
