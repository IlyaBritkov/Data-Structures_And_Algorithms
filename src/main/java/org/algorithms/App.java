package org.algorithms;

import static org.algorithms.BinarySearch.recursiveBinarySearch;

public class App {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 10, 15, 17};
        System.out.println(recursiveBinarySearch(15, array));
    }
}
