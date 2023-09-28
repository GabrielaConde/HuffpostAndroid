package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AccountDetailsClass extends BaseClass{
    public AccountDetailsClass(AndroidDriver driver){super(driver);}

    private By accountEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]");
    private By accountName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
    private By logOut = By.xpath("//android.view.View[@content-desc=\"Log Out\"]/android.widget.TextView");
    private By editProfile = By.xpath("//android.view.View[@content-desc=\"Edit Profile\"]/android.widget.TextView");
    private By accountImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");

    private By closeBtn = By.xpath("//android.widget.Button[@content-desc=\"ACCOUNT DETAILS, back\"]/android.view.ViewGroup/android.widget.ImageView");

 public void clickOnLogOut(){
     WaitHelper.waitForElementDisplayed(driver,logOut,40);
     driver.findElement(logOut).click();
 }

 public void closeAccDetails() {driver.findElement(closeBtn).click();}
    public Boolean isAccountEmailDisplayed(){ return driver.findElement(accountEmail).isDisplayed();}
    public Boolean isAccountNamelDisplayed(){ return driver.findElement(accountName).isDisplayed();}
    public Boolean isAccountImageDisplayed(){ return driver.findElement(accountImage).isDisplayed();}

    public EditProfileScreen tapOnEditProfileBtn() {
     driver.findElement(editProfile).click();
     return new EditProfileScreen(driver);
    }
    public void tapOnLogOutBtn(){
      driver.findElement(logOut).click();
    }


}
