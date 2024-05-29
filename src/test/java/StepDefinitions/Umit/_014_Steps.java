package StepDefinitions.Umit;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.awt.*;

public class _014_Steps extends ParentPage {

    Umit_pom um = new Umit_pom();
    Robot robot = new Robot();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    public _014_Steps() throws AWTException {
    }

    @When("the user clicks the profile picture and settings button")
    public void theUserClicksTheProfilePictureAndSettingsButton() {
        myClick(um.avatar);
        myClick(um.settings);
    }

    @Then("the user clicks picture icon")
    public void theUserClicksPictureIcon() {
        myClick(um.picture);

    }

    @And("the user clicks upload picture icon")
    public void theUserClicksUploadPictureIcon() {
        myClick(um.uploadPicture);
    }

    @When("the user selects picture from computer")
    public void theUserSelectsPictureFromComputer() {
        //robot.keyPress(KeyEvent.VK_T);
        //robot.keyRelease(KeyEvent.VK_T);
    }

    @Then("the user clicks upload and save button")
    public void theUserClicksUploadAndSaveButton() {
        myClick(um.upload);
        myClick(um.save);
    }

    @And("the user verifies that the ricture was succesfully updated")
    public void theUserVerifiesThatTheRictureWasSuccesfullyUpdated() {
        Assert.assertTrue(GWD.getDriver().getWindowHandles().size()>1,"Profile successfully updated!");
    }


}
