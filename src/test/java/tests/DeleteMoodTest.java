package tests;

import org.testng.annotations.Test;
import steps.MoodSteps;

public class DeleteMoodTest extends BaseTest {

    @Test
    public void deleteMoodTest() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        MoodSteps moodSteps = new MoodSteps();
        moodSteps
                .openMyMood()
                .updateMood(7, "comment to be deleted")
                .deleteMood();
    }
}
