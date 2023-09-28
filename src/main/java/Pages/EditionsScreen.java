package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EditionsScreen extends BaseClass{

    public EditionsScreen(AndroidDriver driver){
        super(driver);

    }

    private By Espana = By.xpath("//android.view.ViewGroup[@content-desc=\"España\"]/android.widget.TextView");
    private By France = By.xpath("//android.view.ViewGroup[@content-desc=\"France\"]/android.widget.TextView");
    private By Grece = By.xpath("//android.view.ViewGroup[@content-desc=\"Ελλάδα (Greece)\"]/android.widget.TextView");
    private By Italy = By.xpath("//android.view.ViewGroup[@content-desc=\"Italia\"]/android.widget.TextView");
    private By japan = By.xpath("//android.view.ViewGroup[@content-desc=\"日本 (Japan)\"]/android.widget.TextView");
    private By korea = By.xpath("//android.view.ViewGroup[@content-desc=\"한국 (Korea)\"]/android.widget.TextView");
    private By UK = By.xpath("//android.view.ViewGroup[@content-desc=\"U.K.\"]/android.widget.TextView");

    public HomeClass selectEspana(){
        driver.findElement(Espana).click();
        return new HomeClass(driver);
    }
    public HomeClass selectFrance(){
        driver.findElement(France).click();
        return new HomeClass(driver);
    }
    public HomeClass selectGrece(){
        driver.findElement(Grece).click();
        return new HomeClass(driver);
    }
    public HomeClass selectItaly(){
        driver.findElement(Italy).click();
        return new HomeClass(driver);
    }
    public HomeClass selectJapan(){
        driver.findElement(japan).click();
        return new HomeClass(driver);
    }
    public HomeClass selectKorea(){
        driver.findElement(korea).click();
        return new HomeClass(driver);
    }
    public HomeClass selectUK()
    {driver.findElement(UK).click();
     return new HomeClass(driver);
    }

}
