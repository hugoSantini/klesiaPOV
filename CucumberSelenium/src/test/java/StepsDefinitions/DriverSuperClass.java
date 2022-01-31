package StepsDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverSuperClass {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static JavascriptExecutor jse;

    protected WebDriverWait getWait(){
        if (wait == null) {
            wait = new WebDriverWait(getDriver(),20);
        }
        return wait;
    }
    protected WebDriver getDriver(){
        return driver;
    }

    protected JavascriptExecutor getJse(){
        if (jse == null) {
            jse = (JavascriptExecutor)driver;
        }
        return jse;
    }

    protected void setupChromeDriver(boolean cookies){
        //false = pas de cookies | true = des cookies
        if (driver == null && cookies == true) {
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--headless");
            this.driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        if (driver == null && cookies == false) {
            DesiredCapabilities caps = new DesiredCapabilities();

            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<String, Object>();
            Map<String, Object> profile = new HashMap<String, Object>();
            Map<String, Object> contentSettings = new HashMap<String, Object>();

            contentSettings.put("cookies",2);
            profile.put("managed_default_content_settings",contentSettings);
            prefs.put("profile",profile);
            options.setExperimentalOption("prefs",prefs);
            options.addArguments("--headless");
            caps.setCapability(ChromeOptions.CAPABILITY,options);
            this.driver = new ChromeDriver(caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }


}
