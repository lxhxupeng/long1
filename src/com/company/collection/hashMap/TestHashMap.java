package com.company.collection.hashMap;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("adc", "AD");
        hashMap.put("apc", "magic");
        hashMap.put("t", "tanke");
        System.out.println(hashMap.get("t"));
    }
}
