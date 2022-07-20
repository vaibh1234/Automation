package requestBuilder;

import apiPojo.CreateUserRequest;
import apiPojo.CreateUserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dzieciou.testing.curl.CurlLoggingRestAssuredConfigFactory;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class CreateUser extends baseApi {
    CreateUserResponse createUserResponse;
    ObjectMapper objectMapper=new ObjectMapper();
    RestAssuredConfig config = CurlLoggingRestAssuredConfigFactory.createConfig();


    public void createAndExecuteRequest( CreateUserRequest createUserRequest) {
        try{
           requestSpecification=    requestSpecBuilder.setContentType("application/json").setBaseUri("https://gorest.co.in/public/v2/users").setBody(createUserRequest)
                    .addHeader("Authorization","Bearer b6cbbcff699128e70b3d19a398ea958b9ada58c71fdb75ef5735499c453bde85").setConfig(config).build();
              response=  restAssured.given().spec(requestSpecification).request(Method.POST);

        CreateUserResponse createUserResponse=objectMapper.readValue(response.asString(),CreateUserResponse.class);
        this.createUserResponse=createUserResponse;}
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public CreateUserResponse getResponse(){
        return createUserResponse;
    }

    public int getStatusCode(){
        return response.getStatusCode();
    }

}
