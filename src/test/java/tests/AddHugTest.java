package tests;

import org.testng.annotations.Test;

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
