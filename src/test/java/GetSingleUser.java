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
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }
    @Test
    public void getCall(){
        given().
                get(END_POINT).
                then().
                statusCode(200).
                log().all();
    }
}
