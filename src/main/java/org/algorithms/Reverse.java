package org.algorithms;

public class Reverse {

    public static void reverseElementsWithinArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int buffer = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = buffer;
        }
    }
}
