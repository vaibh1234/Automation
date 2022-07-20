import apiPojo.CreateUserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import customListeners.retry;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import requestBuilder.DummyCreateUser;

public class CreateUserDummyTest {
    final String defaultRequest="{\"name\":\"Tenali\",\"gender\":\"male\",\"email\":\"tenali.123@15ce.com\",\"status\":\"active\"}";
    ObjectMapper objectMapper= new ObjectMapper();

    @Test(retryAnalyzer = retry.class)
    public void DummyTest() throws Exception{
        CreateUserRequest createUserRequest;
        createUserRequest=objectMapper.readValue(defaultRequest,CreateUserRequest.class);
        String randomString= RandomStringUtils.randomAlphabetic(10);
        createUserRequest.setEmail(randomString+"@gmail.com");
        createUserRequest.setName(randomString);
        DummyCreateUser dummyCreateUser=new DummyCreateUser();
        dummyCreateUser.createAndExecuteRequest(createUserRequest);
        Assert.fail();
    }
}
