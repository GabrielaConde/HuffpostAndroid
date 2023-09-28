package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.By;

public class FrontPageClass extends BaseClass{

    public FrontPageClass(AndroidDriver driver){super(driver);}

    private By frontPageHeader = MobileBy.AccessibilityId("FRONT PAGE, back");


    private By frontPageTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView[1]");
    private By frontPageDescription = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView[2]");
    private By authorName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView[3]");
    private By authorDate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]");

    public Boolean isFrontPageTitleDescDisplayed(){ return driver.findElement(frontPageDescription).isDisplayed();}
    public Boolean isAuthorNameDisplayed(){ return driver.findElement(authorName).isDisplayed();}
    public Boolean isAuthorDateDisplayed(){ return driver.findElement(authorDate).isDisplayed();}

    //Bottom header
    private By changeTextSizeBtn = MobileBy.AccessibilityId("Change Text Size");
    private By openCommentsBtn = MobileBy.AccessibilityId("Open Comments");
    private By shareActicleBtn = MobileBy.AccessibilityId("Share Article");
    private By BookmarkIcon = MobileBy.AccessibilityId("Bookmark Article");


    public void clickOnBookmarkIcon(){
        WaitHelper.waitForElementDisplayed(driver,BookmarkIcon,40);
        driver.findElement(BookmarkIcon).click();
    }

    public void clickOnShareIcon(){
        WaitHelper.waitForElementDisplayed(driver,shareActicleBtn,40);
        driver.findElement(shareActicleBtn).click();
    }

    public void clickOnOpenCommentsBtn(){
       // WaitHelper.waitForElementDisplayed(driver,openCommentsBtn,40);
        driver.findElement(openCommentsBtn).click();
    }

    public void clickOnChangeSizeBtn(){
        WaitHelper.waitForElementDisplayed(driver,changeTextSizeBtn,40);
        driver.findElement(changeTextSizeBtn).click();
    }


    public Boolean isFrontPagaHeaderDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,frontPageHeader,40);
       return driver.findElement(frontPageHeader).isDisplayed();
    }


}
