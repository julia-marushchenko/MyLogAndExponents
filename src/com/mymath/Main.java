/**
 *  Java program to demonstrate rounding with Math class.
 */

package com.mymath;

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Exponent.
        double E = Math.E;

        // Printing exponent to console.
        System.out.println(E); // Output: 2.718281828459045

        // Counting logarithm.
        double pow = Math.log(E);
        System.out.println(pow); // Output: 1.0

        double pow1 = Math.log10(1000);
        System.out.println(pow1); // Output: 3.0

        double pow2 = Math.log10(100);
        System.out.println(pow2); // Output: 2.0

    }
}