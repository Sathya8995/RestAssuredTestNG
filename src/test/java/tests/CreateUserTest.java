package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.TestBase;
import utils.Endpoints;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserTest extends TestBase {

    @Test
    public void testCreateUser() {
        String requestBody = "{ \"name\": \"John\", \"job\": \"QA Engineer\" }";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(Endpoints.CREATE_USER)
                .then()
                .statusCode(201)
                .body("name", equalTo("John"))
                .body("job", equalTo("QA Engineer"));
    }
}
