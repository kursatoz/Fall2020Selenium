package automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("ozduman", Keys.ENTER);
        Thread.sleep(2500);
        driver.close();
    }
}
