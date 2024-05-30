package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStep_07 extends ParentPage {
    HamburgerMenu_pom hm = new HamburgerMenu_pom();
    @Given("Click Trash button and See Deleted Messages")
    public void clickTrashButtonAndSeeDeletedMessages() {
        hm.myClick(hm.Trash);
        hm.TrashDelete1.isDisplayed();
        hm.TrashDelete2.isDisplayed();
        WaitNano(3);
    }
    @When("Click the Delete button and back button") public void clickTheDeleteButtonAndBackButton() {
        hm.myClick(hm.TrashDelete1);
        WaitNano(3);
        hm.myClick(hm.Cancel);
        WaitNano(3);}

    @Then("Click the Restore button and see success message")
    public void clickTheRestoreButtonAndSeeSuccessMessage() {
        hm.myClick(hm.Restore);
        WaitNano(3);
        verifyContainsText(hm.successMessage,"success");
    }

    @And("Delete Message Permanent")
    public void deleteMessagePermanent() {
        hm.myClick(hm.TrashDelete1);
        hm.verifyContainsText(hm.successMessage,"want to delete");
        hm.myClick(hm.TrashDeleteDelete);
        hm.verifyContainsText(hm.successMessage,"success");
    }

}
