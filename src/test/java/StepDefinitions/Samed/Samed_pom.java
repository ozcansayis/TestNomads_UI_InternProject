package StepDefinitions.Samed;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Samed_pom  {
    public Samed_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    public WebElement username;
    @FindBy(css = "[placeholder='Password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[contains( text(), 'Welcome' ) ]")
    public WebElement helperT;
    @FindBy(css = "[aria-haspopup='menu'] span:nth-child(2)")
    public WebElement hamburgerMenu;
    @FindBy(css = "[role='menuitem']:nth-child(3)")
    public WebElement finance;
    @FindBy(xpath = "//*[text()='My Finance']")
    public WebElement MyFinance;
    @FindBy(css = "div[_ngcontent-ng-c1362440916] div:nth-child(2)")
    public WebElement student;
    @FindBy(css = "div[role='tab']:nth-child(1)")
    public WebElement onlinePayment;
    @FindBy(css = "div[role='tab']:nth-child(2)")
    public WebElement feeBalance;
    @FindBy(css = "balance[class*='ng']")
    List<WebElement> balance;
    @FindBy(css = "button[class*='button']:nth-child(4)")
    public WebElement profilePic;
    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settings;
    @FindBy(css = "button[color='accent']")
    public WebElement save;
    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement helperT2;
    @FindBy(xpath = "//*[text()='Default Theme']")
    public WebElement theme;
    @FindBy(css = "[value='purple-theme']")
    public WebElement PurpleTheme;
    @FindBy(css = "[value='dark-purple-theme']")
    public WebElement DarkPurpleTheme;
    @FindBy(css = "[value='indigo-theme']")
    public WebElement Indigo;
    @FindBy(css = "[value='default-theme']")
    public WebElement defaultx;

    public WebElement getWebElement(int x) {
        switch (x) {
            case 1:
                return this.defaultx;
            case 2:
                return this.PurpleTheme;
            case 3:
                return this.Indigo;
            case 4:
                return this.DarkPurpleTheme;

        }
        return null;
    }

}
