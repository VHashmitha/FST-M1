// Menu checking
//Goal: Make sure that the “Activities” menu item exists and is clickable
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class Activity6 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //Initialize the driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        // Login in CRM application
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();


        //Ensure that the “Activities” menu item exists.
        boolean exists = driver.findElements(By.cssSelector("#grouptab_3")).size()!=0;
        if(exists==true)
        {
            System.out.println("Activities Element exists");
        }
        else
        {
            System.out.println("Element doesn't exists");
        }

        Boolean display=driver.findElement(By.cssSelector("#grouptab_3")).isDisplayed();

        if(display==true)
        {
            System.out.println("Activities Element available in UI");
        }
        else
        {
            System.out.println("Element doesn't available in UI");
        }
        driver.close();
    }

}