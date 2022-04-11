package students.Yasmin.Aydin.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import students.Yasmin.Aydin.Project.POM.BasePage;
import students.Yasmin.Aydin.Runner.BaseTest;

    public class LoginPage extends BasePage {

        @FindBy(xpath = "//*[@name='uid']")
        public WebElement userIdInput;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement userPasswordInput;

        @FindBy(xpath = "//input[@name='btnLogin']")
        public WebElement loginButton;

        @FindBy(xpath = "//h2[text()='Guru99 Bank']")
        public WebElement loginPageTitle;

    }