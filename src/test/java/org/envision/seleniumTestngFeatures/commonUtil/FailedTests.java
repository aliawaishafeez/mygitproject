package org.envision.seleniumTestngFeatures.commonUtil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTests implements IRetryAnalyzer {
    int min=0, max=2;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(min<max && !iTestResult.isSuccess())
        {
            min++;
            return true;
        }
        return false;
    }
}
