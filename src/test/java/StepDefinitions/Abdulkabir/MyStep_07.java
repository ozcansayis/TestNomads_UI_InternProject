package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyStep_07 extends ParentPage {
    HamburgerMenu_pom hm = new HamburgerMenu_pom();

    @Given("Click Trash button and See restore Icon")
    public void clickTrashButtonAndSeeRestoreIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(hm.Trash));
        hm.myClick(hm.Trash);

        wait.until(ExpectedConditions.elementToBeClickable(hm.restoreIcon));
        Assert.assertTrue(hm.restoreIcon.isDisplayed());
        Assert.assertTrue(hm.trashIcon.isDisplayed());
    }


    @When("Click the Restore button and see success message")
    public void clickTheRestoreButtonAndSeeSuccessMessage() {
        hm.myClick(hm.restoreIcon);
        wait.until(ExpectedConditions.visibilityOf(hm.successMessage));
        Assert.assertTrue(hm.successMessage.isDisplayed());
        wait.until(ExpectedConditions.invisibilityOf(hm.successMessage));
    }

    @Then("Click on the delete button and see the success message")
    public void clickOnTheDeleteButtonAndSeeTheSuccessMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(hm.trashIcon));
        hm.myJSClick(hm.trashIcon);
        hm.myClick(hm.delete);
        wait.until(ExpectedConditions.visibilityOf(hm.successMessage));
        hm.verifyContainsText(hm.successMessage, "successfully");

    }
}