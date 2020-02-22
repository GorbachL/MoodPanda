package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.AllureUtils;

import java.text.Format;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

@Log4j2
public class RateHappinessModal extends BasePage {

    private static final String COMMENT_CSS = "#TextBoxUpdateMoodTag";

    @Deprecated
    /**
     DO NOT USE THIS METHOD BECAUSE IT IS A MODAL AND CANNOT BE OPEN DIRECTLY
     **/

    RateHappinessModal openPage() {
        return this;
    }

    void isPageOpened() {
        $(COMMENT_CSS).shouldBe(Condition.visible);
    }

    /**
     * @param moodRate цифра, отражающая настроение (9 - значит 9)
     * @param comment  комментарий
     * @return
     */

    public RateHappinessModal updateMood(int moodRate, String comment) {
        $(By.id("slider-range-min")).find("a").click();
        int difference = moodRate - 5; //TODO remove refresh calculate current state
        Keys key;
        if (difference < 0) {
            key = Keys.ARROW_LEFT;
        } else {
            key = Keys.ARROW_RIGHT;
        }
        for (int i = 0; i < Math.abs(difference); i++) {
            $(By.id("slider-range-min")).find("a").sendKeys(key);
        }

        $(COMMENT_CSS).click();
        sleep(1000);
        $(COMMENT_CSS).sendKeys(comment);
        $(COMMENT_CSS).shouldHave(Condition.value(comment));
        log.info("User added comment");
        sleep(1000);
        log.info("Save comment");
        $(byXpath("//*[@class='btn btn-sm btn-primary ButtonUpdate']")).click();

        $(byText("Done")).click();
        log.info("Mood Updated");

        refresh();
        $(byText(comment)).shouldBe(Condition.visible);
        log.info("Comment << " + comment + " >> should be displayed on the page");
        return this;
    }
}
