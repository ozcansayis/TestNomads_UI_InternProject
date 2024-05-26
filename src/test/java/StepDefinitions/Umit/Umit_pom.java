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

    @FindBy(css = "[class='svg-inline--fa fa-calendar-circle-user fa-fw']")
    public WebElement attendanceExcuse;

    @FindBy(css = "[class='mat-ripple mat-mdc-button-ripple']")
    public WebElement plusIcon;

    @FindBy(css = "[class='mat-mdc-form-field-icon-suffix ng-tns-c1534922977-56 ng-star-inserted']")
    public WebElement date;

    @FindBy(id = "mat-option-14")
    public WebElement fullDay;

    @FindBy(css = "[class='mat-mdc-form-field-flex ng-tns-c1534922977-52']")
    public WebElement messageBox;

    @FindBy(css = "[class='mat-ripple mat-mdc-menu-ripple']")
    public WebElement attachFiles;

    @FindBy(xpath = "//*[text()='From Local']")
    public WebElement fromLocal;


}
