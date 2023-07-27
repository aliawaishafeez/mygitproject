package org.envision.seleniumTestngFeatures.commonUtil;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BrowserFactory {
    public static WebDriver driver;
    public static int i=0;
    public static void getBrowser(String BrowserName)
    {
        if(BrowserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","browserexes/chromedriver.exe");
            BrowserFactory.driver = new ChromeDriver();

        }
        else if (BrowserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","browserexes/msedgedriver.exe");
            BrowserFactory.driver = new EdgeDriver();

        }
        driver.manage().window().maximize();
    }

    public static void getUrl(String Url)
    {

        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void quitBrowser()
    {
        driver.quit();
    }

    public static void takeScreenshot() throws IOException {
        TakesScreenshot tss = (TakesScreenshot) driver;
        File src = tss.getScreenshotAs(OutputType.FILE);
        i++;
        File dest = new File("screenshots/sc"+i+".png");
        FileUtils.copyFile(src,dest);

    }

}
