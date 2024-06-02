package StepDefinitions.Samed;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _09HamburgerMenu_ extends ParentPage {
    Samed_pom x=new Samed_pom();

    @Given("Navigate to Ccampuss")
    public void navigateToCcampuss() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(x.username,"Student_8");
        mySendKeys(x.password,"S12345");
        myClick(x.loginButton);

    }
    @When("Login succesfullyy")
    public void loginSuccesfullyy() {
        verifyContainsText(x.helperT,"Welcome");
    }

    @Then("Click Hamburger Menuu")
    public void clickHamburgerMenuu() {
        myClick(x.hamburgerMenu);

    }

    @Then("Click Finance Butttton")
    public void clickFinanceButttton() {
        myClick(x.finance);
    }

    @Then("Click My Finance Buttonn")
    public void clickMyFinanceButtonn() {
        myClick(x.MyFinance);
    }

    @Then("Click Fee Balance button and check")
    public void clickFeeBalanceButtonAndCheck() {
        myClick(x.student);
        myClick(x.feeBalance);
        ListContainsString(x.balance,"Installment");
        ListContainsString(x.balance," 200 $ ");
        ListContainsString(x.balance,"Payment");
        ListContainsString(x.balance,"2024");
    }
}
