package StepDefinitions.Fatos;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Fatos_pom extends ParentPage {
    public Fatos_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[placeholder='Kullanıcı Adı']")
    public WebElement username;
    @FindBy(css = "[placeholder='Parola']")
    public WebElement password;
    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath="/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[1]")
    public WebElement logo;
    @FindBy(xpath="/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]")
    public WebElement allElement;
    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]")
    public WebElement allElement2;
    @FindBy(xpath = "//*[@id='payment-element']/div/iframe")
    public WebElement iframecard;

    @FindBy(xpath = "//ms-layout-menu-button[contains(@caption, 'COURSE.TITLE.BROWSER')]")
    public WebElement coursess;

    @FindBy(xpath = "//ms-layout-menu-button[contains(@caption, 'NAV.CALENDAR_EVENT.TITLE')]")
    public WebElement calendarr;

    @FindBy(xpath = "//ms-layout-menu-button[contains(@caption, 'NAV.ATTENDANCE.TITLE')]")
    public WebElement atteendancee;

    @FindBy(xpath = "//ms-layout-menu-button[contains(@caption, 'MY_PAGE.TAB_TITLE.ASSIGNMENTS')]")
    public WebElement assignmentss;

    @FindBy(xpath = "//ms-layout-menu-button[contains(@caption, 'NAV.GRADING.TITLE.BROWSER')]'")
    public WebElement gradingg;

    @FindBy(xpath="/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[4]/button")
    public WebElement assignments18;
    @FindBy(xpath="//span[text()='Grading']")
    public WebElement grading;
    @FindBy(css = "[aria-haspopup='menu'] span:nth-child(2)")
    public WebElement hamburgerMenu18;
    @FindBy(xpath= "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-chat-bell/button")
    public WebElement Chatmessage;
    @FindBy(css="user-message-bell[class='ng-star-inserted'] button" )
    public WebElement message;
    @FindBy(css = "//a[contains(text(),'Profile')]")
    public WebElement prof;
    @FindBy(css = "[role='menuitem']:nth-child(3)")
    public WebElement finance;
    @FindBy(xpath = "//*[text()='My Finance']")
    public WebElement MyFinance;

    @FindBy(xpath = "//*[@id='ms-table-0']/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[1]/td[2]/student-image/div/div[2]/div[1]")
    public WebElement student;
    @FindBy(xpath= "//label[@class='mdc-label' and @for='mat-radio-8-input']")
    public WebElement stripe;
    @FindBy(xpath= "//label[@for='mat-radio-11-input']")
    public WebElement Payful  ;
    @FindBy(xpath="//input[@id='mat-radio-10-input']")
    public WebElement Pay ;
    @FindBy(xpath ="//input[@id='ms-currency-field-0']")
    public WebElement paymentamount;
    @FindBy(css = "div[role='tab']:nth-child(1)")
    public WebElement onlinePayment;
    @FindBy(css="ms-button")
    public WebElement Paybuton ;

    @FindBy(xpath="//*[@id='Field-numberInput']")
    public WebElement number;

    @FindBy(xpath="//*[@id='Field-expiryInput']")
    public WebElement Expiration;

    @FindBy(xpath="//*[@id='Field-cvcInput']")
    public WebElement cvc;

    @FindBy(xpath = "//*[@id='payment-form']/button")
    public WebElement completePaymentButtonn;

    @FindBy(css = "body > div.cdk-overlay-container")
    public WebElement AssignmentCount;

    @FindBy( xpath ="//span[text()='Fee/Balance Detail']")
    public WebElement feebalanse;

    @FindBy( xpath ="//div[contains(text(),'successfully')]")
    public WebElement ms1;

    @FindBy( id="//div[@id='elementID']")
    public WebElement element9;

    @FindBy(xpath="//*[@id='ms-table-5']/div/cdk-virtual-scroll-viewport/div[1]/table/tbody")
    public List<WebElement> BalanceDetail;

    @FindBy(xpath="/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-chat-bell/button")
    public WebElement ChatMessage;

    @FindBy(css="button[aria-label='Close dialog']")
    public WebElement closeButton;
    @FindBy(css="button.mat-mdc-tooltip-trigger.mdc-icon-button.mat-mdc-icon-button.mat-unthemed.mat-mdc-button-base[aria-describedby='cdk-describedby-message-ng-1-13']")
    public WebElement newMessage;

    @FindBy(xpath="/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/button/span[2]/div/div")
    public WebElement Profil;

    @FindBy(xpath="/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/button/span[2]/div/user-image")
    public WebElement exit;
    @FindBy(xpath="//button[contains(@class, 'mat-mdc-menu-item') and .//span[text()='Sign Out']]")
    public WebElement signOut;
}