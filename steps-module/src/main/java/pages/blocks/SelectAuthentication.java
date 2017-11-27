package pages.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class SelectAuthentication extends HtmlElement{

    @FindBy(css = ".new-hr-auth-Form_Button-enter")
    private Button login;

    public WebElement getLogin() {
        return login;
    }
}
