package automation.tests.day3;

import automation.tests.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFindElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName=driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister Twister");

        WebElement email =driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");
         WebElement signup =driver.findElement(By.name("wooden_spoon"));
         signup.click();
        Thread.sleep(2500);

        String expected="Thank you for signing up. Click the button below to return to the home page.";
       WebElement subheader =driver.findElement(By.className("subheader"));
       String message=subheader.getText();
       if(message.equalsIgnoreCase(expected)){
           System.out.println("TEST PASSED");

       }else{
           System.out.println("TEST FAILED");
        }
        driver.quit();
    }
}
