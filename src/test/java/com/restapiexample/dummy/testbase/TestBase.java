package com.restapiexample.dummy.testbase;
/* 
 Created by Kalpesh Patel
 */

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://dummy.restapiexample.com";
        RestAssured.basePath = "/api/v1";

    }
}
