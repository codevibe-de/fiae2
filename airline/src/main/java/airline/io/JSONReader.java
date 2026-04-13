package airline.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import airline.flight.persistence.Flight;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class JSONReader {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Flight> reader(File directoryPath, File fileName) {
        StringBuilder sb = new StringBuilder();
        File file = new File(directoryPath.getAbsolutePath() + "\\" + fileName);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                sb.append(line);
            }
            return mapper.readValue(sb.toString(), new TypeReference<List<Flight>>() {
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }
}
