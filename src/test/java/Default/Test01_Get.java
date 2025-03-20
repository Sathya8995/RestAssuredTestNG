package Default;

import static io.restassured.RestAssured.*;
import org.hamcrest.CoreMatchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Test01_Get {
    @Test
    void test_01(){
        Response response = RestAssured.get("https://api.restful-api.dev/objects");
        int status = response.getStatusCode();
        Assert.assertEquals(200,status);
    }

    @Test
    void test_02(){
        given().get("https://api.restful-api.dev/objects").then().statusCode(200).body("data[0].color",CoreMatchers.equalTo("Cloudy White"));

    }
}
