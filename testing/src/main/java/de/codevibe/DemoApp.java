package de.codevibe;

import org.apache.commons.lang3.StringUtils;

public class DemoApp {

    public static void main(String[] args) {
        String s = "Ich bin ein sehr laaaaanger Text!!!";
        String k = StringUtils.abbreviate(s, 13);
        System.out.println(k);
    }

}
