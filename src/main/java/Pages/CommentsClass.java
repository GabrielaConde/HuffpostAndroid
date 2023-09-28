package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CommentsClass extends BaseClass{

    public CommentsClass (AndroidDriver driver){super(driver);}

    private By commentsHeader = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
    private By spotCommentsWidget = By.id("spot-comments-widget");

    public Boolean isCommentsHeaderDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,commentsHeader,40);
        return driver.findElement(commentsHeader).isDisplayed();
    }

    public Boolean isCommentsWidgetDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,spotCommentsWidget,40);
        return driver.findElement(spotCommentsWidget).isDisplayed();
    }
}
