package page.android;

import org.openqa.selenium.By;
import utils.android.MobileAction;


public class FormsPage extends BasePage {
    MobileAction mobileAction=new MobileAction();
    By formsLabel = By.id("Forms");
    By switchElement = By.id("switch");
    By switchTextElement = By.id("switch-text");
    By dropdownMenuElement = By.id("select-Dropdown");
    By firstOption = By.xpath("//*[@text='webdriver.io is awesome']");

    public void click_on_forms_label() {
        if (driver.findElement(formsLabel).isDisplayed()) {
            driver.findElement(formsLabel).click();
        }
    }

    public void click_on_switch_toggle_btn() {
        if (driver.findElement(switchElement).getText().equals("Click to turn the switch OFF")) {
            driver.findElement(switchElement).click();
        }
    }

    public void check_toggle_btn_value() {
        System.out.println(driver.findElement(switchTextElement).getText());
    }

    public void click_on_dropdown_menu() {
        if (driver.findElement(dropdownMenuElement).isDisplayed()) {
            driver.findElement(dropdownMenuElement).click();
        }
    }

    public void select_the_first_option_dropdownMenu() {
        if (driver.findElement(firstOption).isDisplayed()) {
            driver.findElement(firstOption).click();
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
    public void swipe_vertical(){
        mobileAction.verticalSwipeByPercentages(0.9,0.5,0.6);
    }
}
