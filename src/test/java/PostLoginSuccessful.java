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
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }
    @Test
    public void postLoginSuccessful(){

        //Storing keys & values
        JSONObject request = new JSONObject();

        request.put("email", EMAIL);
        request.put("password", PASSWORD);

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(LOGIN).
        then().
                assertThat().
                statusCode(200).
                log().all();
    }
}
