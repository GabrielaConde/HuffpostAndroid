package Tests;

import Base.BaseTest;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testFrontPage extends BaseTest {
    Onboarding onboarding;
    HomeClass home;
    BottomMenuClass bottomMenu;
    ExploreClass explore;
    String testName;
    SectionClass section;
    FrontPageClass frontPage;

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

    }

    @Test(priority = 2)
    public void validateFronPageMainElements() throws InterruptedException{
        try {
            testName = "validateFronPageMainElements";
            System.out.println("validateFronPageMainElements");
            Thread.sleep(3000);
            frontPage = home.clickOnSplashtitle();
            Thread.sleep(7000);
            frontPage.isFrontPagaHeaderDisplayed();
            Thread.sleep(2000);
            // frontPage.isFrontPageTitleDescDisplayed();
            // Thread.sleep(2000);
            frontPage.isAuthorNameDisplayed();
            Thread.sleep(2000);
            frontPage.isAuthorDateDisplayed();
        }catch (Exception e){}

    }

    @Test(priority = 3)
    public void validateAlterTextSizeBtn(){
        testName ="validateAlterTextSizeBtn";
        System.out.println("validateAlterTextSizeBtn");
        frontPage.clickOnChangeSizeBtn();
    }

    @Test(priority = 4)
    public void validateCommentsBtn()throws InterruptedException{
        testName ="validatetestCommentsBtn";
        System.out.println("validatetestCommentsBtn");
        frontPage.clickOnOpenCommentsBtn();
        Thread.sleep(2000);
        frontPage.androidBACK();
    }

    @Test(priority = 5)
    public void validateBookmarksBtn()throws InterruptedException{
        testName ="validateBookmarksBtn";
        System.out.println("validateBookmarksBtn");
        Thread.sleep(2000);
        frontPage.clickOnBookmarkIcon();
    }

    @Test(priority = 6)
    public void validateShareBtn()throws InterruptedException{
        testName ="validateShareBtn";
        System.out.println("validateShareBtn");
        frontPage.clickOnShareIcon();
        Thread.sleep(2000);
        frontPage.androidBACK();
    }

    @Test(priority = 7)
    public void failTest(){
        Assert.assertTrue(false);
    }

}
