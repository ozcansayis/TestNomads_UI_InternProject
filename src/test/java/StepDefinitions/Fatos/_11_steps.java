package StepDefinitions.Fatos;

import Pages.ParentPage;
import StepDefinitions.Fatos.Fatos_pom;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class _11_steps extends ParentPage {
    Fatos_pom a = new Fatos_pom();

    @Given("Navigate to CampusS")
    public void navigateToCampusS() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(a.username, "Student_8");
        mySendKeys(a.password, "S12345");
        myClick(a.loginButton);
    }
    @When("click  Hamburger Menu > Finance > My Finance link")
    public void clickHamburgerMenuFinanceMyFinanceLink() {
        myClick(a.hamburgerMenu18);
        myClick(a.finance);
        myClick(a.MyFinance);
        WaitNano(20);
        myClick(a.student);
        WaitNano(20);
        myClick(a.stripe);
        myClick(a.Payful);
        WaitNano(20);
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(a.Pay).click().perform();
        mySendKeys(a.paymentamount, "1");
        WaitNano(20);
        actions.moveToElement(a.onlinePayment).click().build().perform();
        myClick(a.Paybuton);
        WaitNano(50);
        GWD.getDriver().switchTo().frame(a.iframecard);
        mySendKeys(a.number ,"4242 4242 4242 4242");
        mySendKeys(a.Expiration, "12/26");
        mySendKeys(a.cvc, "123");
    }
    @And("complete the payment")
    public void completeThePayment() {
        GWD.getDriver().switchTo().parentFrame();
        WaitNano(20);
        myClick(a.completePaymentButtonn);
    }
    @Then("verify that a installment of the debt has been paid")
    public void verifyThatAInstallmentOfTheDebtHasBeenPaid() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));
        Assert.assertTrue(a.ms1.isDisplayed(), "Installment not paid successfully");
        wait.until(ExpectedConditions.visibilityOf(a.ms1));
        wait.until(ExpectedConditions.elementToBeClickable(a.feebalanse));
        myClick(a.feebalanse);
    }
}

