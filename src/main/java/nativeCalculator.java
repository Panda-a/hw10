import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class nativeCalculator {
    AppiumDriver<MobileElement> driver;

    @AndroidFindBy(accessibility = "Calculator")
    private MobileElement openApp;
    @AndroidFindBy(id = "com.akarshit.calculator:id/two")
    private MobileElement clickNumber;
    @AndroidFindBy(id = "com.akarshit.calculator:id/plus")
    private MobileElement clickPlus;
    @AndroidFindBy(id ="com.akarshit.calculator:id/result")
    private MobileElement operationResult;
    public String calculation(){
        openApp.click();
        clickNumber.click();
        clickPlus.click();
        clickNumber.click();

        return operationResult.getText();
    }

    public nativeCalculator(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }



}
