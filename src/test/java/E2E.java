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

        body("data[1].last_name", equalTo("Ferguson")).
                log().body();

    }

    @Test
    public void postCall() {
        String pathParams = "users";
        JSONObject request = new JSONObject();

        //Storing key and values in json object
        request.put("name", "Abhishek");
        request.put("job", "Principal");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post(pathParams).

        then().statusCode(201).log().all();

    }
    @Test
    public void patchCall(){
        String pathParams = "users";

        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "zion resident");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        patch(baseURI+basePath+pathParams).
        //patch("https://reqres.in/api/users").
        then().
                statusCode(200).log().all();


    }

    @Test
    public void deleteCall(){
        String pathParams = "users/2";
        JSONObject request = new JSONObject();
        request.put("name", "Kuldeep");
        
        given().
        delete(pathParams).
                then().
                statusCode(204).log().all();

    }

}
