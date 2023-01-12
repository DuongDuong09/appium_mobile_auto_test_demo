package page.android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage extends BasePage {
    By loginLabel = By.id("Login");
    By emailTxtBx = By.id("input-email");
    By passwordTxtBx = By.id("input-password");
    By loginBtn = By.id("button-LOGIN");
    By successTitle= By.id("android:id/alertTitle");
    public void click_on_login_label() {
        if (driver.findElement(loginLabel).isDisplayed()) {
            driver.findElement(loginLabel).click();
        }
    }
    public void enter_email_input(){
        if(driver.findElement(emailTxtBx).isDisplayed()){
            driver.findElement(emailTxtBx).sendKeys("duonguyen0811@gmail.com");
        }
    }
    public void enter_password_input(){
        if(driver.findElement(passwordTxtBx).isDisplayed()){
            driver.findElement(passwordTxtBx).sendKeys("password");
        }
    }
    public void click_login_btn(){
        if(driver.findElement(loginBtn).isDisplayed()){
            driver.findElement(loginBtn).click();
        }
    }
    public void get_success_title(){
        if(driver.findElement(successTitle).isDisplayed()){
            driver.findElement(successTitle).getText();
        }
    }
//     test handle  elements and fluent wait
    List<MobileElement> loginTextElements=driver.findElementsByXPath("//*[@text='Login']");
    public void test_multiple_elements(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.xpath("//*[@text='Login']"),2));
        loginTextElements.get(1).click();
    }

}
