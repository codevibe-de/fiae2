package de.codevibe.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopExercisesTest {

    private LoopExercises ex;

    @BeforeEach
    void setUp() {
        ex = new LoopExercises();
    }

    // --- sumUpTo ---

    @Test
    void sumUpTo_positiveNumber() {
        assertEquals(15, ex.sumUpTo(5));   // 1+2+3+4+5
        assertEquals(55, ex.sumUpTo(10));
    }

    @Test
    void sumUpTo_one() {
        assertEquals(1, ex.sumUpTo(1));
    }

    @Test
    void sumUpTo_zeroOrNegative() {
        assertEquals(0, ex.sumUpTo(0));
        assertEquals(0, ex.sumUpTo(-3));
    }

    // --- factorial ---

    @Test
    void factorial_baseCase() {
        assertEquals(1L, ex.factorial(0));
        assertEquals(1L, ex.factorial(1));
    }

    @Test
    void factorial_smallNumbers() {
        assertEquals(6L, ex.factorial(3));
        assertEquals(120L, ex.factorial(5));
    }

    @Test
    void factorial_largerNumber() {
        assertEquals(3628800L, ex.factorial(10));
    }

    // --- countVowels ---

    @Test
    void countVowels_mixedText() {
        assertEquals(3, ex.countVowels("Hello World"));
        assertEquals(5, ex.countVowels("aeiou"));
    }

    @Test
    void countVowels_caseInsensitive() {
        assertEquals(5, ex.countVowels("AEIOU"));
        assertEquals(2, ex.countVowels("Java"));
    }

    @Test
    void countVowels_noVowels() {
        assertEquals(0, ex.countVowels("rhythm"));
    }

    @Test
    void countVowels_emptyOrNull() {
        assertEquals(0, ex.countVowels(""));
        assertEquals(0, ex.countVowels(null));
    }

    // --- reverseArray ---

    @Test
    void reverseArray_normalCase() {
        assertArrayEquals(new int[]{3, 2, 1}, ex.reverseArray(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ex.reverseArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void reverseArray_singleElement() {
        assertArrayEquals(new int[]{42}, ex.reverseArray(new int[]{42}));
    }

    @Test
    void reverseArray_nullInput() {
        assertArrayEquals(new int[0], ex.reverseArray(null));
    }

    // --- findMax ---

    @Test
    void findMax_positiveNumbers() {
        assertEquals(9, ex.findMax(new int[]{3, 9, 1, 5}));
    }

    @Test
    void findMax_negativeNumbers() {
        assertEquals(-1, ex.findMax(new int[]{-5, -1, -3}));
    }

    @Test
    void findMax_singleElement() {
        assertEquals(7, ex.findMax(new int[]{7}));
    }
}