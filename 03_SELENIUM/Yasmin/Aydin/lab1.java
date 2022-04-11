package students.Yasmin.Aydin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab1 {
    public static void main(String[] args) throws InterruptedException {
        /*
         ##Task 1
#### Go to https://www.etsy.com/
#### Maximize window
#### title doesnt contains "Smile"
#### Verify Current Url */

  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        String exist_one = driver.getCurrentUrl();
        String Expected_one = "Smile";
        if (exist_one.equals(Expected_one)) {
            System.out.println("URL Verified!");
        } else {
            System.out.println("URL is not Verified");
        }


           /*
##Task 2
#### Go to https://www.amazon.com/
#### Verify title
#### Verify Current Url
#### Navigate Back
#### Refresh
#### Quit browser*/
        driver.navigate().forward();
        driver.navigate().to("https://amazon.com");
        String Expected_title= driver.getTitle();
        if (exist_one.equals(Expected_title)) {
            System.out.println("Title Verified!");
        } else {
            System.out.println("Title is not Verified");
        }
        String exist_URL = driver.getCurrentUrl();
        if (exist_one.equals(exist_URL )) {
            System.out.println("URL Verified!");
        } else {
            System.out.println("URL is not Verified");
        }
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.quit();

    }
}
