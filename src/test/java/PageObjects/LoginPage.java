package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

   public LoginPage(WebDriver driver)
   {
       super(driver);
   }

   @FindBy(name = "username")
    private static WebElement usernameField;

   @FindBy(name = "password")
    private static WebElement passwordField;

   @FindBy(xpath = "//button[normalize-space()='Login']")
   private static WebElement LoginBtn;


   public LoginPage enterUsrname() throws InterruptedException {
       usernameField.sendKeys("Admin");
       Thread.sleep(3000);
       return this;

   }

    public LoginPage enterpwd() throws InterruptedException {
        passwordField.sendKeys("admin123");
        Thread.sleep(3000);
        return this;
    }

    public Dashboard clicKlogin()
    {
        LoginBtn.click();
        return new Dashboard(super.driver);

    }


}
