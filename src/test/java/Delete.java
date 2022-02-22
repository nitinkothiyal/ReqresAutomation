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
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }
    @Test
    public static void delete(){
        String pathParams = "/2";
        given().
                delete(END_POINT).
        then().
                assertThat().
                statusCode(204).
                log().all();
    }
}
