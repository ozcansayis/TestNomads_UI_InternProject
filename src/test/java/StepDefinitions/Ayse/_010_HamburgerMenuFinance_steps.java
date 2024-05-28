package StepDefinitions.Ayse;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class _010_HamburgerMenuFinance_steps extends ParentPage {

    Ayse_pom pm = new Ayse_pom();
    JavascriptExecutor executor = (JavascriptExecutor) GWD.getDriver();
    double balance_1;
    double totalRevenue_1;
    double balance_2;
    double totalRevenue_2;
    double amount = 1;

    @And("Go to the payment page")
    public void goToThePaymentPage() {
        wait.until(ExpectedConditions.visibilityOf(pm.userInformation));
        String b = pm.balance.getText();
        balance_1 = Double.parseDouble(b.substring(0, b.indexOf(" ")).replace(",", ""));
        String t = pm.totalRevenue.getText();
        totalRevenue_1 = Double.parseDouble(t.substring(0, t.indexOf(" ")).replace(",", ""));
        myClick(pm.viewButton);
        wait.until(ExpectedConditions.urlContains("fees"));
        wait.until(ExpectedConditions.elementToBeClickable(pm.onlinePayment));
        wait.until(ExpectedConditions.elementToBeClickable(pm.feeDetail));
        Assert.assertTrue(pm.onlinePayment.isDisplayed(), "Online Payment could not be displayed.");
        Assert.assertTrue(pm.feeDetail.isDisplayed(), "Fee/Balance Detail could not be displayed.");
    }

    @Then("Check the functionality of payment options")
    public void checkTheFunctionalityOfPaymentOptions() {
        wait.until(ExpectedConditions.urlContains("fees"));
        wait.until(ExpectedConditions.elementToBeClickable(pm.stripe));
        myClick(pm.stripe);
        executor.executeScript("arguments[0].click();", pm.payFull);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name^='__privateStripeFrame']:nth-child(1)")));
        Assert.assertTrue(pm.paymentForm.isDisplayed(), "The payment form to enter card information could not be displayed.");

        executor.executeScript("arguments[0].click();", pm.createPayment);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='mat-dialog-content']")));
        Assert.assertTrue(pm.installmentPlans.isDisplayed(), "New instalment plans could not be displayed.");
        wait.until(ExpectedConditions.elementToBeClickable(pm.close));
        myClick(pm.close);

        executor.executeScript("arguments[0].click();", pm.payAmountDue);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name^='__privateStripeFrame']:nth-child(1)")));
        Assert.assertTrue(pm.paymentForm.isDisplayed(), "The payment form to enter card information could not be displayed.");
    }

    @And("Enter the card details and make the payment")
    public void enterTheCardDetailsAndMakeThePayment() {
        executor.executeScript("arguments[0].click();", pm.pay);
        mySendKeys(pm.amount, String.valueOf(amount));
        myClick(pm.stripe);
        myClick(pm.payButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name^='__privateStripeFrame']:nth-child(1)")));
        GWD.getDriver().switchTo().frame(pm.frame1);
        mySendKeys(pm.cardNumber, "4242 4242 4242 4242");
        mySendKeys(pm.expiration, "1230");
        mySendKeys(pm.cvc, "123");
        GWD.getDriver().switchTo().parentFrame();
        myClick(pm.stripePaymentButton);
    }

    @Then("Payment success message should be displayed")
    public void paymentSuccessMessageShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));
        verifyContainsText(pm.successMessage, "successfully");
        wait.until(ExpectedConditions.invisibilityOf(pm.successMessage));
    }

    @And("Verify that the values are updated on the finance page")
    public void verifyThatTheValuesAreUpdatedOnTheFinancePage() {
        GWD.getDriver().navigate().back();
        wait.until(ExpectedConditions.urlContains("student-finance/active"));
        wait.until(ExpectedConditions.visibilityOf(pm.userInformation));
        wait.until(ExpectedConditions.elementToBeClickable(pm.balance));
        String b = pm.balance.getText();
        balance_2 = Double.parseDouble(b.substring(0, b.indexOf(" ")).replace(",", ""));
        String t = pm.totalRevenue.getText();
        totalRevenue_2 = Double.parseDouble(t.substring(0, t.indexOf(" ")).replace(",", ""));
        Assert.assertEquals((balance_1 - 1), balance_2, "");
        Assert.assertEquals((totalRevenue_1 + 1), totalRevenue_2, "");
    }

    @Then("Check the Fee Balance Detail button on the payment page")
    public void checkTheFeeBalanceDetailButtonOnThePaymentPage() {
        myClick(pm.viewButton);
        wait.until(ExpectedConditions.urlContains("fees"));
        wait.until(ExpectedConditions.elementToBeClickable(pm.feeDetail));
        myClick(pm.feeDetail);
        myClick(pm.x);
        WebElement credit = GWD.getDriver().findElement(By.xpath("(//div[text()=' Payment '])[" + pm.typeList.size() + "]/../../following-sibling::td[2]"));
        executor.executeScript("arguments[0].scrollIntoView(false);", credit);
        String s_credit = credit.getText();
        double d_credit = Double.parseDouble(s_credit.substring(0, s_credit.indexOf(" ")).replace(",", ""));
        Assert.assertEquals(amount, d_credit, "The payment amount could not be verified.");
    }

    @And("Verify the message confirming the successful payment in the message box")
    public void verifyTheMessageConfirmingTheSuccessfulPaymentInTheMessageBox() {
        myClick(pm.onlinePayment);
        myClick(pm.messageIcon);
        wait.until(ExpectedConditions.elementToBeClickable(pm.ms_table_first));
        Assert.assertTrue(pm.ms_table_first.isDisplayed(),"Message confirming successful payment could not be displayed.");
        myClick(pm.ms_first_view);
        Assert.assertTrue(pm.message_.isDisplayed(),"Payment status could not be displayed.");
    }
}