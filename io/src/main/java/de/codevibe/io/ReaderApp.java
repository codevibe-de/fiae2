package de.codevibe.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReaderApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("blah.txt", StandardCharsets.UTF_8, true))) {
            bw.write("Test");
            bw.newLine();
            bw.write("asd");
            bw.flush();
        }

        System.out.println(System.getProperty("user.dir") + "\\" + "blah.txt");

        try (BufferedReader br = new BufferedReader(new FileReader("blah.txt", StandardCharsets.UTF_8))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
