package de.codevibe.basics;

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (i + 1);
        }
        return sum;
    }

    /**
     * Returns n! (n factorial).
     * factorial(0) == 1, factorial(1) == 1, factorial(5) == 120.
     * Assume n >= 0.
     */
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        }

        long prod = n;

        for (int i = 1; i < n; i++) {
            prod = prod * i;
        }
        return prod;
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

        int sumOfVowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.toLowerCase().charAt(i); 
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                sumOfVowels++;
            }
        }
        return sumOfVowels;
    }

    /**
     * Returns a new array that is the reverse of the input array.
     * E.g. [1, 2, 3] -> [3, 2, 1].
     * Returns an empty array for null input.
     */
    public int[] reverseArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] revArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            revArray [i] = array[array.length - 1 - i];
        }
        return revArray;
    }

    /**
     * Returns the largest number in the array.
     * Assume the array is non-null and non-empty.
     */
    public int findMax(int[] array) {
        int maxNum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }
}