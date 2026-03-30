package de.codevibe.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderApp {

    public static void main(String[] args) throws IOException {

        try {
            InputStream auslesen = new FileInputStream("blah.txt");
            byte[] bytes = new byte[1024];
            auslesen.read(bytes);
            String s = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println(("Konnte nicht gelesen werden") + e.getMessage());
        } catch (IOException e) {
            System.out.println(("Konnte nicht gelesen werden") + e.getMessage());
        }

    }
}


