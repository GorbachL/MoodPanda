package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import steps.LoginSteps;
import steps.MoodSteps;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Listeners(TestListener.class)
public class BaseTest {

    LoginSteps loginSteps;
    MoodSteps moodSteps;
    @BeforeClass
    public void setupDriver() {
        //Configuration.headless = true;
        //Configuration.browser = "Safari";
        Configuration.startMaximized = true;
        Configuration.timeout = 20000;
        //Configuration.clickViaJs = true;
        Configuration.screenshots = true;
        loginSteps = new LoginSteps();
        moodSteps = new MoodSteps();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
