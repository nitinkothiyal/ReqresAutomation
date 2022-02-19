import org.testng.annotations.*;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class GetDelayedResponse {
    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public void getDelayedResponse(){
        String pathParams = "users";
        String queryParams = "delay=3";

        given().
        when().
                get(pathParams+queryParams).
        then().
                statusCode(200).
                log().everything();
    }
}
