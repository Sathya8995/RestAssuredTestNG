package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.TestBase;
import utils.Endpoints;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UpdateUserTest extends TestBase {

    @Test
    public void testUpdateUser() {
        String requestBody = "{ \"name\": \"Updated Name\", \"job\": \"Updated Job\" }";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .pathParam("id", 2)
                .when()
                .put(Endpoints.UPDATE_USER)
                .then()
                .statusCode(200)
                .body("name", equalTo("Updated Name"));
    }
}
