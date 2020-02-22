package pages;

import com.codeborne.selenide.Condition;
import com.google.gson.annotations.Until;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.AfterMethod;
import utils.AllureUtils;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j2
public class LoginPage extends BasePage {

    public static final String URL = "https://moodpanda.com/Login/";
    public static final String LOGIN_BUTTON_CSS = "#ContentPlaceHolderContent_ButtonLogin";
    public static final String EMAIL_CSS = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASSWORD_CSS = "#ContentPlaceHolderContent_TextBoxPassword";

    private static final String TOOLBAR_CSS = ".navbar-hidesmalla";

    public LoginPage openPage() {
        open(URL);
        isPageOpened();
        return this;
    }

    void isPageOpened() {
        $(LOGIN_BUTTON_CSS).shouldBe(Condition.visible);
    }

    public LoginPage login(String email, String password) {

        AllureUtils.takeScreenshot(getWebDriver());
        $(EMAIL_CSS).click();
        //$(EMAIL_CSS).sendKeys(email);
        $(EMAIL_CSS).val(email).shouldHave(Condition.value(email));
        sleep(1000);

        AllureUtils.takeScreenshot(getWebDriver());
        $(PASSWORD_CSS).click();
       // $(PASSWORD_CSS).sendKeys(password);
        $(PASSWORD_CSS).val(password);
        sleep(1000);

        AllureUtils.takeScreenshot(getWebDriver());
        $(LOGIN_BUTTON_CSS).click();

        log.info("User logged in");

        $(TOOLBAR_CSS).shouldBe(Condition.visible);
        AllureUtils.takeScreenshot(getWebDriver());
        return this;
    }
}
