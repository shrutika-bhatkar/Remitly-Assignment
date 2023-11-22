package collection;

import java.util.LinkedList;

public class LinkedListExample {
     public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();

        // Adding elements
        myLinkedList.add("Apple");
        myLinkedList.add("Banana");
        myLinkedList.add("Orange");

        // Removing elements
        myLinkedList.remove("Banana");

        // Iterating through the linked list
        for (String fruit : myLinkedList) {
            System.out.println(fruit);
        }
    }
}
