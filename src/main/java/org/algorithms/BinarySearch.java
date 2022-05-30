package org.algorithms;

public class BinarySearch {

    public static int recursiveBinarySearch(int key, int[] array) {
        return recursiveBinarySearch(key, array, 0, array.length - 1);
    }

    private static int recursiveBinarySearch(int key, int[] array, int lowerIndex, int upperIndex) {
        if (lowerIndex >= upperIndex) {
            return -1;
        }

        int middleIndex = (upperIndex - lowerIndex) / 2 + lowerIndex;
        if (array[middleIndex] == key) {
            return middleIndex;
        }

        if (array[middleIndex] > key) {
            // left half
            return recursiveBinarySearch(key, array, lowerIndex, middleIndex);
        } else {
            // right half
            return recursiveBinarySearch(key, array, middleIndex + 1, upperIndex);
        }
    }
}
