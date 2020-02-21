package tests;

import org.testng.annotations.Test;
import steps.MoodSteps;

public class UpdateMoodTest extends BaseTest {

    @Test
    public void updateMyMoodTest() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .updateMood(6, "new NEW comment");
    }
}
