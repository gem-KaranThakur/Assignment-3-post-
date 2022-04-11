import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
public class Assignment2 {
    public static void main(String[] args) {

        RestAssured.baseURI="https://gorest.co.in";
        RestAssured.basePath="/public/v2/users";
        JSONObject obj=new JSONObject();
        obj.put("name","karan singh Thakur");
        obj.put("email","karan@12gmail.com");
        obj.put("gender","male");
        obj.put("status","active");
        //use the headers after the given methods
        Response response=given().header("Content-Type","application/json")
                 .header("Authorization","Bearer "+ "52f3e15df951a85c92feb6f43c970e00be54cb7ff4a248478123e33bf2705fc8")
                .contentType("application/json")
                .relaxedHTTPSValidation().body(obj.toString())
                .post();
//        String ans= response.prettyPrint().toString();
 response.prettyPrint();
        //Assert.assertTrue(ans.contains("emma.wong@reqres.in"));
    }
}