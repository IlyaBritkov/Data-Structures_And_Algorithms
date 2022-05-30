package org.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void recursiveBinarySearch_givenKeyIsPresentAndEvenNumberOfElements() {
        int key = 15;
        int[] array = {2, 4, 7, 10, 15, 17};

        int resultIndex =
                BinarySearch.recursiveBinarySearch(key, array);

        Assert.assertEquals(4, resultIndex);
    }

    @Test
    public void recursiveBinarySearch_givenKeyIsNotPresentAndEvenNumberOfElements() {
        int key = 9;
        int[] array = {2, 4, 7, 10, 15, 17};

        int resultIndex =
                BinarySearch.recursiveBinarySearch(key, array);

        Assert.assertEquals(-1, resultIndex);
    }

    @Test
    public void recursiveBinarySearch_givenKeyIsPresentAndOddNumberOfElements() {
        int key = 2;
        int[] array = {2, 4, 7, 10, 15};

        int resultIndex =
                BinarySearch.recursiveBinarySearch(key, array);

        Assert.assertEquals(0, resultIndex);
    }

    @Test
    public void recursiveBinarySearch_givenKeyIsNotPresentAndOddNumberOfElements() {
        int key = 18;
        int[] array = {2, 4, 7, 10, 15};

        int resultIndex =
                BinarySearch.recursiveBinarySearch(key, array);

        Assert.assertEquals(-1, resultIndex);
    }
}