package tests;

import org.testng.annotations.Test;
import steps.MoodSteps;

public class AddReplyCommentTest extends BaseTest {

    @Test
    public void addReplyCommentToMood() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .addReplyComment("reply comment");
    }
}
