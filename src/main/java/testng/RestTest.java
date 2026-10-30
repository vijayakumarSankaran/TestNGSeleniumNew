package testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class RestTest {

    @Test
    public void testGetPostById() {
    	  RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

          Response response = RestAssured
                  .given()
                  .when()
                  .get("/posts/1");
          

          // Read entire body as String
          String responseBody = response.getBody().asString();

          // Print or use it
          System.out.println("Response Body:");
          System.out.println(responseBody);
          assertEquals(200, response.getStatusCode());
          JsonPath json = response.jsonPath();
          int id = json.getInt("id");
          int userId = json.getInt("userId");
          String title = json.getString("title");

          assertEquals(1, id);
          assertEquals(1, userId);
          System.out.println("Title: " + title);
    }
}



