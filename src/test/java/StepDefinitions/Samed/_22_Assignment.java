package StepDefinitions.Samed;

import Pages.ParentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static Pages.sRobot.clickBlank;

public class _22_Assignment extends ParentPage {
    Samed_pom sp = new Samed_pom();

    @Then("Head to assignments")
    public void headToAssignments(DataTable dt) {
        List<String> x = dt.asList(String.class);
        WebElement we = sp.getWebElementx(x.get(0));
        myClick(we);
    }

    @And("Check sorting functionalities")
    public void checkSortingFunctionalities() {
        ListContainsString(sp.assignmentz, "11-A"); //DEFAULT SEARCH
        myClick(sp.sort1);
        myClick(sp.biology);
        clickBlank("click", 200, 250);

        myClick(sp.sort2);
        WaitNano(4);

        myClick(sp.resultPublished);
        clickBlank("click", 200, 250);
        myClick(sp.sort3);
        myClick(sp.all);


        myClick(sp.sort4);
        myClick(sp.thisYearz);

        ListContainsString(sp.assignmentz, "Biology");
        verifyContainsText(sp.classDate, "2024");


    }
}
