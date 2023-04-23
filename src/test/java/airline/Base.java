package airline;

import utils.JsonUtils;

import java.util.Map;

public class Base {
    public static Map<String, Object> dataFromJsonFile;

    static {
        System.out.println("Env val = " + System.getProperty("env"));
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        try {
            dataFromJsonFile = JsonUtils.getJsonAsMap("airlines/environment/" + env + "/AirlineApiData.json");
        } catch (Exception e) {

        }
    }
}
