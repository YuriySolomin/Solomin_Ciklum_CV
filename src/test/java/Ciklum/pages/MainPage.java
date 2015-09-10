package Ciklum.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by solomin-y on 9/10/2015.
 */
public class MainPage extends Page {

    @FindBy(css = "[ng-click='newWrestler()']")
    private WebElement newButton;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getNewButton() {
        return newButton;
    }

    public MainPage clickNewButton() {
        newButton.click();
        return createPage(MainPage.class);
    }
}
