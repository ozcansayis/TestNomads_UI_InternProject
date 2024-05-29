package StepDefinitions.Umit;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _013_Steps extends ParentPage {

    Umit_pom um = new Umit_pom();
    Robot robot = new Robot();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    public _013_Steps() throws AWTException {
    }

    @And("the user clicks the attendance button")
    public void theUserClicksTheAttendanceButton() {
        myClick(um.attendance);
    }
    @When("the user clicks the attendance excuses")
    public void theUserClicksTheAttendanceExcuses() {
        WaitNano(20);
        js.executeScript("arguments[0].click();", um.attendanceExcuse);
    }
    @Then("the user clicks add attendance excuses button")
    public void theUserClicksAddAttendanceExcusesButton() {
        myClick(um.plusIcon);
    }
    @And("the user fills in all the fields in the excuse section")
    public void theUserFillsInAllTheFieldsInTheExcuseSection() {
        WaitNano(5);
        js.executeScript("arguments[0].click();", um.fullDay);
        WaitNano(10);
        js.executeScript("arguments[0].click();", um.date);
        WaitNano(10);
        myClick(um.date31);
        WaitNano(10);
        mySendKeys(um.messageBox, "I wont be able to attend today's class because i am sick");
    }
    @When("the user clicks attach files and add his excuse files")
    public void theUserClicksAttachFilesAndAddHisExcuseFiles() {
        js.executeScript("arguments[0].click();", um.attachFiles);
        js.executeScript("arguments[0].click();", um.fromLocal);

        WaitNano(20);

        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);

      // robot.keyPress(KeyEvent.VK_DOWN);
      // robot.keyRelease(KeyEvent.VK_DOWN);
      // robot.keyPress(KeyEvent.VK_ENTER);
      // robot.keyRelease(KeyEvent.VK_ENTER);
      // robot.keyPress(KeyEvent.VK_ENTER);
      // robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
