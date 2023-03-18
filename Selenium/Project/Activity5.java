// Getting colors
//Goal: Get the color of the navigation menu
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class Activity5 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //Initialize the driver
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        // Login in CRM application
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        //Get the color of the navigation menu and print it to the console.
        String color = driver.findElement(By.cssSelector("#grouptab_0")).getCssValue("background-color");
        System.out.println("The rgba color is: " + color);
        System.out.println("The Hex color of the background is: " + Color.fromString(color).asHex());
        driver.close();
    }

}