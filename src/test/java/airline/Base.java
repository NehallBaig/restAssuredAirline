package airline;

import utils.JsonUtils;

import java.util.Map;

public class Base {

    //You can have different types of values such as int, boolean, double, and others.
    //Therefore, instead of using a map with the data type of map<String, String>, use map<String, Object>
    public static Map<String, Object> dataFromJsonFile;

    static {
        System.out.println("Env val = " + System.getProperty("env"));
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        try {
            dataFromJsonFile = JsonUtils.getJsonAsMap("airlines/environment/" + env + "/AirlineApiData.json");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
