package students.Yasmin.Aydin;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class lab4 {

        /*#### go to http://demo.guru99.com/test/newtours/register.php
#### click on country dropdown and select Barbados with Select Method
#### Use 3 different Select Method (visible text,index,value)
#### and switch to another countries as you wish*/


    WebDriver driver;
    //go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before class is running");
    }



    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");

    }
    @Test
    public void TC1() throws InterruptedException {
        WebElement element= driver.findElement(By.name("country"));
        Select country1= new Select(element);
        country1.selectByVisibleText("BARBADOS");
        Thread.sleep(1000);

        WebElement element2= driver.findElement(By.name("country"));
        Select country2= new Select(element2);
        country2.selectByIndex(40);
        Thread.sleep(1000);

        WebElement element3= driver.findElement(By.name("country"));
        Select country3= new Select(element3);
        country3.selectByValue("TURKEY");
    }


    @AfterMethod
    public void closing(){

        driver.quit();
    }

}


