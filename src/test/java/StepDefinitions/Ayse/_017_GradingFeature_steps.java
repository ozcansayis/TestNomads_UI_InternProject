package StepDefinitions.Ayse;

import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import static Pages.ParentPage.WaitNano;

public class _017_GradingFeature_steps {

    Ayse_pom pm = new Ayse_pom();
    String gradingPageWindowID;

    @Then("Go to the grading page")
    public void goToTheGradingPage() {
        pm.wait.until(ExpectedConditions.urlContains("user-courses"));
        pm.wait.until(ExpectedConditions.elementToBeClickable(pm.grading));
        pm.myClick(pm.grading);
        pm.wait.until(ExpectedConditions.urlContains("grading"));
        gradingPageWindowID = GWD.getDriver().getWindowHandle();
    }

    @And("Go to the Course Grade")
    public void goToTheCourseGrade() throws AWTException {
        pm.myClick(pm.courseGrade);
        pm.wait.until(ExpectedConditions.elementToBeClickable(pm.download));
        Assert.assertTrue(pm.download.isDisplayed(), "Download button not displayed.");
        Set<String> oldWindows = GWD.getDriver().getWindowHandles();
        pm.myClick(pm.download);
        for (String handle : GWD.getDriver().getWindowHandles()) {
            GWD.getDriver().switchTo().window(handle);
        }
        pm.wait.until(ExpectedConditions.numberOfWindowsToBe(oldWindows.size() + 1));

        Robot robot = new Robot();
        for (int i = 0; i < 8; i++) {
            WaitNano(1);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        WaitNano(5);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        WaitNano(5);
        StringSelection filePath = new StringSelection("C:\\Users\\AYŞE\\Downloads\\CourseTermGrades.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        WaitNano(5);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        WaitNano(15);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WaitNano(5);
        File file = new File("C:\\Users\\AYŞE\\Downloads\\CourseTermGrades.pdf");
        Assert.assertTrue(file.exists() && !file.isDirectory(), "PDF download failed.");
    }

    @Then("Go to the Students Transcript")
    public void goToTheStudentsTranscript() throws AWTException {
        GWD.getDriver().switchTo().window(gradingPageWindowID);
        pm.myClick(pm.studentTranscript);

        Set<String> oldWindows = GWD.getDriver().getWindowHandles();
        pm.myClick(pm.print);
        for (String handle : GWD.getDriver().getWindowHandles()) {
            GWD.getDriver().switchTo().window(handle);
        }
        pm.wait.until(ExpectedConditions.numberOfWindowsToBe(oldWindows.size() + 1));

        Robot robot = new Robot();
        for (int i = 0; i < 8; i++) {
            WaitNano(1);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        WaitNano(5);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        WaitNano(5);
        StringSelection filePath = new StringSelection("C:\\Users\\AYŞE\\Downloads\\StudentTranscript.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        WaitNano(5);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        WaitNano(15);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WaitNano(5);
        File file = new File("C:\\Users\\AYŞE\\Downloads\\StudentTranscript.pdf");
        Assert.assertTrue(file.exists() && !file.isDirectory(), "PDF download failed.");
    }
}