package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenu_pom extends ParentPage {
    public HamburgerMenu_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
        @FindBy(xpath = "//input[@placeholder='Username']")
        public WebElement userName;
        @FindBy(xpath = "//input[@type='password']")
        public WebElement password;
        @FindBy(xpath = "//span[text()=' LOGIN ']")
        public WebElement Login;
        @FindBy(xpath = "//span[contains(text(),'Welcome')]")
        public WebElement welcomeText;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button/span[2]/fa-icon")
    public WebElement Hamburger;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-4\"]/div/button[1]/span/span")
    public WebElement Message;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-5\"]/div/button[1]/span/span")
    public WebElement NewMessage;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-5\"]/div/button[2]/span/span")
    public WebElement Inbox;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-5\"]/div/button[3]/span/span")
    public WebElement Outbox;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-5\"]/div/button[4]/span/span")
    public WebElement Trash;



}
