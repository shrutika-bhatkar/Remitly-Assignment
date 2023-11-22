package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // Adding elements
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        // Accessing elements
        System.out.println("First element: " + myList.get(0));

        // Iterating through the list
        for (String language : myList) {
            System.out.println(language);
        }
    }
}
