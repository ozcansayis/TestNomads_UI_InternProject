package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MyStep_05 extends ParentPage {
    Actions actions = new Actions(GWD.getDriver());
    HamburgerMenu_pom hm = new HamburgerMenu_pom();

    @Given("Click new message button")
    public void clickNewMessageButton() {
        myClick(hm.NewMessage);

        //Assert.assertTrue(hm.newMessage02.isDisplayed(),"New Message");
    }

    @When("Click AddReceiver button")
    public void clickAddReceiverButton() {
        myClick(hm.AddReceiver);
        mySendKeys(hm.Name, "Stu");
        myClick(hm.userBox);
        myClick(hm.AddButton);
        verifyContainsText(hm.AddSM,"Users (Fullname, Username or E-mail) was successfully added']");
        myClick(hm.AddClose);
    }
    @Then("Enter Text")
    public void enterText() {
        mySendKeys(hm.Subject, "Payment");
        mySendKeys(hm.MetinBox,"teacher I want to payment....");
        myClick(hm.MesageSend);
        // bu adimda gözüken success mesagge hemen kayboluyo
    }


    @And("Checkout Sended Message")
    public void checkoutSendedMessage() {
        myClick(hm.Hamburger);
        actions.moveToElement(hm.Message).perform();
        myClick(hm.Outbox);
        Assert.assertTrue(hm.SendedSubject.equals("Payment"));
    }
}
