import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TextFields1 {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        WebElement email =driver.findElement(By.xpath("//input[@type = \"email\"]"));
        email.sendKeys("rma0076@gmail.com");

        System.out.println("email is "+email.getAttribute("value"));
        driver.findElement(By.xpath("//table//input[@type = \"password\"] ")).sendKeys("qazXSW69");
        WebElement button =driver.findElement(By.xpath("//input[@value = \"Log In\"]"));
        button.click();

     /*   driver.get("https://github.com/");
        driver.findElement(By.xpath("//input[@class = \"form-control form-control-lg input-block\"and @name =\"user[login]\"]")).sendKeys("RMA0076");
        driver.findElement(By.xpath("//dl[@class = \"form-group\"]//input[@name =\"user[email]\"]")).sendKeys("rma0076@gmai.com");
        driver.findElement(By.xpath("//input[@type = \"password\"and @id =\"user[password]\"]")).sendKeys("qazXSW69");
        driver.findElement(By.xpath("//form[@class = \"home-hero-signup text-gray-dark js-signup-form\"]//button")).submit();*/


 /*       driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//div/input[@name =\"search\"]")).sendKeys("Selenium Webdriver");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement searchClick =driver.findElement(By.xpath("//div/input[@name=\"go\"]"));
        searchClick.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        System.out.println(        driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).getAttribute("value")
);

        driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).clear();
        driver.manage().timeouts().pageLoadTimeout(12,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).sendKeys("Selenium");*/



    }
}
