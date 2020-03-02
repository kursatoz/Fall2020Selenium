package automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstSeleniumScript {

    public static void main(String[] args) throws Exception{

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();
        String title=driver.getTitle();
        System.out.println("title>>."+ title);
        driver.get("http://google.com");
        Thread.sleep(2000);
        String titleone="Google";
        if(titleone.equalsIgnoreCase(title)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
        driver.navigate().back();
        verifyTitle(driver.getTitle(),"Google");

        driver.close();
    }

    public static void  verifyTitle(String one,String two){
        if (one.equals(two)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
