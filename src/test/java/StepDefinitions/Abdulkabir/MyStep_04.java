package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStep_04 {
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
        hm.verifyContainsText(hm.welcomeText,"Welcome");
    }
}
