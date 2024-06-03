package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MyStep_06 extends ParentPage {
    HamburgerMenu_pom hm = new HamburgerMenu_pom();
    @Given("Click Outbox button")
    public void clickOutboxButton() {
        hm.myClick(hm.Outbox);
    }
    @When("Delete Message")
    public void deleteMessage() {
        myClick(hm.MoveToTrash01);
        myClick(hm.confirmYesButton);

    }
    @Then("Deleted Succes")
    public void deletedSucces() {
        wait.until(ExpectedConditions.visibilityOf(hm.confirmMessage));
        verifyContainsText(hm.confirmMessage, "Message successfully moved to trash!");
    }

}
