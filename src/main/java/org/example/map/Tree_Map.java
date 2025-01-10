package org.example.map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {

        // Sorted on the basis of key

        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        numbers.remove("Three");

        // numbers.put("Two",23); // this overrides the value of the Two

        for (Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key :numbers.keySet()){
            System.out.println(key);
        }

        for (Integer value : numbers.values()){
            System.out.println(value);
        }
        System.out.println(numbers.containsKey("Three"));
        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());

        System.out.println(numbers);
    }
}
