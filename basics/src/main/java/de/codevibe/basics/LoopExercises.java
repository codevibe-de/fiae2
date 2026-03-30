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
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

    /**
     * Returns n! (n factorial).
     * factorial(0) == 1, factorial(1) == 1, factorial(5) == 120.
     * Assume n >= 0.
     */
    public long factorial(int n) {
        long factorial=1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    /**
     * Counts the number of vowels (a, e, i, o, u – case-insensitive)
     * in the given string.
     * Returns 0 for a null or empty string.
     */
    public int countVowels(String text) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        if(text == null) return 0;

        for(char c : text.toCharArray()) {
            if(vowels.contains(String.valueOf(c))) count++;
        }
        return count;
    }

    /**
     * Returns a new array that is the reverse of the input array.
     * E.g. [1, 2, 3] -> [3, 2, 1].
     * Returns an empty array for null input.
     */
    public int[] reverseArray(int[] array) {
        int[] reversedArray;
        if (array == null) {
            return new int[0];
        };
        reversedArray = new int[array.length];
        for(int i = array.length-1; i >= 0; i--) {
            reversedArray[array.length-1-i] = array[i];
        }
        return reversedArray;
    }

    /**
     * Returns the largest number in the array.
     * Assume the array is non-null and non-empty.
     */
    public int findMax(int[] array) {
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}