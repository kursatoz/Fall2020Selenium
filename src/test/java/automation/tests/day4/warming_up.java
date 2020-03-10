package automation.tests.day4;
import automation.tests.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class warming_up {
static WebDriver driver;
    public static void main(String[] args) {

        ebayTest();
//        amazonTest();
//        wikiTest();
    }
    public static void ebayTest() {
        driver= DriverFactory.createDriver("chrome");
        driver.get("https://www.ebay.ca/");
        driver.findElement(By.className("gh-tb ui-autocomplete-input")).sendKeys("java Book");
        driver.findElement(By.id("gh-btn")).click();
        WebElement result=driver.findElement(By.className("rsHdr"));
        System.out.println(result.getText().split(" ")[0]);
        driver.quit();
    }

    public static void amazonTest() {
        driver= DriverFactory.createDriver("chrome");
        driver.get("https://www.amazon.ca/");
        driver.findElement(By.id("searchDropdownBox")).sendKeys("Java Book" );




        driver.quit();
    }

//    public static wikiTest() {
//        driver= DriverFactory.createDriver("chrome");
//        driver.get("https://www.wikipedia.org/");
//
//
//
//        driver.quit();
//    }

}