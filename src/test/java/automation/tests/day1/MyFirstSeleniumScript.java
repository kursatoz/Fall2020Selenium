package automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Set;

public class MyFirstSeleniumScript {

    public static void main(String[] args) throws Exception{

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();
        String title=driver.getTitle();
        System.out.println("title>>."+ title);
        driver.get("http://google.com");
        Thread.sleep(2000);
        String titleone="Google";
        driver.get("http://amazon.com");
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        if(titleone.equalsIgnoreCase(title)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
        driver.navigate().back();
        verifyTitle(driver.getTitle(),"Google");
        String windowHandle=driver.getWindowHandle();
        System.out.println(windowHandle);
        System.out.println("Before"+driver.getCurrentUrl());
        Set<String> windowHandles= driver.getWindowHandles();
        System.out.println("windowHandles = " + windowHandles);
        for (String windowId:windowHandles) {
            if(!windowId.equals(windowHandle)){
                driver.switchTo().window(windowId);
                }

        }
        System.out.println("after"+driver.getCurrentUrl());

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
