package StepDefinitions.Umit;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class _016_Steps extends ParentPage {

    Umit_pom um = new Umit_pom();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    @When("the user clicks grading")
    public void theUserClicksGrading() {
        myClick(um.grading);
    }

    @Then("the user clicks course grade")
    public void theUserClicksCourseGrade() {
        WaitNano(10);
        js.executeScript("arguments[0].click();", um.courseGrade);

    }

    @And("the user clicks student transcript")
    public void theUserClicksStudentTranscript() {
        WaitNano(10);
        js.executeScript("arguments[0].click();", um.studentTranscript);

    }

    @When("the user clicks transcript by subject")
    public void theUserClicksTranscriptBySubject() {
        WaitNano(10);
        js.executeScript("arguments[0].click();", um.transcriptBySubject);

    }
}
