package com.durgesh.program2;

import java.util.*;

public class HashMapExample {

    Map<String, String> hm = new HashMap<>();

    public void setValue(String state, String capital) {
        hm.put(state, capital);
    }

    public void getValue()
    {
        for (Map.Entry<String, String> word : hm.entrySet()) {
            System.out.println(word.getKey() + ":" + word.getValue());

        }
    }
    public void sortValue() {
        TreeMap<String, String> sorted = new TreeMap<>();

        sorted.forEach((k,v)->{
        System.out.println(k+" "+v); }
         );
    }

}
