package de.codevibe.basics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Exercises for FOR loops (and while/do-while where suitable).
 * Fill in the method bodies so that all unit tests pass.
 */
public class LoopExercises {

    /**
     * Returns the sum of all integers from 1 to n (inclusive).
     * Returns 0 for n <= 0.
     */
    public int sumUpTo(int n) {
        if (n <= 0) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Returns n! (n factorial).
     * factorial(0) == 1, factorial(1) == 1, factorial(5) == 120.
     * Assume n >= 0.
     */
    public long factorial(int n) {
        return n == 1 || n == 0 ? 1 : n * factorial(n - 1);
    }

    /**
     * Counts the number of vowels (a, e, i, o, u – case-insensitive)
     * in the given string.
     * Returns 0 for a null or empty string.
     */
    public int countVowels(String text) {

        if (text == null || text.isEmpty()) {
            return 0;
        }

        String lowerText = text.toLowerCase();
        int count = 0;

        String vowels = "aeiou";

        for (int i = 0; i < lowerText.length(); i++) {
            if (vowels.indexOf(lowerText.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns a new array that is the reverse of the input array.
     * E.g. [1, 2, 3] -> [3, 2, 1].
     * Returns an empty array for null input.
     */
    public int[] reverseArray(int[] array) {
        if (array == null || array.length == 0) return new int[0];
       for (int i = 0; i < array.length / 2; i++) {
           int temp = array[i];
           array[i] = array[array.length - i - 1];
           array[array.length - i - 1] = temp;
       }
       return array;
    }

    /**
     * Returns the largest number in the array.
     * Assume the array is non-null and non-empty.
     */
    public int findMax(int[] array) {
//        ArrayList<Integer> a = new ArrayList();
//        for (int i = 0; i < array.length; i++) {
//            a.add(array[i]);
//        }
//        return a.Math;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
//        Arrays.stream(array).sorted();
//        return array[array.length - 1]
    }
}