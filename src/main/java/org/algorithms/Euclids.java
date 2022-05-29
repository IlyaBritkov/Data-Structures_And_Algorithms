package org.algorithms;

public class Euclids {

    /**
     * Compute the greatest common divisor of two nonnegative integers p and q as follows: <br>
     * If q is 0, the answer is p. <br>
     * If not, divide p by q and take the remainder r.
     * The answer is the greatest common divisor of q and r.
     **/
    public static int findGreatestCommonDivisor(int p, int q) {
        validateInputParameters(p, q);
        return greatestCommonDivisor(p, q);
    }

    private static void validateInputParameters(int p, int q) {
        if (p < 0 || q < 0) {
            throw new IllegalArgumentException("Input parameters must be nonnegative");
        }
    }

    private static int greatestCommonDivisor(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return greatestCommonDivisor(q, r);
    }
}
