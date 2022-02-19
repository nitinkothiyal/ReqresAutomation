import org.testng.annotations.*;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/

public class Delete {

    @BeforeClass
    public void setup(){
        baseURI = apiURI;
        basePath = apiPath;
    }
    @Test
    public static void delete(){
        String pathParams = "users/2";
        given().
                delete(pathParams).
                then().
                statusCode(204).log().all();
    }
}
