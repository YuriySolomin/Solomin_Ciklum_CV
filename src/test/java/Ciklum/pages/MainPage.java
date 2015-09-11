package Ciklum.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by solomin-y on 9/10/2015.
 */
public class MainPage extends Page {

    @FindBy(css = "[ng-click='newWrestler()']")
    private WebElement newButton;

    @FindBy(css = "[placeholder='Last name']")
    private WebElement lastName;

    @FindBy(css = "[placeholder='First name']")
    private WebElement firstName;

    @FindBy(css = "[placeholder='Date of Birth']")
    private WebElement dateOfBirth;

    @FindBy(css = "[placeholder='Middle name']")
    private WebElement middleName;

    @FindBy(css = "[value='wr.region1'] .select-ph")
    private WebElement regionLeft;

    @FindBy(css = "[value='wr.region2'] .select-ph")
    private WebElement regionRight;

    @FindBy(css = "[value='wr.fst1'] .select-ph")
    private WebElement fstLeft;

    @FindBy(css = "[value='wr.fst2'] .select-ph")
    private WebElement fstRight;

    @FindBy(css = "[value='wr.trainer1'] [placeholder='Trainer']")
    private WebElement trainerLeft;

    @FindBy(css = "[value='wr.trainer2'] [placeholder='Trainer']")
    private WebElement trainerRight;

    @FindBy(css = "[value='wr.style'] .select-ph")
    private WebElement style;

    @FindBy(css = "[value='wr.lictype'] .select-ph")
    private WebElement age;

    @FindBy(css = "[value='wr.expires'] .select-ph")
    private WebElement year;

    @FindBy(css = "[value='wr.card_state'] .ng-pristine")
    private WebElement noCard;

    @FindBy(css = ".buttons .btn.btn-lg.btn-success")
    private WebElement saveButton;

    @FindBy(css = "input[uploader='photoUploader']")
    private WebElement photoUploader;

    @FindBy(css = ".tab-heading")
    private WebElement mainTab;



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

    public void typeLastName(String value) {
        lastName.sendKeys(value);
    }

    public void typeFirstName(String value) {
        firstName.sendKeys(value);
    }

    public void typeDateOfBirth(String value) {
        dateOfBirth.sendKeys(value);
    }

    public void typeMiddleName(String value) {
        middleName.sendKeys(value);
    }

    public void selectRegionLeft(String value) {
        new Select(regionLeft).selectByVisibleText(value);
    }

    public void selectRegionRight(String value) {
        new Select(regionRight).selectByVisibleText(value);
    }

    public void selectFstLeft(String value) {
        new Select(fstLeft).selectByVisibleText(value);
    }

    public void selectFstRight(String value) {
        new Select(fstRight).selectByVisibleText(value);
    }

    public void typeTrainerLeft(String value) {
        trainerLeft.sendKeys(value);
    }

    public void typeTrainerRight(String value) {
        trainerRight.sendKeys(value);
    }

    public void selectStyle(String value) {
        new Select(style).selectByVisibleText(value);
    }

    public void selectAge(String value) {
        new Select(age).selectByVisibleText(value);
    }

    public void selectYear(String value) {
        new Select(year).selectByVisibleText(value);
    }

    public void selectNoCard(String value) {
        new Select(noCard).selectByVisibleText(value);
    }

    public MainPage clickSave() {
        saveButton.click();
        return createPage(MainPage.class);
    }

    public void uploadPhoto(String pathToLocal) {
        photoUploader.sendKeys(pathToLocal);
    }

    public MainPage clickMainTab() {
        mainTab.click();
        return createPage(MainPage.class);
    }

}
