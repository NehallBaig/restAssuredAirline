package airline;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static Map<String, Object> getCreateAirlinePayload(String id, String name, String country, String logo, String slogan, String head_quaters, String website, String established) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("country", country);
        map.put("logo", logo);
        map.put("slogan", slogan);
        map.put("head_quaters", head_quaters);
        map.put("website", website);
        map.put("established", established);
        return map;
    }
}
