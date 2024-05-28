package StepDefinitions.Samed;

import Pages.ParentPage;
import Pages.sRobot;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Pages.sRobot.clickBlank;

public class _23Calender_ extends ParentPage {
    Samed_pom s = new Samed_pom();

    @Then("Click Calendar Button")
    public void clickCalendarButton() {
        myClick(s.Calendar);
    }

    @And("Check Weekly Course Plan")
    public void checkWeeklyCoursePlan() {
        myClick(s.WeeklyCoursePlan);
    }

    @Then("Check abbrevations")
    public void checkAbbrevations() {
        ListContainsString(s.x, "P\n" +
                "Published");
        ListContainsString(s.x, "C\n" +
                "Cancelled");
        ListContainsString(s.x, "E\n" +
                "Ended");
        ListContainsString(s.x, "E\n" +
                "Started");
    }


    @Then("Check Previous ,Today and Next button")
    public void checkPreviousTodayAndNextButton() {
        WaitNano(8);
        myClick(s.WeeklyCoursePlan);
        String monday = s.monday.getText();
        int mondayInt = Integer.parseInt(monday.substring(monday.length() - 2).trim());
        myClick(s.Previous);

        WaitNano(4);
        String friday = s.friday.getText();
        int fridayInt = Integer.parseInt(friday.substring(friday.length() - 2).trim());

        myClick(s.Today);
        WaitNano(4);

        myClick(s.Next);
        WaitNano(4);

        String thursday = s.thursday.getText();
        int thursdayInt = Integer.parseInt(thursday.substring(thursday.length() - 2).trim());


        Assert.assertEquals(3, mondayInt - fridayInt, "Error");
        Assert.assertEquals(21, mondayInt - thursdayInt, "Error");
    }

    @Then("Check the visibility of all the classes that students take")
    public void checkTheVisibilityOfAllTheClassesThatStudentsTake() {
        ListContainsString(s.classes,"(L1)");
        ListContainsString(s.classes,"(L2)");
        ListContainsString(s.classes,"(L3)");
        ListContainsString(s.classes,"(L4)");
        ListContainsString(s.classes,"BIOLOGY");
        ListContainsString(s.classes,"MATHEMATICS");
        ListContainsString(s.classes,"DUTCH");
        ListContainsString(s.classes,"GEOMETRY");
        ListContainsString(s.classes,"SPANISH");
        ListContainsString(s.classes,"STATISTICS");
        ListContainsString(s.classes,"CHEMISTRY");
    }

    @Then("Check Weekly Course Plan and Calendar button")
    public void checkWeeklyCoursePlanAndCalendarButton() {
        myClick(s.CalendarButton);
        WaitNano(23);
        clickBlank("click", 1890, 119);
        clickBlank("dontClick", 1800, 700);
        WaitNano(4);
        Assert.assertTrue(s.listButton.isEnabled(), "error");
    }

}
