package customListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Succes passed" + result.getName());
    }
}
