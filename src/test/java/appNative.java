import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class appNative {
    private AppiumDriver<MobileElement> driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
//        desiredCapabilities.setCapability("appPackage", "com.example.myapplicationj");
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }
    @Test
    public void nativeTest(){
        String testItem = "4";
        nativeCalculator screen = new nativeCalculator(driver);
        String result = screen.calculation();
        Assert.assertEquals(result, testItem);
        System.out.println("2 + 2 = 4");
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
