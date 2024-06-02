package StepDefinitions.Ozcan;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class steps extends ParentPage {
    Ozcan_pom op = new Ozcan_pom();
    String timer;

    @Given("the user navigates to the website and logs in")
    public void navigate_to_website_and_login() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(op.username, "Student_8");
        mySendKeys(op.password, "S12345");
        myClick(op.loginButton);
    }

    @And("the user reaches the payment page")
    public void theUserReachesThePaymentPage() {
        myClick(op.burgerMenu);
        myClick(op.bFinance);
        myClick(op.myFinance);
    }

    @When("the user downloads the report")
    public void theUserDownloadsTheReport() {
        myClick(op.threeDot);
        myClick(op.report);
    }

    @Then("the user verifies that the report has downloaded")
    public void theUserVerifiesThatTheReportHasDownloaded() {
        WaitNano(20);
        Assert.assertTrue(GWD.getDriver().getWindowHandles().size() > 1, "Download failed!");
    }

    @And("the user navigates to weekly course plan section")
    public void theUserNavigatesToWeeklyCoursePlanSection() {
        myClick(op.calendar);
    }

    @When("the user clicks a lesson that has not yet been published")
    public void theUserClicksALessonThatHasNotYetBeenPublished() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[class='ng-star-inserted'] td[rowspan]"), 20));
        for (WebElement x : op.lessons) {
            WebElement y;
            try {
                y = x.findElement(By.cssSelector("[class='mat-badge-content mat-badge-active']"));
            } catch (Exception e) {
                myClick(x);
                break;
            }
        }
    }

    @Then("the user should see the required information and the corresponding message")
    public void theUserShouldSeeTheRequiredInformationAndTheCorrespondingMessage() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[formgroup='[object Object]'] span"), 5));
        Assert.assertEquals(op.courseData.size(), 5);
        Assert.assertTrue(op.npMessage.isDisplayed());
    }

    @When("the user clicks a lesson that has been published")
    public void theUserClicksALessonThatHasBeenPublished() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        int r = 1;
        do {
            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[class='ng-star-inserted'] td[rowspan]"), 20));
            for (WebElement x : op.lessons) {
                WebElement y;
                try {
                    y = x.findElement(By.cssSelector("[class='mat-badge-content mat-badge-active']"));
                    myClick(x);
                    r = 2;
                    break;
                } catch (Exception e) {
                }
            }
            if (r == 1)
                op.previous.click();
        } while (r == 1);
    }

    @Then("the user should see the necessary information")
    public void theUserShouldSeeTheNecessaryInformation() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[style='transform: translateX(0px);'] >[class='mat-mdc-tab-labels'] > div"), 4));
        Assert.assertEquals(op.infoTab.size(), 4);
    }

    @And("the user clicks the Recording button")
    public void theUserClicksTheRecordingButton() {
        myClick(op.recording);
    }

    @Then("the user should access the course video")
    public void theUserShouldAccessTheCourseVideo() {
        wait.until(ExpectedConditions.visibilityOf(op.iframe));
        GWD.getDriver().switchTo().frame(op.iframe);
        wait.until(ExpectedConditions.visibilityOf(op.playButton));
        Assert.assertTrue(op.playButton.isDisplayed());
    }

    @When("the user clicks the Play icon")
    public void theUserClicksThePlayIcon() {
        timer = op.timer.getText();
        myClick(op.playButton);
    }

    @Then("the user should start watching the video")
    public void theUserShouldStartWatchingTheVideo() {
        WaitNano(20);
        Assert.assertNotEquals(op.timer.getText(), timer);
    }
}