package de.codevibe.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import tools.jackson.databind.ObjectMapper;

public class WriterApp {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static boolean writer (File directory, File file, String input, boolean appendMode) {

        if (!directory.exists()) {
            try {
                directory.mkdirs();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directory.getAbsolutePath() + "\\" + file, StandardCharsets.UTF_8, appendMode))) {
            bw.write(input);
            bw.flush();

            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static String prettify(String rawJson) {
    try {
        Object json = mapper.readValue(rawJson, Object.class);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
    } catch (Exception e) {
        return rawJson; // Fallback
    }
    }
}
