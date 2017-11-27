package pages.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class LoginBlock extends HtmlElement {

    @FindBy(id = "login")
    private HtmlElement loginField;

    @FindBy(id = "passwd")
    private HtmlElement passwordField;

    @FindBy(css = ".domik-submit-button")
    private Button loginButton;

    public HtmlElement getLoginField() {
        return loginField;
    }

    public HtmlElement getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }
}
