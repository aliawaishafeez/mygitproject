package TestManager;

import PageObjects.LoginPage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.envision.seleniumTestngFeatures.commonUtil.BrowserFactory;

import org.envision.seleniumTestngFeatures.commonUtil.FailedTests;
import org.envision.seleniumTestngFeatures.commonUtil.TestListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.*;

import javax.annotation.Generated;
import java.io.IOException;
import java.lang.reflect.Method;

import static org.envision.seleniumTestngFeatures.commonUtil.BrowserFactory.driver;

@Listeners(TestListeners.class)
public class TestRunner extends BaseTest{


    @Test(retryAnalyzer = FailedTests.class)
    public void actualTest() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
//        lp.enterUsrname();
//        lp.enterpwd();
//        lp.clicKlogin();
//
       lp.enterUsrname().enterpwd().clicKlogin();

        et.log(Status.PASS, "Test Passed");



    }
}
