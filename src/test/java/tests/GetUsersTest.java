package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.TestBase;
import utils.Endpoints;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUsersTest extends TestBase {

    @Test
    public void testGetUsers() {
        given()
                .when().get(Endpoints.GET_USERS)
                .then()
                .statusCode(200)
                .body("data", notNullValue())
                .body("page", equalTo(2));
    }
}
