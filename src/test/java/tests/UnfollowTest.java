package tests;

import org.testng.annotations.Test;

public class UnfollowTest extends BaseTest {

    @Test
    public void clickUnfollow() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .clickUnfollow();
    }
}
