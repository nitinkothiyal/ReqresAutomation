import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.*;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class PostRegisterSuccessful {
    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;

    }
    @Test
    public void postRegisterSuccessful(){
        String pathParams = "register";

        //Storing keys and values
        JSONObject request = new JSONObject();
        request.put("email", "eve.holt@reqres.in");
        request.put("password", "pistol");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(pathParams).
        then().
                statusCode(200).
                log().all();
    }
}
