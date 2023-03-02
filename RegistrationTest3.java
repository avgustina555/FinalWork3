package FinalWork3;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RegistrationTest3 extends AbstractTest3 {
    @Test
    public void submitForm() {
        RestAssured.baseURI = "https://test-stand.gb.ru";
        given().urlEncodingEnabled(true)
                .param("username", "GB202308")
                .param("password", "75fcc98aed")
                .post("/login")
                .then().statusCode(200);
    }
}


