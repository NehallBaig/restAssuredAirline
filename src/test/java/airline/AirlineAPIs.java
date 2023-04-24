package airline;

import io.restassured.response.Response;
import restUtils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlineAPIs {

    //Currently, an airline is being created using a Map data structure.
    //However, additional overloaded methods will be added later to support the creation of airline objects using POJOs.
    public Response createAirline(Map<String,Object> createAirlinePayload){
        String endPoint = (String) Base.dataFromJsonFile.get("createAirLineEndPoint");
        return RestUtils.performPost(endPoint, createAirlinePayload, new HashMap<>());
    }
}
