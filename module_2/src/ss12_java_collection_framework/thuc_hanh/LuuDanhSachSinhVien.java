package ss12_java_collection_framework.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LuuDanhSachSinhVien {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hoa2", 48);
        hashMap.put("hoa3", 50);
        hashMap.put("hoa4", 10);
        hashMap.put("hoa6", 20);
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("hoa2", 20);
        linkedHashMap.put("hoa3", 48);
        linkedHashMap.put("hoa4", 50);
        linkedHashMap.put("hoa6", 10);
        System.out.println("\nThe age for " + "hoa4 is " + linkedHashMap.get("hoa4"));

    }

}
