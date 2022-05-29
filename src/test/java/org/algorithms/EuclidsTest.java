package org.algorithms;

import junit.framework.TestCase;

public class EuclidsTest extends TestCase {

    public void testFindGreatestCommonDivisor() {
        int result = Euclids.findGreatestCommonDivisor(5, 2);

        assertEquals(1, result);
    }
}