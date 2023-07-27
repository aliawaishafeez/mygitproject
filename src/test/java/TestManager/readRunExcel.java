package TestManager;

import org.envision.seleniumTestngFeatures.commonUtil.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.envision.seleniumTestngFeatures.commonUtil.BrowserFactory.*;

public class readRunExcel {




    @Test(dataProvider="testData",dataProviderClass = ExcelReader.class)
    public void test2(String username)
    {
        System.out.println(username);
        //System.out.println(password);
    }




}
