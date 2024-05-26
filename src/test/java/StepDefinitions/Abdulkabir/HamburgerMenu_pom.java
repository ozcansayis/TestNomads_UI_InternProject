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
    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement NewMessage;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-5\"]/div/button[2]/span/span")
    public WebElement Inbox;
    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement Outbox;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-5\"]/div/button[4]/span/span")
    public WebElement Trash;

    ///////////////////////////////////////////////05////
    @FindBy(css = "div[class='ng-star-inserted']>span")
    public WebElement newMessage02;
    @FindBy(css = "div[class='mdc-notched-outline__notch']>label>mat-label")
    public WebElement Receivers;
    @FindBy(xpath = "//ms-button[@icon='users-medical']/button/span[4]")
    public WebElement AddReceiver;
    @FindBy(css = "input[placeholder='Name, Username or E-mail']")
    public WebElement Name;
    @FindBy(css = "input[placeholder='Subject']")
    public WebElement Subject;
    @FindBy(css = "input[id='mat-mdc-checkbox-57-input']")
    public WebElement userBox;
    @FindBy(xpath = "//span[text()='Add']")
    public WebElement AddButton;
    @FindBy(xpath = "//div[text()='Users (Fullname, Username or E-mail) was successfully added']")
    public WebElement AddSM;
    @FindBy(xpath = "//button[@aria-label='Close dialog']/span[2]")
    public WebElement AddClose;
    @FindBy(css = "body[id='tinymce']")
    public WebElement MetinBox;
    @FindBy(xpath = "//span[text()='Send']")
    public WebElement MesageSend;
    @FindBy(css = "//tbody[@role='rowgroup']/tr/td[3]")
    public WebElement SendedSubject;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;
 //   @FindBy(css = "")
 //   public WebElement Receivers;



}
