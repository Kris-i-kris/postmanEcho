package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void test () {
        var text = "hello";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(400)
                .body("data", equalTo(text));
    }

}
