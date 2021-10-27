package com.durgesh.program2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample
{

    TreeMap<String, String> tm = new TreeMap<>();
    public void setValue(String state, String capital)
    {
        tm.put(state, capital);
    }

    public void getValue()
    {
        for (Map.Entry<String, String> word : tm.entrySet())
        {
            System.out.println(word.getKey() + " :" + word.getValue());

        }
    }
    public void searchValue(String key)
    {
        if (tm.containsKey(key)) {
            System.out.println("The Value is present");
        } else {
            System.out.println("The Value is not present");
        }

    }
}
