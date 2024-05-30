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

    /////////////////////////////06////////////////////////

    @FindBy(xpath = "((//tbody/tr/td)[6])/div/ms-confirm-button")
    public WebElement MoveToTrash01;
    @FindBy(xpath = "//tbody[@class='mdc-data-table__content ng-star-inserted']/tr[2]/td[6]/div/ms-confirm-button")
    public WebElement MoveToTrash02;

    //tbody[@class='mdc-data-table__content ng-star-inserted']/tr[2]/td[6]/div/ms-confirm-button
    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement confirmYesButton;
    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement confirmMessage;

    ////////////////////// 07 ///////////////////////

    @FindBy(xpath = "//*[@id=\"ms-table-3\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[1]/td[7]/div[1]/ms-delete-button/button/span[1]")
    public WebElement TrashDelete1;
    @FindBy(xpath = "//tbody/tr[2]/td[7]/div/ms-delete-button")
    public WebElement TrashDelete2;
    @FindBy(xpath = "//mat-dialog-actions[@class='mat-mdc-dialog-actions mdc-dialog__actions']/div/div/button[1]/span[1]")
    public WebElement Cancel;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/div/ms-standard-button")
    public WebElement Restore;
    @FindBy(xpath = "//mat-dialog-actions[@class='mat-mdc-dialog-actions mdc-dialog__actions']/div/div/button[2]/span[1]")
    public WebElement TrashDeleteDelete;
    @FindBy(xpath = "//app-simple-dialog[@class='mat-mdc-dialog-component-host ng-star-inserted']/div/div/div")
    public WebElement TrashDeleteMessage;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
   // @FindBy(css = "")
   // public WebElement sfsfs;
   // @FindBy(css = "")
   // public WebElement sfsfs;
   // @FindBy(css = "")
   // public WebElement sfsfs;
   // @FindBy(css = "")
   // public WebElement sfsfs;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "NewMessage":
                return this.NewMessage;
            case "passwordInput":
                return this.password;
            case "Inbox":
                return this.Inbox;
            //     case "Outbox":
            //         return this.Outbox;
            case "Trash":
                return this.Trash;
            case "confirmButton":
                //          return this.confirmButton;
                //      case "MyFinanceButton":
                //          return this.MyFinanceButton;
                //      case "viewButton":
                //          return this.viewButton;
                //      case "payAmountDue":
                //          return this.payAmountDue;
                //      case "payButton":
                //          return this.payButton;


        }
        return null;


    }
}