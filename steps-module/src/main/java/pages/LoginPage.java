package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.LoginBlock;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".domik-content")
    private LoginBlock loginBlock;

    public LoginBlock getLoginBlock() {
        return loginBlock;
    }
}
