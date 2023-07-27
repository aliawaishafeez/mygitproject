package org.envision.seleniumTestngFeatures.commonUtil;

import org.envision.seleniumTestngFeatures.commonUtil.BrowserFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import java.io.IOException;

public class TestListeners implements ITestListener {


    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        try {
            BrowserFactory.takeScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {


    }

    public void onFinish(ITestContext iTestContext) {

    }
}
