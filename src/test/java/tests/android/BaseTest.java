package tests.android;
import extent_report.ExtentReport;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.android.BasePage;
import page.android.LoginPage;
import record.RecordVideo;

import java.io.IOException;

public class BaseTest extends ExtentReport {
    RecordVideo recordVideo = new RecordVideo();
    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    @BeforeTest
    public void setupDriver(){
        recordVideo.startRecordVideo();
        basePage.initDriver();
    }

    @AfterTest
    public void tearDown() throws IOException {
        recordVideo.stopRecordVideo();
        basePage.tearDown();
    }
}

