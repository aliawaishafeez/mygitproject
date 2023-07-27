package org.envision.seleniumTestngFeatures.commonUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ObjectRepoHandler {

    public static WebElement getElement(WebDriver driver, String locator_type, String locator_value)
    {
        if(locator_type.equalsIgnoreCase("xpath"))
        {
            return driver.findElement(By.xpath(locator_value));
        }
        else if (locator_type.equalsIgnoreCase("name"))
        {
            return driver.findElement(By.name(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("css"))
        {
            return driver.findElement(By.cssSelector(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("link"))
        {
            return driver.findElement(By.linkText(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("class"))
        {
            return driver.findElement(By.className(locator_value));
        }
        else if (locator_type.equalsIgnoreCase("tag"))
        {
            return driver.findElement(By.tagName(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("id"))
        {
            return driver.findElement(By.id(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("partialLink"))
        {
            return driver.findElement(By.partialLinkText(locator_value));
        }
        return null;


    }



    //--------------------------------------------------------

    public static List<WebElement> allWebelements(WebDriver driver, String locator_type, String locator_value)
    {
        if(locator_type.equalsIgnoreCase("xpath"))
        {
            return driver.findElements(By.xpath(locator_value));
        }
        else if (locator_type.equalsIgnoreCase("name"))
        {
            return driver.findElements(By.name(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("css"))
        {
            return driver.findElements(By.cssSelector(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("link"))
        {
            return driver.findElements(By.linkText(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("class"))
        {
            return driver.findElements(By.className(locator_value));
        }
        else if (locator_type.equalsIgnoreCase("tag"))
        {
            return driver.findElements(By.tagName(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("id"))
        {
            return driver.findElements(By.id(locator_value));
        }
        else if(locator_type.equalsIgnoreCase("partialLink"))
        {
            return driver.findElements(By.partialLinkText(locator_value));
        }
        return null;


    }


    //----------------------------------------------------
    //return elements by fluent wait


    public static WebElement ElementbyFluentWait(WebDriver driver, String locator_type, String locator_value)
    {
        FluentWait<WebDriver> fw = new WebDriverWait(driver, Duration.ofSeconds(100));
        fw.pollingEvery(Duration.ofSeconds(5));
        fw.ignoring(StaleElementReferenceException.class);

        if(locator_type.equalsIgnoreCase("xpath"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator_value)));
        }
        else if (locator_type.equalsIgnoreCase("name"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(locator_value)));
        }
        else if(locator_type.equalsIgnoreCase("css"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(locator_value)));
        }
        else if(locator_type.equalsIgnoreCase("link"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText(locator_value)));

        }
        else if(locator_type.equalsIgnoreCase("class"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(locator_value)));
        }
        else if (locator_type.equalsIgnoreCase("tag"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName(locator_value)));

        }
        else if(locator_type.equalsIgnoreCase("id"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(locator_value)));

        }
        else if(locator_type.equalsIgnoreCase("partialLink"))
        {
            return (WebElement) fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.partialLinkText(locator_value)));

        }
        return null;





    }
}
