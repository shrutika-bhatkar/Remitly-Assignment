package collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();

        // Adding elements
        myHashSet.add("Red");
        myHashSet.add("Green");
        myHashSet.add("Blue");

        // Removing elements
        myHashSet.remove("Green");

        // Iterating through the hash set
        for (String color : myHashSet) {
            System.out.println(color);
        }
    }
}
