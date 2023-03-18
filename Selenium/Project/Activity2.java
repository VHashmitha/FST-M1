//2.Get the url of the header image
//Goal: Print the url of the header image to the console
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //Initialize the driver
        WebDriver driver = new FirefoxDriver();

        //open the page
        driver.get("http://alchemy.hguy.co/crm");
        WebElement url=  driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        //Get the url of the header image
        //getAttribute() to get src of image
        System.out.println("URL of the Header page is: "+ url.getAttribute("src"));
        driver.close();
    }
}
