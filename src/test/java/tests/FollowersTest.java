package tests;

import org.testng.annotations.Test;

public class FollowersTest extends BaseTest {

    @Test
    public void clickFollowTest() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .clickFollow(4, "comment for follower");
    }
}