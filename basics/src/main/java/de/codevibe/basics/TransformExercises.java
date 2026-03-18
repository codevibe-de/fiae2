package de.codevibe.basics;

/**
 * Exercises for transforming input values (string operations, number parsing).
 * Fill in the method bodies so that all unit tests pass.
 */
public class TransformExercises {

    /**
     * Capitalizes the first letter of every word in the sentence and
     * lowercases the rest.
     * Words are separated by single spaces.
     * E.g. "hello world" -> "Hello World"
     */
    public String capitalizeWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        String lower = sentence.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == ' ') {
                lower = sentence.substring(0, i).toUpperCase() + sentence.substring(i);
            }
        }
        return lower;
    }

    /**
     * Parses the given string as an integer and returns double its value.
     * E.g. "21" -> 42
     * Throw a NumberFormatException (unchecked) if the string is not a valid integer.
     */
    public int parseAndDouble(String value) {
        // TODO
        return 0;
    }

    /**
     * Returns true if the string is a palindrome (reads the same forwards
     * and backwards), ignoring case and spaces.
     * E.g. "Racecar" -> true, "A man a plan a canal Panama" -> true
     */
    public boolean isPalindrome(String text) {
        // TODO
        return false;
    }

    /**
     * Joins the elements of the array into a single string, separated by
     * the given separator.
     * E.g. ["a", "b", "c"], "-" -> "a-b-c"
     * Returns an empty string for a null or empty array.
     */
    public String joinWithSeparator(String[] words, String separator) {
        // TODO
        return null;
    }

    /**
     * Counts how many times the character c appears in the string text.
     * The search is case-sensitive.
     * Returns 0 for a null or empty string.
     */
    public int countChar(String text, char c) {
        // TODO
        return 0;
    }
}