package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Onboarding extends BaseClass{
    public Onboarding(AndroidDriver driver){super(driver);}

    private OnboardingPrivacyClass privacy;
    private OnboardingJoinHuffpostClass joinHuffpost;
    private OnboardingJoinHuffpostCommunity huffpostCommunity;
    private OnboardingSelectLocationClass edition;
    private OnboardingAlertsClass alerts;
    private SignInClass signIn;
    private By maybeLaterLnk = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View[4]/android.widget.TextView");
  //  private By skipIntroLnk = By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View[1]/android.widget.TextView\n");
    private By skipIntroLnk = By.xpath("//android.view.View[@content-desc=\"Skip Intro\"]/android.widget.TextView");
    public void tapOnMaybeLaterLnk() {driver.findElement(maybeLaterLnk).click();}
    public void tapOnSkipIntroLnk() {driver.findElement(skipIntroLnk).click();}

    public HomeClass skipIntro()throws InterruptedException{
        privacy = new OnboardingPrivacyClass(driver);
        OnboardingAlertsClass alerts;
        OnboardingSelectLocationClass edition = new OnboardingSelectLocationClass(driver);
     //   Thread.sleep(3000);
     //   edition= privacy.tapOnAgreeBtn();
        Thread.sleep(4000);
        alerts = edition.tapOnUseMyLocationBtn();
        Thread.sleep(2000);
        tapOnSkipIntroLnk();
        return new HomeClass(driver);
    }
    public SignInClass basicFullOnboarding()throws InterruptedException{
        privacy = new OnboardingPrivacyClass(driver);
        Thread.sleep(2000);
        edition= privacy.tapOnAgreeBtn();
        Thread.sleep(2000);
        alerts= edition.tapOnUseMyLocationBtn();
        Thread.sleep(2000);
        joinHuffpost = alerts.clickOnEnableAlerts();
        Thread.sleep(2000);
        huffpostCommunity = joinHuffpost.tapOnJoinHuffpostBtn();
        signIn = huffpostCommunity.clickOnCreateFreeAccountBtn();
        return new SignInClass(driver);
    }


}
