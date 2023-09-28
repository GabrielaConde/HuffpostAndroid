package Pages;

import Helpers.WaitHelper;
import com.mongodb.annotations.ThreadSafe;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MySettingsClass extends BaseClass{

    public MySettingsClass(AndroidDriver driver){super(driver);}
    private By signOutMsg = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    private By signUpMsg = By.xpath("//android.view.View[@content-desc=\"Sign up or log into your HuffPost account\"]/android.widget.TextView");
    private By signInIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View/android.view.ViewGroup/android.widget.ImageView");
    private By welcomeText = By.xpath("//android.view.View[@content-desc=\"Welcome, Familia!\"]/android.widget.TextView");
    private By readidngStats = By.xpath("//android.view.View[@content-desc=\"Your Reading Stats\"]/android.widget.TextView");

    private By editionLbl = By.xpath("//android.view.View[@content-desc=\"Current edition U.S.. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[1]");
    private By editonEspanaLbl = By.xpath("//android.view.View[@content-desc=\"Current edition España. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]\n");
    private By editionItaliaLbl = By.xpath("//android.view.View[@content-desc=\"Current edition Italia. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]\n");
    private By editionJapanLbl = By.xpath("//android.view.View[@content-desc=\"Current edition Japan. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]\n");
    private By editionKoreaLbl = By.xpath("//android.view.View[@content-desc=\"Current edition Korea. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]\n");
    private By editionGreceeLbl = By.xpath("//android.view.View[@content-desc=\"Current edition Grece. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]\n");
    private By editionUKLbl = By.xpath("//android.view.View[@content-desc=\"Current edition UK. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]\n");
    private By editionFranceLbl = By.xpath("//android.view.View[@content-desc=\"Current edition France. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]\n");


    public EditionsScreen clickOnEditions() {
        driver.findElement(editionLbl).click();
        return new EditionsScreen(driver);
    }

    public EditionsScreen selectEspana(){
        driver.findElement(editonEspanaLbl).click();
        return new EditionsScreen(driver);
    }
    public EditionsScreen selectFrance(){
        driver.findElement(editionFranceLbl).click();
        return new EditionsScreen(driver);
    }
    public EditionsScreen selectGrece(){
        driver.findElement(editionGreceeLbl).click();
        return new EditionsScreen(driver);
    }
    public EditionsScreen selectItaly(){
        driver.findElement(editionItaliaLbl).click();
        return new EditionsScreen(driver);
    }
    public EditionsScreen selectJapan(){
        driver.findElement(editionJapanLbl).click();
        return new EditionsScreen(driver);
    }
    public EditionsScreen selectKorea(){
        driver.findElement(editionKoreaLbl).click();
        return new EditionsScreen(driver);
    }
    public EditionsScreen selectUK()
    {driver.findElement(editionUKLbl).click();
        return new EditionsScreen(driver);
    }


    public AccountDetailsClass clickOnWelcomeMsg(){
        driver.findElement(welcomeText).click();
        return new AccountDetailsClass(driver);
    }

    public Boolean isSignOutMsgDisplayed(){return driver.findElement(signOutMsg).isDisplayed();}

    public SignInClass tapOnSignInBtn(){
        driver.findElement(signInIcon).click();
        return new SignInClass(driver);
    }


    public void clickOnReadingStats(){driver.findElement(readidngStats).click();}
    private By profileImage = By.xpath("//android.view.View[@content-desc=\"Sign up or log into your HuffPost account\"]/android.widget.ImageView");
    private By mySettingsHeader = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup");
   // private By signUpMsg = By.xpath("//android.view.View[@content-desc=\"Sign up or log into your HuffPost account\"]/android.widget.TextView");
  //  private By editionLbl = By.xpath("//android.view.View[@content-desc=\"Current edition U.S.. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[1]");
    private By usEdition = By.xpath("//android.view.View[@content-desc=\"Current edition U.S.. Tap to change editions\"]/android.view.ViewGroup/android.widget.TextView[2]");

    private By developerSettings = MobileBy.AccessibilityId("Developer Settings");
    private By mapiConfiguration = MobileBy.AccessibilityId("MAPI Configuration");

    private By mapiEnvStaging = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]");
    private By contentEnvStaging = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[8]");


    public EditionsScreen clickOnEditionLbl() {
        driver.findElement(editionLbl).click();
        return new EditionsScreen(driver);
    }
    public void clickOnMapiEnvStaging(){
        WaitHelper.waitForElementDisplayed(driver,mapiEnvStaging,40);
        driver.findElement(mapiEnvStaging).click();
    }
    public void clickOnContentEnvStaging(){
        WaitHelper.waitForElementDisplayed(driver,contentEnvStaging,40);
        driver.findElement(contentEnvStaging).click();
    }

    public void clickOnMapiConfig(){
        WaitHelper.waitForElementDisplayed(driver,mapiConfiguration,40);
        driver.findElement(mapiConfiguration).click();
    }

    public void clickOnDeveloperSettings(){
        WaitHelper.waitForElementDisplayed(driver,developerSettings,40);
        driver.findElement(developerSettings).click();
    }

    public Boolean isMySettingsHeaderDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,mySettingsHeader,30);
      return   driver.findElement(mySettingsHeader).isDisplayed();
    }
    public Boolean isProfileImageDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,profileImage,40);
        return driver.findElement(profileImage).isDisplayed();}
    public Boolean isSignUpMsgDisplayed(){return driver.findElement(signUpMsg).isDisplayed();}
    public Boolean isEditionLblDisplayed(){return driver.findElement(editionLbl).isDisplayed();}
    public Boolean isusEditionDisplayed(){return driver.findElement(usEdition).isDisplayed();}



    private By generalLbl = MobileBy.AccessibilityId("GENERAL");
    private By displaySettings= MobileBy.AccessibilityId("Display Settings");

    private By pushNotifications = MobileBy.AccessibilityId("Push Notifications");
    private By manageNewsletters = MobileBy.AccessibilityId("Manage Newsletters");

    public Boolean isGeneralLblDisplayed(){return driver.findElement(generalLbl).isDisplayed();}
    public Boolean isDisplaySettingsDisplayed(){return driver.findElement(displaySettings).isDisplayed();}
    public void clickOnDisplaySettings(){ driver.findElement(displaySettings).click();}
    public Boolean isPushNotificationsLblDisplayed(){return driver.findElement(pushNotifications).isDisplayed();}
    public PushNotificationsClass clickOnPushNotificationsSettings()
    { driver.findElement(pushNotifications).click();
        return new PushNotificationsClass(driver);
    }
    public Boolean isManageNewslettersDisplayed(){return driver.findElement(manageNewsletters).isDisplayed();}
    public ManageNewslettersClass clickOnManageNewsletters(){
        driver.findElement(manageNewsletters).click();
        return new ManageNewslettersClass(driver);
    }



    private By offlineReading = MobileBy.AccessibilityId("OFFLINE READING");

    private By downloadMySectionsLbl = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[1]");
   private By downloadMySectionsToggle = MobileBy.AccessibilityId("Download My Sections, Download news from the My Sections list in the background. This helps ensure you have the latest content whenever you open the app or go offline.");
   private By downloadUsingMobileData = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView");
   private By dowonloadUsingMobileDataToggle = MobileBy.AccessibilityId("Download Using Mobile Data");
   private By downloadTextOnly = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[1]");
   private By downladTextOnlySecondText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.v");
   private By downloadTextOnlyToggle = MobileBy.AccessibilityId("Download Text Only, Restrict background download to text only.");

    public Boolean isOfflineReadingDisplayed(){return driver.findElement(offlineReading).isDisplayed();}
    public Boolean isDownloadUsingMobileDataDisplayed(){return driver.findElement(downloadUsingMobileData).isDisplayed();}
    public void clickOnDownloadUsingMobiledata(){ driver.findElement(dowonloadUsingMobileDataToggle).click();}
    public Boolean isDownloadMySectionsLblDisplayed(){return driver.findElement(downloadMySectionsLbl).isDisplayed();}
    public void clickOnDownloadMySections(){ driver.findElement(downloadMySectionsToggle).click();}

    public Boolean isDownloadTextOnlyDisplayed(){return driver.findElement(downloadTextOnly).isDisplayed();}
    public void clickOnDownloadTextOnly(){ driver.findElement(downloadTextOnlyToggle).click();}


    private By supportLbl = MobileBy.AccessibilityId("SUPPORT");
   private By sendAppFeedback = MobileBy.AccessibilityId("Send App Feedback");
   private By contectOurEditiors = MobileBy.AccessibilityId("Contact Our Editors");
   private By rateThisApp = MobileBy.AccessibilityId("Rate This App");

    public Boolean isAppFeedbackLblDisplayed(){return driver.findElement(sendAppFeedback).isDisplayed();}
    public void clickOnAppFeedback(){ driver.findElement(sendAppFeedback).click();}

    public Boolean isContactOurEditorsLblDisplayed(){return driver.findElement(contectOurEditiors).isDisplayed();}
    public void clickOnContactOurEditiors(){ driver.findElement(contectOurEditiors).click();}
    public Boolean isRateThisAppLblDisplayed(){return driver.findElement(rateThisApp).isDisplayed();}
    public void clickOnRateThisApp(){ driver.findElement(rateThisApp).click();}

   private By aboutLbl = MobileBy.AccessibilityId("ABOUT");
   private By privacyPolicyLbl = MobileBy.AccessibilityId("Privacy Policy");
   private By termsOfServiceLbl = MobileBy.AccessibilityId("Terms of Service");
   private By consentPreferencesLbl = MobileBy.AccessibilityId("Consent Preferences");
   private By creditsLbl = MobileBy.AccessibilityId("Credits");

    public Boolean isAboutLblDisplayed(){return driver.findElement(aboutLbl).isDisplayed();}

    public Boolean isPrivacyPolicyLblDisplayed(){return driver.findElement(privacyPolicyLbl).isDisplayed();}
    public void clickOnPrivacyPolicy(){ driver.findElement(privacyPolicyLbl).click();}
    public void clickOnDTermsOfService(){ driver.findElement(termsOfServiceLbl).click();}
    public OneTrustClass clickOnConsentPreferences(){
        driver.findElement(consentPreferencesLbl).click();
        return new OneTrustClass(driver);
    }
    public void clickOnCredits(){ driver.findElement(creditsLbl).click();}

    public void tapOnGeneral()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
        driver.findElement(generalLbl).click();
    }


    public void swithToStaging()throws InterruptedException{
        tapOnGeneral();
        Thread.sleep(3000);
        scroll(1,1);
        scroll(1,1);
        clickOnDeveloperSettings();
        clickOnMapiConfig();
        Thread.sleep(2000);
        clickOnMapiEnvStaging();
        clickOnContentEnvStaging();
        Thread.sleep(2000);
        androidBACK();
        androidBACK();
     //   BottomMenuClass bottom = new BottomMenuClass(driver);
     //   HomeClass home = bottom.tapOntopNews();

    }

}
