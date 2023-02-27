package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ExploreClass extends BaseClass{

    public ExploreClass(AndroidDriver driver){super(driver);}

    private By exploreLbl = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup");
    private By searchIcon = By.xpath("//android.widget.Button[@content-desc=\"Search\"]/android.widget.ImageView");
    private By topStoriesLbl = MobileBy.AccessibilityId("YOUR TOP STORIES");
    private By logInBtn = MobileBy.AccessibilityId("Log In");
    private By favoriteSectionsLbl = MobileBy.AccessibilityId("Favorite Sections");
    private By allSectionsLbl = MobileBy.AccessibilityId("ALL SECTIONS");


    public Boolean isLogInButtonDisplayed() {return driver.findElement(logInBtn).isDisplayed();}

    public Boolean isAllSectionsLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,allSectionsLbl,40);
        return driver.findElement(allSectionsLbl).isDisplayed();
    }
    public Boolean isFavoriteSectionsLblDisplayed(){
       return driver.findElement(favoriteSectionsLbl).isDisplayed();
    }

    public void clickOnLogInBtn(){
        WaitHelper.waitForElementDisplayed(driver,logInBtn,40);
        driver.findElement(logInBtn).click();
    }
    public Boolean isExploreLblDisplayed() {
        WaitHelper.waitForElementDisplayed(driver,exploreLbl,40);
       return driver.findElement(exploreLbl).isDisplayed();
    }

    public void tapOnSearchIcon(){
        WaitHelper.waitForElementDisplayed(driver, searchIcon,40);
        driver.findElement(searchIcon).click();
    }

    public Boolean isTopStoriesLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,topStoriesLbl,40);
       return driver.findElement(topStoriesLbl).isDisplayed();
    }

    public void clickOnUSNews(){
        WaitHelper.waitForElementDisplayed(driver,usNewsLbl,40);
        driver.findElement(usNewsLbl).click();
    }
    public void clickOnWorldNews(){
        WaitHelper.waitForElementDisplayed(driver,worldNews,40);
        driver.findElement(worldNews).click();
    }

    public void clickOnBusiness(){
        WaitHelper.waitForElementDisplayed(driver,businessLbl,40);
        driver.findElement(businessLbl).click();
    }
    public void clickOnEnvironment(){
        WaitHelper.waitForElementDisplayed(driver,environmentLbl,40);
        driver.findElement(environmentLbl).click();
    }

    public void clickOnHealth(){
        WaitHelper.waitForElementDisplayed(driver,healthLbl,40);
        driver.findElement(healthLbl).click();
    }

    public void clickOnSocialJustice(){
        WaitHelper.waitForElementDisplayed(driver,socialJusticeLbl,40);
        driver.findElement(socialJusticeLbl).click();
    }

    // SECTIONS
    private By newsSection = MobileBy.AccessibilityId("News");
    private By usNewsLbl = MobileBy.AccessibilityId("US News");
    private By worldNews = MobileBy.AccessibilityId("World News");
    private By businessLbl = MobileBy.AccessibilityId("Business");
    private By environmentLbl = MobileBy.AccessibilityId("Environment");
    private By healthLbl = MobileBy.AccessibilityId("Health");
    private By socialJusticeLbl = MobileBy.AccessibilityId("Social Justice");



    private By entertainmentLbl = By.xpath("//android.view.View[@content-desc=\"Entertainment\"]");
    private By entertainmentSectionLbl = By.xpath("//android.widget.Button[@content-desc=\"Entertainment\"]");
    private By cultureAndArts = MobileBy.AccessibilityId("Culture & Arts");
    private By mediaLbl = MobileBy.AccessibilityId("Media");
    private By celebrityLbl = MobileBy.AccessibilityId("Celebrity");
    private By tvAndFilm = MobileBy.AccessibilityId("TV & Film");
    private By politicsLbl = By.xpath("//android.view.View[@content-desc=\"Politics\"]");
    private By politicsSectionLbl = By.xpath("//android.widget.Button[@content-desc=\"Politics\"]");
    private By congressLbl = MobileBy.AccessibilityId("Congress");
    private By extremism = MobileBy.AccessibilityId("Extremism");

    public void clickOnExtremismLbl(){
        WaitHelper.waitForElementDisplayed(driver,extremism,40);
        driver.findElement(extremism).click();
    }


    public void clickOnCongressLbl(){
        WaitHelper.waitForElementDisplayed(driver,congressLbl,40);
        driver.findElement(congressLbl).click();
    }


    public void clickOnPoliticSectionLbl(){
        WaitHelper.waitForElementDisplayed(driver,politicsSectionLbl,40);
        driver.findElement(politicsSectionLbl).click();
    }


    public Boolean isPoliticsSectionLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,politicsLbl,40);
      return   driver.findElement(politicsLbl).isDisplayed();
    }

    public Boolean isMultimediaSectionLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,multimmediaLbl,40);
        return   driver.findElement(multimmediaLbl).isDisplayed();
    }

    public Boolean isEntertainmentSectionLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,environmentLbl,40);
        return   driver.findElement(environmentLbl).isDisplayed();
    }

    public void clickOntvAndFilmLbl(){
        WaitHelper.waitForElementDisplayed(driver,tvAndFilm,40);
        driver.findElement(tvAndFilm).click();
    }


    public void clickOnmediaLbl(){
        WaitHelper.waitForElementDisplayed(driver,mediaLbl,40);
        driver.findElement(mediaLbl).click();
    }

    public void clickOnCelebrityLbl(){
        WaitHelper.waitForElementDisplayed(driver,celebrityLbl,40);
        driver.findElement(celebrityLbl).click();
    }


    public void clickOnMediaLbl(){
        WaitHelper.waitForElementDisplayed(driver,mediaLbl,40);
        driver.findElement(businessLbl).click();
    }

    public void clickOnCultureAndArtsLbl(){
        WaitHelper.waitForElementDisplayed(driver,cultureAndArts,40);
        driver.findElement(cultureAndArts).click();
    }

    public void clickOnEntertainmentLbl(){
        WaitHelper.waitForElementDisplayed(driver,entertainmentLbl,40);
        driver.findElement(entertainmentLbl).click();
    }


    public void clickOnSocialJusticeLbl(){
        WaitHelper.waitForElementDisplayed(driver,socialJusticeLbl,40);
        driver.findElement(socialJusticeLbl).click();
    }


    public void clickHealthLbl(){
        WaitHelper.waitForElementDisplayed(driver,healthLbl,40);
        driver.findElement(healthLbl).click();
    }


    public void clickOnEnvironmentLbl(){
        WaitHelper.waitForElementDisplayed(driver,entertainmentLbl,40);
        driver.findElement(entertainmentLbl).click();
    }


    public void clickOnBusinessLbl(){
        WaitHelper.waitForElementDisplayed(driver,businessLbl,40);
         driver.findElement(businessLbl).click();
    }

    public Boolean isNewsLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,usNewsLbl,40);
        return driver.findElement(usNewsLbl).isDisplayed();
    }

    public Boolean isNewsSectionLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,newsSection,40);
        return driver.findElement(newsSection).isDisplayed();
    }


    private By lifeLbl = By.xpath("//android.view.View[@content-desc=\"Life\"]");
    private By lifeSectionLbl = By.xpath("//android.widget.Button[@content-desc=\"Life\"]\n");
    private By styleAndBeauty = MobileBy.AccessibilityId("Style & Beauty");
    private By foodAndDrink = MobileBy.AccessibilityId("Food & Drink");
    private By parenting = MobileBy.AccessibilityId("Parenting");
    private By travel = MobileBy.AccessibilityId("Travel");
    private By shopping = MobileBy.AccessibilityId("Shopping");
    private By wellness = MobileBy.AccessibilityId("Wellness");
    private By relationships = MobileBy.AccessibilityId("Relationships");
    private By money = MobileBy.AccessibilityId("Money");
    private By homeAndLiving = MobileBy.AccessibilityId("Home & Living");
    private By workAndLife = MobileBy.AccessibilityId("Work/Life");


    public void clickOnWorkAndLifeLbl(){
        WaitHelper.waitForElementDisplayed(driver,workAndLife,40);
        driver.findElement(workAndLife).click();
    }

    public void clickOnHomeAndLivingLbl(){
        WaitHelper.waitForElementDisplayed(driver,homeAndLiving,40);
        driver.findElement(homeAndLiving).click();
    }

    public void clickOnMoneyLbl(){
        WaitHelper.waitForElementDisplayed(driver,money,40);
        driver.findElement(money).click();
    }

    public void clickOnRelationshipsLbl(){
        WaitHelper.waitForElementDisplayed(driver,relationships,40);
        driver.findElement(relationships).click();
    }
    public void clickOnWellnessLbl(){
        WaitHelper.waitForElementDisplayed(driver,wellness,40);
        driver.findElement(wellness).click();
    }

    public void clickOnParentingLbl(){
        WaitHelper.waitForElementDisplayed(driver,parenting,40);
        driver.findElement(parenting).click();
    }

    public void clickOnStyleAndBeautyLbl(){
        WaitHelper.waitForElementDisplayed(driver,styleAndBeauty,40);
        driver.findElement(styleAndBeauty).click();
    }

    public void clickOnShoppingLbl(){
        WaitHelper.waitForElementDisplayed(driver,shopping,40);
        driver.findElement(shopping).click();
    }

    public void clickOnTravelLbl(){
        WaitHelper.waitForElementDisplayed(driver,travel,40);
        driver.findElement(travel).click();
    }

    public void clickOnFoodAndDrinkLbl(){
        WaitHelper.waitForElementDisplayed(driver,foodAndDrink,40);
        driver.findElement(foodAndDrink).click();
    }

    public void clickOnLifeSectionLbl(){
        WaitHelper.waitForElementDisplayed(driver,lifeSectionLbl,40);
        driver.findElement(lifeSectionLbl).click();
    }

    public Boolean isLifeLblDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,lifeLbl,40);
        return driver.findElement(lifeLbl).isDisplayed();
    }


    private By opinionLbl = By.xpath("//android.view.View[@content-desc=\"Opinion\"]");
    private By opinionSectionLbl = By.xpath("//android.widget.Button[@content-desc=\"Opinion\"]");
    private By multimmediaLbl = MobileBy.AccessibilityId("Multimedia");
    private By videoLbl = MobileBy.AccessibilityId("Video");
    private By huffpostPersonalLbl = By.xpath("//android.view.View[@content-desc=\"HuffPost Personal\"]");
    private By huffpostPersonalSectionLbl = By.xpath("//android.widget.Button[@content-desc=\"HuffPost Personal\"]");

    public Boolean isOpinionlDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,opinionLbl,40);
        return driver.findElement(opinionLbl).isDisplayed();
    }

    public Boolean isHuffpostPersonalDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,huffpostPersonalLbl,40);
        return driver.findElement(huffpostPersonalLbl).isDisplayed();
    }
    public void clickOnOpinionSectionLbl(){
        WaitHelper.waitForElementDisplayed(driver,opinionSectionLbl,40);
        driver.findElement(opinionSectionLbl).click();
    }

    public void clickOnMultimediaLbl(){
        WaitHelper.waitForElementDisplayed(driver,multimmediaLbl,40);
        driver.findElement(multimmediaLbl).click();
    }

    public void clickOnVideoLbl(){
        WaitHelper.waitForElementDisplayed(driver,videoLbl,40);
        driver.findElement(videoLbl).click();
    }

    public void clickOnHuffpostPersonalLbl(){
        WaitHelper.waitForElementDisplayed(driver,huffpostPersonalSectionLbl,40);
        driver.findElement(huffpostPersonalSectionLbl).click();
    }


    private By voicesLbl = By.xpath("//android.view.View[@content-desc=\"Voices\"]");
    private By voicesSectionLbl = By.xpath("//android.view.View[@content-desc=\"Voices\"]");
    private By queerVoicesLbl = MobileBy.AccessibilityId("Queer Voices");
    private By womenLbl = MobileBy.AccessibilityId("Women");
    private By blackVoicesLbl = MobileBy.AccessibilityId("Black Voices");
    private By latinoVoicesLbl = MobileBy.AccessibilityId("Latino Voices");
    private By assianVoices = MobileBy.AccessibilityId("Asian Voices");

    public void clickOnBlackVoicesLbl(){
        WaitHelper.waitForElementDisplayed(driver,blackVoicesLbl,40);
        driver.findElement(blackVoicesLbl).click();
    }

    public void clickOnQueerVoicesLbl(){
        WaitHelper.waitForElementDisplayed(driver,queerVoicesLbl,40);
        driver.findElement(queerVoicesLbl).click();
    }


    public void clickOnLatinoVoicesLbl(){
        WaitHelper.waitForElementDisplayed(driver,latinoVoicesLbl,40);
        driver.findElement(latinoVoicesLbl).click();
    }

    public void clickOnAssianVoicesLbl(){
        WaitHelper.waitForElementDisplayed(driver,assianVoices,40);
        driver.findElement(assianVoices).click();
    }


    public Boolean isVoicesDisplayed(){
        WaitHelper.waitForElementDisplayed(driver,voicesLbl,40);
        return driver.findElement(voicesLbl).isDisplayed();
    }

    public void clickOnVoicesSectionLbl(){
        WaitHelper.waitForElementDisplayed(driver,voicesSectionLbl,40);
        driver.findElement(voicesSectionLbl).click();
    }

    public void clickOnWomanLbl(){
        WaitHelper.waitForElementDisplayed(driver,womenLbl,40);
        driver.findElement(womenLbl).click();
    }





}
