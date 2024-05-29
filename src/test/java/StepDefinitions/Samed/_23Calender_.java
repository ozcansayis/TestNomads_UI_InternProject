package StepDefinitions.Samed;

import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static Pages.sRobot.clickBlank;

public class _23Calender_ extends ParentPage {
    Samed_pom s = new Samed_pom();
    List<String> x;

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
        x = new ArrayList<>(List.of("BIOLOGY", "CHEMISTRY", "MATHEMATICS", "GEOMETRY", "PHYSICAL", "STATISTICS", "DUTCH", "SPANISH"));
        List<String> a = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            String classq = s.classes.get(i).getText().replace("11A-", "").trim();
            if (!a.contains(classq)) {
                a.add(classq);
            }
        }
        x1(a);

        myClick(s.classss);
        verifyContainsText(s.courseDetail, "Course Meeting - ( 11A- Biology )");
        myClick(s.exitButton);
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

    public void x1(List<String> xz) {
        for (int i = 0; i < x.size(); i++) {
            if (!x.contains(xz.get(i))) {
                Assert.fail();
            }
        }
    }

}

