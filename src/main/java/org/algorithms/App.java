package org.algorithms;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Reverse.reverseElementsWithinArray(array);
        System.out.println(Arrays.toString(array));
    }
}
