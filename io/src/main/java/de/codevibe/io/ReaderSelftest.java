package de.codevibe.io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderSelftest {

    public static void main(String[] args) throws IOException {

        File filetxt = new File("C:\\Users\\robme\\Documents\\JavaDatein\\TestdateiTest.txt");
        System.out.println("Bist du eine Datei ?" + filetxt.isFile());
        System.out.println("Kann man dich lesen ?" + filetxt.canRead());
        String s = Files.readString(Path.of("C:\\Users\\robme\\Documents\\JavaDatein\\TestdateiTest.txt"), StandardCharsets.UTF_8);
        System.out.println(s);

        File fileJSON = new File("C:\\Users\\robme\\Documents\\JavaDatein\\JSONDateinTest.JSON");
        System.out.println("bist du eine Datei ?" + fileJSON.isFile());
        System.out.println("Kann man dich lesen ?" + fileJSON.canRead());
        String f = Files.readString(Path.of("C:\\Users\\robme\\Documents\\JavaDatein\\JSONDateinTest.JSON"), StandardCharsets.UTF_8);
        System.out.println(f);

    }

}
