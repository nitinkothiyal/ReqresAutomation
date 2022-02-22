import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.*;

import static Utils.Constants.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

/*
RestAsssured BDD
API Testing Automation Framework
Created by Nitin Kothiyal
*/


public class E2E {

    @BeforeClass
    public void setup(){
        baseURI = BASE_URI;
        basePath = BASE_PATH;
    }
    @Test
    public void getCall(){

        given().
                get(END_POINT2+QUERY_PARAMS).
        then().
        body("data[1].last_name", equalTo("Ferguson")).
                assertThat().
                statusCode(200).
                log().body();

    }

    @Test
    public void postCall() {
        JSONObject request = new JSONObject();

        //Storing key and values in json object
        request.put(NAME, JOB);
        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(END_POINT).

        then().statusCode(201).log().all();

    }
    @Test
    public void patchCall(){

        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "zion resident");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        patch(baseURI+basePath+END_POINT).
        //patch("https://reqres.in/api/users").
        then().
                statusCode(200).log().all();


    }

    @Test
    public void deleteCall(){
        String pathParams = "/2";
        JSONObject request = new JSONObject();
        request.put("name", "Kuldeep");
        
        given().
        delete(END_POINT+pathParams).
                then().
                statusCode(204).log().all();

    }

}
