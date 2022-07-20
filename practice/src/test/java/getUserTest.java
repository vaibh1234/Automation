import Parameterization.baseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import requestBuilder.GetUser;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.LogManager.*;



public class getUserTest extends baseTest {




    @Test(dataProvider = "userProvider123")
    public void userLoginTest(String userName,String password){
        System.out.println(userName+" "+password);
    }


}
