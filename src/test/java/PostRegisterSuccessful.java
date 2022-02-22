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
        baseURI = BASE_URI;
        basePath = BASE_PATH;

    }
    @Test
    public void postRegisterSuccessful(){

        //Storing keys and values
        JSONObject request = new JSONObject();
        request.put("email", EMAIL);
        request.put("password", PASSWORD);

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(REGISTER).
        then().
                assertThat().
                statusCode(200).
                log().all();
    }
}
