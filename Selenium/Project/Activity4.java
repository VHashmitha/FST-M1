//Logging into the site
//Goal: Open the site and login with the credentials provided
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity4 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //Initialize the driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        // Login in CRM application
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        //Verify that the homepage has opened.
        String txt = driver.findElement(By.xpath("//*[@id=\"tab0\"]")).getText();
        //System.out.println(txt);
        Assert.assertEquals(txt, "SUITECRM DASHBOARD", "Homepage isn't opened successfully");
        driver.close();
    }

}