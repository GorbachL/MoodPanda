package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import steps.MoodSteps;

public class AddHugTest extends BaseTest {

    @Test
    public void addHugToMood() {
        loginSteps
                .login("lenagmailinator.com", "qwerty12345");
        moodSteps
                .openMyMood()
                .addHug();
    }
}
