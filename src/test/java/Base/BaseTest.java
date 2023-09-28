
package Base;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.xml.sax.SAXException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class BaseTest {

    protected AndroidDriver driver;

   // @Parameters({ "device", "platformVersion", "apppackage","activity", "AppiumServer"})
    @BeforeClass
    public void init() throws MalformedURLException{

        DesiredCapabilities capabilities = new DesiredCapabilities();
      //  String apkPath = "/HUFFPOST/com.huffingtonpost.android-26.27.0.36770-release--dogfood.apk";
        String apkPath = "/HUFFPOST/com.huffingtonpost.android-27.4.0.38334-release--dogfood.apk";
        File app = new File(apkPath);

        capabilities.setCapability("deviceName", "Google Pixel XL II");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("maxTypingFrequency", "1");

        capabilities.setCapability("language", "en");
        capabilities.setCapability("locale", "US");
        capabilities.setCapability("console", true);
        capabilities.setCapability("network", false);
        capabilities.setCapability("visual", true);
        capabilities.setCapability("devicelog", true);
        capabilities.setCapability("app", app.getAbsolutePath());


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @AfterClass
    public void End(){driver.quit();}

}
