import org.testng.annotations.*;
import org.testng.annotations.Test;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class GetSingleUSerNotFound {
    @BeforeClass
    public void setup(){
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }
    @Test
    public void singleUSerNotFound(){
        String pathParams = "/6";
        given().
                get(END_POINT+pathParams).
        then().
                log().all();
    }
}
