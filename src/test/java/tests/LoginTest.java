package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import steps.MoodSteps;


@Log4j2
public class LoginTest extends BaseTest {

    @Test
    public void loginUsingCorrectCredentials() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood();
    }
}
