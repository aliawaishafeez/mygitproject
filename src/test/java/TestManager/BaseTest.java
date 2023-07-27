package TestManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.envision.seleniumTestngFeatures.commonUtil.BrowserFactory;
import org.testng.annotations.*;

public class BaseTest {
    public static ExtentReports extentReports;
    public static ExtentTest et;
    @BeforeSuite
    public static void initiateTest()

    {
        ExtentSparkReporter esr = new ExtentSparkReporter("eagle/allReports.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(esr);
    }
    @AfterSuite
    public static void endReport()
    {
        extentReports.flush();
    }


    @Parameters({"browsername","url"})
    @BeforeMethod
    public static void openBrowser(@Optional("Chrome") String bn,@Optional("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") String Url) throws InterruptedException {
        String name = bn;
        String url = Url;
        BrowserFactory.getBrowser(name);
        et =extentReports.createTest("test1");
        et.log(Status.INFO,"Broswer Opened");


        BrowserFactory.getUrl(url);
        Thread.sleep(5000);

        et.log(Status.INFO, "URL opened");


    }

    @AfterMethod
    public void KillBroswer()
    {
        BrowserFactory.quitBrowser();
        et.log(Status.INFO,"broswer Closed");
    }
}
