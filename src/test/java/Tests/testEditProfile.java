package Tests;

import Base.BaseTest;
import Pages.*;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testEditProfile extends BaseTest {
    Onboarding onboarding;
    HomeClass home;
    BottomMenuClass bottomMenu;
    ExploreClass explore;
    String testName;
    SectionClass section;
    FrontPageClass frontPage;
    AccountDetailsClass accountDetails;

    EditProfileScreen editProfile;

    SignInClass signIn;
    BookmarkClass bookmarks;
    MySettingsClass mySettings;
    ManageNewslettersClass manageNewsletter;


    @BeforeClass
    public void initObjects()throws InterruptedException{

        onboarding = new Onboarding(driver);
        home= new HomeClass(driver);
        bottomMenu = new BottomMenuClass(driver);
        section = new SectionClass(driver);

    }

    @Test(priority = 1)
    public void basicOnboarding()throws InterruptedException{
        testName = "basic Onboarding";
        System.out.println("Validate Skip onboarding");
        onboarding.skipIntro();
        Thread.sleep(3000);
        mySettings = bottomMenu.tapOnMySettings();
    }

    @Test(priority = 2)
    public void gotoEditProfileScreen()throws InterruptedException{
        signIn = mySettings.tapOnSignInBtn();
        signIn.signInWIthFacebook("sanfer12");
        accountDetails = mySettings.clickOnWelcomeMsg();
    }

    @Test(priority = 3)
    public void validateMainImage(){
       Assert.assertTrue(accountDetails.isAccountImageDisplayed());
    }

    @Test(priority = 4)
    public void validateAccountName(){
        Assert.assertTrue(accountDetails.isAccountNamelDisplayed());
    }

    @Test(priority = 5)
    public void validateAccountEmail(){
        Assert.assertTrue(accountDetails.isAccountEmailDisplayed());
    }

    @Test(priority = 6)
    public void clickOnEditProfile(){
        editProfile = accountDetails.tapOnEditProfileBtn();
    }

    @Test(priority = 7)
    public void validateEditProfileScreenElements(){
        Assert.assertTrue(editProfile.isAccoutnImageDisplayed());
        Assert.assertTrue( editProfile.isWelcomeMsgDisplayed());
        Assert.assertTrue(editProfile.isProfileInfoLblDisplayed());
        Assert.assertTrue(editProfile.isProfileNameLblDisplayed());
        Assert.assertTrue(editProfile.isProfileEmailLblDisplayed());
    }

    @Test(priority = 8)
    public void validateAccountPrivacyElements(){
        editProfile.scrollMultipleTimes(2);
        editProfile.isAccountPrivacyDisplayed();
        editProfile.isDisclaimerDisplayed();
    }

    @Test(priority = 9)
    public void tapRequestDeleteData(){
        editProfile.clickDeleteMyDataBtn();
     Assert.assertTrue(editProfile.isDataDeleteMsgDisplayed());
    }

    @Test(priority = 10)
    public void tapOpenBookmarks()throws InterruptedException{
       bookmarks = editProfile.clickOnOpenBookmarksBtn();
       Thread.sleep(3000);
      Assert.assertTrue(bookmarks.isBookmarkHeaderDisplayed());
      editProfile.closeAccDetails();
      accountDetails.tapOnEditProfileBtn();
    }

    @Test(priority = 11)
    public void tapOpenNewsletter()throws InterruptedException{
        Thread.sleep(3000);
        manageNewsletter = editProfile.clickOpenNewsletterBtn();
        Thread.sleep(3000);
      Assert.assertTrue(manageNewsletter.isManageNewsletterHeaderDisplayed());
    }

    @Test(priority = 12)
    public void clickOnLogOut()throws InterruptedException{
        accountDetails.tapOnLogOutBtn();
        Thread.sleep(2000);
        Assert.assertTrue(mySettings.isSignOutMsgDisplayed());
    }

}

