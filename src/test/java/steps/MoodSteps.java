package steps;

import io.qameta.allure.Step;
import pages.MyUpdatesPage;

public class MoodSteps {

    MyUpdatesPage myUpdatesPage;

    public MoodSteps() {
        myUpdatesPage = new MyUpdatesPage();
    }

    @Step("Update of mood to '{moodRate}' with comment '{comment}'")
    public MoodSteps updateMood(int moodRate, String comment) {
        myUpdatesPage
                .openPage()
                .clickUpdateMood()
                .updateMood(moodRate, comment);
        return this;
    }
}
