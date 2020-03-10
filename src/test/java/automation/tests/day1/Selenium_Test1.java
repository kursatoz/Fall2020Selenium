package automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Selenium_Test1 {
    public static void main(String[] args) {

        ArrayList<String>keysToSearch= new ArrayList<>();
        keysToSearch.add("fruits") ;
        keysToSearch.add("veggies");
        keysToSearch.add("berries");
        Iterator <String> iterator=keysToSearch.iterator();
         while(iterator.hasNext()){
             System.out.println(iterator.next());

         }
    Iterator <String> iterator1=keysToSearch.iterator();
         while (iterator1.hasNext()){
             String item=iterator1.next();
             System.out.println(item);
             System.out.println("*"+ item);
         }
        HashMap<String,String>personalInfo=new HashMap<>();
         personalInfo.put("name","Adem");
         personalInfo.put("student_id","2303443");
         personalInfo.put("major","computer Science");

         Iterator<String> mapIterator =personalInfo.keySet().iterator();
         while(mapIterator.hasNext()){
             String key=mapIterator.next();
             System.out.println(key+":"+personalInfo.get(key));
         }

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://etsy.com");
        WebElement searchBar=driver.findElement(By.id("global-enhancements-search-query"));


    }
}
