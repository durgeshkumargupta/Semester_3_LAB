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
        for (Map.Entry<String, String> val : tm.entrySet())
        {
            System.out.println(val.getKey() + " :" + val.getValue());

        }
    }
    public void searchValue(String key)
    {
        if (tm.containsKey(key)) {
            System.out.println("The key is present");
        } else {
            System.out.println("The key is not present");
        }

    }
}
