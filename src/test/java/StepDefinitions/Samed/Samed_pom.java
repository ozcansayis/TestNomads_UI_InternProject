package StepDefinitions.Samed;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Samed_pom {
    public Samed_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //login
    @FindBy(css = "input[placeholder='Username']")
    public WebElement username;
    @FindBy(css = "[placeholder='Password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    //login control
    @FindBy(xpath = "//*[contains( text(), 'Welcome,' ) ]")
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
    @FindBy(xpath = "//*[text()='Assignments'][1]")
    public WebElement assignments;
    @FindBy(xpath = "//*[text()='Show All']")
    public WebElement sort1;
    @FindBy(xpath = "//*[text()='Published']")
    public WebElement sort2;
    @FindBy(xpath = "//*[text()='Semester']")
    public WebElement sort3;
    @FindBy(css = "[class*='date'] div div [class*='icon-suffix']")
    public WebElement sort4;
    @FindBy(css = "[class*='assignment'] div div span:nth-child(1)")
    public List<WebElement> assignmentz;
    @FindBy(xpath = "//*[text()='Search']")
    public WebElement searchButton;
    @FindBy(xpath = "//*[text()='11A- Biology']")
    public WebElement biology;
    @FindBy(css = "[class*='assignment'] div div span:nth-child(2)")
    public WebElement classDate;
    @FindBy(xpath = "//*[text()=' Results Published ']")
    public WebElement resultPublished;
    @FindBy(css = "[role='option'][value='all']")
    public WebElement all;
    @FindBy(css = "[id*=datepicker] [class='left-side'] button:nth-child(5)")
    public WebElement thisYearz;

    //23
    @FindBy(xpath = "//*[text()='Calendar'][1]")
    public WebElement Calendar;
    @FindBy(css = "div[role='tab']:nth-child(1)")
    public WebElement WeeklyCoursePlan;
    @FindBy(css = "div[role='tab']:nth-child(2)")
    public WebElement CalendarButton;
    @FindBy(css = "ms-course-schedule-board div div [class='ng-star-inserted']:nth-child(3)")
    public List<WebElement> x;
    @FindBy(css = "button[type='button']:nth-child(4)")
    public WebElement listButton;
    @FindBy(css = "ms-course-schedule-board div div [class='ng-star-inserted']:nth-child(3) div:nth-child(4)")
    public WebElement cancelled;
    @FindBy(css = "#mat-tab-content-0-0 > div > ms-course-schedule-board > ms-browse > div > div > div:nth-child(2) > div:nth-child(4) > button:nth-child(1) > span.mat-mdc-focus-indicator")
    public WebElement Previous;
    @FindBy(css = "#mat-tab-content-0-0 > div > ms-course-schedule-board > ms-browse > div > div > div:nth-child(2) > div:nth-child(4) > button:nth-child(2) > span.mat-mdc-focus-indicator")
    public WebElement Today;
    @FindBy(css = "#mat-tab-content-0-0 > div > ms-course-schedule-board > ms-browse > div > div > div:nth-child(2) > div:nth-child(4) > button:nth-child(3) > span.mat-mdc-focus-indicator")
    public WebElement Next;

    @FindBy(xpath = "//*[contains( text(), 'Monday,' ) ]")
    public WebElement monday;
    @FindBy(xpath = "//*[contains( text(), 'Friday,' ) ]")
    public WebElement friday;
    @FindBy(xpath = "//*[contains( text(), 'Thursday,' ) ]")
    public WebElement thursday;
    @FindBy(xpath = "//*[contains( text(), '11A-' ) ]")
    public List<WebElement> classes;
    @FindBy(xpath = "//*[text()='11A- BIOLOGY ']")
    public WebElement classss;
    @FindBy(css = "course-details-dialog span:nth-child(1)")
    public WebElement courseDetail;
@FindBy(css = "course-details-dialog div button:nth-child(2)")
public WebElement exitButton;
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
    public WebElement getWebElementx(String a) {
        switch (a) {
            case "assignments":
                return this.assignments;
        }
        return null;
    }
}
