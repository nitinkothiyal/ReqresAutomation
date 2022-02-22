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
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }
    @Test
    public void getDelayedResponse(){
        String queryParams = "delay=3";

        given().
        when().
                get(END_POINT+queryParams).
        then().
                statusCode(200).
                log().everything();
    }
}
