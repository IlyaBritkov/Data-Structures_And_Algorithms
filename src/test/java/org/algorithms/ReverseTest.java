package org.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseTest {

    @Test
    public void reverseElementsWithinArray() {
        int[] array = {1, 2, 3, 4, 5};
        Reverse.reverseElementsWithinArray(array);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, array);
    }

}