package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class CoreTestCase extends TestCase {

    private static final String PLATFORM_IOS = "ios";
    private static final String PLATFORM_ANDROID = "android";
    private static final String AppiumURL = "http://127.0.0.1:4723/wd/hub";

    protected AppiumDriver driver;

    @Override
    public void setUp() throws Exception {

        super.setUp();
        DesiredCapabilities capabilities = this.getCapabilitiesByPlatformEnv();
                driver = new AndroidDriver(new URL(AppiumURL), capabilities);
        this.rotateScreenPortrait();

    }

    @Override
    public void tearDown() throws Exception {
        driver.quit();
        super.tearDown();
    }

    protected void rotateScreenPortrait() {
        driver.rotate(ScreenOrientation.PORTRAIT);
    }

    protected void rotateScreenLandscape() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

    protected void backgroundApp(int seconds) {
        driver.runAppInBackground(Duration.ofMillis(seconds));
    }

    private DesiredCapabilities getCapabilitiesByPlatformEnv() throws Exception
    {
        String platform = System.getenv("PLATFORM");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if(platform.equals(PLATFORM_ANDROID))
        {
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "AndroidDevice");
            capabilities.setCapability("platformVersion", "8.0");
            capabilities.setCapability("AutomationName", "Appium");
            capabilities.setCapability("appPackage", "org.wikipedia");
            capabilities.setCapability("appActivity", ".main.MainActivity");
            capabilities.setCapability("app", "Users/alekseyverin/JAA_MY/apks/org.wikipedia.apk");
        }
        else if (platform.equals(PLATFORM_IOS)) {
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("deviceName", "iPhone X");
            capabilities.setCapability("platformVersion", "12.0");
            capabilities.setCapability("app", "Users/alekseyverin/JAA_MY/apks/Wikipedia.app");
        }
        else {
            throw new Exception("Can't get run platform from env variable. Platform value " + platform);
        }
        return capabilities;
    }
}