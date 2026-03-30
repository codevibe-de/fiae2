package de.codevibe.basics;

import java.util.ArrayList;
import java.util.Arrays;

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
        }
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%5==0){
            return "Buzz";
        }
        return String.valueOf(n);
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
        if (score > 100) return null;
        else if (score >=90) return "A";
        else if (score >=80) return "B";
        else if (score >=70) return "C";
        else if (score >=60) return "D";
        else if (score >= 0) return "F";
        else return null;
    }

    /**
     * Returns "Weekend" for "Saturday" or "Sunday",
     * "Weekday" for any other valid day name (Monday–Friday),
     * and null for unknown inputs.
     * Use a switch statement.
     */
    public String dayType(String day) {
        String[] weekenddays = {"Saturday","Sunday"};
        String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        if(Arrays.stream(weekenddays).toList().contains(day)) return "Weekend";
        else if(Arrays.stream(weekdays).toList().contains(day)) return "Weekday";
        else return null;
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
        String[] winter = {"12","1","2"};
        String[] spring = {"3","4","5"};
        String[] summer = {"6","7","8"};
        String[] fall = {"9","10","11"};
        if(Arrays.stream(winter).toList().contains(String.valueOf(month))) return "Winter";
        else if(Arrays.stream(spring).toList().contains(String.valueOf(month))) return "Spring";
        else if(Arrays.stream(summer).toList().contains(String.valueOf(month))) return "Summer";
        else if(Arrays.stream(fall).toList().contains(String.valueOf(month))) return "Autumn";
        else return null;

    }
}