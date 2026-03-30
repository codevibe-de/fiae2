package de.codevibe.basics;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
//import org.junit.platform.commons.util.StringUtils;

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
        sentence = sentence.toLowerCase();
//        return StringUtils.capitalize(sentence);
        String[] splitter = sentence.split(" ");
        String result = "";
        for (String word : splitter) {
            result += StringUtils.capitalize(word) + " ";
        }
        return result.trim();
    }

    /**
     * Parses the given string as an integer and returns double its value.
     * E.g. "21" -> 42
     * Throw a NumberFormatException (unchecked) if the string is not a valid integer.
     */
    public int parseAndDouble(String value) {
        int number = Integer.parseInt(value);
        return number * 2;
    }

    /**
     * Returns true if the string is a palindrome (reads the same forwards
     * and backwards), ignoring case and spaces.
     * E.g. "Racecar" -> true, "A man a plan a canal Panama" -> true
     */
    public boolean isPalindrome(String text) {
        String txet = new StringBuilder(text.replaceAll(" ", "").toLowerCase()).reverse().toString();
        System.out.println(txet);
        text = text.replaceAll(" ", "").toLowerCase();
        if (txet.equals(text)) return true;
        return false;
    }

    /**
     * Joins the elements of the array into a single string, separated by
     * the given separator.
     * E.g. ["a", "b", "c"], "-" -> "a-b-c"
     * Returns an empty string for a null or empty array.
     */
    public String joinWithSeparator(String[] words, String separator) {
        if (words == null || words.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        return sb.append(StringUtils.join(words, separator)).toString();
    }

    /**
     * Counts how many times the character c appears in the string text.
     * The search is case-sensitive.
     * Returns 0 for a null or empty string.
     */
    public int countChar(String text, char c) {
        if (StringUtils.isEmpty(text)) return 0;
        return StringUtils.countMatches(text, c);
    }
}