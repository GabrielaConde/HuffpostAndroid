package Tests;

import Base.BaseTest;
import Pages.*;
import org.springframework.ui.context.Theme;
import org.testng.Assert;
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

    SignInClass signIn;

    MySettingsClass settings;

    AccountDetailsClass account;

    SearchClass search;


    @BeforeClass
    public void initObjects() throws InterruptedException {

        onboarding = new Onboarding(driver);
        home = new HomeClass(driver);
        bottomMenu = new BottomMenuClass(driver);
        section = new SectionClass(driver);
        settings = new MySettingsClass(driver);


    }

    @Test(priority = 1)
    public void basicOnboarding() throws InterruptedException {
        try {
            testName = "basic Onboarding";
            System.out.println("Validate Skip onboarding");
            Thread.sleep(2000);
            onboarding.skipIntro();
            Thread.sleep(3000);
            home.clickOnToolTip();
            // settings = bottomMenu.tapOnMySettings();
            Thread.sleep(3000);
            // settings.swithToStaging();
            explore = bottomMenu.tapOnExplore();
        } catch (Exception e) {
            section.androidBACK();
            Assert.assertTrue(false);
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 2)
    public void vaidateExploreScreenElements() throws InterruptedException {
        try {
            testName = "validateExploreElements";
            System.out.println("validate Explore screen elements are displayed");
            Thread.sleep(2000);
            // home.clickOnToolTip();
            explore = bottomMenu.tapOnExplore();
            Thread.sleep(3000);
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
        } catch (Exception e) {
            section.androidBACK();
            Assert.assertTrue(false);
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 3)
    public void validateElementSelectedIsAddedtoFavSecCarrousel(){
        testName = "validateElementSelectedIsAddedtoFavSecCarrousel";
        explore.scroll(1,1);
        explore.tapOnWorldNewsCheck();
        Assert.assertTrue(explore.validateWorldNewsIsAddedToCarrousel());
        explore.tapOnWorldNewsCheck();
    }

    @Test(priority = 4)
    public void validateElementUncheckedIsRemovedFromCarrousel(){
        explore.tapOnWorldNewsCheck();
        Assert.assertFalse(explore.validateWorldNewsIsAddedToCarrousel());
    }

    @Test(priority = 5)
    public void validateNewsSection() throws InterruptedException {
        try {
            testName = "validateNewsSection";
            System.out.println("validate News Header is displayed");
            Thread.sleep(1000);
            explore.isNewsLblDisplayed();
            explore.clickOnUSNews();
            Thread.sleep(2000);
            explore.isContentDisplayed();
            Thread.sleep(35000);
            section.androidBACK();
            Thread.sleep(1000);
            explore.littleScroll(1, 1);
            explore.clickOnWorldNews();
            Thread.sleep(3000);
            explore.isContentDisplayed();
            section.androidBACK();
            Thread.sleep(2000);
            explore.littleScroll(1, 1);
            explore.littleScroll(1, 1);
            explore.clickOnBusiness();
            Thread.sleep(3000);
            explore.isContentDisplayed();
            Thread.sleep(2000);
            section.androidBACK();
            Thread.sleep(1000);
            explore.clickOnEnvironment();
            Thread.sleep(3000);
            explore.isContentDisplayed();
            section.androidBACK();
            Thread.sleep(1000);
            explore.clickOnHealth();
            Thread.sleep(3000);
            explore.isContentDisplayed();
            section.androidBACK();
            Thread.sleep(2000);
            explore.clickOnSocialJustice();
            Thread.sleep(3000);
            explore.isContentDisplayed();
            section.androidBACK();
        } catch (Exception e) {
            section.androidBACK();
            Assert.assertTrue(false);
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 6)
    public void validateEntertainmentSection() throws InterruptedException {
        try {
            explore.scroll(1, 1);
            testName = "validateEnterteSection";
            System.out.println("validate News Header is displayed");
            Thread.sleep(2000);
            explore.scroll(1, 1);
            explore.littleScroll(1, 1);
            explore.isEntertainmentSectionLblDisplayed();
            explore.clickOnEntertainment();
            Thread.sleep(2000);
            explore.isContentDisplayed();
            Thread.sleep(2000);
            explore.androidBACK();
            explore.clickOnCultureAndArtsLbl();
            explore.isContentDisplayed();
            Thread.sleep(2000);
            explore.androidBACK();
            Thread.sleep(2000);
            explore.clickOnMediaLbl();
            Thread.sleep(2000);
            explore.isContentDisplayed();
            Thread.sleep(2000);
            explore.androidBACK();
            explore.clickOnCelebrityLbl();
            Thread.sleep(2000);
            explore.isContentDisplayed();
            Thread.sleep(2000);
            explore.androidBACK();
            Thread.sleep(2000);
            explore.clickOntvAndFilmLbl();
            Thread.sleep(2000);
            explore.isContentDisplayed();
            Thread.sleep(2000);
            explore.isContentDisplayed();
            explore.androidBACK();
        } catch (Exception e) {
            explore.androidBACK();
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }

    }



    @Test(priority = 7)
    public void validatePoliticsSection()throws InterruptedException {
        try{
        testName = "validatePolitcsSection";
        System.out.println("validate Politics Header is displayed");
        Thread.sleep(2000);
        explore.scroll(1, 1);
        explore.isPoliticsSectionLblDisplayed();
        explore.clickOnPoliticSectionLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnCongressLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnExtremismLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        }catch(Exception e){
            explore.androidBACK();
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }
    }

    @Test(priority = 8)
    public void validateLifeSection()throws InterruptedException {
        try{
        testName = "validateLifeSection";
        System.out.println("validate Life Header is displayed");
        Thread.sleep(2000);
        explore.littleScroll(1, 1);
        explore.isLifeLblDisplayed();
        explore.clickOnLifeSectionLbl();
        Thread.sleep(2000);
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnStyleAndBeautyLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnFoodAndDrinkLbl();
        Thread.sleep(2000);
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnParentingLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        Thread.sleep(2000);
        explore.clickOnTravelLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnShoppingLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnWellnessLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnRelationshipsLbl();
        Thread.sleep(2000);
        explore.isContentDisplayed();
        explore.androidBACK();
        explore.clickOnMoneyLbl();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnHomeAndLivingLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        explore.clickOnWorkAndLifeLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        }catch(Exception e){
            explore.androidBACK();
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }

    }

    @Test(priority = 9)
    public void validateOpinionSection()throws InterruptedException {
        try{
        testName = "validateOpinionSection";
        System.out.println("validate Opinion Header is displayed");
        explore.scroll(1,1);
        Thread.sleep(2000);
        explore.isOpinionlDisplayed();
        explore.clickOnOpinionSectionLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        }catch(Exception e){
            explore.androidBACK();
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }
    }

    @Test(priority = 10)
    public void validateMultimediaSection()throws InterruptedException {
        try{
        testName = "validateMultimediaSection";
        System.out.println("validate Multimedia Header is displayed");
        Thread.sleep(2000);
        explore.scroll(1,1);
        explore.isMultimediaSectionLblDisplayed();
        explore.clickOnVideoLbl();
        Thread.sleep(2000);
        explore.isContentDisplayed();
        Thread.sleep(2000);
        explore.androidBACK();
        }catch(Exception e){
            explore.androidBACK();
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }
    }

    @Test(priority = 11)
    public void validateHuffpostPersonalSection()throws InterruptedException {
        try{
        testName = "validateHuffpostPersonalSection";
        System.out.println("validate HuffpostPersonal Header is displayed");
        Thread.sleep(2000);
        explore.isHuffpostPersonalDisplayed();
        explore.clickOnHuffpostPersonalLbl();
        explore.isContentDisplayed();
        Thread.sleep(2000);
        Thread.sleep(2000);
        explore.androidBACK();
        }catch(Exception e){
            explore.androidBACK();
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }
    }

    @Test(priority = 12)
    public void validateVoicesSection()throws InterruptedException {
        try{
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
        }catch(Exception e){
            explore.androidBACK();
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }
    }

    @Test(priority = 13)
    public void signInWithFB()throws InterruptedException{
        signIn = explore.clickOnLogInBtn();
        signIn.signInWIthFacebook("sanfer12");
        Thread.sleep(4000);
        settings = bottomMenu.tapOnMySettings();
        account = settings.clickOnWelcomeMsg();
        account.clickOnLogOut();
    }

    @Test(priority = 14)
    public void signInWithGoogle()throws InterruptedException{
        signIn = explore.clickOnLogInBtn();
        signIn.tapOnSignInWithGoogle();
        Thread.sleep(4000);
        settings = bottomMenu.tapOnMySettings();
        account = settings.clickOnWelcomeMsg();
        account.clickOnLogOut();
        bottomMenu.tapOnExplore();
    }
    @Test(priority = 15)
    public void searchText()throws InterruptedException{
        search = explore.tapOnSearchIcon();
        search.clickOnsearchText();
        search.typeText("Trump");
        search.tapSearchResult();
    }

}
