package Tests;

import Base.BaseTest;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testBookmarksScreen extends BaseTest {

        Onboarding onboarding;
        HomeClass home;
        BottomMenuClass bottomMenu;
        ExploreClass explore;
        String testName;
        SectionClass section;
        FrontPageClass frontPage;
        AccountDetailsClass accountDetails;

        SignInClass signIn;
        BookmarkClass bookmarks;
        MySettingsClass mySettings;

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
            bookmarks = bottomMenu.tapOnBookmarks();
    }

    @Test(priority = 2)
    public void validateBookmarksHeader(){
        testName ="Validate Bookmark's header";
        System.out.println("Validate Bookmark's heade");
        bookmarks.isBookmarkHeaderDisplayed();

    }

    @Test(priority = 3)
    public void validateBookmarksTextEmptyScreen(){
        testName ="Validate Bookmark's text";
        System.out.println("Validate Bookmark's text");
        bookmarks.isBookmarksTextDisplayed();
    }

    @Test(priority = 4)
    public void validateSignInFromBookmarksScreen()throws InterruptedException{
        testName ="Validate Log In Button";
        System.out.println("Validate Log In Button");
        bottomMenu.tapOnBookmarks();
        Thread.sleep(2000);
        signIn = bookmarks.tapOnLogInBtn();
        signIn.signInWIthFacebook("sanfer12");

    }


    @Test(priority = 5)
    public void bookmarkArticle()throws InterruptedException{
        testName ="Validate Bookmarking";
        System.out.println("Validate Bookmarking");
        home =bookmarks.tapFindStoriesBtn();
        Thread.sleep(2000);
        frontPage = home.clickOnSplashtitle();
        Thread.sleep(2000);
        frontPage.clickOnBookmarkIcon();
        frontPage.androidBACK();

    }



    @Test(priority = 6)
    public void validateArticleIsAddedIntoBookmarksFeed()throws InterruptedException{
        testName ="Validate FrontPage is added to Bookmarks screen";
        System.out.println("Validate FrontPage is added to Bookmarks screen");
        Thread.sleep(2000);
        bookmarks = bottomMenu.tapOnBookmarks();
        Thread.sleep(2000);
        bookmarks.isCellDisplayed();
    }

    @Test(priority = 7)
    public void validateUnbookmarkPage(){
        testName ="Validate removing bookmark";
        System.out.println("Validate removing a bookmark");
        bookmarks.clickOnBookmarkIcon();
    }

    @Test(priority = 8)
    public void validateBookmarksEmptyState(){
        testName ="Validate Bookmarks empty state";
        System.out.println("Validate Bookmarks empty state");
        bookmarks.isNoBookmarksTextDisplayed();
        bookmarks.isTapToBookmarkTextDisplayed();
    }

    @Test(priority = 9)
    public void validateLoginElementsInMySettings()throws InterruptedException {
        testName = "validateLoginElementsInMySettings";
        System.out.println("validateLoginElementsInMySettings");
        mySettings = bottomMenu.tapOnMySettings();
        Thread.sleep(2000);
        mySettings.clickOnReadingStats();
        mySettings.androidBACK();
        Thread.sleep(2000);
        accountDetails = mySettings.clickOnWelcomeMsg();
        accountDetails.clickOnLogOut();
        Thread.sleep(2000);
        mySettings.isSignUpMsgDisplayed();
    }


    @Test(priority = 10)
    public void validateBookmarksTextEmptyScreenAfterSignOut(){
        bottomMenu.tapOnBookmarks();
        testName ="Validate Bookmark's text";
        System.out.println("Validate Bookmark's text");
        bookmarks.isBookmarksTextDisplayed();
    }

    @Test(priority = 11)
    public void validateSignInWithGoogleFromBookmarksScreen()throws InterruptedException{
        testName ="Validate Log In Button";
        System.out.println("Validate Log In Button");
        bottomMenu.tapOnBookmarks();
        Thread.sleep(2000);
        signIn = bookmarks.tapOnLogInBtn();
        signIn.tapOnSignInWithGoogle();
    }


    @Test(priority = 12)
    public void bookmarkArticleWithGoogleSignIn()throws InterruptedException{
        testName ="Validate Bookmarking";
        System.out.println("Validate Bookmarking");
        home =bookmarks.tapFindStoriesBtn();
        Thread.sleep(2000);
        frontPage = home.clickOnSplashtitle();
        Thread.sleep(2000);
        frontPage.clickOnBookmarkIcon();
        frontPage.androidBACK();
    }


    @Test(priority = 13)
    public void validateArticleIsAddedIntoBookmarksFeedAgain()throws InterruptedException{
        testName ="Validate FrontPage is added to Bookmarks screen";
        System.out.println("Validate FrontPage is added to Bookmarks screen");
        Thread.sleep(2000);
        bookmarks = bottomMenu.tapOnBookmarks();
        Thread.sleep(2000);
        bookmarks.isCellDisplayed();
    }

    @Test(priority = 14)
    public void validateUnbookmarkPageAgain(){
        testName ="Validate removing bookmark";
        System.out.println("Validate removing a bookmark");
        bookmarks.clickOnBookmarkIcon();
    }

    @Test(priority = 15)
    public void validateBookmarksEmptyStateAfterGoogleSignOut(){
        testName ="Validate Bookmarks empty state";
        System.out.println("Validate Bookmarks empty state");
        bookmarks.isNoBookmarksTextDisplayed();
        bookmarks.isTapToBookmarkTextDisplayed();
    }

    @Test(priority = 16)
    public void validateLoginElementsInMySettingsWithGoogleSignIn()throws InterruptedException {
        testName = "validateLoginElementsInMySettings";
        System.out.println("validateLoginElementsInMySettings");
        mySettings = bottomMenu.tapOnMySettings();
        Thread.sleep(2000);
        mySettings.clickOnReadingStats();
        mySettings.androidBACK();
        Thread.sleep(2000);
        accountDetails = mySettings.clickOnWelcomeMsg();
        accountDetails.clickOnLogOut();
        Thread.sleep(2000);
        mySettings.isSignUpMsgDisplayed();
    }




}
