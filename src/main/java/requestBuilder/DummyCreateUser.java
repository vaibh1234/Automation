package requestBuilder;

import apiPojo.CreateUserRequest;
import apiPojo.CreateUserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dzieciou.testing.curl.CurlLoggingRestAssuredConfigFactory;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;

public class DummyCreateUser extends baseApi{
    CreateUserResponse createUserResponse;
    CreateUserRequest createUserRequest;
    ObjectMapper objectMapper=new ObjectMapper();
    RestAssuredConfig config= CurlLoggingRestAssuredConfigFactory.createConfig();
    public void createAndExecuteRequest(CreateUserRequest createUserRequest) throws Exception{
        requestSpecification=requestSpecBuilder.setBaseUri("https://gorest.co.in/public/v2/users").setContentType("application/json").
                setBody(createUserRequest).addHeader("Authorization","Bearer b6cbbcff699128e70b3d19a398ea958b9ada58c71fdb75ef5735499c453bde85").setConfig(config).
                build();
        response= RestAssured.given().spec(requestSpecification).request(Method.POST);
        createUserResponse =objectMapper.readValue(response.asString(),CreateUserResponse.class);
        response.prettyPrint();
    }

}
