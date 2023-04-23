package utils;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;

public class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, Object> getJsonAsMap(String jsonFileName) {
        Map<String, Object> data = null;
        try {
            String completeJsonFilePath = System.getProperty("user.dir") + "/src/test/java/resources/" + jsonFileName;
            data = objectMapper.readValue(new File(completeJsonFilePath), new TypeReference<>() {
            });
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;

    }
}
