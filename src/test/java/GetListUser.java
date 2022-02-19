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
        baseURI = apiURI;
        basePath = apiPath;
    }

    @Test
    public void getCall(){
        String pathParams = "users?";
        String queryParams = "page=2";
        given().
                get(pathParams+queryParams).
                then().
                statusCode(200).
                log().all();
    }

}
