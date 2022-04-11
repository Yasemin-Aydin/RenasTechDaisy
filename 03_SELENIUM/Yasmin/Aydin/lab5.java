package students.Yasmin.Aydin;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab5 {
    /*
 #### Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
#### Step 2) Enter Any Customer id.
#### Step 3) After entering the customer ID, Click on the “Submit” button.
#### Step 4) Reject/accept the alert.*/


    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");

    }
    @Test
    public void TC1_Alert_Dismiss_Accept() throws InterruptedException {
        driver.findElement(By.name("cusid")).sendKeys("Yasmin");
        driver.findElement(By.name("submit")).click();
        BrowserUtils.wait(2);
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept();
    }
}
