package utils.android;

import org.openqa.selenium.NotFoundException;
import page.android.BasePage;

public class InteractMultipleApp extends BasePage {
    public void interact_multiple_application(){
        driver.activateApp("com.android.settings");
        driver.findElementByXPath("//*[@text='Wi-Fi']").click();
        try{
            boolean isWifiOn=driver.findElementByXPath("//*[@text='On']").isDisplayed();
        }catch (NotFoundException notFoundException){
            notFoundException.printStackTrace();
        }
    }
}
