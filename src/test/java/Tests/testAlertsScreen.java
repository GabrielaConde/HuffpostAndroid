package Tests;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testAlertsScreen extends BaseTest {

    Onboarding onboarding;
    HomeClass home;

    AlertsClass alerts;
    BottomMenuClass bottomMenu;
    ExploreClass explore;
    String testName;
    SectionClass section;

    @BeforeClass
    public void initObjects()throws InterruptedException{

        onboarding = new Onboarding(driver);
        home= new HomeClass(driver);
        bottomMenu = new BottomMenuClass(driver);
        section = new SectionClass(driver);

    }

    @Test(priority = 1)
    public void basicOnboarding()throws InterruptedException{
        try {
            testName = "basic Onboarding";
            System.out.println("Validate Skip onboarding");
            onboarding.skipIntro();
            Thread.sleep(3000);
            home.clickOnToolTip();
            alerts = bottomMenu.tapOnAlerts();
        }catch (Exception e){}
    }

    @Test(priority = 2)
    public void validateAlertsScreenElements()throws InterruptedException{
        try{
        testName ="validateAlertsScreenElements";
        System.out.println("validateAlertsScreenElements");
        alerts.isAlertsMainHeaderDisplayed();
        alerts.isAlertHeaderDisplayed();
        alerts.isAlertTextDisplayed();
        alerts.isAlertDateDisplayed();
        }catch (Exception e){}
    }

    @Test(priority = 3)
    public void validateAlertDisplays()throws InterruptedException {
        try{
        testName = "validateAlertDisplays";
        System.out.println("validateAlertDisplays");
        alerts.clickOnAlertsText();
        Thread.sleep(2000);
        alerts.androidBACK();
        }catch (Exception e){}
    }





}
