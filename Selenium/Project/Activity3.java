//3.Get the copyright text
//Goal: Print the first copyright text in the footer to the console
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //Initialize the driver
        WebDriver driver = new FirefoxDriver();

        //open the page
        driver.get("http://alchemy.hguy.co/crm");
        WebElement idLocator = driver.findElement(By.id("admin_options"));
        System.out.println("First copyright text in the footer is: " + idLocator.getText());

        driver.close();
    }
}
