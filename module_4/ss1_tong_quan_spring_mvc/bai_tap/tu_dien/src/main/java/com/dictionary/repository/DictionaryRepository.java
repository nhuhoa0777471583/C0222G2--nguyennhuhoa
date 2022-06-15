package com.dictionary.repository;

import java.util.HashMap;
import java.util.Map;

public class DictionaryRepository implements IDictionaryRepository {
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("dog", "chó");
        map.put("cat", "mèo");
        map.put("pig", "heo");
        map.put("hello", "xin chào");
        map.put("bye", "tạm biệt");
    }

    @Override
    public String dictionary(String english) {
    String e = map.get(english);
    return e;
    }
}
