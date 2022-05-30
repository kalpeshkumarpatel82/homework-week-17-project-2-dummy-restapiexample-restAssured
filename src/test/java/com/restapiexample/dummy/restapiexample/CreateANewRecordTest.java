package com.restapiexample.dummy.restapiexample;
/* 
 Created by Kalpesh Patel
 */

import com.restapiexample.dummy.model.RestAPIPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateANewRecordTest extends TestBase {

    @Test
    public void createANewRecord() {
        HashMap<String,Object> createRecord = new HashMap<>();
        createRecord.put("name","sheel");
        createRecord.put("salary","12500");
        createRecord.put("age","65");
        createRecord.put("id",104);
        RestAPIPojo restAPIPojo = new RestAPIPojo();
        restAPIPojo.setStatus("success");
        restAPIPojo.setData(createRecord);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restAPIPojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
