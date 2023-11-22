package collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        // Adding elements
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);

        // Accessing elements
        System.out.println("First element: " + myArrayList.get(0));

        // Iterating through the array list
        for (int number : myArrayList) {
            System.out.println(number);
        }
    }
}
