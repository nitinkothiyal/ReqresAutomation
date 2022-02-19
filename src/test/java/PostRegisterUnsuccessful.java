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

public class PostRegisterUnsuccessful {
    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public void postRegisterUnsuccessful(){
        String pathParams = "register";

        //Storing keys & values
        JSONObject request = new JSONObject();
        request.put("email", "sydney@fife");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(pathParams).
                then().
                statusCode(400).
                log().all();
    }
}
