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

public class UpdateARecordTest extends TestBase {

    @Test
    public void updateARecord() {
        HashMap<String,Object> createRecord = new HashMap<>();
        createRecord.put("name","Hriday");
        RestAPIPojo restAPIPojo = new RestAPIPojo();
        restAPIPojo.setData(createRecord);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restAPIPojo)
                .when()
                .put("/update/21");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
