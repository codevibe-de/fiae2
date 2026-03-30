package de.codevibe.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileApp {

    public static void main(String[] args) throws IOException {
        File file = new File(".");
        File[] contents = file.listFiles();
        for (File f : contents) {
            System.out.println(f.getAbsolutePath()); // work-dir + relative-path
            System.out.println("Ist es eine Datei? " + f.isFile());
            System.out.println("Ist es ein Verzeichnis? " + f.isDirectory());
        }
//
//        file.getName();
//        file.length();
//        file.getAbsolutePath();
//
//        file.createNewFile();
//        file.delete();
//
//        file.mkdir();
//        file.listFiles();
//
    }
}
