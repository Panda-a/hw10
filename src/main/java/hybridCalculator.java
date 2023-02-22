import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class hybridCalculator {
    AppiumDriver<MobileElement> driver;

    @AndroidFindBy(id = "com.dmytro.herasymchuk.hybridapp:id/search_field")
    private MobileElement searchField;
    @AndroidFindBy(id = "com.dmytro.herasymchuk.hybridapp:id/search_btn")
    private MobileElement goBtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[14]")
    private MobileElement firstNumber;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]")
    private MobileElement plusOperation;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[26]")
    private MobileElement equalOperation;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
    public MobileElement operationResult;
    public String addSearch() {
        searchField.sendKeys("https://www.calculator.net");
        goBtn.click();
        firstNumber.click();
        plusOperation.click();
        firstNumber.click();
        equalOperation.click();

        return operationResult.getText();
    }



    public hybridCalculator(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }
}
