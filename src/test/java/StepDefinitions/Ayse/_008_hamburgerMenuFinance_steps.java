package StepDefinitions.Ayse;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class _008_hamburgerMenuFinance_steps extends ParentPage {

    Ayse_pom pm = new Ayse_pom();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    @Given("Go to the Campus test website and log in")
    public void goToTheCampusTestWebsiteAndLogIn() {
        GWD.getDriver().get("https://test.mersys.io/");
        pm.mySendKeys(pm.username, "Student_8");
        pm.mySendKeys(pm.password, "S12345");
        pm.myClick(pm.loginButton);
    }

    @Then("Go to the My Finance page")
    public void goToTheMyFinancePage() {
        wait.until(ExpectedConditions.elementToBeClickable(pm.hamburgerMenu));
        myClick(pm.hamburgerMenu);
        myClick(pm.finance);
        myClick(pm.myFinance);
        wait.until(ExpectedConditions.urlContains("student-finance/active"));
    }

    @And("Verify that user financial information is displayed")
    public void verifyThatUserFinancialInformationIsDisplayed() {
        Assert.assertTrue(pm.userInformation.isDisplayed(),"User financial information could not be displayed.");
    }
}