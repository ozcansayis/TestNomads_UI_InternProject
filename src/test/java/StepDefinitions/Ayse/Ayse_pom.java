package StepDefinitions.Ayse;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Ayse_pom extends ParentPage {

    public Ayse_pom() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;


    @FindBy(className = "mdc-button__label")
    public WebElement loginButton;

    // Hamburger Menu

    @FindBy(css = "[aria-haspopup='menu']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//div[@class='cdk-overlay-container']/div[2]//button[2]")
    public WebElement finance;

    @FindBy(xpath = "//div[@class='cdk-overlay-container']/div[3]//button")
    public WebElement myFinance;

    //my finance

    @FindBy(css = "thead[class='ng-star-inserted']+tbody")
    public WebElement userInformation;

    @FindBy(css = "thead[class='ng-star-inserted']+tbody td:nth-child(10) button")
    public WebElement viewButton;

}