import java.util.ArrayList;

public class ArraysArrayList {
    public static void main(String[] args) {
        // MyBookTracker theme: pages read across five days.
        int[] pagesReadArray = {12, 20, 15, 30, 18};

        System.out.println("Array elements:");
        for (int value : pagesReadArray) {
            System.out.println(value);
        }
        System.out.println("Array length: " + pagesReadArray.length);

        ArrayList<Integer> pagesReadList = new ArrayList<>();
        pagesReadList.add(12);
        pagesReadList.add(20);
        pagesReadList.add(15);
        pagesReadList.add(30);
        pagesReadList.add(18);

        System.out.println("\nArrayList elements:");
        for (Integer value : pagesReadList) {
            System.out.println(value);
        }
        System.out.println("ArrayList size: " + pagesReadList.size());

        // Arrays cannot grow after creation because their length is fixed.
        // ArrayList can grow dynamically as you add items.
        pagesReadList.add(25);
        System.out.println("ArrayList size after adding one more value: " + pagesReadList.size());

        // Choose an array when size is fixed and known in advance.
        // Choose an ArrayList when the number of elements may change.

        ArrayList<String> bookTitles = new ArrayList<>();
        bookTitles.add("Atomic Habits");
        bookTitles.add("The Hobbit");
        bookTitles.add("Clean Code");

        // bookTitles.add(123);
        // Not allowed: ArrayList<String> only accepts String values.

        System.out.println("\nint[] with traditional for loop:");
        for (int i = 0; i < pagesReadArray.length; i++) {
            System.out.println("Index " + i + ": " + pagesReadArray[i]);
        }

        System.out.println("\nint[] with enhanced for-each loop:");
        for (int value : pagesReadArray) {
            System.out.println(value);
        }

        System.out.println("\nArrayList<Integer> with traditional for loop (get(i)):");
        for (int i = 0; i < pagesReadList.size(); i++) {
            System.out.println("Index " + i + ": " + pagesReadList.get(i));
        }

        System.out.println("\nArrayList<Integer> with while loop:");
        int i = 0;
        while (i < pagesReadList.size()) {
            System.out.println(pagesReadList.get(i));
            i++;
        }
    }
}
