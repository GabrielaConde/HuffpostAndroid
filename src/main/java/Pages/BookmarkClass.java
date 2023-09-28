package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BookmarkClass extends BaseClass{

    public BookmarkClass(AndroidDriver driver){super(driver);}

    private By noBookmarksText = MobileBy.AccessibilityId("You haven't bookmarked anything yet!");
    private By tapToBookmarkText = MobileBy.AccessibilityId("Tap the bookmark icon to save articles to read later.");
    private By findStoriesBtn = MobileBy.AccessibilityId("Find stories");
    private By BookmarksText = MobileBy.AccessibilityId("Log in or create a free account to save and sync bookmarks across devices.");
    private By logIn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup");
    private By BookmarksHeader = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup");
    private By fstCell = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.View/android.view.ViewGroup[1]\n");
    private By BookmarkIcon = By.xpath("//android.widget.Button[@content-desc=\"Remove Bookmark\"]/android.widget.ImageView");
    private By shareIcon = By.xpath("//android.widget.Button[@content-desc=\"Share Article\"]/android.widget.ImageView");

    public Boolean isCellDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,fstCell,40);
        return driver.findElement(fstCell).isDisplayed();
    }

    public void clickOnBookmarkIcon(){
        WaitHelper.waitForElementDisplayed(driver,BookmarkIcon,40);
        driver.findElement(BookmarkIcon).click();
    }
    public Boolean isNoBookmarksTextDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,noBookmarksText,40);
       return driver.findElement(noBookmarksText).isDisplayed();
    }
    public Boolean isTapToBookmarkTextDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,tapToBookmarkText,40);
        return driver.findElement(tapToBookmarkText).isDisplayed();
    }

    public HomeClass tapFindStoriesBtn(){
        WaitHelper.waitForElementDisplayed(driver,findStoriesBtn,40);
        driver.findElement(findStoriesBtn).click();
        return new HomeClass(driver);
    }

    public Boolean isBookmarkHeaderDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,BookmarksHeader,40);
       return driver.findElement(BookmarksHeader).isDisplayed();
    }

    public Boolean isBookmarksTextDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,BookmarksText,40);
        return driver.findElement(BookmarksText).isDisplayed();
    }
    public SignInClass tapOnLogInBtn(){
        WaitHelper.waitForElementDisplayed(driver,logIn,40);
        driver.findElement(logIn).click();
        return new SignInClass(driver);
    }
}
