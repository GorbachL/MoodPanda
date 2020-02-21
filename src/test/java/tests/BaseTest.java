package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import steps.LoginSteps;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Listeners(TestListener.class)
public class BaseTest {

    LoginSteps loginSteps;

    @BeforeClass
    public void setupDriver() {
        //Configuration.headless = true;
        //Configuration.browser = "Safari";
        Configuration.startMaximized = true;
        Configuration.timeout = 20000;
        //Configuration.clickViaJs = true;
        Configuration.screenshots = true;
        loginSteps = new LoginSteps();
    }

    @AfterMethod (alwaysRun = true)
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
