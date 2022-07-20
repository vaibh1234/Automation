package requestBuilder;
import apiPojo.GetUserResponse;
import constants.BasePath;
import constants.BaseUriPath;
import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.http.Method;
import com.fasterxml.jackson.databind.*;

import java.util.List;


public class GetUser extends baseApi {
    List <GetUserResponse>  getUserResponse;
    ObjectMapper objectMapper=new ObjectMapper();

public void requestCreateAndExecute()  {
    try {
        requestSpecification=requestSpecBuilder.setContentType("application/json").setBaseUri("https://gorest.co.in/public/v2/users").
                addHeader("Authorization","Bearer ACCESS-TOKEN").
                addQueryParam("page","1") .build();
            response = restAssured.given().spec(requestSpecification).request(Method.GET);
           List <GetUserResponse>  getUserResponse =  objectMapper.readValue(response.asString(), new TypeReference<List<GetUserResponse>>(){});
           this.getUserResponse=getUserResponse;
           response.prettyPeek();
    }catch (Exception e){
        e.printStackTrace();
    }
}


    public List <GetUserResponse> getResponsePojo() {
        return  getUserResponse;
    }

    public int gethttpResponseCode() {
        return response.getStatusCode();
    }




}
