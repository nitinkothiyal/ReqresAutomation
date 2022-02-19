import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class PostCreate {
    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public void postCreate(){
        String pathParams = "users";

        //Storing key and values in json object
        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "leader");


        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(pathParams).
        then().
                statusCode(201).
                log().all();
    }
}
