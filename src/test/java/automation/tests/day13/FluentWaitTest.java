package automation.tests.day13;

import automation.tests.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWait {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= DriverFactory.createDriver("chrome");

    }
    @Test
    public  void fluentWaitTest(){

        
    }
    @AfterMethod
    public  void teardown(){
        driver.quit();
    }
}
