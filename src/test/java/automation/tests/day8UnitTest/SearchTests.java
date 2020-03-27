package automation.tests.day8UnitTest;
import automation.tests.utilities.web1.BrowserWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
    public class SearchTests {
        public WebDriver driver;
        @Test
        public void googleSearchTest() {
            driver.get("http://google.com");
            driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
            //since every search item has a tag name <h3>
            //it's the easiest way to collect all of them
            List<WebElement> searchItems = driver.findElements(By.tagName("h3"));
            for (WebElement searchItem : searchItems) {
                System.out.println(searchItem.getText());
                String var=searchItem.getText();
                if(!var.isEmpty()){
                    System.out.println(var);
                    Assert.assertTrue(var.toLowerCase().contains("java"));
                }
            }
        }
@Test
public void amazonSearchTest(){
            driver.get("http://amazon.com");
            }
        @BeforeMethod
        public void setup() {
            //setup webdriver
            WebDriverManager.chromedriver().version("79").setup();
            driver = new ChromeDriver();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java",Keys.ENTER);
            BrowserWait.wait(2);
            List<WebElement> searchItem= driver.findElements(By.tagName("h2"));
            searchItem.get(0).click();
            BrowserWait.wait(2);
            WebElement productTitle=driver.findElement(By.id("productTitle"));
            String productTitleString =productTitle.getText();
            Assert.assertTrue(productTitleString.contains("java"));

        }

        @AfterMethod
        public void teardown() {
            //close browser and destroy webdriver object
            driver.quit();
        }
    }

