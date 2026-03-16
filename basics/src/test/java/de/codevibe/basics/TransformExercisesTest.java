package de.codevibe.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformExercisesTest {

    private TransformExercises ex;

    @BeforeEach
    void setUp() {
        ex = new TransformExercises();
    }

    // --- capitalizeWords ---

    @Test
    void capitalizeWords_singleWord() {
        assertEquals("Hello", ex.capitalizeWords("hello"));
        assertEquals("Java", ex.capitalizeWords("JAVA"));
    }

    @Test
    void capitalizeWords_multipleWords() {
        assertEquals("Hello World", ex.capitalizeWords("hello world"));
        assertEquals("The Quick Brown Fox", ex.capitalizeWords("the quick brown fox"));
    }

    @Test
    void capitalizeWords_alreadyCapitalized() {
        assertEquals("Hello World", ex.capitalizeWords("Hello World"));
    }

    // --- parseAndDouble ---

    @Test
    void parseAndDouble_validIntegers() {
        assertEquals(42, ex.parseAndDouble("21"));
        assertEquals(0, ex.parseAndDouble("0"));
        assertEquals(-10, ex.parseAndDouble("-5"));
    }

    @Test
    void parseAndDouble_invalidInput() {
        assertThrows(NumberFormatException.class, () -> ex.parseAndDouble("abc"));
        assertThrows(NumberFormatException.class, () -> ex.parseAndDouble("1.5"));
    }

    // --- isPalindrome ---

    @Test
    void isPalindrome_simplePalindromes() {
        assertTrue(ex.isPalindrome("racecar"));
        assertTrue(ex.isPalindrome("Racecar"));
        assertTrue(ex.isPalindrome("madam"));
        assertTrue(ex.isPalindrome("reliefpfeiler"));
    }

    @Test
    void isPalindrome_withSpaces() {
        assertTrue(ex.isPalindrome("A man a plan a canal Panama"));
        assertTrue(ex.isPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    void isPalindrome_notPalindrome() {
        assertFalse(ex.isPalindrome("hello"));
        assertFalse(ex.isPalindrome("Java"));
    }

    @Test
    void isPalindrome_singleCharacter() {
        assertTrue(ex.isPalindrome("a"));
    }

    // --- joinWithSeparator ---

    @Test
    void joinWithSeparator_normalCase() {
        assertEquals("a-b-c", ex.joinWithSeparator(new String[]{"a", "b", "c"}, "-"));
        assertEquals("one, two, three", ex.joinWithSeparator(new String[]{"one", "two", "three"}, ", "));
    }

    @Test
    void joinWithSeparator_singleElement() {
        assertEquals("only", ex.joinWithSeparator(new String[]{"only"}, "/"));
    }

    @Test
    void joinWithSeparator_emptyOrNull() {
        assertEquals("", ex.joinWithSeparator(new String[]{}, "-"));
        assertEquals("", ex.joinWithSeparator(null, "-"));
    }

    // --- countChar ---

    @Test
    void countChar_found() {
        assertEquals(3, ex.countChar("banana", 'a'));
        assertEquals(2, ex.countChar("hello", 'l'));
    }

    @Test
    void countChar_notFound() {
        assertEquals(0, ex.countChar("hello", 'z'));
    }

    @Test
    void countChar_caseSensitive() {
        assertEquals(0, ex.countChar("Hello", 'h'));
        assertEquals(1, ex.countChar("Hello", 'H'));
    }

    @Test
    void countChar_emptyOrNull() {
        assertEquals(0, ex.countChar("", 'a'));
        assertEquals(0, ex.countChar(null, 'a'));
    }
}