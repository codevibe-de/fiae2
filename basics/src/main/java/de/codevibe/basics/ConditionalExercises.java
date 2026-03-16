package de.codevibe.basics;

import java.util.Locale;

/**
 * Exercises for IF/ELSE and SWITCH statements.
 * Fill in the method bodies so that all unit tests pass.
 */
public class ConditionalExercises {

    /**
     * Returns "Fizz" if n is divisible by 3,
     * "Buzz" if divisible by 5,
     * "FizzBuzz" if divisible by both,
     * otherwise the number as a String.
     */
    public String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }  else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else  {
            return "" + n;
        }
    }

    /**
     * Returns a letter grade based on the score:
     *   90-100 -> "A"
     *   80-89  -> "B"
     *   70-79  -> "C"
     *   60-69  -> "D"
     *   0-59   -> "F"
     * Return null for scores outside 0-100.
     */
    public String letterGrade(int score) {
        if (score < 0 || score > 100){
            return null;
        } else if (score >= 90){
            return "A";
        }  else if (score >= 80){
            return "B";
        } else if (score >= 70){
            return "C";
        }  else if (score >= 60){
            return "D";
        }  else {
            return "F";
        }
    }

    /**
     * Returns "Weekend" for "Saturday" or "Sunday",
     * "Weekday" for any other valid day name (Monday–Friday),
     * and null for unknown inputs.
     * Use a switch statement.
     */
    public String dayType(String day) {
        return switch (day.toLowerCase()) {
            case "saturday", "sunday" -> "Weekend";
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> "Weekday";
            default -> null;
        };
    }

    /**
     * Returns the season for a given month number (1–12):
     *   12, 1, 2  -> "Winter"
     *   3, 4, 5   -> "Spring"
     *   6, 7, 8   -> "Summer"
     *   9, 10, 11 -> "Autumn"
     * Return null for invalid month numbers.
     * Use a switch statement.
     */
    public String season(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> null;
        };
    }
}