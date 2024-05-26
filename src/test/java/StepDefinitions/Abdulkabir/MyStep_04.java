package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class MyStep_04 {

    Actions actions = new Actions(GWD.getDriver());
    HamburgerMenu_pom hm = new HamburgerMenu_pom();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter valid username and password and click login button")
    public void enterValidUsernameAndPasswordAndClickLoginButton() {
        hm.mySendKeys(hm.userName, "Student_8");
        hm.mySendKeys(hm.password, "S12345");
        hm.myClick(hm.Login);
    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        hm.verifyContainsText(hm.welcomeText, "Welcome");
    }

    @And("Checkout Hamburger Menu")
    public void checkoutHamburgerMenu() {
        hm.myClick(hm.Hamburger);
        actions.moveToElement(hm.Message).perform();
        Assert.assertTrue(hm.NewMessage.isDisplayed());
        Assert.assertTrue(hm.Inbox.isDisplayed());
        Assert.assertTrue(hm.Outbox.isDisplayed());
        Assert.assertTrue(hm.Trash.isDisplayed());

    }
}
