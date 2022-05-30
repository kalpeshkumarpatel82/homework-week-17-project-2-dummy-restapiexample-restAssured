package com.restapiexample.dummy.restapiexample;
/* 
 Created by Kalpesh Patel
 */

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleEmployeeTest extends TestBase {
    @Test
    public void getSingleEmployee() {
        Response response = given()
                .pathParam("id", 24)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}

