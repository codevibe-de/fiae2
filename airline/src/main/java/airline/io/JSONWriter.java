package airline.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.FileNameMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import airline.flight.persistence.Flight;
import tools.jackson.databind.ObjectMapper;

public class JSONWriter {
    private static final ObjectMapper mapper = new ObjectMapper();

    
    public static boolean writer (File directoryPath, File fileName, Flight flight, boolean appendMode) {
        List<Flight> existingList = new ArrayList<>();
        
        if (!directoryPath.exists()) {
            try {
                directoryPath.mkdirs();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        File fileExistsPath = new File(directoryPath.getAbsolutePath() + "\\" + fileName);

        if (!fileExistsPath.exists()) {
            try {
                fileExistsPath.createNewFile();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        File file = new File(directoryPath.getAbsolutePath() + "\\" + fileName);
        if (file.exists() && file.length() != 0) {
            existingList = JSONReader.reader(directoryPath, fileName);
        }


        existingList.add(flight);

        System.out.println(existingList);

        String json = mapper.writeValueAsString(existingList);
        String prettyJson = prettify(json);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directoryPath.getAbsolutePath() + "\\" + fileName, StandardCharsets.UTF_8, appendMode))) {
            bw.write(prettyJson);
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
        return rawJson;
    }
}
}
