package tests;

import org.testng.annotations.Test;
import steps.MoodSteps;

public class FollowersTest extends BaseTest {

    @Test
    public void clickFollowTest() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .clickFollow();
    }
}
