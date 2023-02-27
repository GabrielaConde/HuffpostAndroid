package Helpers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitHelper {
    public static boolean waitForVisibilityOf(WebDriver webDriver, WebElement locator, int timeOutInSeconds){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, timeOutInSeconds);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static boolean implicitWait(AndroidDriver driver, Integer secs){
        driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
        return true;
    }

    public static boolean WaitForElement(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 20);
        return true;
    }

    public static boolean waitForElementDisplayed(WebDriver webDriver, By locator, int timeOutInSeconds){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, timeOutInSeconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
