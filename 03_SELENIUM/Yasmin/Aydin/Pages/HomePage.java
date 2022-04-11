package students.Yasmin.Aydin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import students.Yasmin.Aydin.Project.POM.BasePage;

public class HomePage extends BasePage {

        @FindBy(xpath = "//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]")
        public WebElement homePageMessage;

        @FindBy(xpath = "//a[contains(text(),\"New Customer\")]")
        public WebElement newCustomerButton;
    }
