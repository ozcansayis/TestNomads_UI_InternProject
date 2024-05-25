package StepDefinitions.Fatos;

import Pages.ParentPage;
import StepDefinitions.Fatos.Fatos_pom;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class _003_steps extends ParentPage {
    Fatos_pom aaa = new Fatos_pom();


    @Given("User is logged in as a student")
    public void userIsLoggedInAsAStudent() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(aaa.username, "Student_8");
        mySendKeys(aaa.password, "S12345");
        myClick(aaa.loginButton);
    }

    @When("User checks the top navigation menu")
    public void userChecksTheTopNavigationMenu() {
        wait.until(ExpectedConditions.visibilityOf(aaa.logo));
        Assert.assertTrue(aaa.logo.isDisplayed());
        myClick(aaa.logo);
        WaitNano(3);
        GWD.getDriver().switchTo().window(GWD.getDriver().getWindowHandle());
        Assert.assertTrue(aaa.courses.isDisplayed());
        myClick(aaa.courses);
        WaitNano(3);
        Assert.assertTrue(aaa.calendar.isDisplayed());
        myClick(aaa.calendar);
        WaitNano(3);
        Assert.assertTrue(aaa.attendance.isDisplayed());
        myClick(aaa.attendance);
        WaitNano(6);
        Assert.assertTrue(aaa.assignments.isDisplayed());
        myClick(aaa.assignments);
        WaitNano(3);
        Assert.assertTrue(aaa.grading.isDisplayed());
        myClick(aaa.grading);
        WaitNano(3);
    }

    @Then("User should see all main menu items")
    public void userShouldSeeAllMainMenuItems() {

    }

    @And("User should be able to click each item correctly")
    public void userShouldBeAbleToClickEachItemCorrectly() {
    }

}
