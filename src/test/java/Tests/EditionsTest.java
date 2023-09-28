package Tests;

import Base.BaseTest;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditionsTest extends BaseTest {
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
    EditionsScreen editions;

    AccountDetailsClass account;

    @BeforeClass
    public void initObjects()throws InterruptedException{
        onboarding = new Onboarding(driver);
        home= new HomeClass(driver);
        bottomMenu = new BottomMenuClass(driver);
        section = new SectionClass(driver);
    }


    @Test(priority = 1)
    public void validateSelectSwitchtoEspana()throws InterruptedException{
        mySettings = bottomMenu.tapOnMySettings();
        editions =mySettings.clickOnEditionLbl();
        Thread.sleep(3000);
        home = editions.selectEspana();
        Assert.assertTrue(home.isHuffpostLblDisplayed());
    }

    @Test(priority = 2)
    public void validateSelectSwitchToFrance()throws InterruptedException{
        mySettings =bottomMenu.tapOnMySettings();
        editions = mySettings.selectFrance();
        Thread.sleep(3000);
        home = editions.selectFrance();
        Assert.assertTrue(home.isHuffpostLblDisplayed());
    }

    @Test(priority = 3)
    public void validateSelectSwitchToGrece()throws InterruptedException{
        mySettings =bottomMenu.tapOnMySettings();
        editions = mySettings.selectGrece();
        Thread.sleep(3000);
        home = editions.selectGrece();
        Assert.assertTrue(home.isHuffpostLblDisplayed());
    }

    @Test(priority = 4)
    public void validateSelectSwitchToItaly()throws InterruptedException{
        mySettings =bottomMenu.tapOnMySettings();
        editions = mySettings.selectItaly();
        Thread.sleep(3000);
        home = editions.selectItaly();
        Assert.assertTrue(home.isHuffpostLblDisplayed());
    }

    @Test(priority = 5)
    public void validateSelectSwitchToKorea()throws InterruptedException{
        mySettings =bottomMenu.tapOnMySettings();
        editions = mySettings.selectKorea();
        Thread.sleep(3000);
        home = editions.selectKorea();
        Assert.assertTrue(home.isHuffpostLblDisplayed());
    }

    @Test(priority = 6)
    public void validateSelectSwitchToJapan()throws InterruptedException{
        mySettings =bottomMenu.tapOnMySettings();
        editions = mySettings.selectJapan();
        Thread.sleep(3000);
        home = editions.selectJapan();
        Assert.assertTrue(home.isHuffpostLblDisplayed());
    }

    @Test(priority = 7)
    public void validateSelectSwitchToUK()throws InterruptedException{
        mySettings =bottomMenu.tapOnMySettings();
        editions = mySettings.selectUK();
        Thread.sleep(3000);
        home = editions.selectUK();
        Assert.assertTrue(home.isHuffpostLblDisplayed());
    }
}
