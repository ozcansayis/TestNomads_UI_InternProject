package StepDefinitions.Ozcan;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class _012_steps extends ParentPage {
    Ozcan_pom op= new Ozcan_pom();
    @Given("the user navigates to the website and logs in")
    public void navigate_to_website_and_login(){
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(op.username, "Student_8");
        mySendKeys(op.password, "S12345");
        myClick(op.loginButton);
    }

    @And("the user reaches the payment page")
    public void theUserReachesThePaymentPage() {
        myClick(op.burgerMenu);
        myClick(op.bFinance);
        myClick(op.myFinance);
    }

    @When("the user downloads the report")
    public void theUserDownloadsTheReport() {
        myClick(op.threeDot);
        myClick(op.report);
    }

    @Then("the user verifies that the report has downloaded")
    public void theUserVerifiesThatTheReportHasDownloaded() {
        WaitNano(20);
        Assert.assertTrue(GWD.getDriver().getWindowHandles().size()>1,"Download failed!");
    }
}