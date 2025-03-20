package tests;

import org.testng.annotations.Test;
import utils.TestBase;
import utils.Endpoints;

import static io.restassured.RestAssured.*;

public class DeleteUserTest extends TestBase {

    @Test
    public void testDeleteUser() {
        given()
                .pathParam("id", 2)
                .when()
                .delete(Endpoints.DELETE_USER)
                .then()
                .statusCode(204);
    }
}
