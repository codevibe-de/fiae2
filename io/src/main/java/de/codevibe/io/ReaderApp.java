package de.codevibe.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class ReaderApp {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Book> reader(File directoryPath, File filePath) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(directoryPath.getAbsolutePath() + "\\" + filePath, StandardCharsets.UTF_8))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                sb.append(line);
                sb.append("\n");
            }
            return mapper.readValue(sb.toString(), new TypeReference<List<Book>>() {});
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }



    /*public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(System.getProperty("user.dir") + "\\" + "blah.txt");

        try (BufferedReader br = new BufferedReader(new FileReader("blah.txt", StandardCharsets.UTF_8))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/
}
