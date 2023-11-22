package collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> myLinkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        myLinkedHashMap.put("Monday", 1);
        myLinkedHashMap.put("Tuesday", 2);
        myLinkedHashMap.put("Wednesday", 3);

        // Iterating through the linked hash map
        for (String day : myLinkedHashMap.keySet()) {
            System.out.println(day + ": " + myLinkedHashMap.get(day));
        }
    }
}
