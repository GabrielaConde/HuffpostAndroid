package Tests;

import Base.BaseTest;
import Pages.BottomMenuClass;
import Pages.HomeClass;
import Pages.MySettingsClass;
import Pages.Onboarding;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.lang.reflect.Type;

public class testHomeScreen extends BaseTest {
    Onboarding onboarding;
    HomeClass home;
    String testName;

    MySettingsClass settings;

    BottomMenuClass bottom;

    @BeforeClass
    public void initObjects()throws InterruptedException{
        onboarding = new Onboarding(driver);
        bottom = new BottomMenuClass(driver);
    }

    @Test(priority = 1)
    public void basicOnboarding()throws InterruptedException{
            testName = "basic Onboarding";
            System.out.println("Validate Skip onboarding");
            home = onboarding.skipIntro();
    }

    @Test(priority = 2)
    public void validateMainHPElements()throws InterruptedException{
           Thread.sleep(4000);
        testName ="validateMainHPElements";
        System.out.println("validate Main HP Elements are displayed");
        Assert.assertTrue(home.isHuffpostLblDisplayed());
        System.out.println("validate HP label is displayed");
        Thread.sleep(2000);
        Assert.assertTrue(home.isMainImageDisplayed());
        System.out.println("validate Main Image is displayed");
        Thread.sleep(2000);
        Assert.assertTrue(home.isToolTipDisplayed());
        System.out.println("validate is Tool Tip displayed");
        home.clickOnToolTip();
    }

    @Test(priority = 3)
    public void validateSplashDisplays()throws InterruptedException{
        testName ="validateSplashDisplays";
        System.out.println("Validate Splash is displayed");
        home.clickOnSplashtitle();
        Thread.sleep(2000);
        home.androidBACK();
    }

    @Test(priority = 4)
    public void validateLatestNewsLabelSection()throws InterruptedException{
        testName ="validateLatestNewsLabelSection";
        System.out.println("Validate Latest News Section Label is displayed");
        Assert.assertTrue(home.isNewsCategoryLblDisplayed());
    }

    @Test(priority = 5)
    public void validateCellElements()throws InterruptedException{
        testName ="validateCellElements";
        System.out.println("Validate the cell elements are displayed");
        home.isDateCellDisplayed();
        System.out.println("Validate cell image is displayed");
        home.isImageCellDisplayed();
        System.out.println("Validate cell date is displayed");
    }

    @Test(priority = 6)
    public void clickOnLatestNewsArticle()throws InterruptedException{
        testName ="clickOnLatestNewsArticle";
        System.out.println("Validate Latest News Cell displays");
        home.clickOnNewsSectionCell();
        Thread.sleep(2000);
        home.androidBACK();
    }

  //  @Test(priority = 7)
    public void validateContextMenu(){
        testName ="validateContextMenu";
        System.out.println("Validate long press");
        home.validateContextMenu();
    }

    @Test(priority = 7)
    public void validateWhatsHappeningLabelSection()throws InterruptedException{
        testName ="validateWhatsHappeningLabelSection";
        System.out.println("Validate Whats Happening Section displayed");
        home.validateWhatsHappeningSection();
    }

    @Test(priority = 8)
    public void validateCellFromWhatsHappeningSectionDisplays()throws InterruptedException{
        testName ="validateCellFromWhatsHappeningSectionDisplays";
        System.out.println("Validate Whats Happening article opens");
        Thread.sleep(2000);
       home.clickOnWhatsHappeningSectionCell();
       Thread.sleep(3000);
       home.androidBACK();
    }

    @Test(priority = 9)
    public void validateFollowedSectionLabelDisplays()throws InterruptedException{
        testName ="validateFollowedSectionLabelDisplays";
        System.out.println("Validate Followed Section Label displays");
      home.validateFollowedSectionsLbl();
    }

    @Test(priority = 10)
    public void validateFollowedSectionTextDisplays()throws InterruptedException{
        testName ="validateFollowedSectionTextDisplays";
        System.out.println("Validate Followed Section text displays");
      home.validateFollowedSectonsTxt();
    }

    @Test(priority = 11)
    public void validateFollowedSectionCarrouoselText()throws InterruptedException{
        testName ="validateFollowedSectionCarrouosel";
        System.out.println("Validate Followed Section Carrousel");
      home.validateFollowedSectonsTxt();
    }

    @Test(priority = 12)
    public void validateFollowedSectionsOnCarrousel()throws InterruptedException{
       home.validateFollowedSectionsCarrousel();
    }

    @Test(priority = 13)
    public void validateLifeCategory()throws InterruptedException{
        Thread.sleep(2000);
        home.isLifeCategoryLblDisplayed();
        home.clickOnLifeCategory();
        Thread.sleep(2000);
        home.androidBACK();
        home.scroll(1,1);
        home.clickOnSeeMoreLife();
        Thread.sleep(2000);
        home.androidBACK();
        Thread.sleep(2000);
    }


    @Test(priority = 14)
    public void validateShoppingCategoryElements()throws InterruptedException{
        home.scroll(1,1);
        home.isShoppingSectionLblDisplayed();
        home.clickOnShoppingSectionCell();
        Thread.sleep(3000);
        home.androidBACK();
    }

    @Test(priority = 15)
    public void validateDontMissCategoryElements()throws InterruptedException{
        home.scroll(1,1);
        home.scroll(1,1);
        home.isDontMisslblDisplayed();
        home.clickOnDontMissCategory();
        Thread.sleep(2000);
        home.androidBACK();
    }


}
