package restUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;


public class RestUtils {

    public static Response performPost(String endPoint, Object payload, Map<String, String> headers) {
        return RestAssured.given().log().all()
                .baseUri(endPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(payload)
                .post()
                .then().log().all().extract().response();
    }
}
