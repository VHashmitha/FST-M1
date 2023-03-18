//Reading additional information
//Goal: Reading a popup that contains additional information about the account/lead.
package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity7 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //Initialize the driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("http://alchemy.hguy.co/crm");
        //Login in CRM Application
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        // Navigate to Sales -> Leads
        WebElement menu_sales = driver.findElement(By.id("grouptab_0"));
        WebElement submenu_Leads = driver.findElement(By.cssSelector("li.topnav:nth-child(2) > span:nth-child(2) > ul:nth-child(3) > li:nth-child(5) > a:nth-child(1)"));
        wait.until(ExpectedConditions.visibilityOf(menu_sales));

        Actions action = new Actions(driver);
        action.moveToElement(menu_sales);
        //wait.until(ExpectedConditions.visibilityOf(submenu_Leads));
        action.moveToElement(submenu_Leads).click().build().perform();

        //In the table, find the Additional information icon at the end of the row of the lead information. Click it.
        WebElement information = driver.findElement(By.cssSelector("#adspan_1bf01e91-1f26-5249-ed14-63294367a7e5 > span:nth-child(1)"));
        wait.until(ExpectedConditions.visibilityOf(information));
        information.click();

        //Read the popup and print the phone number displayed in it.

        WebElement phone_Number = driver.findElement(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span"));
        wait.until(ExpectedConditions.visibilityOf(phone_Number));
        System.out.println("The Phone Number is: " + phone_Number.getText());

        driver.close();
    }
}
