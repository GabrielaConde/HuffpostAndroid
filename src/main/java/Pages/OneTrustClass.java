package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OneTrustClass extends BaseClass{

    public OneTrustClass(AndroidDriver driver){super(driver);}

    private By oneTrustLlb = By.xpath("Banner view Logo");
    private By AcceptAllBtn = By.id("com.huffingtonpost.android:id/btn_accept_cookies");

    public Boolean isOneTrustLblDisplayed(){
       return driver.findElement(oneTrustLlb).isDisplayed();
    }

    public void tapOnAcceptAllBtn(){
        driver.findElement(AcceptAllBtn).click();
    }
}
