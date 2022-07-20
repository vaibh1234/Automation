import Parameterization.baseTest;
import ReportingListener.extentReport;
import apiPojo.CreateUserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import requestBuilder.CreateUser;
import requestBuilder.GetUser;
import org.apache.logging.log4j.*;


public class createUserTest  {
    private  static Logger logger = (Logger) LogManager.getLogger(createUserTest.class);

    ObjectMapper objectMapper=new ObjectMapper();
    final String defaultRequest="{\"name\":\"Tenali\",\"gender\":\"male\",\"email\":\"tenali.123@15ce.com\",\"status\":\"active\"}";

    @Test
    public void createUser_01() throws Exception{
        CreateUserRequest createUserRequest=objectMapper.readValue(defaultRequest,CreateUserRequest.class);
        CreateUser createUser=new CreateUser();
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        createUserRequest.setName(generatedString);
        createUserRequest.setEmail(generatedString+"@gmail.com");
        createUser.createAndExecuteRequest(createUserRequest);
        logger.info(createUser.getResponse());
        if(createUser.getStatusCode()==201) {
            Assert.assertEquals(createUserRequest.getEmail(), createUser.getResponse().getEmail());
            Assert.assertEquals(createUserRequest.getName(), createUser.getResponse().getName());
            SoftAssert softAssert=new SoftAssert();
        }
    }

    @Test
    public void createUser_02() throws Exception{
        CreateUserRequest createUserRequest=objectMapper.readValue(defaultRequest,CreateUserRequest.class);
        CreateUser createUser=new CreateUser();
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        createUserRequest.setName(generatedString);
        createUserRequest.setEmail(generatedString+"@gmail.com");
        createUser.createAndExecuteRequest(createUserRequest);
        if(createUser.getStatusCode()==201) {
            Assert.assertEquals(createUserRequest.getEmail(), createUser.getResponse().getEmail());
            Assert.assertEquals(createUserRequest.getName(), createUser.getResponse().getName());
            SoftAssert softAssert=new SoftAssert();
        }
    }
    @Test
    public void createUser_03() throws Exception{
        CreateUserRequest createUserRequest=objectMapper.readValue(defaultRequest,CreateUserRequest.class);
        CreateUser createUser=new CreateUser();
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        createUserRequest.setName(generatedString);
        createUserRequest.setEmail(generatedString+"@gmail.com");
        createUser.createAndExecuteRequest(createUserRequest);
        if(createUser.getStatusCode()==201) {
            Assert.assertEquals(createUserRequest.getEmail(), createUser.getResponse().getEmail());
            Assert.assertEquals(createUserRequest.getName(), createUser.getResponse().getName());
            SoftAssert softAssert=new SoftAssert();
        }
    }



}
