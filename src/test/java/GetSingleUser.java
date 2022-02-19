import org.testng.annotations.*;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class GetSingleUser {
    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public void getCall(){
        String pathParams = "users/2";
        given().
                get(pathParams).
                then().
                statusCode(200).
                log().all();
    }
}
