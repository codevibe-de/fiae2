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
        StringBuilder sb = new StringBuilder(lower.length());

        sb.append(Character.toUpperCase(lower.charAt(0)));

        for (int i = 1; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (lower.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Parses the given string as an integer and returns double its value.
     * E.g. "21" -> 42
     * Throw a NumberFormatException (unchecked) if the string is not a valid integer.
     */
    public int parseAndDouble(String value) {
        int intValue = Integer.parseInt(value);
        return intValue * 2;
    }

    /**
     * Returns true if the string is a palindrome (reads the same forwards
     * and backwards), ignoring case and spaces.
     * E.g. "Racecar" -> true, "A man a plan a canal Panama" -> true
     */
    public boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        String textVergleich = text.toLowerCase().replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(textVergleich);
        String reversed = sb.reverse().toString();
        return textVergleich.equals(reversed);
    }

    /**
     * Joins the elements of the array into a single string, separated by
     * the given separator.
     * E.g. ["a", "b", "c"], "-" -> "a-b-c"
     * Returns an empty string for a null or empty array.
     */
    public String joinWithSeparator(String[] words, String separator) {
        if  (words == null || words.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            sb.append(separator).append(words[i]);
        }
        return sb.toString();

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
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }
        return count;

    }
}