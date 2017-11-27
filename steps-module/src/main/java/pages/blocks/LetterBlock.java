package pages.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class LetterBlock extends HtmlElement{

    @FindBy(className = "mail-MessageSnippet-FromText")
    public HtmlElement from;

    @FindBy(className = "mail-MessageSnippet-Item_body")
    public HtmlElement body;

    @FindBy(className = "mail-MessageSnippet-Item_dateText")
    public HtmlElement time;

    public HtmlElement getFrom() {
        return from;
    }

    public HtmlElement getBody() {
        return body;
    }

    public HtmlElement getTime() {
        return time;
    }
}
