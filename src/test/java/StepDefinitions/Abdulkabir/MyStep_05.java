package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MyStep_05 extends ParentPage {
    HamburgerMenu_pom hm = new HamburgerMenu_pom();
    @And("Click on the New Message button")
    public void clickOnTheNewMessageButton() {
        myClick(hm.newMessage);
    }

    @Then("User should be redirected to the new message page")
    public void userShouldBeRedirectedToTheNewMessagePage() {
        wait.until(ExpectedConditions.urlContains("user-messages/new"));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("user-messages/new"));
    }

    @When("User clicks on the Add Receiver button")
    public void userClicksOnTheAddReceiverButton() {
        myClick(hm.addReceiverBtn);
    }

    @And("The user select receivers")
    public void theUserSelectReceivers() {
        wait.until(ExpectedConditions.elementToBeClickable(hm.addCloseBtn));
        hm.mySendKeys(hm.receiverSearch,"stu");
        wait.until(ExpectedConditions.elementToBeClickable(hm.addCloseBtn));
        hm.myClick(hm.addreceiverUser);
        wait.until(ExpectedConditions.elementToBeClickable(hm.addCloseBtn));
    }

    @And("User clicks on the Add & Close button and user should see the success message")
    public void userClicksOnTheAddCloseButtonAndUserShouldSeeTheSuccessMessage() {
        hm.myClick(hm.addCloseBtn);
        wait.until(ExpectedConditions.visibilityOf(hm.successMsg));
        verifyContainsText(hm.successMsg, "successfully added");
    }

    @Then("Enter subject to the new message")
    public void enterSubjectToTheNewMessage() {
        mySendKeys(hm.subjectBox, "Why you must learn ?");
    }

    @And("Enter message to the text and attach a file to it.")
    public void enterMessageToTheTextAndAttachAFileToIt() {
        GWD.getDriver().switchTo().frame(hm.richTextAreaFrame);
        mySendKeys(hm.richTextArea, "Unless you learn, you fall behind. The more you are stuck, the more difficult it is.");
    }

    @And("Click on the Send button and user should see the success message")
    public void clickOnTheSendButtonAndUserShouldSeeTheSuccessMessage() {
        myClick(hm.sendButton);
        wait.until(ExpectedConditions.invisibilityOf(hm.sendButton));

        verifyContainsText(hm.sentMessage, "successfully");
    }
}




