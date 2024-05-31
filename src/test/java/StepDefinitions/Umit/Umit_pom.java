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

    @FindBy(xpath = "//*[text()=' Full Day ']")
    public WebElement fullDay2;

    @FindBy(css = "[placeholder='Message']")
    public WebElement messageBox;

    @FindBy(css = "[role='menuitem']")
    public WebElement attachFiles;

    @FindBy(xpath = "//*[text()='From Local']")
    public WebElement fromLocal;

    @FindBy(css = "[class='avatar-mini ng-star-inserted']")
    public WebElement avatar;

    @FindBy(css = "[class='svg-inline--fa fa-circle-user fa-fw']")
    public WebElement settings;

    @FindBy(css = "[class='user-info']")
    public WebElement picture;

    @FindBy(css = "[class='svg-inline--fa fa-upload fa-fw']")
    public WebElement uploadPicture;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "//*[text()=' Upload ']")
    public WebElement upload;

    @FindBy(css = "[page='GRADING']")
    public WebElement grading;

    @FindBy(xpath ="//*[text()=' Course Grade ']" )
    public WebElement courseGrade;

    @FindBy(xpath = "//*[text()=' Student Transcript ']")
    public WebElement studentTranscript;

    @FindBy(xpath = "//*[text()=' Transcript By Subject ']")
    public WebElement transcriptBySubject;

    @FindBy(xpath = "//*[text()='Assignments'][1]")
    public WebElement assignments;

    @FindBy(xpath = "//*[text()='Published, Results Published']")
    public WebElement published;

    @FindBy(xpath = "//*[text()=' Results Published ']")
    public WebElement resultsPublished;

    @FindBy(xpath = "//*[text()=' Semester 1 ']")
    public WebElement semester1;

    @FindBy(xpath = "//*[text()='All ']")
    public WebElement all;

    @FindBy(linkText = "Search")
    public WebElement search;

    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement helperT2;

    @FindBy(xpath = "//*[text()='Project Geo']")
    public WebElement geometry;

    @FindBy(css = "[class*='assignment'] div div span:nth-child(1)")
    public WebElement discuss;

    @FindBy(css = "[formcontrolname='commentText']")
    public WebElement message;

    @FindBy(xpath = "//*[text()='Send']")
    public WebElement send;

    @FindBy(css = "[class='ng-untouched ng-pristine ng-valid'] button")
    public WebElement assignAttach;

    @FindBy(xpath = "//*[text()='Profile successfully completed']")
    public WebElement completedWarning;












}
