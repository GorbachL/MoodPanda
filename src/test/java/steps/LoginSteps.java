package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage();
    }

    @Step("Login using email '{email}' and password '{password}'")
    public LoginSteps login(String email, String password) {
        loginPage
                .openPage()
                .login(email, password);
        return this;
    }
}
