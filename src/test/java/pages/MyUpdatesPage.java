package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

@Log4j2
public class MyUpdatesPage extends BasePage {

    private static final String URL = "https://moodpanda.com/Feed/?Me=1";
    private static final String TOOLBAR_CSS = ".navbar-hidesmalla";
    private static final String UPDATE_MOOD_CSS = "#LinkUpdate";
    private static final String ADDED_BLOCKS_MOOD_CSS = ".rounded-top-corner";
    private static final String DELETE_MOOD_CSS = ".ButtonDelete";
    private static final String COMMENT_IN_BLOCK_CSS = ".MoodPostItem.media-content";
    private static final String CLICK_ON_COMMENT_CSS = ".glyphicon.glyphicon-comment";
    private static final String REPLY_INPUT_CSS = ".form-control.InputReply";
    private static final String REPLY_BUTTON_CSS = ".btn-sm.ButtonReply";
    private static final String HUG_UNDER_COMMENT_CSS = ".ButtonHug .glyphicon.glyphicon-heart";
    private static final String HUGS_COUNT_CSS = ".col-xs-6.col-md-3 .glyphicon.glyphicon-heart";
    private static final String FOLLOW_UNDER_COMMENT_CSS = ".FeedFollow .glyphicon.glyphicon-star";
    private static final String FOLLOWERS_COUNT_CSS = ".col-xs-6.col-md-3 .FollowLiteral";


    public MyUpdatesPage openPage() {
        open(URL);
        isPageOpened();
        return this;
    }

    void isPageOpened() {
        $(TOOLBAR_CSS).shouldBe(Condition.visible);
    }

    public RateHappinessModal clickUpdateMood() {
        refresh();
        $(UPDATE_MOOD_CSS).click();
        RateHappinessModal modal = new RateHappinessModal();
        modal.isPageOpened();
        return modal;
    }

    public MyUpdatesPage deleteMyMood() {
        int countMoodBlocks = $$(ADDED_BLOCKS_MOOD_CSS).size();
        $(DELETE_MOOD_CSS).click();
        refresh();
        log.info("Mood block should be deleted");
        $$(ADDED_BLOCKS_MOOD_CSS).shouldHaveSize(countMoodBlocks - 1);
        return this;
    }

    public void replyOnComment(String replyComment) {
        $(CLICK_ON_COMMENT_CSS).click();
        $(REPLY_INPUT_CSS).shouldBe(Condition.visible).click();
        $(REPLY_INPUT_CSS).sendKeys(replyComment);
        log.info("Reply on Comment << " + replyComment + " >>");
        $(REPLY_BUTTON_CSS).click();
    }

    public void addHug() {
        String countHugsBefore = $(HUGS_COUNT_CSS).getText();
        log.info("Count HUG before text >> " + countHugsBefore);
        $(HUG_UNDER_COMMENT_CSS).click();
        refresh();
        String countHugsAfter = $(HUGS_COUNT_CSS).getText();
        log.info("Count HUG after text >> " + countHugsAfter);
    }

    public void clickFollow() {
        String countFollowersBefore = $(FOLLOWERS_COUNT_CSS).getText();
        log.info("Count Followers before text >> " + countFollowersBefore);
        $(FOLLOW_UNDER_COMMENT_CSS).click();
        refresh();
        String countFollowersAfter = $(FOLLOWERS_COUNT_CSS).getText();
        log.info("Count Followers before text >> " + countFollowersAfter);
    }
}
