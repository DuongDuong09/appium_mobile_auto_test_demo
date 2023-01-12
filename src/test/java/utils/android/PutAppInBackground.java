package utils.android;

import page.android.BasePage;

import java.time.Duration;

public class PutAppInBackground extends BasePage {
    public void run_app_in_background(){
        driver.runAppInBackground(Duration.ofSeconds(30));
    }
}
