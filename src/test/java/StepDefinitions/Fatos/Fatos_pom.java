package StepDefinitions.Fatos;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fatos_pom extends ParentPage {

    public Fatos_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // login
    @FindBy(css = "[placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(css = "[placeholder='Parola']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath="//img[@_ngcontent-ng-c2415873216 and contains(@style, 'max-height: 74px;')]")
    public WebElement logo;

    @FindBy(xpath="//span[text()='Courses']")
    public WebElement courses;
    @FindBy(xpath="//span[text()='Calendar']")
    public WebElement calendar;
    @FindBy(xpath="//span[text()='Attendance']")
    public WebElement attendance;

    @FindBy(xpath="//span[text()='Assignments']")
    public WebElement assignments;
    @FindBy(xpath="//span[text()='Grading']")
    public WebElement grading;



}
