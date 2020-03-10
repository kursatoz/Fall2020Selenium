package automation.tests.day3;

import automation.tests.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class FindElementById {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
//        WebElement pass=driver.findElement(By.name("password"));
//        pass.sendKeys("SuperSecretPassword");
//        String message=
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(2000);
        WebElement logout =driver.findElement(By.partialLinkText("Logout"));
        logout.click();

//        String href=logout.getAttribute("href");
//        System.out.println(href);
        driver.findElement(By.name("username")).sendKeys("wrong key");
        driver.findElement(By.name("password")).sendKeys("fgfdgdfgd");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(2000);
        WebElement errorMessage=driver.findElement(By.id("flash-messages"));
        System.out.println(errorMessage.getText());


        logout.click();
      //  driver.quit();
    }
}
