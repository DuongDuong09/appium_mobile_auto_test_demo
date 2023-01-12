package page.android;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import setupDriver.Android_Setup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public static AndroidDriver driver;
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    static Android_Setup android_setup = new Android_Setup();

    public AndroidDriver initDriver() {
        driver = android_setup.getAppiumDriver_Android();
        return driver;
    }

    public void tearDown() throws IOException {
        driver.quit();
    }

    public void takeScreenShot() {
        File formScreenBase64Data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String formScreenFilePath = System.getProperty("user.dir") + "/screenshot/" + "formScreen.png";
        try {
            FileUtils.copyFile(formScreenBase64Data, new File(formScreenFilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

