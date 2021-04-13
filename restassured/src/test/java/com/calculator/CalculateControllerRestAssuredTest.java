package com.bank.account.restassured;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.post;

import io.restassured.RestAssured;

public class CalculateControllerRestAssuredTest {
    
    @BeforeAll
    public static void setBaseURI() {
        RestAssured.baseURI = "http://localhost:8080";
        get("/calculate").then().statusCode(200);
    }

    @Test
    public void testCalculateOperationDeriveSuccess() {
        String result = get("/calculate/derive/x^2").then().assertThat().statusCode(200).extract().path("result");
        assertEquals("2 x", result);
    }

    @Test
    public void testCalculateOperationLogarithmWithNegativeNumberFailure() {
        String result = get("/calculate/log/2l-8").then().assertThat().statusCode(200).extract().path("result");
        assertEquals("NaN", result);
    }
}
