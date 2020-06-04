package steps;

import io.qameta.allure.Step;
import pages.MyUpdatesPage;

public class MoodSteps {

    private MyUpdatesPage myUpdatesPage;

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
    public MoodSteps addReplyComment(int moodRate, String comment, String replyComment) {
        myUpdatesPage
                .clickUpdateMood()
                .updateMood(moodRate, comment);
        myUpdatesPage
                .replyOnComment(replyComment);
        return this;
    }

    @Step("Add Hug")
    public MoodSteps addHug(int moodRate, String comment) {
        myUpdatesPage
                .clickUpdateMood()
                .updateMood(moodRate, comment);
        myUpdatesPage
                .addHug();
        return this;
    }

    @Step("Click Follow")
    public MoodSteps clickFollow(int moodRate, String comment) {
        myUpdatesPage
                .clickUpdateMood()
                .updateMood(moodRate, comment);
        myUpdatesPage
                .clickFollow();
        return this;
    }

    @Step("Click Unfollow")
    public MoodSteps clickUnfollow() {
        myUpdatesPage
                .clickUnfollow();
        return this;
    }

    @Step("Verify Followers")
    public MoodSteps clickViewToSeeFollowers() {
        myUpdatesPage
                .checkFollowers();
        return this;
    }
}
