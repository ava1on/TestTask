import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import rules.WebDriverRule;
import steps.DefaultSteps;

public class EmailsTests {
    private final String LOGIN = "ava1on-test";
    private final String PASS = "asdfMy12";
    private DefaultSteps defaultSteps;


    @Rule
    public WebDriverRule webDriverRule = new WebDriverRule();

    @Before
    public void init() {
        defaultSteps = new DefaultSteps(webDriverRule.getDriver());
    }

    @Test
    public void checkEmailsNumberTest() {
        defaultSteps.openYandexMail();
        defaultSteps.clickOnLoginButton();
        defaultSteps.login(LOGIN, PASS);
        defaultSteps.shouldSeeAtLeastLetters(2);
    }
}
