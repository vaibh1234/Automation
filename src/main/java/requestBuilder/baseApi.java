package requestBuilder;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

abstract public  class baseApi {
    RestAssured restAssured = new RestAssured();
    Response response;
    RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    RequestSpecification requestSpecification;

}
