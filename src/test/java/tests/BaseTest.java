package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import steps.LoginSteps;

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
}
