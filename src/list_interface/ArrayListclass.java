package list_interface;

import java.util.*;

public class ArrayListclass {
    public static void main(String args[]) {


        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements to the ArrayList
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        System.out.println("ArrayList after adding elements: " + list);

        // 3. Accessing elements by index
        String element = list.get(1); // Get the element at index 1
        System.out.println("Element at index 1: " + element);

        // 4. Modifying an element at a specific index
        list.set(1, "Ramesh"); // Modify the element at index 1
        System.out.println("ArrayList after modifying element: " + list);

        // 5. Removing an element by index
        list.remove(2); // Remove the element at index 2
        System.out.println("ArrayList after removing element by index: " + list);

        // 6. Removing an element by value
        list.remove("Ravi"); // Remove the first occurrence of "Ravi"
        System.out.println("ArrayList after removing element by value: " + list);

        // 7. Checking if the ArrayList contains a specific element
        boolean contains = list.contains("Ramesh");
        System.out.println("Does the ArrayList contain 'Ramesh'? " + contains);

        // 8. Getting the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // 9. Iterating over the ArrayList using a for-each loop
        System.out.print("Iterating using for-each loop: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 10. Iterating over the ArrayList using an iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 11. Clearing all elements from the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);

        // 12. Checking if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // 13. Adding all elements from another collection
        ArrayList<String> newList = new ArrayList<>();
        newList.add("John");
        newList.add("Doe");
        list.addAll(newList);
        System.out.println("ArrayList after adding all elements from newList: " + list);

        // 14. Getting the index of a specific element
        int index = list.indexOf("John");
        System.out.println("Index of 'John': " + index);

        // 15. Cloning the ArrayList (Shallow copy)
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned ArrayList: " + clonedList);
    }
}
