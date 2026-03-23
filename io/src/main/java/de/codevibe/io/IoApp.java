package de.codevibe.io;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IoApp {

    public static void main(String[] args) {
        try {
            InputStream inStream = new FileInputStream("blah.txt");
            byte[] bytes = new byte[1000];
            inStream.read(bytes);
            String s = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(s);
        }
        catch(FileNotFoundException e) {
            System.out.println("Uh oh, nicht gefunden: " + e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Uh oh, Fehler beim Lesen: " + e.getMessage());
        }
    }

}
