package airline;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AirlineTest {

    @Test
    public void createAirline() {


//         Map<String, String> data = JsonUtils.getJsonAsMap("airlines/environment/"+env+"/AirlineApiData.json");
        String endPoint = (String) Base.dataFromJsonFile.get("createAirLineEndPoint");
        Map<String, Object> payload = Payloads.getCreateAirlinePayload("78767887133", "Quatar Airways", "Quatar", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png", "Going Places Together", "Qatar Airways Towers, Doha, Qatar", "www.qatarairways.com", "1994");
        Response response = RestUtils.performPost(endPoint, payload, new HashMap<>());

        Assert.assertEquals(response.statusCode(), 200);


        //"https://api.instantwebtools.net/v1/airlines";
    }
}
