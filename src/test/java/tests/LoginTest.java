package tests;

import org.testng.annotations.Test;
import pages.MyUpdatesPage;
import steps.MoodSteps;

public class LoginTest extends BaseTest {

    @Test
    public void loginUsingCorrectCredentials() {
        loginSteps.login("lenagmailinator.com", "qwerty12345");
        MoodSteps moodSteps = new MoodSteps();
        moodSteps.updateMood(8, "new comment");
    }
}
