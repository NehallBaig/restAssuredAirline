package airline;

import io.restassured.response.Response;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.Map;

@Listeners(TestListener.class)
public class AirlineTest extends AirlineAPIs {

    // Currently, a class is being extended to access the properties of AirlineAPIs,
    // but it is also possible to create an object of the AirlineAPIs class directly.
    @Test
    public void createAirline() {

        Map<String, Object> payload = Payloads.getCreateAirlinePayload("78767887137", "Quatar Airways", "Quatar", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png", "Going Places Together", "Qatar Airways Towers, Doha, Qatar", "www.qatarairways.com", "1994");
        Response response = createAirline(payload);
        Assert.assertEquals(response.statusCode(), 200);
        //"https://api.instantwebtools.net/v1/airlines";
    }
}
