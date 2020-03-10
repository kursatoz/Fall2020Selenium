package automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfficeWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        WebElement search_box=driver.findElement(By.id("search_query_top"));
        search_box.sendKeys("tshirt"+ Keys.ENTER);
        String error =driver.findElement(By.className("aler alert-warning")).getText();
        System.out.println("Error Message "+error);
        search_box.clear();
        search_box.sendKeys("t-shirt"+Keys.ENTER);
        WebElement count= driver.findElement(By.className("product-count"));
        System.out.println("result item: "+count);



    }
}
