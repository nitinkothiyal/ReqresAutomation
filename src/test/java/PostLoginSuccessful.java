import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static Utils.Constants.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class PostLoginSuccessful {
    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public void postLoginSuccessful(){
        String endPoint = "login";

        //Storing keys & values
        JSONObject request = new JSONObject();
        request.put("email", "eve.holt@reqres.in");
        request.put("password", "cityslicka");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(endPoint).
        then().
                statusCode(200).
                log().everything();
    }
}
