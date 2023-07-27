package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driverInput)
    {
        this.driver = driverInput;
        PageFactory.initElements(driverInput,this);
    }
}
