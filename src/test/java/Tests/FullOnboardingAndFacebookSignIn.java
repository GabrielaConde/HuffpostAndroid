package Tests;

import Base.BaseTest;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FullOnboardingAndFacebookSignIn extends BaseTest {
    private OnboardingPrivacyClass privacy;
    private OnboardingSelectLocationClass edition;
    private OnboardingAlertsClass alerts;
    private OnboardingJoinHuffpostClass joinHuffpost;
    private OnboardingJoinHuffpostCommunity joinHuffpostCommunity;
    private String testName;
    private SignInClass signIn;
    private HomeClass home;

    @BeforeClass
    public void initObjects(){
       privacy = new OnboardingPrivacyClass(driver);
    }

    @Test(priority = 1)
    public void testHPLogoIsDisplayed(){
        testName = "testHPLogo";
        System.out.println("Validate Huffpost Logo is displayed on screen");
      //  Assert.assertTrue(privacy.IsHPLogoLblDisplayed());
        privacy.IsHPLogoLblDisplayed();
    }

    @Test(priority = 2)
    public void validatePrivacyTitleIsDisplayed(){
        testName = "validatePrivacyTitleIsDisplayed";
        System.out.println("Validate Privacy Title is displayed on Privacy Screen");
        Assert.assertTrue(privacy.IsWeValueYourPrivacyTitlelblDisplayed());
    }

    @Test(priority = 3)
    public void validatePrivacyDescriptionIsDisplayed(){
        testName = "validatePrivacyDescriptionIsDisplayed";
        System.out.println("Validate Privacy Description is displayed on Privacy Screen");
        Assert.assertTrue(privacy.IsWeValueYourProvacyMsgLblDisplayed());
    }

    @Test(priority = 4)
    public void tapOnAgreeBtn(){
        testName = "tapOnAgreeBtn";
        System.out.println("Tap on Agree Button");
        edition =privacy.tapOnAgreeBtn();
    }

  //  @Test(priority = 5)
    public void validateEditionScreenImageIsDisplayed() {
        testName = "validateEditionScreenImageIsDisplayed";
        System.out.println("Validate edition screen image is displayed");
        Assert.assertTrue(edition.isImageDisplayed());
    }

 //   @Test(priority = 6)
    public void validateSelectYourEditionTitleIsDisplayed(){
        testName="validateSelectYourEditionTitleIsDisplayed";
        System.out.println("Validate Select your Edition title is displayed on Edition's screen");
        Assert.assertTrue(edition.isSelectEditionLblDisplayed());
    }

  //  @Test(priority = 7)
    public void validateSelectEditionText(){
        testName = "validateSelectEditionText";
        System.out.println("Validate Select Edition Text");
        Assert.assertTrue(edition.useMyLocationTextLbl());
    }

 //   @Test(priority = 8)
    public void validateEditionScreenDisplays(){
        testName = "validateEditionScreenDisplays";
        System.out.println("Validate Edition Screen Displays");
        edition.tapOnChooseFromAListLnk();
       Assert.assertTrue(edition.IsChooseYourEditoinLblDisplayed());
       edition.androidBACK();
    }

    @Test(priority = 9)
    public void validateTappingONUseMyLocationBtn(){
        testName ="validateTappingONUseMyLocationBtn";
        System.out.println("Validate Tapping on Use My Location Button");
        edition.tapOnUseMyLocationBtn();

    }

    @Test(priority = 10)
    public void setValidateAlertsDontMissAThing(){
        testName = "validateAlertstitles";
        System.out.println("Validate Setting alerts screen labels are displayed");
        Assert.assertTrue(alerts.isDontMissAThingLblDisplayed());
        Assert.assertTrue(alerts.isChooseCategoryLblDisplayed());

    }

    @Test(priority = 11)
    public void validateSettingAlerts(){
        testName = "validateSettingAlerts";
        System.out.println("Valiate Setting Alerts");
        alerts.clickOnPoliticsAndElections();
        alerts.clickOnExtremismLnk();
        alerts.clickOnRaceInAmerica();
        alerts.clickOnartAndEntertainmentLnk();
        joinHuffpost = alerts.clickOnEnableAlerts();
    }

    @Test(priority = 12)
    public void validateJoinHuffpostScreen(){
        testName = "validateJoinHuffpostScreen";
        System.out.println("Validate Join HuffpostScreen");
        Assert.assertTrue(joinHuffpost.isJoinHuffPostLblDisplayed());
        Assert.assertTrue(joinHuffpost.isBecomePartOfTheCommunity());
    }

    @Test(priority = 13)
    public void tapOnJoinHuffpostBtn(){
        testName = "tapOnJoinHuffpostBtn";
        System.out.println("Validate tapping On Join Huffpost  Button");
       joinHuffpostCommunity = joinHuffpost.tapOnJoinHuffpostBtn();
    }

    @Test(priority = 14)
    public void validateJoinHuffpostCommunityScreenElements(){
        testName = "validateJoinHuffpostCommunityScreenElements";
        System.out.println("Validate Join HUffpost Community Screen Elements");
        Assert.assertTrue(joinHuffpostCommunity.isFreeLblDisplayed());
        Assert.assertTrue(joinHuffpostCommunity.isJoinHuffPostTitleDisplayed());
        Assert.assertTrue(joinHuffpostCommunity.isJoinHuffPostDescDisplayed());
        joinHuffpostCommunity.isSaveBookmarksLblDisplayed();
        joinHuffpostCommunity.isTrackStoriesLblDisplayed();
        joinHuffpostCommunity.isParticipateInCommentingLblDisplayed();
    }

    @Test(priority = 15)
       public void validateJumpIntoSignInScreen(){
         signIn = joinHuffpostCommunity.clickOnCreateFreeAccountBtn();
       }

    @Test(priority = 15)
    public void validateSignInWithFacebook() throws InterruptedException{
      home=  signIn.signInWIthFacebook("sanfer12");
    }

    @Test(priority = 15)
    public void validateHomeElements() throws InterruptedException{

    }

}
