package Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class BaseClass {
    protected AndroidDriver driver;

    public BaseClass(AndroidDriver Driver) {
        this.driver = Driver;

    }

    private By back = MobileBy.AccessibilityId("AppNavigation, back");
    private By FPback = By.xpath("//android.widget.Button[@content-desc=\" , back\"]/android.widget.ImageView");

    public void tapBack() {
        driver.findElement(back).click();
    }

    public void tapENTER() {
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void tapFPBack() {
        driver.findElement(FPback).click();
    }

    public void longPress(AndroidElement element) {
      /*  TouchActions action = new TouchActions(driver);
        action.longPress(element);
        action.perform();
        action.release();*/
    /*    AndroidTouchAction action = new AndroidTouchAction(driver);
        AndroidElement ele = element;
        action.longPress(ele);*/
    }


    public void androidBACK() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public String randomChar() {
        Random r = new Random();
        String word = "";
        for (int i = 1; i >= 4; i++) {
            word = word + r.nextInt(26);
        }
        return word;
    }

    public void scrollingUp(int amountOfScrolls) {
        int i;
        for (i = 1; i <= amountOfScrolls; i++) {
            scrollUp(1, 1);
        }
    }

    public void scrollToASpecificElement(WebElement elem) {
        boolean isFoundTheElement = elem.isDisplayed();
        while (isFoundTheElement == false) {
            scroll(1, 1);
            isFoundTheElement = elem.isDisplayed();
        }
    }



    public void scrollUntilElement(By locator) {
        Integer scrollCount = 0;
        boolean isFoundTheElement = driver.findElements(locator).size() > 0;
        while (isFoundTheElement == false && scrollCount <= 4) {
            scroll(1, 1);
            scrollCount++;
            isFoundTheElement = driver.findElements(locator).size() > 0;
        }
    }

 /*   public void scrollUntilElement(By locator){
        boolean isFoundTheElement = driver.findElements(locator).size() > 0;
        while (isFoundTheElement == false) {
            scroll(1, 1);
            isFoundTheElement = driver.findElements(locator).size() > 0;
        }
    }*/


    public void scrollUpUntilElement(By locator) {
        boolean isFoundTheElement = driver.findElements(locator).size() > 0;
        while (isFoundTheElement == false) {
            scrollUp(1, 1);
            isFoundTheElement = driver.findElements(locator).size() > 0;
        }
    }

    public void scroll(int x, int y) {
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.7);
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.2);
        TouchAction action = new TouchAction(driver);
        action.press(point(x, startY)).waitAction(waitOptions(ofSeconds(5))).moveTo(point(x, endY)).release().perform();
    }

    public void littleScroll(int x, int y) {
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.3);
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.0);
        TouchAction action = new TouchAction(driver);
        action.press(point(x, startY)).waitAction(waitOptions(ofSeconds(5))).moveTo(point(x, endY)).release().perform();
    }

    public void typeText(String text){
        Actions a = new Actions(driver);
        a.sendKeys(text);
        a.perform();
    }

    public void tinyScroll(int x, int y) {
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.2);
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.0);
        TouchAction action = new TouchAction(driver);
        action.press(point(x, startY)).waitAction(waitOptions(ofSeconds(5))).moveTo(point(x, endY)).release().perform();
    }


    public void scrollMultipleTimes(int times){
        for(int i= 1;i==times; i++){
            scroll(1,1);
        }
        }


    public void scrollOnSmallScreen(int x, int y) {
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.8);
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.0);
        TouchAction action = new TouchAction(driver);
        action.press(point(x, startY)).waitAction(waitOptions(ofSeconds(3))).moveTo(point(x, endY)).release().perform();
    }

    public void scrollUp(int x, int y) {
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.5);
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.2);
        TouchAction action = new TouchAction(driver);
        action.press(point(x, startY)).waitAction(waitOptions(ofSeconds(9))).moveTo(point(x, endY)).release().perform();
    }


    public void HorizontalScroll(int x, int y) {
        int startX = (int) (driver.manage().window().getSize().getWidth() * 0.90);
        int endX = (int) (driver.manage().window().getSize().getWidth() * 0.10);
        TouchAction action = new TouchAction(driver);
        action.press(point(startX, y)).waitAction(waitOptions(ofSeconds(3))).moveTo(point(endX, y)).release().perform();
    }


    public void swipeRight() {

        //The viewing size of the device
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(videoStepByStep));

        Dimension size = driver.manage().window().getSize();

        //Starting x location set to 5% of the width (near left)
        int endx = (int) (size.width * 0.05);
        //Ending x location set to 95% of the width (near right)
        int startx = (int) (size.width * 0.95);
        //y position set to mid-screen vertically
        int starty = size.height / 2;

        scrollHoriz(startx, starty, endx, starty);
    }

    public void smallScroll(int x ,int y){
        int startX = (int) (driver.manage().window().getSize().getWidth() * 0.40);
        int endX = (int) (driver.manage().window().getSize().getWidth() * 0.50);
        TouchAction action = new TouchAction(driver);
        action.press(point(startX, y)).waitAction(waitOptions(ofSeconds(3))).moveTo(point(endX, y)).release().perform();

    }
    public void scrollHoriz(int x1, int y1, int x2, int y2) {
        TouchAction action = new TouchAction(driver);
        action.press(point(x1, y1)).waitAction(waitOptions(ofSeconds(5))).moveTo(point(x2, y2)).release().perform();
    }


    public void swipeLeft() {
        //The viewing size of the device
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(videoStepByStep));

        Dimension size = driver.manage().window().getSize();

        //Starting x location set to 5% of the width (near left)
        int startx = (int) (size.width * 0.05);
        //Ending x location set to 95% of the width (near right)
        int endx = (int) (size.width * 0.95);
        //y position set to mid-screen vertically
        int starty = size.height / 2;


    }

}
