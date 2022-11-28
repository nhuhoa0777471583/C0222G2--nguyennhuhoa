public class RemoveDuplicate {

    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 4, 5, 9,6,3};
////        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
