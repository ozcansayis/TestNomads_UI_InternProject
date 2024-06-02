package StepDefinitions.Fatos;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class _003_steps extends ParentPage {
    Fatos_pom b = new Fatos_pom();

    @Given("User is logged in as a student")
    public void userIsLoggedInAsAStudent() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(b.username, "Student_8");
        mySendKeys(b.password, "S12345");
        myClick(b.loginButton);
    }

    @When("User checks the top navigation menu")
    public void userChecksTheTopNavigationMenu() {
        WaitNano(15);
        List<WebElement> menuButtons = new ArrayList<>();
        menuButtons.add(b.coursess);
        menuButtons.add(b.calendarr);
        menuButtons.add(b.atteendancee);
        menuButtons.add(b.assignmentss);
        menuButtons.add(b.grading);
        menuButtons.add(b.hamburgerMenu18);

        for (WebElement button : menuButtons) {
            button.click();
            WaitNano(60);
            boolean isClickable =button.isDisplayed();
            Assert.assertTrue(isClickable);
            System.out.println("AssertTrue Sonucu: " + isClickable);
        }
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        WaitNano(30);
        js.executeScript("arguments[0].click();", b.ChatMessage);
        WaitNano(20);
        js.executeScript("arguments[0].click();", b.closeButton);
        WaitNano(30);
        js.executeScript("arguments[0].click();", b.newMessage);
        WaitNano(30);
        js.executeScript("arguments[0].click();", b.closeButton);
        WaitNano(50);
        js.executeScript("arguments[0].click();", b.Profil);
        WaitNano(30);
        js.executeScript("arguments[0].click();", b.signOut);

    }

}



