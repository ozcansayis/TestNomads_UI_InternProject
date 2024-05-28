package StepDefinitions.Umit;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Umit_pom extends ParentPage {

    public Umit_pom(){
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(css = "[caption='NAV.ATTENDANCE.TITLE']")
    public WebElement attendance;

    @FindBy(css = "[id='mat-tab-label-0-2']")
    public WebElement attendanceExcuse;

    @FindBy(css = "[tooltip='ATTENDANCE_EXCUSE.TITLE.ADD']")
    public WebElement plusIcon;

    @FindBy(css = "[aria-label='Open calendar']")
    public WebElement date;

    @FindBy(css = "[aria-label='May 31, 2024']")
    public WebElement date31;

    @FindBy(css = "[id='mat-select-4']")
    public WebElement fullDay;

    @FindBy(css = "[class='mat-mdc-option mdc-list-item mdc-list-item--selected mat-mdc-option-active ng-tns-c1154042729-34 ng-star-inserted']")
    public WebElement fullDay2;

    @FindBy(css = "[placeholder='Message']")
    public WebElement messageBox;

    @FindBy(css = "[role='menuitem']")
    public WebElement attachFiles;

    @FindBy(xpath = "//*[text()='From Local']")
    public WebElement fromLocal;


}
