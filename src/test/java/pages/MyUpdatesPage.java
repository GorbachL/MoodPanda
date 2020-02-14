package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class MyUpdatesPage extends BasePage {

    public static final String URL = "https://moodpanda.com/Feed/?Me=1";
    public static final String TOOLBAR_CSS = "#";
    public static final String UPDATE_MOOD_CSS = "#LinkUpdate";


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
}
