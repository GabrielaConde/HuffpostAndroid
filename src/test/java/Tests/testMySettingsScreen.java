package Tests;

import Base.BaseTest;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testMySettingsScreen extends BaseTest {
    Onboarding onboarding;
    HomeClass home;
    BottomMenuClass bottomMenu;
    ExploreClass explore;
    String testName;
    SectionClass section;
    PushNotificationsClass pushNotificationsScreen;
    ManageNewslettersClass manageNewsletters;

    SignInClass signIn;
    MySettingsClass mySettings;
    OneTrustClass oneTrust;

    AccountDetailsClass account;

    @BeforeClass
    public void initObjects()throws InterruptedException{
        onboarding = new Onboarding(driver);
        home= new HomeClass(driver);
        bottomMenu = new BottomMenuClass(driver);
        section = new SectionClass(driver);
    }


    @Test(priority = 1)
    public void basicOnboarding()throws InterruptedException{
        testName ="basic Onboarding";
        System.out.println("Validate Skip onboarding");
        onboarding.skipIntro();
        Thread.sleep(3000);
        home.clickOnToolTip();
        mySettings =bottomMenu.tapOnMySettings();
    }

    @Test(priority = 2)
    public void validateMySettingScreenMainElements()throws InterruptedException {
        testName = "validateMySettingScreenMainElements";
        System.out.println("validateMySettingScreenMainElements");
        mySettings.isMySettingsHeaderDisplayed();
        mySettings.isProfileImageDisplayed();
        mySettings.isSignUpMsgDisplayed();
        mySettings.isEditionLblDisplayed();
        mySettings.isusEditionDisplayed();

    }

    @Test(priority = 3)
    public void validateGeneralSection()throws InterruptedException {
        testName = "validateGeneralSection";
        System.out.println("validateGeneralSection");
        mySettings.isGeneralLblDisplayed();
        mySettings.isDisplaySettingsDisplayed();
        mySettings.clickOnDisplaySettings();
        Thread.sleep(2000);
        mySettings.androidBACK();
        Thread.sleep(2000);
        mySettings.isPushNotificationsLblDisplayed();
       pushNotificationsScreen = mySettings.clickOnPushNotificationsSettings();
        Thread.sleep(2000);
        mySettings.androidBACK();
        Thread.sleep(2000);
        mySettings.isManageNewslettersDisplayed();
        manageNewsletters = mySettings.clickOnManageNewsletters();
        Thread.sleep(2000);
        mySettings.androidBACK();
    }

    @Test(priority = 4)
    public void validatePushNotificationsScreen()throws InterruptedException{
        testName = "validatePushNotificationsScreen";
        System.out.println("validatePushNotificationsScreen");
        Thread.sleep(2000);
        mySettings.clickOnPushNotificationsSettings();
        pushNotificationsScreen.isNotificationHeaderDisplayed();
        pushNotificationsScreen.isYourCategoriesHeaderDisplayed();
        pushNotificationsScreen.isYourCategoriesTextDisplayed();
        pushNotificationsScreen.isBreakingNewsLblDisplayed();
        pushNotificationsScreen.clickOnBreakingNewsSwitch();
        pushNotificationsScreen.clickOnBreakingNewsSwitch();
        Thread.sleep(1000);
        pushNotificationsScreen.isHuffpostMustReadsLblDisplayed();
        pushNotificationsScreen.clickOnHuffpostMustReadsSwitch();
        pushNotificationsScreen.clickOnHuffpostMustReadsSwitch();
        Thread.sleep(2000);
        pushNotificationsScreen.isPoliticsAndElectionsLblDisplayed();
        pushNotificationsScreen.clickOnPoliticsAndElectionsSwitch();
        pushNotificationsScreen.clickOnPoliticsAndElectionsSwitch();
        Thread.sleep(1000);
        pushNotificationsScreen.isExtremismLblDisplayed();
        pushNotificationsScreen.clickOnExtremismSwitch();
        pushNotificationsScreen.clickOnExtremismSwitch();
        Thread.sleep(1000);
        pushNotificationsScreen.isRaceInAmericaLblDisplayed();
        pushNotificationsScreen.clickOnRaceInAmericaSwitch();
        pushNotificationsScreen.clickOnRaceInAmericaSwitch();
        Thread.sleep(1000);
        pushNotificationsScreen.isArtsAndEntertainmentLblDisplayed();
        pushNotificationsScreen.clickOnArtAndEntertainmentSwitch();
        pushNotificationsScreen.clickOnArtAndEntertainmentSwitch();
        Thread.sleep(1000);
        mySettings.androidBACK();
    }

  //  @Test(priority = 5)
    public void validateManageNewslettersScreen()throws InterruptedException{
        testName = "validateManageNewsletters";
        System.out.println("validateManageNewsletters");
        manageNewsletters = mySettings.clickOnManageNewsletters();
        Thread.sleep(2000);
        manageNewsletters.isManageNewsletterHeaderDisplayed();
        manageNewsletters.isSignUpLblDisplayed();
        manageNewsletters.isSignUpTextDisplayed();
        manageNewsletters.isEntertainmentLblDisplayed();
        manageNewsletters.isEntertainmentTxtDisplayed();
        manageNewsletters.clickOnEntertainmentCheck();
        manageNewsletters.isBlackVoicesLblDisplayed();
        manageNewsletters.isBlackVoicesTxtDisplayed();
        manageNewsletters.clickBlackVoicesCheck();
        manageNewsletters.isFringeLblDisplayed();
        manageNewsletters.isFringeTxtDisplayed();
        manageNewsletters.clickFringeCheck();
        manageNewsletters.isTheMorningEmailLbl();
        manageNewsletters.isTheMorningEmailTxt();
        manageNewsletters.clicMorningEmaiCheck();
        manageNewsletters.isPerentingLblDisplayed();
        manageNewsletters.isPerentingTxtDisplayed();
        manageNewsletters.clickParentingCheck();
        manageNewsletters.typeInvalidEmailOnSignUpTxt();
        manageNewsletters.typevalidEmailOnSignUpTxt();
        manageNewsletters.scroll(1,1);
        manageNewsletters.scroll(1,1);
        manageNewsletters.isFunniesWomanTweekLbl();
        manageNewsletters.isFunniesWomanTweekTxt();
        manageNewsletters.clickFunniesWomanTweetsCheck();
        manageNewsletters.isFunniesWomanTweekLbl();
        manageNewsletters.isFunniesWomanTweekTxt();
        manageNewsletters.clickFunniesWomanTweetsCheck();
        manageNewsletters.isStreamlineLblDisplayed();
        manageNewsletters.isStreamlineTxtDisplayed();
        manageNewsletters.clickStreamLineCheck();
        manageNewsletters.isWhatchingTheRoyalsLblDisplayed();
        manageNewsletters.isWhatchingTheRoyalsTxtDisplayed();
        manageNewsletters.clickWatchingTheRoyalCheck();
        manageNewsletters.isTheGoodLifeLblDisplayed();
        manageNewsletters.isTheGoodLifeTxtDisplayed();
        manageNewsletters.clickTheGoodLifeCheck();
        manageNewsletters.isPoliticsLblDisplayed();
        manageNewsletters.isPoliticsTxtDisplayed();
        manageNewsletters.clickPoliticsCheck();
        manageNewsletters.isMustReadsLblDisplayed();
        manageNewsletters.isMustReadsTxtDisplayed();
        manageNewsletters.clickTheGoodLifeCheck();
    }

    @Test(priority = 6)
    public void validateOfflineReadingSection()throws InterruptedException {
        testName = "validateGeneralSection";
        System.out.println("validateGeneralSection");
        Thread.sleep(2000);
        mySettings.isOfflineReadingDisplayed();
        mySettings.isDownloadMySectionsLblDisplayed();
        mySettings.clickOnDownloadMySections();
        mySettings.isDownloadUsingMobileDataDisplayed();
        mySettings.clickOnDownloadUsingMobiledata();
        mySettings.isDownloadTextOnlyDisplayed();
        mySettings.clickOnDownloadTextOnly();
    }

    @Test(priority = 7)
    public void validateSupportSection()throws InterruptedException {
        testName = "validateSupportSection";
        System.out.println("validateSupportSection");
        mySettings.scroll(1, 1);
        mySettings.scroll(1, 1);
        mySettings.isAppFeedbackLblDisplayed();
        mySettings.clickOnAppFeedback();
        Thread.sleep(2000);
        mySettings.androidBACK();
        mySettings.isContactOurEditorsLblDisplayed();
        mySettings.clickOnContactOurEditiors();
        Thread.sleep(2000);
        mySettings.androidBACK();
        mySettings.isRateThisAppLblDisplayed();
        mySettings.clickOnRateThisApp();
        Thread.sleep(2000);
        mySettings.androidBACK();
    }

    @Test(priority = 8)
    public void validateAboutSection()throws InterruptedException {
        testName = "validateSupportSection";
        System.out.println("validateSupportSection");
        mySettings.isAboutLblDisplayed();
        mySettings.isPrivacyPolicyLblDisplayed();
        mySettings.clickOnPrivacyPolicy();
        Thread.sleep(2000);
        mySettings.androidBACK();
        mySettings.clickOnDTermsOfService();
        Thread.sleep(2000);
        mySettings.androidBACK();
        oneTrust = mySettings.clickOnConsentPreferences();
        oneTrust.isOneTrustLblDisplayed();
        oneTrust.tapOnAcceptAllBtn();
        Thread.sleep(2000);
        mySettings.clickOnCredits();
        mySettings.androidBACK();
    }

    @Test(priority = 9)
    public void signInWithFB()throws InterruptedException{
        signIn = mySettings.tapOnSignInBtn();
        signIn.signInWIthFacebook("sanfer12");
        Thread.sleep(4000);
        account = mySettings.clickOnWelcomeMsg();
        account.clickOnLogOut();
    }

    @Test(priority = 10)
    public void signInWithGoogle()throws InterruptedException{
        signIn = mySettings.tapOnSignInBtn();
        signIn.tapOnSignInWithGoogle();
        Thread.sleep(4000);
        account = mySettings.clickOnWelcomeMsg();
    }




}
