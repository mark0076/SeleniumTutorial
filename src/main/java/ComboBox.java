import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ComboBox {
    static WebDriver driver;
    static WebDriverWait wait;
    static WebDriverWait wait2;
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://m.vk.com/join");
        wait=(new WebDriverWait(driver,5));;
        wait2=(new WebDriverWait(driver,3));;

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains (text(), 'Profile information')]")));

        listBox("bday",28);
        listBox("bmonth",4);
        listBox("byear",1994);
/*
        driver.findElement(By.xpath("//td/select[@name = 'bday']")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//select[@name ='bday']/option[@value ='28']")).click();


        driver.findElement(By.xpath("//td/select[@name = 'bmonth']")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//select[@name ='bmonth']/option[@value ='4']")).click();

        driver.findElement(By.xpath("//td/select[@name = 'byear']")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//select[@name ='byear']/option[@value ='1994']")).click();
*/


    }

    public static void listBox(String listName,int  option){
        String xpath1="//td/select[@name = '" + listName+ "']";
        String xPath2="//select[@name ='" + listName+ "']/option[@value ='" + option+"']";
        driver.findElement(By.xpath(xpath1)).click();
       wait2.until(ExpectedConditions.visibilityOfElementLocated( (By.xpath(xPath2))));
        driver.findElement(By.xpath(xPath2)).click();
     //  wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath(xPath2))));

    }
}
