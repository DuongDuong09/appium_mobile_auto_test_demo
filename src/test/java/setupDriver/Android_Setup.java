package setupDriver;

import data_reader.PropertiesFileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class Android_Setup {
    public static AndroidDriver driver;
    public static PropertiesFileReader prop = new PropertiesFileReader();

    public static Properties getData() throws IOException {
        return prop.FileUpload();
    }

    public static AndroidDriver getAppiumDriver_Android() {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, getData().getProperty("platformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, getData().getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, getData().getProperty("udid"));
            desiredCapabilities.setCapability("app","src/test/java/app/Android-NativeDemoApp-0.4.0.apk");
            desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
            desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

            URL appiumServer = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver(appiumServer, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}
