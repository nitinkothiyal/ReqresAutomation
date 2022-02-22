import org.testng.annotations.*;
import org.testng.annotations.Test;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class GetListUser {
    @BeforeClass
    public void setup(){
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }

    @Test
    public void getCall(){
        String queryParams = "page=2";
        given().
                get(END_POINT2+queryParams).
                then().
                statusCode(200).
                log().all();
    }

}
