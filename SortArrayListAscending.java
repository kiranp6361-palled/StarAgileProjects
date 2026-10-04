package com.corejava;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListAscending {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(34);
        numbers.add(23);

        System.out.println("Original ArrayList: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted ArrayList in Ascending Order: " + numbers);
    }
}
