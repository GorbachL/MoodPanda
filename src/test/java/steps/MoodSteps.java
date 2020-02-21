package steps;

import io.qameta.allure.Step;
import pages.MyUpdatesPage;

public class MoodSteps {

    MyUpdatesPage myUpdatesPage;

    public MoodSteps() {
        myUpdatesPage = new MyUpdatesPage();
    }

    @Step("Open My Mood page")
    public MoodSteps openMyMood() {
        myUpdatesPage
                .openPage();
        return this;
    }

    @Step("Update of mood to '{moodRate}' with comment '{comment}'")
    public MoodSteps updateMood(int moodRate, String comment) {
        myUpdatesPage
                .clickUpdateMood()
                .updateMood(moodRate, comment);
        return this;
    }

    @Step("Delete Mood")
    public MoodSteps deleteMood() {
        myUpdatesPage
                .deleteMyMood();
        return this;
    }

    @Step("Add reply comment")
    public MoodSteps addReplyComment(String replyComment) {
        myUpdatesPage
                .replyOnComment(replyComment);
        return this;
    }

    @Step("Add Hug")
    public MoodSteps addHug() {
        myUpdatesPage
                .addHug();
        return this;
    }

    @Step("Click Follow")
    public MoodSteps clickFollow() {
        myUpdatesPage
                .clickFollow();
        return this;
    }
}
