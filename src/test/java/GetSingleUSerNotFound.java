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
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public void singleUSerNotFound(){
        given().
                get("users/6").
        then().
                log().all();
    }
}
