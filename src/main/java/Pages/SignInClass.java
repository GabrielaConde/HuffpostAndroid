package Pages;

import Helpers.WaitHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SignInClass extends BaseClass{
    private By HuffPostLogo = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView[2]");
    private By signInTab = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View[1]");
    private By signUpTab = MobileBy.AccessibilityId("Sign Up");
    private By signInWithFBAccountSelection = MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Password for losdegasperi@hotmail.com.\"]/android.widget.LinearLayout");
    private By signInWithApple = MobileBy.xpath("//android.view.View[@content-desc=\"Sign in with Apple\"]/android.widget.TextView[2]");

    // Facebook sign in fields
    private By signInWithFacebook = MobileBy.xpath("//android.view.View[@content-desc=\"Sign in with Facebook\"]/android.widget.TextView[2]");
    private By facebookPwd = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    private By continueFBBtn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button");
    private By sndContinueFBBtn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button\n");
    // Google sign in fields
    private By signInWithGoogle = MobileBy.xpath("//android.view.View[@content-desc=\"Sign in with Google\"]/android.widget.TextView[2]");
    private By googleAccount = MobileBy.xpath("//android.view.View[@content-desc=\"Gabriela Conde Moreau condemoreau@gmail.com\"]/android.widget.TextView[2]");
    // HP account fields

    private By userFstName = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.EditText");
    //private By userFstName = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.EditText");
    private By userLstName = MobileBy.className("android.widget.EditText");

    // private By userLstName = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText");
    private By signupWithHPAccountText = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText");
    private By signupWithHPAccountPwd = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText");

    private By dontRememberPwd = MobileBy.xpath("//android.view.View[@content-desc=\"Don't remember your password?\"]/android.widget.TextView");
    private By logInButton = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");


    // Apple sign in fields
   // private By appleIDtext = MobileBy.id("account_name_text_field");
    private By appleIDtext = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    private By appleAccountSelection = MobileBy.AccessibilityId("Password for gabmoreau@hotmail.com.");
    private By signInArrow = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    private By continueAppleIdSignIn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
    private By agreecheck = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.CheckBox");

     private By pwdText = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]");

    private By signUpBtn = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button\n");
    public void continueAppleSignIn(){driver.findElement(continueAppleIdSignIn).click();}

    public void tapSignUpTab(){
        WaitHelper.waitForElementDisplayed(driver, signUpTab,60);
        driver.findElement(signUpTab).click();
    }
    public void tapAgreeCheck(){
        WaitHelper.waitForElementDisplayed(driver,agreecheck,60);
        driver.findElement(agreecheck).click();
    }

    public void tapSignUp(){
        WaitHelper.waitForElementDisplayed(driver,signUpBtn,60);
        driver.findElement(signUpBtn).click();
    }
    public HomeClass signInWIthFacebook(String pwd) throws InterruptedException{
        Thread.sleep(3000);
       tapOnSignInWithFacebook();
    //   typeFacebookPassword(pwd);
        Thread.sleep(3000);
        driver.findElement(facebookPwd).click();
        driver.findElement(signInWithFBAccountSelection).click();
       driver.findElement(continueFBBtn).click();
       Thread.sleep(3000);
       driver.findElement(sndContinueFBBtn).click();
       return new HomeClass(driver);
    }
    public void typeAppleId(){
        WaitHelper.waitForElementDisplayed(driver,appleIDtext,60);
        driver.findElement(appleIDtext).click();
    }

    public void typeFacebookPassword(String pwd){
        driver.findElement(facebookPwd).click();
       Actions a = new Actions(driver);
        a.sendKeys(pwd);
        a.perform();
    }

    public void selectAppleAccount(){
        driver.findElement(appleAccountSelection).click();
    }

    public void clickOnSignInArrow(){ driver.findElement(signInArrow).click();}

    public void signInWithApple()throws InterruptedException{
        tapOnSignInWithApple();
        Thread.sleep(2000);
        typeAppleId();
        Thread.sleep(2000);
        selectAppleAccount();
        Thread.sleep(2000);
        clickOnSignInArrow();
        Thread.sleep(2000);
        continueAppleSignIn();
    }

     public void tapOnGoogleAccount(){driver.findElement(googleAccount).click();}

    public SignInClass(AndroidDriver driver){super(driver);}

    public Boolean IsHuffpostLogoDisplayed(){
        WaitHelper.waitForElementDisplayed(driver, HuffPostLogo, 60);
        return  driver.findElement(HuffPostLogo).isDisplayed();
    }

    public void tapOnSignUpTab(){
        WaitHelper.waitForElementDisplayed(driver, signUpTab, 60);
          driver.findElement(signUpTab).click();
    }

    public void tapOnSignInTab(){
        WaitHelper.waitForElementDisplayed(driver, signInTab, 60);
        driver.findElement(signInTab).click();
    }

    public void tapOnSignInWithFacebook(){
        WaitHelper.waitForElementDisplayed(driver, signInWithFacebook, 60);
        driver.findElement(signInWithFacebook).click();
    }

    public void tapOnSignInWithApple(){
        WaitHelper.waitForElementDisplayed(driver, signInWithApple, 60);
        driver.findElement(signInWithApple).click();
    }
    public HomeClass tapOnSignInWithGoogle()throws InterruptedException{
        WaitHelper.waitForElementDisplayed(driver, signInWithGoogle, 60);
        driver.findElement(signInWithGoogle).click();
        Thread.sleep(3000);
        tapOnGoogleAccount();
        return new HomeClass(driver);
    }

    public HomeClass tapOnLogInBtn(){
        WaitHelper.waitForElementDisplayed(driver, logInButton, 60);
        driver.findElement(logInButton).click();
        return new HomeClass(driver);

    }

    public void typeFstName(){
    //   String name= randomChar();
       String name ="Cindy";
       WaitHelper.waitForElementDisplayed(driver,userFstName,60);
       driver.findElement(userFstName).click();
        Actions a = new Actions(driver);
        a.sendKeys(name);
        a.perform();
    }

    public void typeLstName(){
     //   String name= randomChar();
        List<MobileElement> al;
        String name = "Manns";
        WaitHelper.waitForElementDisplayed(driver,userLstName,60);
        al = driver.findElements(userLstName);

        Actions a = new Actions(driver);
        a.sendKeys(name);
        a.perform();
    }

    public List<MobileElement> getTextElements() {return driver.findElements(userLstName);}

    public void inputTextOnTextElements(String user, String pwd, String fstName, String lstName){
        List<MobileElement> list;
        Actions a = new Actions(driver);
        tapOnSignUpTab();
        list = getTextElements();
        for (int i = 0; i < list.size(); i++){
            switch (i){
            case 0: {
                list.get(i).click();
                a.sendKeys(user);
                a.perform();
                break;
            }
                case 1:{
                    list.get(i).click();
                    a.sendKeys(pwd);
                    a.perform();
               //     Thread.sleep(2000);
             //       driver.findElement(pwdText).click();
               //     Thread.sleep(2000);
                    break;
                }
                case 3:{
                    list.get(i).click();
                    a.sendKeys(fstName);
                    a.perform();
                    break;
                }
                case 4: {
                    list.get(i).click();
                    a.sendKeys(lstName);
                    a.perform();
                    break;
                }
            }

        }

    }


        public void createHuffPostAccount(String user, String pwd) throws InterruptedException{
            typeUsername(user);
            tapENTER();
            typePassword(pwd);
            typeFstName();
            typeLstName();
        //    tapBACK();
            tapSignUp();
            Thread.sleep(2000);
    }

    public void typeUsername (String user){
        driver.findElement(signupWithHPAccountText).click();
        WaitHelper.waitForElementDisplayed(driver,signupWithHPAccountText,30);
        driver.findElement(signupWithHPAccountText).click();
        Actions a = new Actions(driver);
        a.sendKeys(user);
        a.perform();
    }

    public void signInWithHPAccount(String user, String pwd)throws InterruptedException{
        tapOnSignUpTab();
        Thread.sleep(2000);
        typeUsername(user);
        typePassword(pwd);
        driver.hideKeyboard();
        typeFstName();
        Thread.sleep(2000);
        typeLstName();
        Thread.sleep(2000);
        tapAgreeCheck();
        Thread.sleep(2000);
        tapSignUp();
    }

    public void typePassword (String pwd)throws InterruptedException{
        driver.findElement(signupWithHPAccountPwd).click();
        WaitHelper.waitForElementDisplayed(driver,signupWithHPAccountPwd,30);
        driver.findElement(signupWithHPAccountPwd).click();
        Actions a = new Actions(driver);
        a.sendKeys(pwd);
        a.perform();
        Thread.sleep(2000);
        driver.findElement(pwdText).click();
        Thread.sleep(2000);
    }
}
