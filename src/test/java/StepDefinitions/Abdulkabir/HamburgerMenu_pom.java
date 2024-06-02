package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement Inbox;
    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement Outbox;
    @FindBy(xpath = "//*[text()='Trash']")
    public WebElement Trash;

    ///////////////////////////////////////////////05///////////////

    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement newMessage;

    @FindBy(css = "ms-button[tooltip$=RECEIVER]")
    public WebElement addReceiverBtn;

    @FindBy(xpath = "//tbody[@class='mdc-data-table__content ng-star-inserted']/tr[2]/td[4]")
    public WebElement addreceiverUser;
    @FindBy(xpath = "//span[text()=\"Add & Close\"]")
    public WebElement addCloseBtn;

    @FindBy(xpath = "//span[text()=\"Add\"]")
    public WebElement addBtn;

    @FindBy(css = "input[placeholder=\"Name, Username or E-mail\"]")
    public WebElement receiverSearch;
    @FindBy(xpath = "//div[contains(text(), \"successfully added\")]")
    public WebElement successMsg;
    @FindBy(css = "ms-text-field[placeholder$=SUBJECT] input")
    public WebElement subjectBox;
    @FindBy(css = "ms-button[caption$=SEND]")
    public WebElement sendButton;
    @FindBy(css = "iframe[title=\"Rich Text Area\"]")
    public WebElement richTextAreaFrame;
    @FindBy(css = "body[id=\"tinymce\"] p")
    public WebElement richTextArea;
    @FindBy(xpath = "//div[contains(text(),'Message Successfully sent')]")
    public WebElement sentMessage;
    /////////////////////////////06////////////////////////

    @FindBy(xpath = "((//tbody/tr/td)[6])/div/ms-confirm-button")
    public WebElement MoveToTrash01;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement confirmYesButton;
    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement confirmMessage;

    ////////////////////// 07 ///////////////////////

    public WebElement trashIcon;
    @FindBy(xpath = "//ms-standard-button[@icon='trash-restore']")
    public WebElement restoreIcon;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//*[text()=' Delete ']")
    public WebElement delete;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "NewMessage":
                return this.NewMessage;
            case "passwordInput":
                return this.password;
            case "Inbox":
                return this.Inbox;
            case "Trash":
                return this.Trash;
            case "confirmButton":

        }
        return null;
    }
}