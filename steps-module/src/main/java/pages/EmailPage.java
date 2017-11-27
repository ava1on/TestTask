package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.LetterBlock;

import java.util.List;

public class EmailPage{

    public EmailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "mail-MessageSnippet-Content")
    private List<LetterBlock> lettersList;

    public List<LetterBlock> getLettersList() {
        return lettersList;
    }
}
