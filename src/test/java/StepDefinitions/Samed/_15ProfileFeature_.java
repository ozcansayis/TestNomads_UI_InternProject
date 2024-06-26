package StepDefinitions.Samed;

import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static Pages.sRobot.clickBlank;

public class _15ProfileFeature_ extends ParentPage {
    Samed_pom x = new Samed_pom();

    @Then("Click on profile button and head to settings")
    public void clickOnProfileButtonAndHeadToSettings() {
        WaitNano(23);
        clickBlank("click", 1890, 119); ///uyari kapatildi
        myClick(x.profilePic);
        myClick(x.settings);

    }

    @And("Change theme color save and check helper text")
    public void changeThemeColorSaveAndCheckHelperText() {
        myClick(x.theme);
        myClick(x.DarkPurpleTheme);


        List<String> colors = new ArrayList<>(List.of("Default Theme", "Purple Theme", "Dark Purple Theme", "Indigo"));
        List<String> themes = new ArrayList<>(List.of(x.defaultx.getText(), x.PurpleTheme.getText(), x.DarkPurpleTheme.getText(), x.Indigo.getText(), x.defaultx.getText()));


        //renk kontrolu
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(colors.get(i), themes.get(i));
        }
        myClick(x.save);
        WaitNano(4);
        x1();


    }
    public void x1() {
        for (int i = 1; i <= 4; i++) {
            myClick(x.profilePic);
            myClick(x.settings);
            myClick(x.theme);
            myClick(x.getWebElement(i));
            WaitNano(3);
            myClick(x.save);

            verifyContainsText(x.helperT2, "Profile successfully updated");
        }
    }

}

