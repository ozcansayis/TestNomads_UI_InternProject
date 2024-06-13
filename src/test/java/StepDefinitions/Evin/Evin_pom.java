package StepDefinitions.Evin;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evin_pom extends ParentPage {
    public Evin_pom() {PageFactory.initElements(GWD.getDriver(), this);
    }
    //login
    @FindBy(css = "[placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(css = "[placeholder='Parola']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(css = "mat-toolbar div > img")
    public WebElement logo;

    @FindBy (css = "[class='tn-atom js-click-zero-stat']")
    public WebElement homepage;

}
