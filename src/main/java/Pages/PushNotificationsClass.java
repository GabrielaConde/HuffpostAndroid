package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PushNotificationsClass extends BaseClass{
    public PushNotificationsClass(AndroidDriver driver) {super(driver);}

    private By pushNotificationHeader = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup");
    private By selectYourCategoriesHeader = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
    private By selectYourCategoriesText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
    private By breakingNewsLbl = MobileBy.AccessibilityId("Breaking News");
    private By huffpostMustReadsLbl = MobileBy.AccessibilityId("HuffPost Must-Reads");
    private By politicsAndElectionsLbl = MobileBy.AccessibilityId("Politics & Elections");
    private By extremismLbl = MobileBy.AccessibilityId("Extremism");
    private By raceInAmericaLbl =MobileBy.AccessibilityId("Race In America");
    private By artsAndEntertainmentLbl = MobileBy.AccessibilityId("Arts & Entertainment");

    private By breakingNewsSwitch = By.xpath("//android.widget.CheckBox[@content-desc=\"Breaking News\"]/android.widget.Switch");
    private By huffpostMustReadsSwitch = By.xpath("//android.widget.CheckBox[@content-desc=\"HuffPost Must-Reads\"]/android.widget.Switch");
    private By politicsAndElectionsSwitch = By.xpath("//android.widget.CheckBox[@content-desc=\"Politics & Elections\"]/android.widget.Switch");
    private By extremismSwitchSwith = By.xpath("//android.widget.CheckBox[@content-desc=\"Extremism\"]/android.widget.Switch");
    private By raceInAmericaSwitch = By.xpath("//android.widget.CheckBox[@content-desc=\"Race In America\"]/android.widget.Switch");
    private By artAndEntertainmenSwitch = By.xpath("//android.widget.CheckBox[@content-desc=\"Arts & Entertainment\"]/android.widget.Switch");

    public Boolean isNotificationHeaderDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,pushNotificationHeader,40);
        return driver.findElement(pushNotificationHeader).isDisplayed();
    }
    public Boolean isYourCategoriesHeaderDisplayed(){return driver.findElement(selectYourCategoriesHeader).isDisplayed();}
    public Boolean isYourCategoriesTextDisplayed(){ return driver.findElement(selectYourCategoriesHeader).isDisplayed();}
    public Boolean isBreakingNewsLblDisplayed(){return driver.findElement(breakingNewsLbl).isDisplayed();}
    public Boolean isHuffpostMustReadsLblDisplayed(){return driver.findElement(huffpostMustReadsLbl).isDisplayed();}
    public Boolean isPoliticsAndElectionsLblDisplayed(){return driver.findElement(politicsAndElectionsLbl).isDisplayed();}
    public Boolean isExtremismLblDisplayed(){return driver.findElement(extremismLbl).isDisplayed();}
    public Boolean isRaceInAmericaLblDisplayed(){return driver.findElement(raceInAmericaLbl).isDisplayed();}
    public Boolean isArtsAndEntertainmentLblDisplayed(){return driver.findElement(artsAndEntertainmentLbl).isDisplayed();}

    public void clickOnBreakingNewsSwitch(){driver.findElement(breakingNewsSwitch).click();}
    public void clickOnHuffpostMustReadsSwitch(){driver.findElement(huffpostMustReadsSwitch).click();}
    public void clickOnPoliticsAndElectionsSwitch(){driver.findElement(politicsAndElectionsSwitch).click();}
    public void clickOnExtremismSwitch(){driver.findElement(extremismSwitchSwith).click();}
    public void clickOnRaceInAmericaSwitch(){driver.findElement(raceInAmericaSwitch).click();}
    public void clickOnArtAndEntertainmentSwitch(){driver.findElement(artAndEntertainmenSwitch).click();}

}
