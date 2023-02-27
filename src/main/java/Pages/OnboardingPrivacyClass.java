package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.List;

public class OnboardingPrivacyClass extends Onboarding{
    public OnboardingPrivacyClass(AndroidDriver driver){super(driver);}

    private By HPLogolbl = MobileBy.AccessibilityId("CMP Logo");
    private By WeValueYourPrivacyTitlelbl = By.id("com.huffingtonpost.android:id/tv_title");
    private By WeValueYourPrivacyMsglbl = By.id("com.huffingtonpost.android:id/tv_message");
    private By MoreOptionsBtn = By.id("com.huffingtonpost.android:id/btn_more_options");
    private By AgreeBtn = By.id("com.huffingtonpost.android:id/btn_agree");

    public Boolean IsHPLogoLblDisplayed() {
        WaitHelper.waitForElementDisplayed(driver,HPLogolbl,60);
        return driver.findElement(HPLogolbl).isDisplayed();}
    public Boolean IsWeValueYourPrivacyTitlelblDisplayed() { return driver.findElement(WeValueYourPrivacyTitlelbl).isDisplayed();}
    public Boolean IsWeValueYourProvacyMsgLblDisplayed() { return driver.findElement(WeValueYourPrivacyMsglbl).isDisplayed();}
    public void tapOnMoreOptions() {  driver.findElement(MoreOptionsBtn).click();}
    public OnboardingSelectLocationClass tapOnAgreeBtn(){
        driver.findElement(AgreeBtn).click();
        return new OnboardingSelectLocationClass(driver);
    }

}
