package StepDefinitions.Fatos;

import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;


public class _003_steps extends ParentPage {
    Fatos_pom aaa = new Fatos_pom();

    @Given("User is logged in as a student")
    public void userIsLoggedInAsAStudent() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(aaa.username, "Student_8");
        mySendKeys(aaa.password, "S12345");
        myClick(aaa.loginButton);
    }

    @When("User checks the top navigation menu")
    public void userChecksTheTopNavigationMenu() {
        WaitNano(15);
       System.out.println(aaa.allElement.getText() + aaa.allElement2.getText());
        Assert.assertEquals(aaa.allElement.getText() + aaa.allElement2.getText(), "Courses\n" +
                "Calendar\n" +
                "Attendance\n" +
                "Assignments\n" +
                "9\n" +
                "Grading2\n" +
                "9+\n" +
                "S. 11A", "Eşit Değildir");
    }

    @And("User should be able to click each item correctly")
    public void userShouldBeAbleToClickEachItemCorrectly() {
        List<WebElement> menuItems = GWD.getDriver().findElements(By.cssSelector("nav .menu-item"));
        for (WebElement menuItem : menuItems) {
            menuItem.click();
        }
        myClick(aaa.courses);
        myClick(aaa.calendar);
        myClick(aaa.attendance);
        myClick(aaa.assignments);
        myClick(aaa.grading);
        myClick(aaa.hamburgerMenu);
        WaitNano(20);
        Actions actions = new Actions(GWD.getDriver());
        WaitNano(30);
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.Chatmessage);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.closeButton);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.newMessage);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.closeButton);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.Profil);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.closeButton);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.exit);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.closeButton);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.signOut);
        WaitNano(30);
        js.executeScript("arguments[0].click();", aaa.closeButton);

    }
}


