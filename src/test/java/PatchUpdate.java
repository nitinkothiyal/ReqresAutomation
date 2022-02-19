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

public class PatchUpdate {
    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public void patchUpdate(){
        String pathParams = "users/2";
        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "zion resident");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                patch(pathParams).
                then().
                statusCode(200).
                log().all();
    }
}
