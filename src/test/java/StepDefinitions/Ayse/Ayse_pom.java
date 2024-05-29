package StepDefinitions.Ayse;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

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

    //My finance
    @FindBy(css = "thead[class='ng-star-inserted']+tbody")
    public WebElement userInformation;

    @FindBy(css = "thead[class='ng-star-inserted']+tbody td:nth-child(8)")
    public WebElement totalRevenue;

    @FindBy(css = "thead[class='ng-star-inserted']+tbody td:nth-child(9)")
    public WebElement balance;

    @FindBy(css = "thead[class='ng-star-inserted']+tbody td:nth-child(10) button")
    public WebElement viewButton;

    @FindBy(css="div[class='mat-mdc-tab-labels']>div:nth-child(1)")
    public WebElement onlinePayment;

    @FindBy(css="div[class='mat-mdc-tab-labels']>div:nth-child(2)")
    public WebElement feeDetail;

    @FindBy(css = "div[class='mdc-radio']")
    public WebElement stripe;

    @FindBy(css = "[id^='mat-radio'][value='TOTAL_DEBT_AT_ONCE']")
    public WebElement payFull;

    @FindBy(css = "[value='TOTAL_DEBT_IN_INSTALLMENT']")
    public WebElement createPayment;

    @FindBy(css = "[class='mat-dialog-content']")
    public WebElement installmentPlans;

    @FindBy(css = "[aria-label='Close dialog']")
    public WebElement close;

    @FindBy(css = "[value='CURRENT_DEBT']")
    public WebElement payAmountDue;

    @FindBy(css = "[value='CUSTOM_AMOUNT']")
    public WebElement pay;

    @FindBy(css = "[placeholder='Amount']")
    public WebElement amount;

    @FindBy(css = "[caption='PAYMENT.FIELD.PAY']>button")
    public WebElement payButton;

    @FindBy(css = "[fxlayoutalign='center']>div")
    public WebElement paymentForm;

    @FindBy(css = "[name^='__privateStripeFrame']:nth-child(1)")
    public WebElement frame1;

    @FindBy(id = "Field-numberInput")
    public WebElement cardNumber;

    @FindBy(id = "Field-expiryInput")
    public WebElement expiration;

    @FindBy(id = "Field-cvcInput")
    public WebElement cvc;

    @FindBy(css = "form[id='payment-form']>button")
    public WebElement stripePaymentButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "(//thead[@class='ng-star-inserted'])[2]/tr/th/div")
    public WebElement x;

    @FindBy(xpath = "//div[text()=' Payment ']")
    public List<WebElement> typeList;

    @FindBy(css = "user-message-bell[class='ng-star-inserted'] button")
    public WebElement messageIcon;

    @FindBy(css ="[id^='ms-table-'] tbody tr:nth-child(2)")
    public WebElement ms_table_first;

    @FindBy(css = "[id^='ms-table-'] tbody tr:nth-child(2) td:nth-child(5) ms-standard-button")
    public WebElement ms_first_view;

    @FindBy(css = "user-message-list>div[class='ng-star-inserted']>div:nth-child(3)")
    public WebElement message_;

    @FindBy(css = "[caption='NAV.GRADING.TITLE'] button")
    public WebElement grading;

    @FindBy(css = "div[class='mat-mdc-tab-labels']>div:nth-child(1)")
    public WebElement courseGrade;

    @FindBy(css = "div[class='mat-mdc-tab-labels']>div:nth-child(2)")
    public WebElement studentTranscript;

    @FindBy(css = "[id='course-grade-print-button'] button")
    public WebElement download;

    @FindBy(css = "[icon='print'] button")
    public WebElement print;
}