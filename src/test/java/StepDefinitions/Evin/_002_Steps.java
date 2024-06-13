package StepDefinitions.Evin;

import Pages.ParentPage;
import StepDefinitions.Ozcan.Ozcan_pom;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.xml.namespace.QName;
import java.util.Set;

public class _002_Steps extends ParentPage {
    Evin_pom us= new Evin_pom();

    @Given("Go to the campus and log in as a student")
    public void theUserIsLoggedInAsAStudent() {
        GWD.getDriver().get("https://test.mersys.io/");
        mySendKeys(us.username, "Student_8");
        mySendKeys(us.password, "S12345");
        myClick(us.loginButton);

    }

    @Then("The user has logged into the system and checks the logo")
    public void theUserHasLoggedIntoTheSystemAndChecksTheLogo() {

        Assert.assertTrue(us.logo.isDisplayed());


    }


    @Then("The user sees the company logo and clicks on it, and when clicked, they are taken to the homepage")
    public void theUserSeesTheCompanyLogoAndClicksOnItAndWhenClickedTheyAreTakenToTheHomepage() {

        myClick(us.logo);
        myClick(us.homepage);

        String originalWindow = GWD.getDriver().getWindowHandle();

            Set<String> allWindows = GWD.getDriver().getWindowHandles();

            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    GWD.getDriver().switchTo().window(windowHandle);
                    break;
                }
            }

            System.out.println("Current URL: " + GWD.getDriver().getCurrentUrl());
            Assert.assertEquals(GWD.getDriver().getCurrentUrl(), "https://techno.study/", "Homepage failed");
        }



}















