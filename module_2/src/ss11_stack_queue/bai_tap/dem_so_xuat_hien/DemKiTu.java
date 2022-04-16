package ss11_stack_queue.bai_tap.dem_so_xuat_hien;


import java.util.TreeMap;

public class DemKiTu {
    public static void main(String[] args) {
        String str = "NHU HOA   ";
        str = str.toLowerCase();
        System.out.println(str);
        String[] arrString = str.split("");

        TreeMap<String, Integer> map = new TreeMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < arrString.length; i++) {
            map.put(arrString[i],1);
        }
        for (String arr : arrString) {
            int value = 0;
            for (int i = 0; i < arrString.length; i++) {
                if (arr.equals(arrString[i])) {
                    value++;
                }
            }
            treeMap.put(arr, value);
        }
        System.out.println(treeMap);
    }
}


