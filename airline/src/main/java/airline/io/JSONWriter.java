package airline.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import airline.flight.persistence.Flight;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class JSONWriter {
    private static final ObjectMapper mapper = new ObjectMapper();

    
    public static boolean saveObjectToJSON(File directoryPath, File fileName, List<Flight> flightList, boolean appendMode, boolean useOldData) {
        //List<Flight> existingList = new ArrayList<>();
        
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

        //ile file = new File(directoryPath.getAbsolutePath() + "\\" + fileName);
        //f (file.exists() && file.length() != 0 && useOldData) {
        //   existingList = JSONReader.reader(directoryPath, fileName);
        //


        //existingList.add(flight);

        String json = mapper.writeValueAsString(flightList);
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
        } catch (JacksonException e) {
            return rawJson;
        }
    }

    public static boolean deleteJSONContent(File directoryPath, File fileName) {
        if (!directoryPath.exists()) {
            return false;
        }

        File fileExistsPath = new File(directoryPath.getAbsolutePath() + "\\" + fileName);

        if (!fileExistsPath.exists()) {
            return false;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directoryPath.getAbsolutePath() + "\\" + fileName, StandardCharsets.UTF_8))) {
            bw.write("");
            bw.flush();

            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
