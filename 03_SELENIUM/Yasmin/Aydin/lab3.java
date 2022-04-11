package students.Yasmin.Aydin;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab3 {
    public static void main(String[] args) {
        /*####1. Open Chrome browser
####2. Go to https://demo.guru99.com/test/radio.html
####3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
####4. Click to checkbox3
####5. Verify checkbox3 is selected*/

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement  checkboxes : checkBox){
            if (!checkboxes.isSelected()) {
                System.out.println(" Checkbox1 has passed");

            } else {
                System.out.println("Verified CheckBox1");
            }
            WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
            checkBox3.click();
            if (checkBox3.isSelected()) {
                System.out.println("CheckBox3 is Verified");
            } else {
                System.out.println("CheckBox3 is not Selected therefore verification has Failed");

            }
        }}

}

