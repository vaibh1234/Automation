package customListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private static int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult){
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
