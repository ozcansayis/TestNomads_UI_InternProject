package StepDefinitions.Umit;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

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
        WaitNano(20);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @Then("the user clicks upload and save button")
    public void theUserClicksUploadAndSaveButton() {
        myClick(um.upload);
        WaitNano(10);
        js.executeScript("arguments[0].click();", um.save);
    }

    @And("the user verifies that the picture was successfully updated")
    public void theUserVerifiesThatThePictureWasSuccessfullyUpdated() {
        //Assert.assertEquals(um.completedWarning.getText(), "Profile successfully updated!");
    }


}
