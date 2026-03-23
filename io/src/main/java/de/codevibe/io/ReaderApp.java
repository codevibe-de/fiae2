package de.codevibe.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class ReaderApp {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("blah.txt", StandardCharsets.UTF_8);
    }

}
