

import static io.restassured.RestAssured.given;

public class Authi {
    public static void main(String[] args) {

//it is premptive means we authentican credential before the server given an unauthorized response
        //extra steps se bach gye
        given().auth().preemptive().
                basic("postman","password").when().//is the credentials are correct we will be authenticated otherwise not
                get("https://postman-echo.com/basic-auth").
                then().log().body();



    }
}