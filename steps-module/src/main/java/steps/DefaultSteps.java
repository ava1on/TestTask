package steps;

import org.openqa.selenium.WebDriver;
import pages.EmailPage;
import pages.LoginPage;
import pages.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class DefaultSteps {
    public static final String YANDEX_MAIL = "http://mail.yandex.ru";

    private WebDriver driver;

    public DefaultSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void openYandexMail(){
        driver.get(YANDEX_MAIL);
    }

    public LoginPage clickOnLoginButton() {
        onMainPage()
                .getAuthBlock()
                .getLogin()
                .click();
        return new LoginPage(driver);
    }

    public void login(String login, String password) {
        onLoginPage().getLoginBlock().getLoginField().sendKeys(login);
        onLoginPage().getLoginBlock().getPasswordField().sendKeys(password);
        onLoginPage().getLoginBlock().getLoginButton().click();
    }

    public void shouldSeeAtLeastLetters(int n) {
        assertThat("должны видеть не менее " + n + " писем", onEmailPage().getLettersList().size(),
                greaterThanOrEqualTo(n));
    }

    private MainPage onMainPage() {
        return new MainPage(driver);
    }

    private LoginPage onLoginPage() {
        return new LoginPage(driver);
    }

    private EmailPage onEmailPage() {
        return new EmailPage(driver);
    }
}
