package Tests;

import Base.BaseTest;
import Pages.*;
import org.springframework.ui.context.Theme;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.TreeMap;

public class testExploreScreen extends BaseTest {
    Onboarding onboarding;
    HomeClass home;
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
        testName ="basic Onboarding";
        System.out.println("Validate Skip onboarding");
        onboarding.skipIntro();
        Thread.sleep(3000);
        home.clickOnToolTip();
        explore =bottomMenu.tapOnExplore();

    }

    @Test(priority = 2)
    public void vaidateExploreScreenElements()throws InterruptedException{
        testName ="validateExploreElements";
        System.out.println("validate Explore screen elements are displayed");
        Thread.sleep(4000);
        explore.isExploreLblDisplayed();
        System.out.println("validate Explore header is displayed");
        Thread.sleep(2000);
        explore.isTopStoriesLblDisplayed();
        System.out.println("validate Top Stories header is displayed");
        Thread.sleep(1000);
        explore.isLogInButtonDisplayed();
        System.out.println("validate Log In Button is displayed");
        explore.isAllSectionsLblDisplayed();
        System.out.println("validate 'All Sections' Label is displayed");
        explore.isAllSectionsLblDisplayed();

    }

    @Test(priority = 3)
    public void validateNewsSection()throws InterruptedException{
        testName ="validateNewsSection";
        System.out.println("validate News Header is displayed");
        Thread.sleep(1000);
        explore.isNewsLblDisplayed();
        explore.clickOnUSNews();
        Thread.sleep(2000);
//        section.clickOnSectionCell();
  //      section.androidBACK();
        section.androidBACK();
        Thread.sleep(1000);
        explore.clickOnWorldNews();
        Thread.sleep(1000);
     //   section.clickOnSectionCell();
     //   section.androidBACK();
        section.androidBACK();
        Thread.sleep(2000);
        explore.littleScroll(1,1);
        explore.littleScroll(1,1);
        explore.clickOnBusiness();
        Thread.sleep(1000);
     //   section.clickOnSectionCell();
     //   section.androidBACK();
        section.androidBACK();
        Thread.sleep(1000);
        explore.clickOnEnvironment();
        Thread.sleep(1000);
      //  section.clickOnSectionCell();
      //  section.androidBACK();
        section.androidBACK();
        Thread.sleep(1000);
        explore.clickOnHealth();
        Thread.sleep(1000);
      //  section.clickOnSectionCell();
      //  section.androidBACK();
        section.androidBACK();
        Thread.sleep(1000);
        explore.clickOnSocialJustice();
      //  section.clickOnSectionCell();
      //  section.androidBACK();
        section.androidBACK();

    }

    @Test(priority = 4)
    public void validateEntertainmentSection()throws InterruptedException{
        testName ="validateEnterteSection";
        System.out.println("validate News Header is displayed");
        Thread.sleep(2000);
        explore.scroll(1,1);
        explore.isEntertainmentSectionLblDisplayed();
     //   explore.clickOnEntertainmentLbl();
      //  Thread.sleep(2000);
     //   explore.androidBACK();
        explore.clickOnCultureAndArtsLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnMediaLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnCelebrityLbl();
        explore.androidBACK();
        Thread.sleep(2000);
        explore.clickOntvAndFilmLbl();
        Thread.sleep(2000);
        explore.androidBACK();
    }

    @Test(priority = 5)
    public void validatePoliticsSection()throws InterruptedException {
        testName = "validatePolitcsSection";
        System.out.println("validate Politics Header is displayed");
        Thread.sleep(2000);
        explore.scroll(1, 1);
        explore.isPoliticsSectionLblDisplayed();
        explore.clickOnPoliticSectionLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnCongressLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnExtremismLbl();
        Thread.sleep(2000);
        explore.androidBACK();
    }

    @Test(priority = 6)
    public void validateLifeSection()throws InterruptedException {
        testName = "validateLifeSection";
        System.out.println("validate Life Header is displayed");
        Thread.sleep(2000);
        explore.littleScroll(1, 1);
        explore.isLifeLblDisplayed();
        explore.clickOnLifeSectionLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnStyleAndBeautyLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnFoodAndDrinkLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnParentingLbl();
        explore.androidBACK();
        Thread.sleep(2000);
        explore.clickOnTravelLbl();
        explore.androidBACK();
        explore.clickOnShoppingLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnWellnessLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnRelationshipsLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnMoneyLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnHomeAndLivingLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnWorkAndLifeLbl();
        Thread.sleep(2000);
        explore.androidBACK();

    }

    @Test(priority = 7)
    public void validateOpinionSection()throws InterruptedException {
        testName = "validateOpinionSection";
        System.out.println("validate Opinion Header is displayed");
        explore.scroll(1,1);
        Thread.sleep(2000);
        explore.isOpinionlDisplayed();
        explore.clickOnOpinionSectionLbl();
        Thread.sleep(2000);
        explore.androidBACK();
    }

    @Test(priority = 8)
    public void validateMultimediaSection()throws InterruptedException {
        testName = "validateMultimediaSection";
        System.out.println("validate Multimedia Header is displayed");
        Thread.sleep(2000);
        explore.scroll(1,1);
        explore.isMultimediaSectionLblDisplayed();
        explore.clickOnVideoLbl();
        Thread.sleep(2000);
        explore.androidBACK();
    }

    @Test(priority = 9)
    public void validateHuffpostPersonalSection()throws InterruptedException {
        testName = "validateHuffpostPersonalSection";
        System.out.println("validate HuffpostPersonal Header is displayed");
        Thread.sleep(2000);
        explore.isHuffpostPersonalDisplayed();
        explore.clickOnHuffpostPersonalLbl();
        Thread.sleep(2000);
        explore.androidBACK();
    }

    @Test(priority = 10)
    public void validateVoicesSection()throws InterruptedException {
        testName = "validateVoicesSection";
        System.out.println("validate Voices Header is displayed");
        Thread.sleep(2000);
        explore.scroll(1,1);
        explore.isVoicesDisplayed();
        explore.clickOnQueerVoicesLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnWomanLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnBlackVoicesLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnLatinoVoicesLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnAssianVoicesLbl();
        Thread.sleep(2000);
        explore.androidBACK();
    }

}
