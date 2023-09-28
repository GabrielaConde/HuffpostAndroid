package Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.codec.digest.HmacUtils;
import org.openqa.selenium.By;

public class BottomMenuClass extends BaseClass{

    public BottomMenuClass(AndroidDriver driver){super(driver);}

    private By topNews = MobileBy.AccessibilityId("Top News");
 //   private By explore = MobileBy.AccessibilityId("Section List");
   private By explore = MobileBy.AccessibilityId("Explore, tab, 2 of 5");
  //  private By bookmarks = MobileBy.AccessibilityId("Bookmarks");
    private By bookmarks = MobileBy.AccessibilityId("Bookmarks, tab, 3 of 5");
    private By alerts = MobileBy.AccessibilityId("Alert History");
    private By mySettings= MobileBy.AccessibilityId("App Settings");

    public HomeClass tapOntopNews() {
        driver.findElement(topNews);
        return new HomeClass(driver);
    }
    public ExploreClass tapOnExplore() {
        driver.findElement(explore).click();
       return new ExploreClass(driver);
    }
    public BookmarkClass tapOnBookmarks() {
        driver.findElement(bookmarks).click();
        return new BookmarkClass(driver);
    }
    public AlertsClass tapOnAlerts() {
        driver.findElement(alerts).click();
        return new AlertsClass(driver);
    }
    public MySettingsClass tapOnMySettings() {
        driver.findElement(mySettings).click();
        return new MySettingsClass(driver);
    }




}
