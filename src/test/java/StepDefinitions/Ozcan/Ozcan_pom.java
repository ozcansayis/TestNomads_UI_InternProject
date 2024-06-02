package StepDefinitions.Ozcan;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Ozcan_pom extends ParentPage {
    public Ozcan_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // login
    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    // menu items
    @FindBy(css = "[aria-haspopup='menu']")
    public WebElement burgerMenu;

    @FindBy(xpath = "//*[@id='mat-menu-panel-4']//button[2]")
    public WebElement bFinance;

    @FindBy(css = "[id='mat-menu-panel-6'] button")
    public WebElement myFinance;

    @FindBy(css = "[caption='NAV.CALENDAR_EVENT.TITLE'] button")
    public WebElement calendar;

    // table
    @FindBy(css = "[class='example-full-width full-size example-container-grid'] cdk-virtual-scroll-viewport+div>div>button")
    public WebElement threeDot;

    @FindBy(css = "[id='mat-menu-panel-18'] button+button")
    public WebElement report;

    @FindBy(css = "tbody[class='ng-star-inserted'] td[rowspan]")
    public List<WebElement> lessons;

    @FindBy(css = "tbody[class='ng-star-inserted'] td[rowspan] [class='mat-badge-content mat-badge-active']")
    public List<WebElement> publishedLessons;

    @FindBy(css = "[formgroup='[object Object]'] span")
    public List<WebElement> courseData;

    @FindBy(xpath = "//*[text()='Course Meeting has not been started yet']")
    public WebElement npMessage;

    @FindBy(xpath = "(//*[contains(@aria-describedby,'cdk-describedby-message-ng') and @class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")
    public WebElement previous;

    @FindBy(css = "[style='transform: translateX(0px);'] >[class='mat-mdc-tab-labels'] > div")
    public List<WebElement> infoTab;

    @FindBy(css = "[caption='MEETINGS.TITLE.RECORDING']")
    public WebElement recording;

    @FindBy(css = "iframe[class='ng-star-inserted']")
    public WebElement iframe;

    @FindBy(css = "[title='Play Video']")
    public WebElement playButton;

    @FindBy(css = "[class='vjs-remaining-time-display']")
    public WebElement timer;
}
