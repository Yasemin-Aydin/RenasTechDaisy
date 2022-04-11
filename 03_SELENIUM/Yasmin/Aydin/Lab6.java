package students.Yasmin.Aydin;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lab6 {
    /*## Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
## Test Scenario:
####      Go to the above URL.
####      Get the current window’s handle and write to the console window. It must be the first window handle.
####      Locate the “Visit W3Schools.com!” link and click it.
####      Get all window handles and hold them in a list.
####      Write to total window handle number to the console. It must be 2.
####      Switch t the second window.
####      Get the current window’s handle and write to the console window. It must be a second window handle.
####      Check the upper left side logo in the second window.
####      Go back (Switch) to the first window.
####      Get the current window’s handle and write to the console window. It must be the first window handle.
####      Check the See Run Button Text. It must contain “Run >” text.*/
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        String firstWindow=driver.getWindowHandle();
        System.out.println("This is the first window:" + firstWindow);
}
    @Test
    public void TC1() throws InterruptedException {
       driver.findElement(By.xpath("//a[@target='_blank']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles);
        System.out.println("This is the windowHandlesList:" + windowHandlesList);
        System.out.println("Total window number: " + windowHandlesList.size());
        driver.switchTo().window(windowHandlesList.get(1));
        String currentWindowHandle=driver.getWindowHandle();
        System.out.println("The current windowHandle is second window:" + currentWindowHandle);
        driver.findElement(By.xpath("//body/div[3]/a[1]/i[1]")).click();
        driver.switchTo().window(windowHandlesList.get(0));
        String currentWindowHandle2=driver.getWindowHandle();
        System.out.println("The current windowHandle is first window:" + currentWindowHandle2);
        WebElement actual_runButton= driver.findElement(By.tagName("button"));
        String runButton= actual_runButton.getText();
       String expected_runButton = "Run ❯";
       if (runButton.contains(expected_runButton)) {
          System.out.println("Runbutton Verified!");
        } else {
           System.out.println("Runbutton is not Verified");
        }

    }}
