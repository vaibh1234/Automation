package ReportingListener;


import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Locale;

public class extentReport {
    public ExtentSparkReporter extentReporter;
    public ExtentReports extent;
    public ExtentTest extentTest;

    @BeforeTest
    public void setReport(){
extentReporter=new ExtentSparkReporter("/Users/vaibhavsingh/Desktop/reports/extent.html");
extentReporter.config().setEncoding("utf-8");
extentReporter.config().setDocumentTitle("Test Suite of Don Vaibhav");
extentReporter.config().setReportName("Vaibhav Singh");
extentReporter.config().setTheme(Theme.DARK);

extent=new ExtentReports();
extent.attachReporter(extentReporter);
extent.setSystemInfo("BuildNumber","12321");

    }

    @AfterTest
    public void endReport(){
        extent.flush();
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if(result.getStatus()==ITestResult.SUCCESS){
            String methodName=result.getMethod().getMethodName();
            String logtest="<b>"+"TEST CASE : -" + methodName + "passed" + "<b/>";
            Markup mu= MarkupHelper.createLabel(logtest, ExtentColor.GREEN);
            extentTest.pass(mu);

        }
        else if(result.getStatus()==ITestResult.FAILURE){

        }
        if(result.getStatus()==ITestResult.SKIP){}
    }


}
