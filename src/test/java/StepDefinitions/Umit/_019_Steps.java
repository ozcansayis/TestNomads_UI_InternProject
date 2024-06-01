package StepDefinitions.Umit;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class _019_Steps extends ParentPage {

    Umit_pom um = new Umit_pom();
    Robot robot = new Robot();

    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    public _019_Steps() throws AWTException {

    }

    @When("the user clicks assignments")
    public void theUserClicksAssignments() {
        myClick(um.assignments);
    }

    @Then("the user clicks status and select results published")
    public void theUserClicksStatusAndSelectResultsPublished() {

        WaitNano(20);
        js.executeScript("arguments[0].click();", um.published);

        //myClick(um.published);

        //WaitNano(10);
        js.executeScript("arguments[0].click();", um.resultsPublished);
        //myClick(um.resultsPublished);
    }

    @And("the user clicks semester and select all")
    public void theUserClicksSemesterAndSelectAll() {

        WaitNano(20);
        js.executeScript("arguments[0].click();", um.semester1);
        WaitNano(20);
        js.executeScript("arguments[0].click();", um.all);
        //myClick(um.semester1);
        //myClick(um.all);
    }

    @When("the user clicks search button")
    public void theUserClicksSearchButton() {
        //myClick(um.search);
        js.executeScript("arguments[0].click();", um.search);
    }

    @Then("the user selects related class and stars discussion")
    public void theUserSelectsRelatedClassAndStarsDiscussion() {
        WaitNano(20);
        js.executeScript("arguments[0].click();", um.geometry);
        WaitNano(20);
        js.executeScript("arguments[0].click();", um.discuss);
    }

    @And("the user adds files and starts conversation")
    public void theUserAddsFilesAndStartsConversation() {
        WaitNano(20);
        js.executeScript("arguments[0].click();", um.chats);
        WaitNano(20);
        js.executeScript("arguments[0].click();", um.student11);
        WaitNano(20);
        mySendKeys(um.message,"How about my Geo homework? What is your opinion?");
        WaitNano(20);
        //js.executeScript("arguments[0].click();", um.paperPlane);
        myClick(um.paperPlane);
        myClick(um.closeDialog);






    }


}
