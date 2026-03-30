package de.codevibe.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalExercisesTest {

    private ConditionalExercises ex;

    @BeforeEach
    void setUp() {
        ex = new ConditionalExercises();
    }

    // --- fizzBuzz ---

    @Test
    void fizzBuzz_returnsNumberAsString() {
        assertEquals("1", ex.fizzBuzz(1));
        assertEquals("7", ex.fizzBuzz(7));
    }

    @Test
    void fizzBuzz_returnsFizzForMultipleOfThree() {
        assertEquals("Fizz", ex.fizzBuzz(3));
        assertEquals("Fizz", ex.fizzBuzz(9));
    }

    @Test
    void fizzBuzz_returnsBuzzForMultipleOfFive() {
        assertEquals("Buzz", ex.fizzBuzz(5));
        assertEquals("Buzz", ex.fizzBuzz(20));
    }

    @Test
    void fizzBuzz_returnsFizzBuzzForMultipleOfFifteen() {
        assertEquals("FizzBuzz", ex.fizzBuzz(15));
        assertEquals("FizzBuzz", ex.fizzBuzz(30));
    }

    // --- letterGrade ---

    @Test
    void letterGrade_returnsA() {
        assertEquals("A", ex.letterGrade(100));
        assertEquals("A", ex.letterGrade(90));
        assertEquals("A", ex.letterGrade(95));
    }

    @Test
    void letterGrade_returnsB() {
        assertEquals("B", ex.letterGrade(89));
        assertEquals("B", ex.letterGrade(80));
    }

    @Test
    void letterGrade_returnsCAndD() {
        assertEquals("C", ex.letterGrade(75));
        assertEquals("D", ex.letterGrade(60));
    }

    @Test
    void letterGrade_returnsF() {
        assertEquals("F", ex.letterGrade(59));
        assertEquals("F", ex.letterGrade(0));
    }

    @Test
    void letterGrade_returnsNullForInvalidScore() {
        assertNull(ex.letterGrade(-1));
        assertNull(ex.letterGrade(101));
    }

    // --- dayType ---

    @Test
    void dayType_weekdays() {
        assertEquals("Weekday", ex.dayType("Monday"));
        assertEquals("Weekday", ex.dayType("Wednesday"));
        assertEquals("Weekday", ex.dayType("Friday"));
    }

    @Test
    void dayType_weekend() {
        assertEquals("Weekend", ex.dayType("Saturday"));
        assertEquals("Weekend", ex.dayType("Sunday"));
    }

    @Test
    void dayType_unknownInput() {
        assertNull(ex.dayType("Holiday"));
        assertNull(ex.dayType(""));
    }

    // --- season ---

    @Test
    void season_winter() {
        assertEquals("Winter", ex.season(12));
        assertEquals("Winter", ex.season(1));
        assertEquals("Winter", ex.season(2));
    }

    @Test
    void season_spring() {
        assertEquals("Spring", ex.season(3));
        assertEquals("Spring", ex.season(5));
    }

    @Test
    void season_summer() {
        assertEquals("Summer", ex.season(6));
        assertEquals("Summer", ex.season(8));
    }

    @Test
    void season_autumn() {
        assertEquals("Autumn", ex.season(9));
        assertEquals("Autumn", ex.season(11));
    }

    @Test
    void season_invalidMonth() {
        assertNull(ex.season(0));
        assertNull(ex.season(13));
    }
}