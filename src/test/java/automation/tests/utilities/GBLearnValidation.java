package automation.tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.Set;

public class GBLearnValidation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("80").setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        // copy  your location index.html inside to get
        driver.get("file:///C:/Users/Kurshat/IdeaProjects/Fall2020Selenium/src/test/java/automation/tests/utilities/web1/index.html");

        List<WebElement> links=driver.findElements(By.tagName("li")); // lists of all <li> tag
        for (WebElement link:links) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();
        }
        int count=0;
        WebElement validation=driver.findElement(By.xpath("//img[@alt='html5 validator']")); // validation element is like object
        validation.click();
        Thread.sleep(2000);
        for (int i = 1;i <links.size() ; i++) {
            String currentHandle=driver.getWindowHandle();    //current active tab window hashcode
            Set<String> handle=driver.getWindowHandles();
            System.out.println(driver.getTitle());
            for (String window:handle) {
                if(!window.equals(currentHandle)){
                    driver.switchTo().window(window);
                   // validation=driver.findElement(By.xpath("//img[@alt='html5 validator']"));
                }

            }
            Thread.sleep(1000);
            String checking=" No errors or warnings to show.";
            String result=driver.findElement(By.id("results")).getText();
                // finding error messages
            if(result.contains(checking)){
                System.out.println("Test PASSED");

            }else{
                System.out.println("Test FAILED");
                count++;
            }
            System.out.println(driver.getTitle());
            driver.close(); // closing validation tab
            driver.switchTo().window(currentHandle);
            System.out.println();
            System.out.println(driver.getTitle());
            Thread.sleep(1000);
            links.get(i).click(); // jump to next link "next page"
            links=driver.findElements(By.tagName("li"));
            Thread.sleep(1000);
            validation=driver.findElement(By.xpath("//img[@alt='html5 validator']"));
            validation.click();
            Thread.sleep(1000);
            System.out.println("Total Error number: "+count);
//            driver.findElements(By.tagName("a")).get(i).click();
//
//
//
//            Thread.sleep(2000);
//
//
//
//            driver.navigate().back();

        }



    }
}
