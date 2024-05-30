package StepDefinitions.Ayse;

import Pages.ParentPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _020_AssignmentsFeature_steps extends ParentPage {

    Ayse_pom pm = new Ayse_pom();

    @Then("Go to the assignments page")
    public void goToTheAssignmentsPage() {
        wait.until(ExpectedConditions.urlContains("user-courses"));
        wait.until(ExpectedConditions.elementToBeClickable(pm.assignments));
        myClick(pm.assignments);
    }

    @And("Click on the i icon and access the assignment details page")
    public void clickOnTheIIconAndAccessTheAssignmentDetailsPage() {
        wait.until(ExpectedConditions.urlContains("assignment"));
        wait.until(ExpectedConditions.elementToBeClickable(pm.y));
        myClick(pm.assignmentButton);
        wait.until(ExpectedConditions.urlContains("info"));
        Assert.assertTrue(pm.assignmentDetails.isDisplayed(), "The assignment details page could not be accessed.");
        myClick(pm.backButton);
    }

    @Then("Click on the Submit icon and access the assignment submission page")
    public void clickOnTheSubmitIconAndAccessTheAssignmentSubmissionPage() {
        wait.until(ExpectedConditions.urlContains("student-assignment"));
        wait.until(ExpectedConditions.elementToBeClickable(pm.y));
        myClick(pm.submitButton);
        wait.until(ExpectedConditions.elementToBeClickable(pm.submit));
        Assert.assertTrue(pm.submissionAttemptPage.isDisplayed(), "The Submission Attempts Page could not be displayed.");
        myClick(pm.closeSubmit);
    }

    @And("Click on the mark it icon and check the icon")
    public void clickOnTheMarkItIconAndCheckTheIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(pm.markItButton));
        myClick(pm.markItButton);
        if (!pm.markSelected.isEmpty()) {
            Assert.assertTrue(true, "Failed to mark the favourite (Mark it) icon.");
        } else {
            Assert.assertFalse(false, "Failed to uncheck the favourite (Mark it) icon.");
        }
    }
}