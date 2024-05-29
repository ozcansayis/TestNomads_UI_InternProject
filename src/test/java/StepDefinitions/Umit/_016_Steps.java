package StepDefinitions.Umit;

import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class _016_Steps extends ParentPage {

    Umit_pom um = new Umit_pom();

    @When("the user clicks grading")
    public void theUserClicksGrading() {
        myClick(um.grading);
    }
    @Then("the user clicks course grade")
    public void theUserClicksCourseGrade() {
        myClick(um.courseGrade);
    }

    @And("the user clicks student transcript")
    public void theUserClicksStudentTranscript() {
        myClick(um.studentTranscript);
    }

    @When("the user clicks transcript by subject")
    public void theUserClicksTranscriptBySubject() {
        myClick(um.transcriptBySubject);
    }
}
