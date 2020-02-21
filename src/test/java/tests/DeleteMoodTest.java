package tests;

import org.testng.annotations.Test;

public class DeleteMoodTest extends BaseTest {

    @Test
    public void deleteMoodTest() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .updateMood(7, "comment to be deleted")
                .deleteMood();
    }
}
