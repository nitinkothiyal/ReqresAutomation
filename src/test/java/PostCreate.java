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

public class PostCreate {
    @BeforeClass
    public void setup(){
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }
    @Test
    public void postCreate(){

        //Storing key and values in json object
        JSONObject request = new JSONObject();
        request.put("name", NAME);
        request.put("job", JOB);

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(END_POINT).
        then().
                assertThat().
                statusCode(201).
                log().all();
    }
}
