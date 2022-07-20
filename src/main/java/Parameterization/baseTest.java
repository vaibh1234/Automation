package Parameterization;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class baseTest {

    public static Object[][] userProvider() throws Exception {
        CSVReader csvReader=new CSVReader(new FileReader(System.getProperty("user.dir")+"/src/main/resources/users.csv"));
        List<String[]>csvDataProvider=csvReader.readAll();
        Object[][]csvData=new Object[csvDataProvider.size()][];
        for(int i=0;i<csvDataProvider.size();i++){
            csvData[i]=csvDataProvider.get(i);
        }
        return csvData;
    }

    @DataProvider
    public static Object[][] userProvider123() throws Exception {
        Object[][] data=new Object[2][2];
        data[0][0]="vaibhav";
        data[0][1]="va";
        data[1][0]="Singh";
        data[1][1]="vaib";
        return data;
    }



















    @DataProvider(name = "userDetails")
    public static Object[][] readCsv() throws IOException, CsvException {
        CSVReader csvReader = new CSVReader(new FileReader(System.getProperty("user.dir")+"/src/main/resources/users.csv"));
        List<String[]> csvData=csvReader.readAll();
        Object[][] csvDataObject=new Object[csvData.size()][2];
        for (int i=0;i<csvData.size();i++) {
            csvDataObject[i]=csvData.get(i);
        }
        return  csvDataObject;
    }

   
    @DataProvider(name = "hello")
    public Object[][] hello(){
        Object[][] data=new Object[2][2];
        data[0][0]="Kumar";
        data[0][1]="Singh";
        data[1][0]="Kumar";
        data[1][1]="Kumar";
        return data;
    }

    @DataProvider(name = "getData")
    public Object[][] getData(){
    Object[][] data=new Object[2][3];

    return data;
    }
}
