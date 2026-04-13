package de.codevibe;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(DemoApp.isIBAN(input));

    }

    public static int leerzeichenCounter(String input) {
        int counter = 0;
        String space = " ";
        for (char c : input.toCharArray()) {
            if (c == space.charAt(0)) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isIBAN(String input) {
        char[] chars = input.toCharArray();
        String s = chars[0] + "" + chars[1];
        if (s.equals("DE")) {
            return true;
        }
        return false;
    }

    public static String toCamelCase(String input) {
        String space = " ";
        String output = "";
        boolean upperCase = false;

        for (char c : input.toCharArray()) {
            if (c == space.charAt(0)) {
                upperCase = true;
            }

            if (c != space.charAt(0) && upperCase) {
                output += String.valueOf(c).toUpperCase();
                upperCase = false;

            }
//            else if (c != space.charAt(0) && output.isEmpty()) {
//                output += String.valueOf(c).toUpperCase();
//            }
            else if (c != space.charAt(0)) {
                output += String.valueOf(c).toLowerCase();
            }
        }
        return output;
    }



}
