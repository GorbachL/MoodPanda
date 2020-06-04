package tests;

import org.testng.annotations.Test;

public class ViewFollowersTest extends BaseTest {

    @Test
    public void clickView() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .clickViewToSeeFollowers();
    }
}
