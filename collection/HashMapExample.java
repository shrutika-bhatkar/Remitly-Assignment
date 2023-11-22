package collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // Adding key-value pairs
        myHashMap.put("Java", 20);
        myHashMap.put("Python", 15);
        myHashMap.put("C++", 10);

        // Accessing values
        System.out.println("Java users: " + myHashMap.get("Java"));

        // Iterating through the hash map
        for (String language : myHashMap.keySet()) {
            System.out.println(language + ": " + myHashMap.get(language) + " users");
        }
    }    
}
