/**
* This program does different math operators.
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-02-07
*/

// Creating class
public final class MathOperators {
    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(String[] args) {

        // add and print result
        System.out.println("2 + 4 = " + (2 + 4));

        // subtract and print result
        System.out.println("6 - 4 = " + (6 - 4));

        // multiply and print result
        System.out.println("10 x 3 = " + (10 * 3));

        // divide and print result, non-decimal
        System.out.println("6 ÷ 2 = " + (6 / 2));

        // divide and print result, float numbers
        System.out.println("8 ÷ 3 = " + (8f / 3f));

        // divide and print result, double numbers
        System.out.println("8 ÷ 3 = " + (8d / 3d));

        // power of 2 and print result
        System.out.println("6^2 = " + (Math.pow(6, 2)));

        // power of 3 and print result
        System.out.println("9^3 = " + (Math.pow(9, 3)));

        // square root and print result
        System.out.println("√36 = " + (Math.sqrt(36)));
    }
}
