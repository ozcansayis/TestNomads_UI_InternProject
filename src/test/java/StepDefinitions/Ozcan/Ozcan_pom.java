package StepDefinitions.Ozcan;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ozcan_pom extends ParentPage {
    public Ozcan_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // login
    @FindBy(css = "[placeholder='Username']")
    public WebElement username;

    @FindBy(css = "[placeholder='Password']")
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

    // table buttons
    @FindBy (css = "[class='example-full-width full-size example-container-grid'] cdk-virtual-scroll-viewport+div>div>button")
    public WebElement threeDot;

    @FindBy(css = "[id='mat-menu-panel-18'] button+button")
    public WebElement report;
}
