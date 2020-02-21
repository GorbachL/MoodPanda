package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.AfterMethod;
import utils.AllureUtils;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class LoginPage extends BasePage {

    public static final String URL = "https://moodpanda.com/Login/";
    public static final String LOGIN_BUTTON_CSS = "#ContentPlaceHolderContent_ButtonLogin";
    public static final String EMAIL_CSS = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASSWORD_CSS = "#ContentPlaceHolderContent_TextBoxPassword";

    public LoginPage openPage() {
        open(URL);
        isPageOpened();
        return this;
    }

    void isPageOpened() {
        $(LOGIN_BUTTON_CSS).shouldBe(Condition.visible);
    }

    public LoginPage login(String email, String password) {
        log.info("User logged in");
        $(EMAIL_CSS).sendKeys(email);
        $(PASSWORD_CSS).sendKeys(password);
        $(LOGIN_BUTTON_CSS).click();
        return this;
    }
}
