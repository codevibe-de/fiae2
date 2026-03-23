package de.codevibe.basics;

import java.util.Arrays;

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
        String[] splittedStrings = sentence.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : splittedStrings) {
            char[] chars = s.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            sb.append(new String(chars)).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Parses the given string as an integer and returns double its value.
     * E.g. "21" -> 42
     * Throw a NumberFormatException (unchecked) if the string is not a valid integer.
     */
    public int parseAndDouble(String value) {
        if (value == null || value.isEmpty()) {
            return 0;
        }
        int parsed = Integer.valueOf(value);

        parsed = parsed * 2;
        return parsed;
    }

    /**
     * Returns true if the string is a palindrome (reads the same forwards
     * and backwards), ignoring case and spaces.
     * E.g. "Racecar" -> true, "A man a plan a canal Panama" -> true
     */
    public boolean isPalindrome(String text) {
        String modString = text.toLowerCase().trim().replace(" ", "");

        for (int i = 0; i < modString.length() / 2; i++) {
            if (modString.charAt(i) != modString.charAt(modString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Joins the elements of the array into a single string, separated by
     * the given separator.
     * E.g. ["a", "b", "c"], "-" -> "a-b-c"
     * Returns an empty string for a null or empty array.
     */
    public String joinWithSeparator(String[] words, String separator) {
        if (words == null || words.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder(words[0]);

        for (int i = 1 ; i < words.length; i++) {
            sb.append(separator).append(words[i]);
        }

        String result = sb.toString();

        return result;
    }

    /**
     * Counts how many times the character c appears in the string text.
     * The search is case-sensitive.
     * Returns 0 for a null or empty string.
     */
    public int countChar(String text, char c) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int count = 0;

        char[] chars = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        return count;
    }
}