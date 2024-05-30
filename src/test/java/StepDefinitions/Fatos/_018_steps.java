package StepDefinitions.Fatos;

import Pages.ParentPage;
import StepDefinitions.Fatos.Fatos_pom;
import Utilities.GWD;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.util.TimeUtils;
public class _018_steps extends ParentPage {
    Fatos_pom aa = new Fatos_pom();
    private String assignmentCounts;  // Sınıf düzeyinde bir değişken

    @Given("The student is logged in to the campus system")
    public void theStudentIsLoggedInToTheCampusSystem() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(aa.username, "Student_8");
        mySendKeys(aa.password, "S12345");
        myClick(aa.loginButton);
    }

    @Then("The student should see the total number of assigned tasks")
    public void theStudentShouldSeeTheTotalNumberOfAssignedTasks() {
        Actions actions = new Actions(GWD.getDriver());
        WaitNano(30);
        actions.moveToElement(aa.assignments).perform();
        WaitNano(30);
        assignmentCounts = aa.AssignmentCount.getText();
        System.out.println(assignmentCounts);
    }
    @When("The student clicks on the Assignments link")
    public void theStudentClicksOnTheAssignmentsLink() {
        myClick(aa.assignments);
        WaitNano(20);
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(aa.assignments).perform();
        WaitNano(30);
        System.out.println(aa.AssignmentCount.getText());
    }

    @Then("The student should be able to view all the assigned tasks")
    public void theStudentShouldBeAbleToViewAllTheAssignedTasks() {
        Assert.assertEquals(assignmentCounts,"9","hata");
    }
}