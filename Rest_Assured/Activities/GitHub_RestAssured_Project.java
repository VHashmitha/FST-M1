package liveProject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import scala.collection.mutable.HashMap;
import scala.collection.mutable.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class GitHub_RestAssured_Project {
    //Specification Object
    RequestSpecification requestSpec ;
    // Response Specification
    ResponseSpecification responseSpec ;
    int sshKeyId;
    String sshkey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIHQGV72MH2hHcqBgeYxeDhKNnYUceo7QAn4QdzCsADnv";
    //Setup Method
    @BeforeClass
    public void setup(){
        // Request Specification
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com/user/keys")
                .addHeader("Authorization", "token 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")
                .addHeader("Content-Type","application/json")
                .build();

        //Response Specification
        responseSpec = new ResponseSpecBuilder()
                .expectResponseTime(lessThan(4000L))
                .expectBody("Key",equalTo(sshkey))
                .expectBody("title",equalTo("TestAPIKey"))
                .build();
    }
    @Test(priority=1)
    public void postRequestTest(){
        //RequestBody
        Map<String,Object> reqBody =new HashMap<>();
        reqBody.put("title","TestAPIKey");
        reqBody.put("key",sshkey);

        //Send Request
        Response response = given().spec(requestSpec).body(reqBody).when().post();
        sshKeyId = response.then().extract().path("id");
        //Assertions
        response.then().statusCode(201).spec(responseSpec);

    }

    @Test(priority=2)
    public void getRequestTest(){

        given().spec(requestSpec).pathParam("keyId",sshKeyId)
                .when().get("/{keyId}")
                .then().statusCode(200).spec(responseSpec);
    }

    @Test(priority=3)
    public void deleteRequestTest(){
        given().spec(requestSpec).pathParam("keyId",sshKeyId)
                .when().get("/{keyId}")
                .then().statusCode(204).spec(responseSpec);;

    }
}
