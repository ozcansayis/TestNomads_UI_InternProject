package StepDefinitions.Abdulkabir;

import Pages.ParentPage;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenu_pom extends ParentPage {
    public HamburgerMenu_pom() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
        @FindBy(xpath = "//input[@placeholder='Username']")
        public WebElement userName;
        @FindBy(xpath = "//input[@type='password']")
        public WebElement password;
        @FindBy(xpath = "//span[text()=' LOGIN ']")
        public WebElement Login;
        @FindBy(xpath = "//span[contains(text(),'Welcome')]")
        public WebElement welcomeText;


}
