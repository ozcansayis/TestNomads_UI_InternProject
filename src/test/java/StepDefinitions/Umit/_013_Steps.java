package StepDefinitions.Umit;

import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _013_Steps extends ParentPage {

    Umit_pom um = new Umit_pom();
    Robot robot = new Robot();

    public _013_Steps() throws AWTException {
    }

    @And("the user clicks the attendance button")
    public void theUserClicksTheAttendanceButton() {
        myClick(um.attendance);
    }

    @When("the user clicks the attendance excuses")
    public void theUserClicksTheAttendanceExcuses() {
        myClick(um.attendanceExcuse);
    }

    @Then("the user clicks add attendance excuses button")
    public void theUserClicksAddAttendanceExcusesButton() {
        myClick(um.plusIcon);
    }

    @And("the user fills in all the fields in the excuse section")
    public void theUserFillsInAllTheFieldsInTheExcuseSection() {
        myClick(um.fullDay);
        myClick(um.date);
        mySendKeys(um.messageBox, "I wont be able to attend today's class because i am sick");
    }

    @When("the user clicks attach files and add his excuse files")
    public void theUserClicksAttachFilesAndAddHisExcuseFiles() {
        myClick(um.attachFiles);
        myClick(um.fromLocal);

        //robot.keyPress(KeyEvent.VK_TAB); techno study yazılacak
        //robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_TAB);
        //robot.keyRelease(KeyEvent.VK_ENTER);

    }

}
